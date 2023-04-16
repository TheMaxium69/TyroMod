package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.block.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TyroMod.ModId);

    //Tyrolium
    public static RegistryObject<Block> TYROLIUM_BLOCK = createBlock("tyrolium_block", () -> new TyroliumBlock());
    public static RegistryObject<Block> TYROLIUM_ORE = createBlock("tyrolium_ore", () -> new TyroliumOre());

    // Copper
    public static RegistryObject<Block> COPPER_BLOCK = createBlock("copper_block", () -> new CopperBlock());
    public static RegistryObject<Block> COPPER_ORE = createBlock("copper_ore", () -> new CopperOre());


    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier){
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ModItemGroup.TAB_TYROMOD)));
        return block;
    }
}


