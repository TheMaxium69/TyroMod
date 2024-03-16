package fr.tyrolium.tyromod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TyroliumOre extends Block {

    public TyroliumOre(String name, Material materialIn) {
        super(materialIn);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
