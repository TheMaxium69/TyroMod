package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.world.biomes.BiomeVolcan;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomesMod {

    public static final Biome VOLCAN = new BiomeVolcan();

    public static void registerBiomes()
    {
        initBiome(VOLCAN, "Volcan", BiomeType.WARM, Type.HILLS, Type.MOUNTAIN, Type.DRY);
    }

    private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
    {
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
        BiomeManager.addSpawnBiome(biome);
        return biome;
    }

}
