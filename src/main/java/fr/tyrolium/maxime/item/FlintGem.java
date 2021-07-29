package fr.tyrolium.maxime.item;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FlintGem extends Item {
    public static String name = "flint_gem";
    public FlintGem(){
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}
