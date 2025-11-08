package fr.tyrolium.tyromod.security;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//@SideOnly(Side.SERVER)
@Mod.EventBusSubscriber(modid = Global.MODID)
public class EventSecurity {

    public static final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

    @SubscribeEvent
    public static void onEvent(EntityJoinWorldEvent event) {

        if (Global.USERITIUM_VERIF == 1) {

            /******************
             *
             *  SERVEUR ACTION
             *
             * ****************/

            /* CONNEXION D'UN UTILISATEUR */
            boolean isClient = event.getWorld().isRemote;
            if (event.getEntity() instanceof EntityPlayerMP && !isClient) {

//                System.out.println("HERE SERVER");

                EntityPlayerMP playerEntity = (EntityPlayerMP) event.getEntity();
                String pseudo = playerEntity.getName();

//                System.out.println("[TYROMOD] " + pseudo + " vient de rejoindre le monde !");
                TyroMod.logger.info("ℹ️ " + pseudo + " tente de se connecter...");
                TyroLogger.logClientBase("ℹ️ " + pseudo + " tente de se connecter...");
                TyroLogger.logServerConnection("ℹ️ " + pseudo + " tente de se connecter...");
                TyroLogger.logServerPlayer(pseudo, "ℹ️ Tentative de connexion au serveur...");


                int playerADejaUneBoucle = 0;
                for (EntityPlayer player : TyroMod.playerEnAttente) {

                    if (player.getName().equals(pseudo)) {
                        playerADejaUneBoucle = 1;
                    }

                }

                if (playerADejaUneBoucle == 0) {

                    /*Ajouter le player dans la liste d'attente*/
                    TyroMod.playerEnAttente.add(playerEntity);

                    /* LANCE LE DELAI */
//                        System.out.println("Planification de la verification dans 2 secondes pour " + pseudo);
                    executorService.schedule(() -> {
//                            System.out.println("Vérification exécutée pour " + pseudo);

                        /* ************
                         * VERIF TOKEN
                         **************/
                        int pseudoVerifToken = 1;
                        for (EntityPlayer player : TyroMod.playersVerifToken) {

                            if (player.getName().equals(pseudo)) {
                                pseudoVerifToken = 2;
                            }

                        }

                        if (pseudoVerifToken != 2) {

                            System.out.println("TOKEN TIME OUT DE "+ pseudo);
                            playerEntity.sendMessage(new TextComponentString("Connexion Time Out !"));
                            ((EntityPlayerMP) playerEntity).connection.disconnect(new TextComponentString("Your Token Useritium is time out"));

                        }

                        /* ************
                         * VERIF MOD
                         **************/
                        int pseudoVerifMod = 1;
                        for (EntityPlayer player : TyroMod.playersVerifMod) {

                            if (player.getName().equals(pseudo)) {
                                pseudoVerifMod = 2;
                            }

                        }

                        if (pseudoVerifMod != 2) {

                            System.out.println("MOD INVALIDE DE "+ pseudo);
                            playerEntity.sendMessage(new TextComponentString("Connexion Mod Invalide !"));
                            ((EntityPlayerMP) playerEntity).connection.disconnect(new TextComponentString("Your Mod is invalide"));

                        }


                        /* ************
                         * VERIF FINAL
                         **************/

                        if(pseudoVerifMod == 2 && pseudoVerifToken == 2) {

                            /* AJOUTER DANS LE TABLEAU DES VERIFIER */
                            TyroMod.playersCanConnect.add(playerEntity);

                            System.out.println("[TYROMOD] " + playerEntity.getName() + " vient d'etre verifier !!");
                            playerEntity.sendMessage(new TextComponentString("\u00A7f[TyroPlugin] \u00A7aConnexion \u00E9tablie !"));

                            /* VIDER LA VERIF POUR REVERIF A CHAQUE FOIS */
                            for (EntityPlayer player : TyroMod.playersVerifToken) {
                                if (player.getName().equals(pseudo)) {
                                    TyroMod.playersVerifToken.remove(player);
                                }
                            }
                            for (EntityPlayer player : TyroMod.playersVerifMod) {
                                if (player.getName().equals(pseudo)) {
                                    TyroMod.playersVerifMod.remove(player);
                                }
                            }

                        } else {

                            System.out.println("CLIENT INVALIDE DE "+ pseudo);
                            playerEntity.sendMessage(new TextComponentString("Connexion CLIENT Invalide !"));
                            ((EntityPlayerMP) playerEntity).connection.disconnect(new TextComponentString("Your CLIENT is invalide"));


                        }


                    }, 2, TimeUnit.SECONDS);
                }
                /*DEBUG INFO*/

                /*String ip = ((EntityPlayerMP) playerEntity).getPlayerIP();
                System.out.println("pseudo : " + pseudo + " ip : " + ip);*/

            }
        }
    }


    @SubscribeEvent
    public static void onEvent(PlayerEvent.PlayerLoggedOutEvent event) {
        EntityPlayer player = event.player;

        System.out.println("[TYROMOD] " + player.getName() + " vient de se deconnecter .");

        /* SERVEUR */
        TyroMod.playerEnAttente.remove(player);
        TyroMod.playersVerifToken.remove(player);
        TyroMod.playersVerifMod.remove(player);
        TyroMod.playersCanConnect.remove(player);

    }



}
