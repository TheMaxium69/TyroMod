package fr.tyrolium.tyromod.creativetabs;

import fr.tyrolium.tyromod.init.ItemsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TyroModTabV3 extends CreativeTabs {
    public TyroModTabV3()
    {
        super("TyroModOreV3");
        this.setBackgroundImageName("tyromod3.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemsMod.swords[235]);
    }
}
