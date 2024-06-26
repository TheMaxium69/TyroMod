package fr.tyrolium.tyromod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesMod {

    public static void init()
    {
        /* ********
          FURNACE
        ******** */

        /*ORE*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.getBlockCustomClass("bc0")), new ItemStack(ItemsMod.getItemCustomClass("c0")), 1.5F); /*TYROLIUM*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[32]), new ItemStack(ItemsMod.items[234]), 1.5F); /*ADAMENTIUM*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[10]), new ItemStack(ItemsMod.items[57]), 1.5F); /*COPPER*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[46]), new ItemStack(ItemsMod.items[355]), 1.5F); /*MYTHRIL*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[26]), new ItemStack(ItemsMod.items[202]), 1.5F); /*TIN*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[22]), new ItemStack(ItemsMod.items[182]), 1.5F); /*RUBY*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[24]), new ItemStack(ItemsMod.items[192]), 1.5F); /*SAPPHIRE*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[43]), new ItemStack(ItemsMod.items[335]), 1.5F); /*JADE*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[17]), new ItemStack(ItemsMod.items[128]), 1.5F); /*MERCURE*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[3]), new ItemStack(ItemsMod.items[11]), 1.5F); /*RHODONITE*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[5]), new ItemStack(ItemsMod.items[22]), 1.5F); /*AMETHYS*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[7]), new ItemStack(ItemsMod.items[33]), 1.5F); /*YELLORITE*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[13]), new ItemStack(ItemsMod.items[88]), 1.5F); /*ENDERINE*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[56]), new ItemStack(ItemsMod.items[497]), 1.5F); /*VOLCANITE*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[54]), new ItemStack(ItemsMod.items[438]), 1.5F); /*NETHERITE*/
        GameRegistry.addSmelting(new ItemStack(BlocksMod.blocks[100]), new ItemStack(ItemsMod.items[937]), 1.5F); /*IUM*/

        /*PURIFIED*/
        GameRegistry.addSmelting(new ItemStack(Items.DIAMOND), new ItemStack(ItemsMod.items[599]), 1.5F); /*PURIFIED DIAMOND*/
        GameRegistry.addSmelting(new ItemStack(Items.GOLD_INGOT), new ItemStack(ItemsMod.items[160]), 1.5F); /*PURIFIED GOLD*/
        GameRegistry.addSmelting(new ItemStack(Items.IRON_INGOT), new ItemStack(ItemsMod.items[589]), 1.5F); /*PURIFIED IRON*/
        GameRegistry.addSmelting(new ItemStack(ItemsMod.items[202]), new ItemStack(ItemsMod.items[213]), 1.5F); /*TITANE*/
        GameRegistry.addSmelting(new ItemStack(Items.ROTTEN_FLESH), new ItemStack(ItemsMod.foods[968]), 1.5F); /*PURIFIED FLESH*/



    }

}
