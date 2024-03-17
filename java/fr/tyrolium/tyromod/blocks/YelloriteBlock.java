package fr.tyrolium.tyromod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class YelloriteBlock extends Block {

    public YelloriteBlock(String name, Material materialIn) {
        super(materialIn);
        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    }
}