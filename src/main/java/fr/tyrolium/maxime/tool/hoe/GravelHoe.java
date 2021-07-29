package fr.tyrolium.maxime.tool.hoe;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemHoe;



public class GravelHoe extends ItemHoe {
    public static String name = "gravel_hoe";
    public GravelHoe() {
        super(MaterialMod.GRAVEL_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}
