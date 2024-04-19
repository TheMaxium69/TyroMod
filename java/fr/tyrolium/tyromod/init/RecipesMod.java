package fr.tyrolium.tyromod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesMod {

    public static void init()
    {
        /*FURNACE*/
        GameRegistry.addSmelting(new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 5, 3), 1.5F); // NIQUE TA MERE LEXEMPLE
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[0]), new ItemStack(ItemsMod.items[0]), 1.5F);
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[3]), new ItemStack(ItemsMod.items[11]), 1.5F);
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[33]), new ItemStack(ItemsMod.items[236]), 1.5F);
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[7]), new ItemStack(ItemsMod.items[22]), 1.5F);
        GameRegistry.addSmelting(new ItemStack(ItemsMod.armors[8]), new ItemStack(ItemsMod.shovels[16]), 1.5F);
//        GameRegistry.add
    }

}
