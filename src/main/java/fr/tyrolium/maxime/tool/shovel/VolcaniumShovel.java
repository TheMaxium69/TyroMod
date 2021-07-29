package fr.tyrolium.maxime.tool.shovel;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemSpade;

public class VolcaniumShovel extends ItemSpade {
    public static String name = "volcanium_shovel";
    public VolcaniumShovel() {
        super(MaterialMod.VOLCANIUM_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}