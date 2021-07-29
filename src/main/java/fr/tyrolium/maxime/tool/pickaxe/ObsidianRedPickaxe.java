package fr.tyrolium.maxime.tool.pickaxe;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemPickaxe;

public class ObsidianRedPickaxe extends ItemPickaxe {
    public static String name = "obsidian_red_pickaxe";
    public ObsidianRedPickaxe() {
        super(MaterialMod.OBSIDIAN_RED_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}

