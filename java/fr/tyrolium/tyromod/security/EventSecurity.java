package fr.tyrolium.tyromod.security;

import fr.tyrolium.tyromod.TyroMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class EventSecurity {

    public static int iterationEvent = 0;

    @Mod.EventBusSubscriber
    public static class EventBus {


        @SubscribeEvent
        public static void onEvent(EntityJoinWorldEvent event) {

//            if(iterationEvent == 0) {
//                System.out.println("Loading Security");

                for (EntityPlayer playerEntity : event.getWorld().playerEntities) {
//                    System.out.println(playerEntity);

                    boolean isClient = event.getWorld().isRemote;
                    String pseudo = playerEntity.getName();
//                    System.out.println("isServeur ? : " + isClient);

                    if (playerEntity instanceof EntityPlayerMP && !isClient) {
//                        System.out.println("Tu est est un serveur");

                        /* SERVEUR ACTION */
                        String ip = ((EntityPlayerMP) playerEntity).getPlayerIP();
//                        System.out.println("pseudo : " + pseudo + " ip : " + ip);


                    } else if (isClient) {
//                        System.out.println("Tu est est un client");


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
