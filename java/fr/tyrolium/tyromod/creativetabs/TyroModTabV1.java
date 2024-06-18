package fr.tyrolium.tyromod.creativetabs;

import fr.tyrolium.tyromod.init.ItemsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TyroModTabV1 extends CreativeTabs {
    public TyroModTabV1()
    {
        super("TyroModOreV1");
        this.setBackgroundImageName("tyromod1.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemsMod.getItemCustomClass("c2"));
    }
}
