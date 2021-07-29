package fr.tyrolium.maxime.tool.hoe;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemHoe;



public class CopperHoe extends ItemHoe {
    public static String name = "copper_hoe";
    public CopperHoe() {
        super(MaterialMod.COPPER_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}
