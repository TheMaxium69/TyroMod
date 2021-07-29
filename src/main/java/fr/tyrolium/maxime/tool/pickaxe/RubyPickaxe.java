package fr.tyrolium.maxime.tool.pickaxe;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemPickaxe;

public class RubyPickaxe extends ItemPickaxe {
    public static String name = "ruby_pickaxe";
    public RubyPickaxe() {
        super(MaterialMod.RUBY_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}

