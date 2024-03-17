package fr.tyrolium.tyromod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RhodoniteOre extends Block {

    public RhodoniteOre(String name, Material materialIn) {
        super(materialIn);
        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CreativeTabs.FOOD);

        // Logique du block
    }
}
