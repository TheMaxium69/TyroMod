package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.blocks.RhodoniteBlock;
import fr.tyrolium.tyromod.blocks.RhodoniteOre;
import fr.tyrolium.tyromod.blocks.TyroliumBlock;
import fr.tyrolium.tyromod.blocks.TyroliumOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class KevinBlockMod {

    public static void init(){
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll();
    }

    @SubscribeEvent
    public static void registerItemBBlocks(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
        );
    }

    @SubscribeEvent
    public static void registryRenders(ModelRegistryEvent event){
    }

    private static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }


}
