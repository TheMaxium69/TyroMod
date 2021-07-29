package fr.tyrolium.maxime.tool.shovel;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemSpade;

public class AventurineShovel extends ItemSpade {
    public static String name = "aventurine_shovel";
    public AventurineShovel() {
        super(MaterialMod.AVENTURINE_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}