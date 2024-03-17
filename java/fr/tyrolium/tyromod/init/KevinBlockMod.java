package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Global.MODID)
public class KevinBlockMod {

    public static Block amethys_block;
    public static Block amethys_ore;

    public static void init(){

        amethys_block = new AmethysBlock("amethys_block", Material.IRON);
        amethys_ore = new AmethysOre("amethys_ore", Material.ROCK);

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(amethys_block, amethys_ore);
    }

    @SubscribeEvent
    public static void registerItemBBlocks(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                new ItemBlock(amethys_block).setRegistryName(amethys_block.getRegistryName()),
                new ItemBlock(amethys_ore).setRegistryName(amethys_ore.getRegistryName())
        );
    }

    @SubscribeEvent
    public static void registryRenders(ModelRegistryEvent event){
        registerRender(Item.getItemFromBlock(amethys_block));
        registerRender(Item.getItemFromBlock(amethys_ore));
    }

    private static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }


}
