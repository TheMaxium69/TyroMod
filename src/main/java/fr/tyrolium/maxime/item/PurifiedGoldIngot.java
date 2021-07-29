package fr.tyrolium.maxime.item;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PurifiedGoldIngot extends Item {
    public static String name = "purified_gold_ingot";
    public PurifiedGoldIngot(){
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}