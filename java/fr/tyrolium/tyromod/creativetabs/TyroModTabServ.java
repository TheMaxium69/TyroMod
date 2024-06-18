package fr.tyrolium.tyromod.creativetabs;

import fr.tyrolium.tyromod.init.ItemsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TyroModTabServ extends CreativeTabs {
    public TyroModTabServ()
    {
        super("TyroModServer");
        this.setBackgroundImageName("tyromod2.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemsMod.getItemCustomClass("c967"));
    }
}
