package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
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
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Global.MODID)
public class BlocksMod {

    public static Block tyrolium_block;
    public static Block tyrolium_ore;
    public static Block rhodonite_block;
    public static Block rhodonite_ore;

    public static void init(){
        tyrolium_block = new TyroliumBlock("tyrolium_block", Material.IRON);
        tyrolium_ore = new TyroliumOre("tyrolium_ore", Material.ROCK);
        rhodonite_block = new RhodoniteBlock("rhodonite_block", Material.IRON);
        rhodonite_ore = new RhodoniteOre("rhodonite_ore", Material.ROCK);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(tyrolium_block, tyrolium_ore, rhodonite_block, rhodonite_ore);
    }

    @SubscribeEvent
    public static void registerItemBBlocks(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                new ItemBlock(tyrolium_block).setRegistryName(tyrolium_block.getRegistryName()),
                new ItemBlock(tyrolium_ore).setRegistryName(tyrolium_ore.getRegistryName()),
                new ItemBlock(rhodonite_block).setRegistryName(rhodonite_block.getRegistryName()),
                new ItemBlock(rhodonite_ore).setRegistryName(rhodonite_ore.getRegistryName())
        );
    }

    @SubscribeEvent
    public static void registryRenders(ModelRegistryEvent event){
        registerRender(Item.getItemFromBlock(tyrolium_block));
        registerRender(Item.getItemFromBlock(tyrolium_ore));
        registerRender(Item.getItemFromBlock(rhodonite_block));
        registerRender(Item.getItemFromBlock(rhodonite_ore));
    }

    private static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }


}
