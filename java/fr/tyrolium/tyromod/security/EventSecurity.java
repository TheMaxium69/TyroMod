package fr.tyrolium.tyromod.security;

import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.GameType;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.GameData;

public class EventSecurity {

    public static int iterationEvent = 0;

    @Mod.EventBusSubscriber
    public static class EventBus {


        @SubscribeEvent
        public static void onEvent(EntityJoinWorldEvent event) {

            if(iterationEvent == 0) {
                System.out.println("Loading Security");

                for (EntityPlayer playerEntity : event.getWorld().playerEntities) {
//                    System.out.println(playerEntity);

                    Boolean isServer = event.getWorld().isRemote;

                    if (playerEntity instanceof EntityPlayerMP /*&& isServer*/) {
                        iterationEvent = 1;

                        String pseudo = playerEntity.getName();
                        String ip = ((EntityPlayerMP) playerEntity).getPlayerIP();

                        System.out.println("pseudo : " + pseudo + " ip : " + ip);

                        PacketToken.postDataToApi(LauncherToken.getTokenUser(), LauncherToken.getTokenUserOld(), (EntityPlayerMP) playerEntity);


                    }
                }

            }

        }

    }

}
