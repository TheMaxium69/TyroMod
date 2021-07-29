package fr.tyrolium.maxime.tool.pickaxe;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemPickaxe;

public class RhodonitePickaxe extends ItemPickaxe {
    public static String name = "rhodonite_pickaxe";
    public RhodonitePickaxe() {
        super(MaterialMod.RHODONITE_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}

