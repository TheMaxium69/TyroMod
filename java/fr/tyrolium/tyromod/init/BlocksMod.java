package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.blocks.RhodoniteBlock;
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
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Global.MODID)
public class BlocksMod {

    public static Block tyrolium_block;
    public static Block tyrolium_ore;
    public static Block rhodonite_block;

    public static void ini(){
        tyrolium_block = new TyroliumBlock("tyrolium_block", Material.IRON);
        tyrolium_ore = new TyroliumOre("tyrolium_ore", Material.IRON);
        rhodonite_block = new RhodoniteBlock("rhodonite_block", Material.IRON);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(tyrolium_block, rhodonite_block);
    }

    @SubscribeEvent
    public static void registerItemBBlocks(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                new ItemBlock(tyrolium_block).setRegistryName(tyrolium_block.getRegistryName()),
                new ItemBlock(tyrolium_ore).setRegistryName(tyrolium_ore.getRegistryName()),
                new ItemBlock(rhodonite_block).setRegistryName(rhodonite_block.getRegistryName())

        );
    }

    @SubscribeEvent
    public static void registryRenders(ModelRegistryEvent event){
        registerRender(Item.getItemFromBlock(tyrolium_block));
        registerRender(Item.getItemFromBlock(tyrolium_ore));
        registerRender(Item.getItemFromBlock(rhodonite_block));
    }

    private static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }


}
