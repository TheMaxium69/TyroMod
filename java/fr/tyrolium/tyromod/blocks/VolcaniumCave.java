package fr.tyrolium.tyromod.blocks;

import fr.tyrolium.tyromod.global.DefaultBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class VolcaniumCave extends DefaultBlock {
    public VolcaniumCave(String name, Material materialIn, String version, String id) {
        super(name, materialIn, version, id);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer func_180664_k()
    {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }
}
