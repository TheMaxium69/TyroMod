package fr.tyrolium.maxime.tool.axe;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemAxe;

public class AventurineAxe extends ItemAxe {
    public static String name = "aventurine_axe";
    public AventurineAxe() {
        super(MaterialMod.AVENTURINE_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}
