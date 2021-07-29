package fr.tyrolium.maxime.block;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AmethysOre extends Block {

    public static String name = "amethys_ore";

    public AmethysOre()
    {
        super(Material.anvil);
        setCreativeTab(MainMod.tyromod);
        setHarvestLevel("axe", 1);
        setHardness(5.0F);
        setResistance(10.0F);
        setBlockName(name);
        setBlockTextureName(InfoMod.MOD_TEXTURE+name);
    }
}