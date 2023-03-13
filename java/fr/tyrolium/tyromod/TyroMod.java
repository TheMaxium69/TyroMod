package fr.tyrolium.tyromod;

import fr.tyrolium.tyromod.init.ModBlocks;
import fr.tyrolium.tyromod.init.ModItems;
import fr.tyrolium.tyromod.network.PacketToken;
import fr.tyrolium.tyromod.security.LauncherToken;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import net.minecraftforge.fml.server.ServerLifecycleHooks;
import org.apache.logging.log4j.LogManager;


import java.util.Optional;

@Mod(TyroMod.ModId)
public class TyroMod {

    public static final String ModId = "tyromod";

    public static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel NETWORK = NetworkRegistry.newSimpleChannel(new ResourceLocation(ModId, "channel"), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);


    public TyroMod() {

        LauncherToken.Token();
        System.out.println("GetToken : " + LauncherToken.getTokenUser() + " GetTokenOld : " + LauncherToken.getTokenUserOld());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);

    }

    private void setup(FMLCommonSetupEvent e){

        int index = 0;
        NETWORK.registerMessage(index, PacketToken.class, PacketToken::encode, PacketToken::decode, PacketToken::handle, Optional.of(NetworkDirection.PLAY_TO_SERVER));

    }

    private void clientSetup(FMLClientSetupEvent e){

    }

    /*@Mod.EventBusSubscriber
    public static class EventBus {

        @SubscribeEvent
        public static void onEvent(EntityJoinWorldEvent event) {
            if ((event.getEntity() instanceof PlayerEntity)) {

                System.out.println("Connecte");

                NETWORK.sendToServer(new PacketToken(LauncherToken.getTokenUser()));

            }
        }

    }*/





}

