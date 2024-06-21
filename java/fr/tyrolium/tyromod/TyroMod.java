package fr.tyrolium.tyromod;

import fr.tyrolium.tyromod.creativetabs.TyroModTabUtils;
import fr.tyrolium.tyromod.creativetabs.TyroModTabV1;
import fr.tyrolium.tyromod.creativetabs.TyroModTabV3;
import fr.tyrolium.tyromod.creativetabs.TyroModTabServ;
import fr.tyrolium.tyromod.init.BlocksMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.proxy.CommonProxy;
import fr.tyrolium.tyromod.security.LauncherToken;
import fr.tyrolium.tyromod.security.PacketClass;
import fr.tyrolium.tyromod.security.PacketToken;
import fr.tyrolium.tyromod.util.handlers.RegistryHandler;
import fr.tyrolium.tyromod.world.generation.WorldGenOres;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Mod(modid = Global.MODID, name = Global.NAME, version = Global.VERSION, acceptedMinecraftVersions = Global.MINECRAFT_VERSION)
public class TyroMod
{
    @Instance
    public static TyroMod instance;

    @SidedProxy(clientSide = Global.CLIENT_PROXY, serverSide = Global.SERVER_PROXY)
    public static CommonProxy proxy;
    private static Logger logger;

    /* CREATIVE TAB*/
    public static final CreativeTabs TyroModTabV1 = new TyroModTabV1();
    public static final CreativeTabs TyroModTabV3 = new TyroModTabV3();
    public static final CreativeTabs TyroModTabUtils = new TyroModTabUtils();
    public static final CreativeTabs TyroModTabServ = new TyroModTabServ();

    /*PLAYER CONNECTED*/
    public static final ArrayList<EntityPlayer> playersVerif = new ArrayList<>();
    public static final ArrayList<EntityPlayer> playerEnAttente = new ArrayList<>();

    /* CHANNEL PAQUET */
    public static SimpleNetworkWrapper networkWrapper;
    public TyroMod(){
        networkWrapper = NetworkRegistry.INSTANCE.newSimpleChannel("MyChannel");
        networkWrapper.registerMessage(PacketClass.Handler.class, PacketClass.class,
                0, Side.SERVER);
    }


    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();
        logger.info("PreINIT");

        RegistryHandler.preInitRegistries(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        logger.info("INIT");
        logger.info("TyroMod a bien charger");

        RegistryHandler.initRegistries(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        logger.info("PostINIT");

        RegistryHandler.postInitRegistries(event);

    }


}
