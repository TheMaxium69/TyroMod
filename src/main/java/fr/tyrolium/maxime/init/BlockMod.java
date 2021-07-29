package fr.tyrolium.maxime.init;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.block.*;
import net.minecraft.block.Block;

public class BlockMod {
    public static Block amethys_block, amethys_ore;
    public static Block aventurine_block/*, aventurine_ore*/;
    //public static Block compressed_cobblestone_1, compressed_cobblestone_2, compressed_cobblestone_3, compressed_cobblestone_4, compressed_cobblestone_5, compressed_cobblestone_6, compressed_cobblestone_7, compressed_cobblestone_8, compressed_cobblestone_9, compressed_cobblestone_10, compressed_cobblestone_11, compressed_cobblestone_12, compressed_cobblestone_13, compressed_cobblestone_14, compressed_cobblestone_15, compressed_cobblestone_16, compressed_cobblestone_17, compressed_cobblestone_18;
    //public static Block compressed_full, compressed_ore;
    public static Block copper_block, copper_ore;
    public static Block dirt_ore;
    public static Block ender_block;
    public static Block enderine_block, enderine_ore;
    public static Block fake_bedrock, fake_lava;
    public static Block flint_block;
    public static Block guardian_block;
    public static Block mercure_block, mercure_ore;
    public static Block obsidian_renforced;
    public static Block purified_gold_block;
    public static Block rhodonite_block, rhodonite_ore;
    public static Block ruby_block, ruby_ore;
    public static Block sapphire_block, sapphire_ore;
    public static Block tin_block, tin_ore;
    public static Block titane_block;
    public static Block tyrolium_block, tyrolium_ore;
    public static Block volcanium_block, volcanium_cave, volcanium_ore;
    public static Block yellorite_block, yellorite_ore;
    public static Block fusion_table;

    public BlockMod() {
    }

    public static void init() {
        amethys_block = new AmethysBlock();
        amethys_ore = new AmethysOre();
        aventurine_block = new AventurineBlock();
        copper_block = new CopperBlock();
        copper_ore = new CopperOre();
        dirt_ore = new DirtOre();
        ender_block = new EnderBlock();
        enderine_block = new EnderineBlock();
        enderine_ore = new EnderineOre();
        fake_bedrock = new FakeBedrock();
        fake_lava = new FakeLava();
        flint_block = new FlintBlock();
        guardian_block = new GuardianBlock();
        mercure_block = new MercureBlock();
        mercure_ore = new MercureOre();
        obsidian_renforced = new ObsidianRenforced();
        purified_gold_block = new PurifiedGoldBlock();
        rhodonite_block = new RhodoniteBlock();
        rhodonite_ore = new RhodoniteOre();
        ruby_block = new RubyBlock();
        ruby_ore = new RubyOre();
        sapphire_block = new SapphireBlock();
        sapphire_ore = new SapphireOre();
        tin_block = new TinBlock();
        tin_ore = new TinOre();
        titane_block = new TitaneBlock();
        tyrolium_block = new TyroliumBlock();
        tyrolium_ore = new TyroliumOre();
        volcanium_block = new VolcaniumBlock();
        volcanium_cave = new VolcaniumCave();
        volcanium_ore = new VolcaniumOre();
        yellorite_block = new YelloriteBlock();
        yellorite_ore = new YelloriteOre();
        fusion_table = new FusionTable();
    }

    public static void register() {
        GameRegistry.registerBlock(amethys_block, amethys_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(amethys_ore, amethys_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(aventurine_block, aventurine_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(copper_block, copper_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(copper_ore, copper_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(dirt_ore, dirt_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(ender_block, ender_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(enderine_block, enderine_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(enderine_ore, enderine_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(fake_bedrock, fake_bedrock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(fake_lava, fake_lava.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(flint_block, flint_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(guardian_block, guardian_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(mercure_block, mercure_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(mercure_ore, mercure_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(obsidian_renforced, obsidian_renforced.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(purified_gold_block, purified_gold_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(rhodonite_block, rhodonite_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(rhodonite_ore, rhodonite_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(ruby_block, ruby_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(ruby_ore, ruby_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(sapphire_block, sapphire_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(sapphire_ore, sapphire_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(tin_block, tin_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(tin_ore, tin_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(titane_block, titane_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(tyrolium_block, tyrolium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(tyrolium_ore, tyrolium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(volcanium_block, volcanium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(volcanium_cave, volcanium_cave.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(volcanium_ore, volcanium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(yellorite_block, yellorite_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(yellorite_ore, yellorite_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(fusion_table, fusion_table.getUnlocalizedName().substring(5));
    }
}
