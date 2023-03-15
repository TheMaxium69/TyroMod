package fr.tyrolium.tyromod.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup TAB_TYROMOD = new ItemGroup("tyroModTab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TYROLIUM_SWORD.get());
        }
    };
}
