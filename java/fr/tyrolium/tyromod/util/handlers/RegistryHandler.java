package fr.tyrolium.tyromod.util.handlers;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.BlocksMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.init.RecipesMod;
import fr.tyrolium.tyromod.proxy.Client;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemsMod.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BlocksMod.BLOCKS.toArray(new Block[0]));
        TileEntityHandler.registerTileEntities();
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {

        for(Item item : ItemsMod.ITEMS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }

        for(Block block : BlocksMod.BLOCKS)
        {
            if(block instanceof IHasModel)
            {
                ((IHasModel)block).registerModels();
            }
        }
    }

    public static void preInitRegistries(FMLPreInitializationEvent event)
    {

    }

    public static void initRegistries(FMLInitializationEvent event)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(TyroMod.instance, new GuiHandler());
        RecipesMod.init();

    }

    public static void postInitRegistries(FMLPostInitializationEvent event)
    {

    }
}
