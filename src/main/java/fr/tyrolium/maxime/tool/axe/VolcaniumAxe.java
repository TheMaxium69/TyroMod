package fr.tyrolium.maxime.tool.axe;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemAxe;

public class VolcaniumAxe extends ItemAxe {
    public static String name = "volcanium_axe";
    public VolcaniumAxe() {
        super(MaterialMod.VOLCANIUM_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}