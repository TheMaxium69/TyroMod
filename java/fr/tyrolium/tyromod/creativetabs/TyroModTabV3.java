package fr.tyrolium.tyromod.creativetabs;

import fr.tyrolium.tyromod.init.ItemsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TyroModTabV3 extends CreativeTabs {
    public TyroModTabV3()
    {
        super("TyroMod Ore V3");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemsMod.swords[237]);
    }
}
