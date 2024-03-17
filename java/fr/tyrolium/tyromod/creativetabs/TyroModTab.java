package fr.tyrolium.tyromod.creativetabs;

import fr.tyrolium.tyromod.init.ItemsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TyroModTab extends CreativeTabs {
    public TyroModTab()
    {
        super("TyroMod");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemsMod.tyrolium);
    }
}
