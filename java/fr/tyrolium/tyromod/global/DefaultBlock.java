package fr.tyrolium.tyromod.global;

import fr.tyrolium.tyromod.TyroMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DefaultBlock extends Block {
    public DefaultBlock(String name, Material materialIn) {
        super(materialIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TyroMod.TyroModTab);
    }
}
