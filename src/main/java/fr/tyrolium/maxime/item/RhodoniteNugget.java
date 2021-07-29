package fr.tyrolium.maxime.item;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RhodoniteNugget extends Item {
    public static String name = "rhodonite_nugget";
    public RhodoniteNugget() {
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE + name);
        setCreativeTab(MainMod.tyromod);
    }
}