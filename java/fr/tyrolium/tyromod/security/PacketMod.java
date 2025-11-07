package fr.tyrolium.tyromod.security;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import org.lwjgl.Sys;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PacketMod {

    public static void verifModToApi(String modList, EntityPlayerMP playerEntity) {


        String pseudo = playerEntity.getName();

        int pseudoExisting = 1;
        for (EntityPlayer player : TyroMod.playersVerifMod) {

            if (player.getName().equals(pseudo)) {
                pseudoExisting = 2;
            }

        }

        for (EntityPlayer player : TyroMod.playersCanConnect) {
            if (player.getName().equals(pseudo)) {
                pseudoExisting = 2;
            }
        }

        if (pseudoExisting == 2) {

            /* DEJA VERIFIER */
            System.out.println("MOD : DEJA VERIFIER POUR " + pseudo);

        } else {

            System.out.println( pseudo + " = ModList JSON : " + modList);

            /* PARSE JSON SERVER*/
            JsonElement TableauModClient = new JsonParser().parse(modList);

            if (TableauModClient.isJsonArray()) {

                JsonArray ModsClientJSON = TableauModClient.getAsJsonArray();

                String apiUrl = Global.API_MODLIST;
                try {
                    URL url = new URL(apiUrl);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("GET");

                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String inputLine;
                    StringBuilder content = new StringBuilder();
                    while ((inputLine = in.readLine()) != null) {
                        content.append(inputLine);
                    }

                    // Tout fermer
                    in.close();
                    conn.disconnect();
//                    System.out.println("Reponse du serveur : " + content.toString());

                    /* PARSE JSON SERVER*/
                    JsonElement TableauModServ = new JsonParser().parse(content.toString());

                    if (TableauModServ.isJsonArray()) {


                        System.out.println("--------------- MOD CLIENT");

                        for (JsonElement el : ModsClientJSON) {

                            JsonObject oneModClient = el.getAsJsonObject();

                            String modid = oneModClient.get("modid").getAsString();
                            String version = oneModClient.get("version").getAsString();

                            System.out.println("CLIENT MOD : " + modid + "@" + version);
                        }






                        System.out.println("--------------- MOD SERVER");

                        JsonArray ModsServerJSON = TableauModServ.getAsJsonArray();

                        for (JsonElement el : ModsServerJSON) {

                            JsonObject oneModServer = el.getAsJsonObject();

                            String modid = oneModServer.get("modid").getAsString();
                            String version = oneModServer.get("version").getAsString();
                            boolean isLock = oneModServer.get("isLock").getAsBoolean();

                            if (isLock) {
                                System.out.println("SERVER MOD (LCK) : " + modid + "@" + version);
                            } else {
                                System.out.println("SERVER MOD (OPT) : " + modid + "@" + version);
                            }
                        }



                        /* Player Verifier */
                        TyroMod.playersVerifMod.add(playerEntity);











                    } else {
                        System.out.println("MOD : Erreur JSON SERVER INVALIDE");
    //                    playerEntity.connection.disconnect(new TextComponentString("Server Erreur"));
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("MOD : Erreur JSON SERVER INVALIDE");
            }



        }

    }

}
