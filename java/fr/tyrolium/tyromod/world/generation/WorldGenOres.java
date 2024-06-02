package fr.tyrolium.tyromod.world.generation;

import fr.tyrolium.tyromod.init.BlocksMod;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenOres implements IWorldGenerator {

    private WorldGenerator ore_test;

    public WorldGenOres(){

        ore_test = new WorldGenMinable(BlocksMod.ELEVATOR_BLOCK.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));

    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.getDimension())
        {
            case -1:
                break;
            case 0:
                runGenerator(ore_test, world, random, chunkX, chunkZ, 150, 2, 60);
                break;
            case 1:
                break;

        }
    }

    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight){

        if (minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");

        int heightDiff = maxHeight - minHeight + 1;

        for (int i = 0; i < chance; i++) {

            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight * rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(heightDiff);

            gen.generate(world, rand, new BlockPos(x, y , z));

        }

    }
}
