package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.blocks.YelloriteBlock;
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
public class AdamBlockMod {

    public static Block yellorite_block;

    public static void init(){

        yellorite_block = new YelloriteBlock("yellorite_block", Material.IRON);

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(yellorite_block);
    }

    @SubscribeEvent
    public static void registerItemBBlocks(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(

                new ItemBlock(yellorite_block).setRegistryName(yellorite_block.getRegistryName())

        );
    }

    @SubscribeEvent
    public static void registryRenders(ModelRegistryEvent event){

        registerRender(Item.getItemFromBlock(yellorite_block));

    }

    private static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
