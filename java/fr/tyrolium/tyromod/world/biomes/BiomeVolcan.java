package fr.tyrolium.tyromod.world.biomes;

import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeVolcan extends Biome
{
	public BiomeVolcan()
	{
		super(new BiomeProperties("volcan").setBaseHeight(1.0F).setHeightVariation(1.0F).setRainDisabled().setTemperature(1.0F));
		
		topBlock = Blocks.OBSIDIAN.getDefaultState();
		fillerBlock = Blocks.OBSIDIAN.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
//		this.spawnableCreatureList.add(new SpawnListEntry(EntityMagmaCube.class, 5, 1, 5));
	}
}
