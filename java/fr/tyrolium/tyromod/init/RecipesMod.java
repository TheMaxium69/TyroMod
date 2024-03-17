package fr.tyrolium.tyromod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesMod {

    public static void init()
    {
        GameRegistry.addSmelting(new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 5, 3), 1.5F);
    }

}
