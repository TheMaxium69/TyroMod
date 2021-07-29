package fr.tyrolium.maxime.tool.shovel;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemSpade;

public class ObsidianRedShovel extends ItemSpade {
    public static String name = "obsidian_red_shovel";
    public ObsidianRedShovel() {
        super(MaterialMod.OBSIDIAN_RED_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}