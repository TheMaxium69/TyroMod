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

public class WorldGenOres implements IWorldGenerator
{
    private WorldGenerator tin_ore;
    private WorldGenerator copper_ore;
    private WorldGenerator mercure_ore;
    private WorldGenerator enderine_ore;
    private WorldGenerator sapphire_ore;
    private WorldGenerator ruby_ore;
    private WorldGenerator yellorite_ore;
    private WorldGenerator volcanite_ore;
    private WorldGenerator ium_ore;
    private WorldGenerator netherite_ore;

    public WorldGenOres()
    {
        tin_ore = new WorldGenMinable(BlocksMod.blocks[26].getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
        copper_ore = new WorldGenMinable(BlocksMod.blocks[10].getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
        mercure_ore = new WorldGenMinable(BlocksMod.blocks[17].getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
        enderine_ore = new WorldGenMinable(BlocksMod.blocks[13].getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
        sapphire_ore = new WorldGenMinable(BlocksMod.blocks[24].getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
        ruby_ore = new WorldGenMinable(BlocksMod.blocks[22].getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
        yellorite_ore = new WorldGenMinable(BlocksMod.blocks[7].getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
        volcanite_ore = new WorldGenMinable(BlocksMod.blocks[56].getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
        ium_ore = new WorldGenMinable(BlocksMod.blocks[100].getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
        netherite_ore = new WorldGenMinable(BlocksMod.blocks[54].getDefaultState(), 6, BlockMatcher.forBlock(Blocks.NETHERRACK));
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.getDimension())
        {
            case -1:
                runGenerator(netherite_ore, world, random, chunkX, chunkZ, 150, 2, 150);
                break;
            case 0:
                runGenerator(tin_ore, world, random, chunkX, chunkZ, 150, 2, 150);
                runGenerator(copper_ore, world, random, chunkX, chunkZ, 150, 2, 150);
                runGenerator(mercure_ore, world, random, chunkX, chunkZ, 150, 2, 150);
                runGenerator(enderine_ore, world, random, chunkX, chunkZ, 150, 2, 150);
                runGenerator(sapphire_ore, world, random, chunkX, chunkZ, 150, 2, 150);
                runGenerator(ruby_ore, world, random, chunkX, chunkZ, 150, 2, 150);
                runGenerator(yellorite_ore, world, random, chunkX, chunkZ, 150, 2, 150);
                runGenerator(volcanite_ore, world, random, chunkX, chunkZ, 150, 2, 150);
                runGenerator(ium_ore, world, random, chunkX, chunkZ, 150, 2, 150);
                break;
            case 1:
                break;
        }
    }

    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
    {
        if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");

        int heightDiff = maxHeight - minHeight + 1;

        for(int i = 0; i < chance; i++)
        {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);

            gen.generate(world, rand, new BlockPos(x, y, z));
        }
    }
}
