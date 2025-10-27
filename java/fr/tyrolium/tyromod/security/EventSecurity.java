package fr.tyrolium.tyromod.security;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class EventSecurity {

    public static int iterationEvent = 0;

    @Mod.EventBusSubscriber
    public static class EventBus {


        @SubscribeEvent
        public static void onEvent(EntityJoinWorldEvent event) {

            if (Global.USERITIUM_VERIF == 1) {

                for (EntityPlayer playerEntity : event.getWorld().playerEntities) {

                    boolean isClient = event.getWorld().isRemote;
                    String pseudo = playerEntity.getName();

                    if (playerEntity instanceof EntityPlayerMP && !isClient) {

                        /******************
                        *
                        *  SERVEUR ACTION
                        *
                        * ****************/


                        System.out.println("HERE SERVER");
                        // Get player mods





//                        EntityPlayerMP playerMP = (EntityPlayerMP) playerEntity;
//                        String playerMods = String.join(", ", net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage.ModList.decode(playerMP.connection.netManager).modList());
//                        System.out.println("Player " + pseudo + " has mods: " + playerMods);







                        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();


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
                            executorService.schedule(() -> {

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

                            }, 2, TimeUnit.SECONDS);
                        }
                        /*DEBUG INFO*/

                        /*String ip = ((EntityPlayerMP) playerEntity).getPlayerIP();
                        System.out.println("pseudo : " + pseudo + " ip : " + ip);*/


                    } else if (isClient) {

                        /******************
                         *
                         *  CLIENT ACTION
                         *
                         * ****************/

    //                    if (iterationEvent != 1) {
    //                        System.out.println("ENVOIE DU PAQUET");


                            String modlist = Loader.instance().getActiveModList().stream()
                                .map(mod -> mod.getModId() + "@" + mod.getVersion()).collect(Collectors.joining(", "));

                            System.out.println("HERE CLIENT");
                        
                            TyroMod.networkWrapper.sendToServer(new PacketClass(LauncherToken.getTokenUser(), LauncherToken.getTokenUserOld(), modlist));

                            


    //                        iterationEvent = 1;
    //                    }

                    }
                }
            }
        }


        @SubscribeEvent
        public static void onEvent(PlayerEvent.PlayerLoggedOutEvent event) {
            EntityPlayer player = event.player;

            System.out.println(player.getName() + " has disconnected.");

            /* SERVEUR */
            TyroMod.playerEnAttente.remove(player);
            TyroMod.playersVerif.remove(player);

        }

    }

}
