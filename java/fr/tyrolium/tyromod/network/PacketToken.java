package fr.tyrolium.tyromod.network;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.fml.network.NetworkEvent;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.function.Supplier;


public class PacketToken {

    private String TokenOld;
    private String Token;

    public PacketToken(String token, String tokenOld) {
        this.Token = token;
        this.TokenOld = tokenOld;
    }

    public static void encode(PacketToken packetToken, PacketBuffer packetBuffer) {
        packetBuffer.writeUtf(packetToken.Token);
        packetBuffer.writeUtf(packetToken.TokenOld);
    }

    public static PacketToken decode(PacketBuffer packetBuffer) {
        String Token = packetBuffer.readUtf();
        String TokenOld = packetBuffer.readUtf();
        return new PacketToken(Token,TokenOld);
    }

    public static void handle(PacketToken packet, Supplier<NetworkEvent.Context> contextSupplier) {

        ServerPlayerEntity EntitySender = contextSupplier.get().getSender();
        MinecraftServer Server = EntitySender.getServer();
        String PlayerName = EntitySender.getName().getString();
        String Token = packet.Token;
        String tokenOld = packet.TokenOld;

        try {
            URL url = new URL("http://useritium.fr/api-externe/index.php?controller=TyroServ&task=servVerif");
            String postData = "pseudo="+PlayerName+"&token="+Token+"&tokenTwo="+tokenOld;

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Content-Length", Integer.toString(postData.length()));
            conn.setUseCaches(false);



            try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                dos.writeBytes(postData);
            }

            try(BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                String JSONString = response.toString();
                System.out.println("Reponse API : " + JSONString);

                String makeReponse = createReponse(PlayerName);
                if (JSONString.equals(makeReponse)){
                    System.out.println("CONNEXION DE "+ PlayerName +" VALIDE");

                    //Connexion
                    //TP PLAYER IN LOBBY
                    EntitySender.displayClientMessage(new StringTextComponent("Connexion a TyroServ : REUSSI"), true);
                    Server.getCommands().performCommand(Server.createCommandSourceStack(), "tp " + PlayerName + " ~ ~ ~ ");

                } else {

                    String codeErr = null;
                    //Erreur
                    if (JSONString.equals("{\"status\":\"err\",\"why\":{\"Token\":\"false\",\"AuthNb\":\"false\"}}")){
                        codeErr = "3033";
                    }

                    if (JSONString.equals("{\"status\":\"err\",\"why\":{\"Token\":\"true\",\"AuthNb\":\"false\"}}")){
                        codeErr = "3013";
                    }

                    if (JSONString.equals("{\"status\":\"err\",\"why\":{\"Token\":\"false\",\"AuthNb\":\"true\"}}")){
                        codeErr = "3031";
                    }

                    System.out.println("TOKEN INVALIDE DE "+ PlayerName +" Err:" + codeErr);
                    //KICK PLAYER
                    Server.getCommands().performCommand(Server.createCommandSourceStack(), "kick " + PlayerName + " Token Invalide Err:" + codeErr);
                }


            }

        } catch (Exception e) {
            e.printStackTrace();
            Server.getCommands().performCommand(Server.createCommandSourceStack(), "kick " + PlayerName + " SERVEUR ERREUR");
        }

    }

    private static String createReponse(String pseudo) {

        String reponse = "{\"status\":\"true\",\"auth_pseudo\":\""+pseudo+"\"}";
        return reponse;

    }

}
