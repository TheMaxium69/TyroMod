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
import net.minecraftforge.fml.common.Mod;
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
//            System.out.println("MOD : DEJA VERIFIER POUR " + pseudo);

        } else if (Global.NOTVERIF_MOD) {

            TyroMod.logger.info("⚠️ " + playerEntity.getName() + " a passé outre la vérification des mods.");
            TyroLogger.logServerPlayer(playerEntity.getName(), "⚠️ " + playerEntity.getName() + " a passé outre la vérification des mods.");

            TyroMod.playersVerifMod.add(playerEntity);

        } else {

//            System.out.println( pseudo + " = ModList JSON : " + modList);

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
                        JsonArray ModsServerJSON = TableauModServ.getAsJsonArray();

                        System.out.println("--------------- MOD CLIENT");

                        String modClientView = "";
                        for (JsonElement el : ModsClientJSON) {

                            JsonObject oneModClient = el.getAsJsonObject();

                            String modid = oneModClient.get("modid").getAsString();
                            String version = oneModClient.get("version").getAsString();

                            modClientView = modClientView + modid + "@" + version + ", ";

                        }


                        TyroMod.logger.info("ℹ️ "+ pseudo +" Liste des mods : " + modClientView);
                        TyroLogger.logServerPlayer(pseudo, "ℹ️ Liste des mods : " + modClientView);


                        /*
                        System.out.println("--------------- MOD SERVER");

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
                        }*/

                        boolean erreur = false;

                        // --- Vérifier les mods du serveur ---
                        for (JsonElement elServer : ModsServerJSON) {
                            JsonObject modServer = elServer.getAsJsonObject();

                            String modidServer = modServer.get("modid").getAsString();
                            String versionServer = modServer.get("version").getAsString();
                            boolean isLock = modServer.get("isLock").getAsBoolean();

                            // Chercher ce mod côté client
                            JsonObject modClientFound = null;
                            for (JsonElement elClient : ModsClientJSON) {
                                JsonObject modClient = elClient.getAsJsonObject();
                                String modidClient = modClient.get("modid").getAsString();
                                if (modidClient.equals(modidServer)) {
                                    modClientFound = modClient;
                                    break;
                                }
                            }

                            if (isLock) {
                                // Mod obligatoire → doit exister et être à la bonne version
                                if (modClientFound == null) {
                                    System.err.println("❌ Mod obligatoire manquant : " + modidServer);
                                    erreur = true;
                                } else {
                                    String versionClient = modClientFound.get("version").getAsString();
                                    if (!versionClient.equals(versionServer)) {
                                        System.err.println("❌ Mauvaise version pour le mod obligatoire : " + modidServer +
                                                " (client: " + versionClient + ", serveur: " + versionServer + ")");
                                        erreur = true;
                                    } else {
                                        System.out.println("✅ Mod obligatoire OK : " + modidServer + "@" + versionServer);
                                    }
                                }
                            } else {
                                // Mod optionnel → peut être absent, mais si présent doit être à la bonne version
                                if (modClientFound != null) {
                                    String versionClient = modClientFound.get("version").getAsString();
                                    if (!versionClient.equals(versionServer)) {
                                        System.err.println("❌ Mauvaise version pour le mod optionnel : " + modidServer +
                                                " (client: " + versionClient + ", serveur: " + versionServer + ")");
                                        erreur = true;
                                    } else {
                                        System.out.println("✅ Mod optionnel OK : " + modidServer + "@" + versionServer);
                                    }
                                } else {
                                    System.out.println("ℹ️ Mod optionnel absent (OK) : " + modidServer);
                                }
                            }
                        }

                        // --- Vérifier si le client a un mod non listé sur le serveur ---
                        for (JsonElement elClient : ModsClientJSON) {
                            JsonObject modClient = elClient.getAsJsonObject();
                            String modidClient = modClient.get("modid").getAsString();

                            boolean found = false;
                            for (JsonElement elServer : ModsServerJSON) {
                                JsonObject modServer = elServer.getAsJsonObject();
                                String modidServer = modServer.get("modid").getAsString();
                                if (modidServer.equals(modidClient)) {
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                System.err.println("❌ Le client possède un mod non autorisé : " + modidClient);
                                erreur = true;
                            }
                        }

                        if (!erreur) {

                            /* Player Verifier */
                            TyroMod.playersVerifMod.add(playerEntity);
                        }

                    } else {
                        System.out.println("MOD : Erreur JSON SERVER INVALIDE");
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
