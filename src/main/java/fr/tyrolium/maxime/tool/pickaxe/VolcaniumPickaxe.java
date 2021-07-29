package fr.tyrolium.maxime.tool.pickaxe;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemPickaxe;

public class VolcaniumPickaxe extends ItemPickaxe {
    public static String name = "volcanium_pickaxe";
    public VolcaniumPickaxe() {
        super(MaterialMod.VOLCANIUM_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}
