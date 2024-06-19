package fr.tyrolium.tyromod.tileentity.recipes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import fr.tyrolium.tyromod.init.ItemsMod;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.Sys;

public class FusionBlockRecipes {
    private static final FusionBlockRecipes INSTANCE = new FusionBlockRecipes();
    private List<FusionRecipe> fusionRecipes = new ArrayList<>();

    private static class FusionRecipe {
        ItemStack input1, input2, result;

        FusionRecipe(ItemStack input1, ItemStack input2, ItemStack result) {
            this.input1 = input1;
            this.input2 = input2;
            this.result = result;
        }
    }

    public static FusionBlockRecipes getInstance() {
        return INSTANCE;
    }

    private FusionBlockRecipes() {
        addFusionRecipe(new ItemStack(ItemsMod.items[22]), new ItemStack(ItemsMod.items[33]), new ItemStack(ItemsMod.items[11]), 5.0F);
        addFusionRecipe(new ItemStack(ItemsMod.items[11]), new ItemStack(ItemsMod.items[23]), new ItemStack(ItemsMod.items[12]), 5.0F);
        addFusionRecipe(new ItemStack(Items.APPLE), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.GOLDEN_APPLE), 5.0F);
    }

    public void addFusionRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) {
        if (!getSinteringResult(input1, input2).isEmpty()) return;
        fusionRecipes.add(new FusionRecipe(input1, input2, result));
    }

    public ItemStack getSinteringResult(ItemStack input1, ItemStack input2) {
        // Removed log statements.
        System.out.println(input1);
        System.out.println(input2);

//        fusionRecipes.clear();
//        new FusionBlockRecipes();


        for (FusionRecipe recipe : fusionRecipes) {
            System.out.println(recipe);
            if (recipe.input1.isItemEqual(input1) && recipe.input2.isItemEqual(input2))
                System.out.println(recipe.result);
                return recipe.result;
        }
        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

//    public Map<ItemStack, Map<ItemStack, ItemStack>> getDualSmeltingList() {
//        return smeltingList;
//    }
//
//    public float getSinteringExperience(ItemStack stack) {
//        for (Entry<ItemStack, Float> entry : experienceList.entrySet()) {
//            if (compareItemStacks(stack, entry.getKey())) {
//                return entry.getValue().floatValue();
//            }
//        }
//        return 0.0F;
//    }
}
