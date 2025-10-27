package fr.tyrolium.tyromod.security;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class EventSecurity {

    public static final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);


    @Mod.EventBusSubscriber
    public static class EventBus {


        @SubscribeEvent
        public static void onEvent(EntityJoinWorldEvent event) {

            if (Global.USERITIUM_VERIF == 1) {

                boolean isClient = event.getWorld().isRemote;


                /******************
                 *
                 *  CLIENT ACTION
                 *
                 * ****************/

                if (event.getEntity() instanceof EntityPlayerSP && isClient) {

//                    System.out.println("HERE CLIENT");

                    EntityPlayerSP playerEntity = (EntityPlayerSP) event.getEntity();
                    String pseudoConnect = playerEntity.getName();

                    EntityPlayer myPlayer = Minecraft.getMinecraft().player;

                    if (myPlayer != null) {
                        String myPseudo = myPlayer.getName();
//                        System.out.println("Mon pseudo est : " + myPseudo);

                        if (pseudoConnect == myPseudo) {

                            String modlist = Loader.instance().getActiveModList().stream().map(mod -> mod.getModId() + "@" + mod.getVersion()).collect(Collectors.joining(", "));

//                            System.out.println("ENVOIE DE PAQUET");
                            TyroMod.networkWrapper.sendToServer(new PacketClass(LauncherToken.getTokenUser(), LauncherToken.getTokenUserOld(), modlist));

                        }
                    }
                }

                /******************
                 *
                 *  SERVEUR ACTION
                 *
                 * ****************/


                /* CONNEXION D'UN UTILISATEUR */
                if (event.getEntity() instanceof EntityPlayerMP && !isClient) {

//                        System.out.println("HERE SERVER");

                    EntityPlayerMP playerEntity = (EntityPlayerMP) event.getEntity();
                    String pseudo = playerEntity.getName();

                    System.out.println("[TYROMOD] " + pseudo + " vient de rejoindre le monde !");


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
                        System.out.println("Planification de la verification dans 2 secondes pour " + pseudo);
                        executorService.schedule(() -> {
                            System.out.println("Vérification exécutée pour " + pseudo);

                            /* VERIFIE SI TU A BIEN ENVOYER LES TOKENS*/
                            int pseudoExisting = 1;
                            for (EntityPlayer player : TyroMod.playersVerif) {

                                if (player.getName().equals(pseudo)) {
                                    pseudoExisting = 2;
                                }

                            }

                            if (pseudoExisting == 2) {

                                playerEntity.sendMessage(new TextComponentString("\u00A7f[TyroPlugin] \u00A7aConnexion \u00E9tablie !"));

                                /* VIDER LA VERIF POUR REVERIF A CHAQUE FOIS */
                                for (EntityPlayer player : TyroMod.playersVerif) {
                                    if (player.getName().equals(pseudo)) {
                                        TyroMod.playersVerif.remove(player);
                                    }
                                }

                            } else {

                                System.out.println("TOKEN TIME OUT DE "+ pseudo);
                                playerEntity.sendMessage(new TextComponentString("Connexion Time Out !"));
                                ((EntityPlayerMP) playerEntity).connection.disconnect(new TextComponentString("Your Token Useritium is time out"));

                            }

                        }, 10, TimeUnit.SECONDS);
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


            System.out.println("[TYROMOD] " + player.getName() + " vient de ce deconnecter .");

            /* SERVEUR */
            TyroMod.playerEnAttente.remove(player);
            TyroMod.playersVerif.remove(player);

        }

    }

}
