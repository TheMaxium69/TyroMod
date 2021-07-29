package fr.tyrolium.maxime.tool.pickaxe;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemPickaxe;

public class PurifiedGoldPickaxe extends ItemPickaxe {
    public static String name = "purified_gold_pickaxe";
    public PurifiedGoldPickaxe() {
        super(MaterialMod.PURIFIED_GOLD_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}
