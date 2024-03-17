package fr.tyrolium.tyromod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Amethys extends Item {
    public Amethys(String name) {

        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CreativeTabs.MISC);

        setMaxStackSize(23);
    }
}
