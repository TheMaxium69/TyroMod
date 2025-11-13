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

        if (!Global.DEBUG_NOTVERIF) {

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


                int playerDontFirstConnect = 0;
                for (EntityPlayer player : TyroMod.playersWaiting) {

                    if (player.getName().equals(pseudo)) {
                        playerDontFirstConnect = 1;
                    }

                }

                for (EntityPlayer player : TyroMod.playersCanConnect) {

                    if (player.getName().equals(pseudo)) {
                        playerDontFirstConnect = 1;
                    }

                }

                if (playerDontFirstConnect == 1){

                    String worldName = event.getWorld().getWorldInfo().getWorldName();

                    if (worldName.equals("world")) {
                        worldName = "world_void";
                    }

                    TyroLogger.logServerPlayer(pseudo, "ℹ️ Téléportation vers : " + worldName);

                } else {

                    TyroMod.logger.info(Global.PREFIX_LOGGER + "ℹ️ " + pseudo + " tente de se connecter...");
                    TyroLogger.logClientBase("ℹ️ " + pseudo + " tente de se connecter...");
                    TyroLogger.logServerConnection("ℹ️ " + pseudo + " tente de se connecter...");
                    TyroLogger.logServerPlayer(pseudo, "-----------------------------------------------------------------------------");
                    TyroLogger.logServerPlayer(pseudo, "ℹ️ Tentative de connexion au serveur...");
                    TyroLogger.logServerPlayer(pseudo, "ℹ️ Connexion avec l'ip : " + ((EntityPlayerMP) playerEntity).getPlayerIP());


                    /*Ajouter le player dans la liste d'attente*/
                    TyroMod.playersWaiting.add(playerEntity);

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

                        if (pseudoVerifToken == 2) {

                            TyroLogger.logServerPlayer(pseudo, "✅ Token validé avec succès");

                        } else {

//                            System.out.println("TOKEN TIME OUT DE "+ pseudo);
                            TyroLogger.logServerPlayer(pseudo, "❌ Aucun Token n'a pu être validé");
//                            ((EntityPlayerMP) playerEntity).connection.disconnect(new TextComponentString("Your Token Useritium is time out"));

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

                        if (pseudoVerifMod == 2) {
                            TyroLogger.logServerPlayer(pseudo, "✅ Mods validés avec succès");

                        } else {

//                            System.out.println("MOD INVALIDE DE "+ pseudo);

                            TyroLogger.logServerPlayer(pseudo, "❌ Les Mods n'ont pu être validés");

//                            ((EntityPlayerMP) playerEntity).connection.disconnect(new TextComponentString("Your Mod is invalide"));

                        }


                        /* ************
                         * VERIF FINAL
                         **************/

                        if(pseudoVerifMod == 2 && pseudoVerifToken == 2) {

                            /* AJOUTER DANS LE TABLEAU DES VERIFIER */
                            TyroMod.playersCanConnect.add(playerEntity);

                            TyroLogger.logServerPlayer(pseudo, "✅ Vérifications réussies et le client est connecté");
                            TyroLogger.logServerConnection("✅ "+ pseudo +" a passé les vérifications et est connecté");
                            TyroMod.logger.info(Global.PREFIX_LOGGER + "✅ "+ pseudo +" a passé les vérifications et est connecté");
                            TyroLogger.logClientBase("✅ "+ pseudo +" a passé les vérifications et est connecté");

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

//                            System.out.println("CLIENT INVALIDE DE "+ pseudo);
                            TyroLogger.logServerPlayer(pseudo, "❌ Vérifications échouées");

                            TyroMod.logger.error(Global.PREFIX_LOGGER + "❌ "+ pseudo +" a été refusé par l'algorithme de vérification");
                            TyroLogger.logClientBase("❌ "+ pseudo +" a été refusé par l'algorithme de vérification");
                            TyroLogger.logServerConnection("❌ "+ pseudo +" a été refusé par l'algorithme de vérification");


                            String whyKick = "(⚠ Raison : Inconnue, contactez le staff)";
                            if (pseudoVerifToken != 2 && pseudoVerifMod != 2) {
                                whyKick = "(⚠ Raison : Compte Useritium et Mods invalide)";
                            } else if (pseudoVerifToken != 2 && pseudoVerifMod == 2 ) {
                                whyKick = "(⚠ Raison : Compte Useritium invalide)";
                            } else if (pseudoVerifToken == 2 && pseudoVerifMod != 2) {
                                whyKick = "(⚠ Raison : Mods invalide)";
                            }


                            ((EntityPlayerMP) playerEntity).connection.disconnect(new TextComponentString("L'algorithme de vérification vous a refusé l'accès " + "\n"
                                    + whyKick + "\n" + "\n"
                                    + "Veuillez redémarrer votre jeu et votre launcher"));


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

        TyroMod.logger.info(Global.PREFIX_LOGGER + "ℹ️ " + player.getName() + " vient de se déconnecter");
        TyroLogger.logClientBase("ℹ️ " + player.getName() + " vient de se déconnecter");
        TyroLogger.logServerPlayer(player.getName(), "ℹ️ " + player.getName() + " vient de se déconnecter");

        /* SERVEUR */
        TyroMod.playersWaiting.remove(player);
        TyroMod.playersWaitingWithPaquet.remove(player);
        TyroMod.playersVerifToken.remove(player);
        TyroMod.playersVerifMod.remove(player);
        TyroMod.playersCanConnect.remove(player);

    }



}
