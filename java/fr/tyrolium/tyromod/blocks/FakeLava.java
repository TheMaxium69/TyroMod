package fr.tyrolium.tyromod.blocks;

import fr.tyrolium.tyromod.global.DefaultBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class FakeLava extends DefaultBlock {
    public FakeLava(String name, Material materialIn, String version, String tier, String id) {
        super(name, materialIn, version, tier, id);
        setLightLevel(1.0F);
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {

        double d0 = (double)pos.getX();
        double d1 = (double)pos.getY();
        double d2 = (double)pos.getZ();

        if (rand.nextInt(100) == 0)
        {
            double d8 = d0 + (double)rand.nextFloat();
            double d4 = d1 + stateIn.getBoundingBox(worldIn, pos).maxY;
            double d6 = d2 + (double)rand.nextFloat();
            worldIn.spawnParticle(EnumParticleTypes.LAVA, d8, d4, d6, 0.0D, 0.0D, 0.0D);
            worldIn.playSound(d8, d4, d6, SoundEvents.BLOCK_LAVA_POP, SoundCategory.BLOCKS, 0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
        }

        if (rand.nextInt(200) == 0)
        {
            worldIn.playSound(d0, d1, d2, SoundEvents.BLOCK_LAVA_AMBIENT, SoundCategory.BLOCKS, 0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
        }

    }

}
