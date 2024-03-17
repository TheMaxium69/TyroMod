package fr.tyrolium.tyromod;

import fr.tyrolium.tyromod.creativetabs.TyroModTab;
import fr.tyrolium.tyromod.init.*;
import fr.tyrolium.tyromod.proxy.Server;
import net.minecraft.creativetab.CreativeTabs;
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

    public static final CreativeTabs TyroModTab = new TyroModTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

        BlocksMod.init();
        _KevinBlockMod.init();
        _AdamBlockMod.init();
        ItemsMod.init();
        _KevinItemMod.init();
        _AdamItemMod.init();
        RecipesMod.init();
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
