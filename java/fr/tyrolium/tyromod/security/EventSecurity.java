package fr.tyrolium.tyromod.security;

import fr.tyrolium.tyromod.TyroMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import java.util.ArrayList;

public class EventSecurity {

    public static int iterationEvent = 0;

    @Mod.EventBusSubscriber
    public static class EventBus {


        @SubscribeEvent
        public static void onEvent(EntityJoinWorldEvent event) {

//            if(iterationEvent == 0) {
                System.out.println("Loading Security");

                for (EntityPlayer playerEntity : event.getWorld().playerEntities) {

                    boolean isClient = event.getWorld().isRemote;
                    String pseudo = playerEntity.getName();

                    if (playerEntity instanceof EntityPlayerMP && !isClient) {
                        System.out.println("Tu est est un serveur");

                        System.out.println("players verif : " + TyroMod.playersVerif);
                        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

                        executorService.schedule(() -> {



                            System.out.println("TOKEN TIME OUT DE "+ pseudo);
                            playerEntity.sendMessage(new TextComponentString("Connexion Time Out !"));
                            ((EntityPlayerMP) playerEntity).connection.disconnect(new TextComponentString("Your Token Useritium is time out"));

                        }, 10, TimeUnit.SECONDS);


                        /* SERVEUR ACTION */
                        String ip = ((EntityPlayerMP) playerEntity).getPlayerIP();
                        System.out.println("pseudo : " + pseudo + " ip : " + ip);


                    } else if (isClient) {
                        System.out.println("Tu est est un client");


                        /* CLIENT ACTION */
//                        if(iterationEvent == 0) {
                            System.out.println("ENVOIE DU PAQUET");
                            TyroMod.networkWrapper.sendToServer(new PacketClass(LauncherToken.getTokenUser(), LauncherToken.getTokenUserOld()));
//                        }
//                        iterationEvent = 1;

                    }
                }

//            }





        }

    }

}
