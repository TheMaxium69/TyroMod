package fr.tyrolium.tyromod.security;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.PacketBuffer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

/*
 *
 * CODE DE LA 1.16
 *
 * */

public class PacketToken {


    public static void postDataToApi(String token, String tokenOld, EntityPlayerMP playerEntity) {

        String pseudo = playerEntity.getName();

        String apiUrl = Global.API_USERITIUM; // change this to be your actual API url
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            String postData = "pseudo=" + pseudo + "&token=" + token + "&tokenTwo=" + tokenOld;

            try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                dos.writeBytes(postData);
            }

            int responseCode = conn.getResponseCode();
//            System.out.println("POST Response Code :  " + responseCode);
//            System.out.println("POST Response Message : " + conn.getResponseMessage());


            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            // Tout fermer
            in.close();
            conn.disconnect();
//            System.out.println("Reponse du serveur : " + content.toString());


            if (content.toString().equals(createReponse(pseudo))) {

                //Connexion
//                System.out.println("TOKEN VALIDE DE "+ pseudo);
//                playerEntity.sendMessage(new TextComponentString("Connexion Effectuez!"));

                MinecraftServer server = playerEntity.getServer();
                if (server != null) {
//                    server.getCommandManager().executeCommand(playerEntity.getCommandSenderEntity(), "say " + pseudo + " is connected : " + tokenOld + " " + token + "");
                }

                /* AJOUT DU JOUEUR DANS LA LISTE DES JOUEURS VERIFIER */
                int pseudoExisting = 1;
                for (EntityPlayer player : TyroMod.playersVerif) {

                    if (player.getName().equals(pseudo)) {
                        pseudoExisting = 2;
                    }
                }

                if (pseudoExisting == 1) {
                    TyroMod.playersVerif.add(playerEntity);
                }



            } else {

                String codeErr = null;
                if (content.toString().equals("")) {
                    codeErr = "3300";
                } else if (content.toString().equals("    {\"status\":\"err\",\"why\":{\"Token\":\"true\",\"AuthNb\":\"false\"}}")) {
                    codeErr = "3033";
                } else if (content.toString().equals("    {\"status\":\"err\",\"why\":{\"Token\":\"false\",\"AuthNb\":\"true\"}}")) {
                    codeErr = "3013";
                } else if (content.toString().equals("    {\"status\":\"err\",\"why\":{\"Token\":\"false\",\"AuthNb\":\"false\"}}")) {
                    codeErr = "3031";
                } else {
                    codeErr = "3000";
                }


                System.out.println("TOKEN INVALIDE DE "+ pseudo +" Err:" + codeErr);
                playerEntity.sendMessage(new TextComponentString("Connexion Refuser! | CodeErr : " + codeErr));
                playerEntity.connection.disconnect(new TextComponentString("Your Token Useritium is invalide - Code : " + codeErr));


            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static String createReponse(String pseudo) {

        String reponse = "    {\"status\":\"true\",\"auth_pseudo\":\""+pseudo+"\"}";
        return reponse;

    }

}
