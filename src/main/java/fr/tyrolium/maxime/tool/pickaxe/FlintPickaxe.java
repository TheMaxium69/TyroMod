package fr.tyrolium.maxime.tool.pickaxe;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemPickaxe;

public class FlintPickaxe extends ItemPickaxe {
    public static String name = "flint_pickaxe";
    public FlintPickaxe() {
        super(MaterialMod.FLINT_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}

