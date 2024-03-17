package fr.tyrolium.tyromod;

import fr.tyrolium.tyromod.init.BlocksMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.proxy.Server;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Global.MODID, name = Global.NAME, version = Global.VERSION, acceptedMinecraftVersions = Global.MINECRAFT_VERSION)
public class TyroMod
{
    @SidedProxy(clientSide = Global.CLIENT_PROXY, serverSide = Global.SERVER_PROXY, modId = Global.MODID)
    public static Server proxy;
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

        BlocksMod.init();
        ItemsMod.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.register();

        logger.info("TyroMod a bien charger");
        logger.info("TYROLIUM BLOCK >> {}", BlocksMod.tyrolium_block.getRegistryName());
        
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
