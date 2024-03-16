package fr.tyrolium.tyromod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TyroliumBlock extends Block {

    public TyroliumBlock(String name, Material materialIn) {
        super(materialIn);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
