package fr.tyrolium.maxime.tool.hoe;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemHoe;



public class RhodoniteHoe extends ItemHoe {
    public static String name = "rhodonite_hoe";
    public RhodoniteHoe() {
        super(MaterialMod.RHODONITE_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}