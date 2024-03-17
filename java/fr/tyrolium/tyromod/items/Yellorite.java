package fr.tyrolium.tyromod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Yellorite extends Item
{
    public Yellorite(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CreativeTabs.MISC);
    }
}