package fr.tyrolium.maxime;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.tyrolium.maxime.init.*;
import fr.tyrolium.maxime.proxy.CommonMod;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;

@Mod(modid = InfoMod.MOD_ID, name = InfoMod.MOD_NAME, version = InfoMod.VERSION, acceptedMinecraftVersions = InfoMod.MC_VERSION)
public class MainMod
{
    @SidedProxy(clientSide = InfoMod.CLIENT_PROXY, serverSide = InfoMod.SERVER_PROXY)
    public static CommonMod proxy;

    public static CreativeTabs tyromod = new CreativeTabs("tyromod")
    {
        @SideOnly(Side.CLIENT)

        public Item getTabIconItem()
        {
            return ItemMod.tyrolium;
        };
    };
    public static CreativeTabs tyromodmachine = new CreativeTabs("tyromodmachine")
    {
        @SideOnly(Side.CLIENT)

        /*public Item getTabIconItem()
        {
            return Item.getItemFromBlock(BlockMod.tyrolium_block);
        };*/
        public Item getTabIconItem()
        {
            return ItemMod.tyrolium_nugget;
        };
    };
    public static CreativeTabs tyromodcrea = new CreativeTabs("tyromodcrea")
    {
        @SideOnly(Side.CLIENT)

        public Item getTabIconItem()
        {
            return ItemMod.tyrolium;
        };
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemMod.init();
        ItemMod.register();
        BlockMod.init();
        BlockMod.register();
        ToolMod.init();
        ToolMod.register();
        ArmorMod.init();
        ArmorMod.register();
        CraftMod.register();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
