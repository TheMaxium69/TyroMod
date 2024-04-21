package fr.tyrolium.tyromod.creativetabs;

import fr.tyrolium.tyromod.init.BlocksMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TyroModTabUtils extends CreativeTabs {
    public TyroModTabUtils()
    {
        super("TyroMod Utils");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(BlocksMod.getBlockCustomClass("bc33"));
    }
}
