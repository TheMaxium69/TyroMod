package fr.tyrolium.maxime.tool.shovel;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemSpade;

public class FlintShovel extends ItemSpade {
    public static String name = "flint_shovel";
    public FlintShovel() {
        super(MaterialMod.FLINT_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}