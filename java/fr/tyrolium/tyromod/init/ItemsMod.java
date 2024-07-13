package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.generate.ItemGenerateClass;
import fr.tyrolium.tyromod.global.*;

import fr.tyrolium.tyromod.items.ServerItem;
import fr.tyrolium.tyromod.items.Radar;
import fr.tyrolium.tyromod.items.Tyrolium;
import fr.tyrolium.tyromod.items.armor.*;
import fr.tyrolium.tyromod.items.tool.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import static fr.tyrolium.tyromod.init.MaterialsMod.*;

@Mod.EventBusSubscriber(modid = Global.MODID)
public class ItemsMod {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    /* GENERATION */
    public static ItemGenerateClass[] ItemList = {

            /*TYROLIUM */
            new ItemGenerateClass("tyrolium", "classic", true, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "nugget", false, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "sword", true, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "pickaxe", true, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "axe", true, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "shovel", true, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "hoe", true, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "helmet", true, TYROLIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "chestplate", true, TYROLIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "leggings", true, TYROLIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "boots", true, TYROLIUM_ARMOR, "1", "IUM"),

            /*RHODONITE*/
            new ItemGenerateClass("rhodonite", "classic", false, "1", "3"),
            new ItemGenerateClass("rhodonite", "nugget", false, "1", "3"),
            new ItemGenerateClass("rhodonite", "sword", false, RHODONITE_TOOL, "1", "3"),
            new ItemGenerateClass("rhodonite", "pickaxe", false, RHODONITE_TOOL, "1", "3"),
            new ItemGenerateClass("rhodonite", "axe", false, RHODONITE_TOOL, "1", "3"),
            new ItemGenerateClass("rhodonite", "shovel", false, RHODONITE_TOOL, "1", "3"),
            new ItemGenerateClass("rhodonite", "hoe", false, RHODONITE_TOOL, "1", "3"),
            new ItemGenerateClass("rhodonite", "helmet", false, RHODONITE_ARMOR, "1", "3"),
            new ItemGenerateClass("rhodonite", "chestplate", false, RHODONITE_ARMOR, "1", "3"),
            new ItemGenerateClass("rhodonite", "leggings", false, RHODONITE_ARMOR, "1", "3"),
            new ItemGenerateClass("rhodonite", "boots", false, RHODONITE_ARMOR, "1", "3"),

            /*AMETHYS*/
            new ItemGenerateClass("amethys", "classic", false, "1", "2"),
            new ItemGenerateClass("amethys", "nugget", false, "1", "2"),
            new ItemGenerateClass("amethys", "sword", false, AMETHYS_TOOL, "1", "2"),
            new ItemGenerateClass("amethys", "pickaxe", false, AMETHYS_TOOL, "1", "2"),
            new ItemGenerateClass("amethys", "axe", false, AMETHYS_TOOL, "1", "2"),
            new ItemGenerateClass("amethys", "shovel", false, AMETHYS_TOOL, "1", "2"),
            new ItemGenerateClass("amethys", "hoe", false, AMETHYS_TOOL, "1", "2"),
            new ItemGenerateClass("amethys", "helmet", false, AMETHYS_ARMOR, "1", "2"),
            new ItemGenerateClass("amethys", "chestplate", false, AMETHYS_ARMOR, "1", "2"),
            new ItemGenerateClass("amethys", "leggings", false, AMETHYS_ARMOR, "1", "2"),
            new ItemGenerateClass("amethys", "boots", false, AMETHYS_ARMOR, "1", "2"),

            /*YELLORITE*/
            new ItemGenerateClass("yellorite", "classic", false, "1", "2"),
            new ItemGenerateClass("yellorite", "nugget", false, "1", "2"),
            new ItemGenerateClass("yellorite", "sword", false, YELLORITE_TOOL, "1", "2"),
            new ItemGenerateClass("yellorite", "pickaxe", false, YELLORITE_TOOL, "1", "2"),
            new ItemGenerateClass("yellorite", "axe", false, YELLORITE_TOOL, "1", "2"),
            new ItemGenerateClass("yellorite", "shovel", false, YELLORITE_TOOL, "1", "2"),
            new ItemGenerateClass("yellorite", "hoe", false, YELLORITE_TOOL, "1", "2"),
            new ItemGenerateClass("yellorite", "helmet", false, YELLORITE_ARMOR, "1", "2"),
            new ItemGenerateClass("yellorite", "chestplate", false, YELLORITE_ARMOR, "1", "2"),
            new ItemGenerateClass("yellorite", "leggings", false, YELLORITE_ARMOR, "1", "2"),
            new ItemGenerateClass("yellorite", "boots", false, YELLORITE_ARMOR, "1", "2"),

            /*AVENTURINE*/
            new ItemGenerateClass("aventurine", "classic", false, "1", "3"),
            new ItemGenerateClass("aventurine", "gem", false, "1", "3"),
            new ItemGenerateClass("aventurine", "nugget", false, "1", "3"),
            new ItemGenerateClass("aventurine", "powder", false, "1", "3"),
            new ItemGenerateClass("aventurine", "sword", false, AVENTURINE_TOOL, "1", "3"),
            new ItemGenerateClass("aventurine", "pickaxe", false, AVENTURINE_TOOL, "1", "3"),
            new ItemGenerateClass("aventurine", "axe", false, AVENTURINE_TOOL, "1", "3"),
            new ItemGenerateClass("aventurine", "shovel", false, AVENTURINE_TOOL, "1", "3"),
            new ItemGenerateClass("aventurine", "hoe", false, AVENTURINE_TOOL, "1", "3"),
            new ItemGenerateClass("aventurine", "helmet", false, AVENTURINE_ARMOR, "1", "3"),
            new ItemGenerateClass("aventurine", "chestplate", false, AVENTURINE_ARMOR, "1", "3"),
            new ItemGenerateClass("aventurine", "leggings", false, AVENTURINE_ARMOR, "1", "3"),
            new ItemGenerateClass("aventurine", "boots", false, AVENTURINE_ARMOR, "1", "3"),

            /*COPPER*/
            new ItemGenerateClass("copper", "ingot", false, "1", "1"),
            new ItemGenerateClass("copper", "nugget", false, "1", "1"),
            new ItemGenerateClass("copper", "sword", false, COPPER_TOOL, "1", "1"),
            new ItemGenerateClass("copper", "pickaxe", false, COPPER_TOOL, "1", "1"),
            new ItemGenerateClass("copper", "axe", false, COPPER_TOOL, "1", "1"),
            new ItemGenerateClass("copper", "shovel", false, COPPER_TOOL, "1", "1"),
            new ItemGenerateClass("copper", "hoe", false, COPPER_TOOL, "1", "1"),
            new ItemGenerateClass("copper", "helmet", false, COPPER_ARMOR, "1", "1"),
            new ItemGenerateClass("copper", "chestplate", false, COPPER_ARMOR, "1", "1"),
            new ItemGenerateClass("copper", "leggings", false, COPPER_ARMOR, "1", "1"),
            new ItemGenerateClass("copper", "boots", false, COPPER_ARMOR, "1", "1"),

            /*EMERALD*/
            new ItemGenerateClass("emerald", "sword", false, EMERALD_TOOL, "V1", "2"),
            new ItemGenerateClass("emerald", "pickaxe", false, EMERALD_TOOL, "V1", "2"),
            new ItemGenerateClass("emerald", "axe", false, EMERALD_TOOL, "V1", "2"),
            new ItemGenerateClass("emerald", "shovel", false, EMERALD_TOOL, "V1", "2"),
            new ItemGenerateClass("emerald", "hoe", false, EMERALD_TOOL, "V1", "2"),
            new ItemGenerateClass("emerald", "helmet", false, EMERALD_ARMOR, "V1", "2"),
            new ItemGenerateClass("emerald", "chestplate", false, EMERALD_ARMOR, "V1", "2"),
            new ItemGenerateClass("emerald", "leggings", false, EMERALD_ARMOR, "V1", "2"),
            new ItemGenerateClass("emerald", "boots", false, EMERALD_ARMOR, "V1", "2"),

            /*ENDER*/
            new ItemGenerateClass("ender", "gem", false, "1", "3"),
            new ItemGenerateClass("ender", "nugget", false, "1", "3"),
            new ItemGenerateClass("ender", "sword", false, ENDER_TOOL, "1", "3"),
            new ItemGenerateClass("ender", "pickaxe", false, ENDER_TOOL, "1", "3"),
            new ItemGenerateClass("ender", "axe", false, ENDER_TOOL, "1", "3"),
            new ItemGenerateClass("ender", "shovel", false, ENDER_TOOL, "1", "3"),
            new ItemGenerateClass("ender", "hoe", false, ENDER_TOOL, "1", "3"),
            new ItemGenerateClass("ender", "helmet", false, ENDER_ARMOR, "1", "3"),
            new ItemGenerateClass("ender", "chestplate", false, ENDER_ARMOR, "1", "3"),
            new ItemGenerateClass("ender", "leggings", false, ENDER_ARMOR, "1", "3"),
            new ItemGenerateClass("ender", "boots", false, ENDER_ARMOR, "1", "3"),

            /*ENDERINE*/
            new ItemGenerateClass("enderine", "ingot", false, "1", "1"),
            new ItemGenerateClass("enderine", "nugget", false, "1", "1"),
            new ItemGenerateClass("enderine", "sword", false, ENDERINE_TOOL, "1", "1"),
            new ItemGenerateClass("enderine", "pickaxe", false, ENDERINE_TOOL, "1", "1"),
            new ItemGenerateClass("enderine", "axe", false, ENDERINE_TOOL, "1", "1"),
            new ItemGenerateClass("enderine", "shovel", false, ENDERINE_TOOL, "1", "1"),
            new ItemGenerateClass("enderine", "hoe", false, ENDERINE_TOOL, "1", "1"),
            new ItemGenerateClass("enderine", "helmet", false, ENDERINE_ARMOR, "1", "1"),
            new ItemGenerateClass("enderine", "chestplate", false, ENDERINE_ARMOR, "1", "1"),
            new ItemGenerateClass("enderine", "leggings", false, ENDERINE_ARMOR, "1", "1"),
            new ItemGenerateClass("enderine", "boots", false, ENDERINE_ARMOR, "1", "1"),

            /*FLINT*/
            new ItemGenerateClass("flint", "gem", false, "V1", "1"),
            new ItemGenerateClass("flint", "sword", false, FLINT_TOOL, "V1", "1"),
            new ItemGenerateClass("flint", "pickaxe", false, FLINT_TOOL, "V1", "1"),
            new ItemGenerateClass("flint", "axe", false, FLINT_TOOL, "V1", "1"),
            new ItemGenerateClass("flint", "shovel", false, FLINT_TOOL, "V1", "1"),
            new ItemGenerateClass("flint", "hoe", false, FLINT_TOOL, "V1", "1"),
            new ItemGenerateClass("flint", "helmet", false, FLINT_ARMOR, "V1", "1"),
            new ItemGenerateClass("flint", "chestplate", false, FLINT_ARMOR, "V1", "1"),
            new ItemGenerateClass("flint", "leggings", false, FLINT_ARMOR, "V1", "1"),
            new ItemGenerateClass("flint", "boots", false, FLINT_ARMOR, "V1", "1"),

            /*GRAVEL*/
            new ItemGenerateClass("gravel", "sword", false, GRAVEL_TOOL, "V1", "0"),
            new ItemGenerateClass("gravel", "pickaxe", false, GRAVEL_TOOL, "V1", "0"),
            new ItemGenerateClass("gravel", "axe", false, GRAVEL_TOOL, "V1", "0"),
            new ItemGenerateClass("gravel", "shovel", false, GRAVEL_TOOL, "V1", "0"),
            new ItemGenerateClass("gravel", "hoe", false, GRAVEL_TOOL, "V1", "0"),
            new ItemGenerateClass("gravel", "helmet", false, GRAVEL_ARMOR, "V1", "0"),
            new ItemGenerateClass("gravel", "chestplate", false, GRAVEL_ARMOR, "V1", "0"),
            new ItemGenerateClass("gravel", "leggings", false, GRAVEL_ARMOR, "V1", "0"),
            new ItemGenerateClass("gravel", "boots", false, GRAVEL_ARMOR, "V1", "0"),

            /*GUARDIAN*/
            new ItemGenerateClass("guardian", "ingot", false, "1", "3"),
            new ItemGenerateClass("guardian", "sword", false, GUARDIAN_TOOL, "1", "3"),
            new ItemGenerateClass("guardian", "pickaxe", false, GUARDIAN_TOOL, "1", "3"),
            new ItemGenerateClass("guardian", "axe", false, GUARDIAN_TOOL, "1", "3"),
            new ItemGenerateClass("guardian", "shovel", false, GUARDIAN_TOOL, "1", "3"),
            new ItemGenerateClass("guardian", "hoe", false, GUARDIAN_TOOL, "1", "3"),
            new ItemGenerateClass("guardian", "helmet", false, GUARDIAN_ARMOR, "1", "3"),
            new ItemGenerateClass("guardian", "chestplate", false, GUARDIAN_ARMOR, "1", "3"),
            new ItemGenerateClass("guardian", "leggings", false, GUARDIAN_ARMOR, "1", "3"),
            new ItemGenerateClass("guardian", "boots", false, GUARDIAN_ARMOR, "1", "3"),

            /*MERCURE*/
            new ItemGenerateClass("mercure", "ingot", false, "13", "0"),
            new ItemGenerateClass("mercure", "nugget", false, "13", "0"),
            new ItemGenerateClass("mercure", "stick", false, "13", "0"),
            new ItemGenerateClass("mercure", "sword", false, MERCURE_TOOL, "13", "0"),
            new ItemGenerateClass("mercure", "pickaxe", false, MERCURE_TOOL, "13", "0"),
            new ItemGenerateClass("mercure", "axe", false, MERCURE_TOOL, "13", "0"),
            new ItemGenerateClass("mercure", "shovel", false, MERCURE_TOOL, "13", "0"),
            new ItemGenerateClass("mercure", "hoe", false, MERCURE_TOOL, "13", "0"),
            new ItemGenerateClass("mercure", "helmet", false, MERCURE_ARMOR, "13", "0"),
            new ItemGenerateClass("mercure", "chestplate", false, MERCURE_ARMOR, "13", "0"),
            new ItemGenerateClass("mercure", "leggings", false, MERCURE_ARMOR, "13", "0"),
            new ItemGenerateClass("mercure", "boots", false, MERCURE_ARMOR, "13", "0"),

            /*OBSIDIAN*/
            new ItemGenerateClass("obsidian", "ingot", false, "V1", "2"),
            new ItemGenerateClass("obsidian", "sword", false, OBSIDIAN_TOOL, "V1", "2"),
            new ItemGenerateClass("obsidian", "pickaxe", false, OBSIDIAN_TOOL, "V1", "2"),
            new ItemGenerateClass("obsidian", "axe", false, OBSIDIAN_TOOL, "V1", "2"),
            new ItemGenerateClass("obsidian", "shovel", false, OBSIDIAN_TOOL, "V1", "2"),
            new ItemGenerateClass("obsidian", "hoe", false, OBSIDIAN_TOOL, "V1", "2"),
            new ItemGenerateClass("obsidian", "helmet", false, OBSIDIAN_ARMOR, "V1", "2"),
            new ItemGenerateClass("obsidian", "chestplate", false, OBSIDIAN_ARMOR, "V1", "2"),
            new ItemGenerateClass("obsidian", "leggings", false, OBSIDIAN_ARMOR, "V1", "2"),
            new ItemGenerateClass("obsidian", "boots", false, OBSIDIAN_ARMOR, "V1", "2"),

            /*OBSIDIAN RED*/
            new ItemGenerateClass("obsidian_red", "ingot", false, "1", "3"),
            new ItemGenerateClass("obsidian_red", "sword", false, OBSIDIAN_RED_TOOL, "1", "3"),
            new ItemGenerateClass("obsidian_red", "pickaxe", false, OBSIDIAN_RED_TOOL, "1", "3"),
            new ItemGenerateClass("obsidian_red", "axe", false, OBSIDIAN_RED_TOOL, "1", "3"),
            new ItemGenerateClass("obsidian_red", "shovel", false, OBSIDIAN_RED_TOOL, "1", "3"),
            new ItemGenerateClass("obsidian_red", "hoe", false, OBSIDIAN_RED_TOOL, "1", "3"),
            new ItemGenerateClass("obsidian_red", "helmet", false, OBSIDIAN_RED_ARMOR, "1", "3"),
            new ItemGenerateClass("obsidian_red", "chestplate", false, OBSIDIAN_RED_ARMOR, "1", "3"),
            new ItemGenerateClass("obsidian_red", "leggings", false, OBSIDIAN_RED_ARMOR, "1", "3"),
            new ItemGenerateClass("obsidian_red", "boots", false, OBSIDIAN_RED_ARMOR, "1", "3"),

            /*PURIFIED GOLD*/
            new ItemGenerateClass("purified_gold", "ingot", false, "1", "2"),
            new ItemGenerateClass("purified_gold", "nugget", false, "1", "2"),
            new ItemGenerateClass("purified_gold", "sword", false, PURIFIED_GOLD_TOOL, "1", "2"),
            new ItemGenerateClass("purified_gold", "pickaxe", false, PURIFIED_GOLD_TOOL, "1", "2"),
            new ItemGenerateClass("purified_gold", "axe", false, PURIFIED_GOLD_TOOL, "1", "2"),
            new ItemGenerateClass("purified_gold", "shovel", false, PURIFIED_GOLD_TOOL, "1", "2"),
            new ItemGenerateClass("purified_gold", "hoe", false, PURIFIED_GOLD_TOOL, "1", "2"),
            new ItemGenerateClass("purified_gold", "helmet", false, PURIFIED_GOLD_ARMOR, "1", "2"),
            new ItemGenerateClass("purified_gold", "chestplate", false, PURIFIED_GOLD_ARMOR, "1", "2"),
            new ItemGenerateClass("purified_gold", "leggings", false, PURIFIED_GOLD_ARMOR, "1", "2"),
            new ItemGenerateClass("purified_gold", "boots", false, PURIFIED_GOLD_ARMOR, "1", "2"),

            /*REDSTONE*/
            new ItemGenerateClass("redstone", "ingot", false, "V1", "0"),
            new ItemGenerateClass("redstone", "stick", false, "V1", "0"),
            new ItemGenerateClass("redstone", "sword", false, REDSTONE_TOOL, "V1", "0"),
            new ItemGenerateClass("redstone", "pickaxe", false, REDSTONE_TOOL, "V1", "0"),
            new ItemGenerateClass("redstone", "axe", false, REDSTONE_TOOL, "V1", "0"),
            new ItemGenerateClass("redstone", "shovel", false, REDSTONE_TOOL, "V1", "0"),
            new ItemGenerateClass("redstone", "hoe", false, REDSTONE_TOOL, "V1", "0"),
            new ItemGenerateClass("redstone", "helmet", false, REDSTONE_ARMOR, "V1", "0"),
            new ItemGenerateClass("redstone", "chestplate", false, REDSTONE_ARMOR, "V1", "0"),
            new ItemGenerateClass("redstone", "leggings", false, REDSTONE_ARMOR, "V1", "0"),
            new ItemGenerateClass("redstone", "boots", false, REDSTONE_ARMOR, "V1", "0"),

            /*RUBY*/
            new ItemGenerateClass("ruby", "classic", false, "1", "2"),
            new ItemGenerateClass("ruby", "sword", false, RUBY_TOOL, "1", "2"),
            new ItemGenerateClass("ruby", "pickaxe", false, RUBY_TOOL, "1", "2"),
            new ItemGenerateClass("ruby", "axe", false, RUBY_TOOL, "1", "2"),
            new ItemGenerateClass("ruby", "shovel", false, RUBY_TOOL, "1", "2"),
            new ItemGenerateClass("ruby", "hoe", false, RUBY_TOOL, "1", "2"),
            new ItemGenerateClass("ruby", "helmet", false, RUBY_ARMOR, "1", "2"),
            new ItemGenerateClass("ruby", "chestplate", false, RUBY_ARMOR, "1", "2"),
            new ItemGenerateClass("ruby", "leggings", false, RUBY_ARMOR, "1", "2"),
            new ItemGenerateClass("ruby", "boots", false, RUBY_ARMOR, "1", "2"),

            /*SAPPHIRE*/
            new ItemGenerateClass("sapphire", "classic", false, "1", "2"),
            new ItemGenerateClass("sapphire", "sword", false, SAPPHIRE_TOOL, "1", "2"),
            new ItemGenerateClass("sapphire", "pickaxe", false, SAPPHIRE_TOOL, "1", "2"),
            new ItemGenerateClass("sapphire", "axe", false, SAPPHIRE_TOOL, "1", "2"),
            new ItemGenerateClass("sapphire", "shovel", false, SAPPHIRE_TOOL, "1", "2"),
            new ItemGenerateClass("sapphire", "hoe", false, SAPPHIRE_TOOL, "1", "2"),
            new ItemGenerateClass("sapphire", "helmet", false, SAPPHIRE_ARMOR, "1", "2"),
            new ItemGenerateClass("sapphire", "chestplate", false, SAPPHIRE_ARMOR, "1", "2"),
            new ItemGenerateClass("sapphire", "leggings", false, SAPPHIRE_ARMOR, "1", "2"),
            new ItemGenerateClass("sapphire", "boots", false, SAPPHIRE_ARMOR, "1", "2"),

            /*TIN*/
            new ItemGenerateClass("tin", "ingot", false, "1", "1"),
            new ItemGenerateClass("tin", "nugget", false, "1", "1"),
            new ItemGenerateClass("tin", "sword", false, TIN_TOOL, "1", "1"),
            new ItemGenerateClass("tin", "pickaxe", false, TIN_TOOL, "1", "1"),
            new ItemGenerateClass("tin", "axe", false, TIN_TOOL, "1", "1"),
            new ItemGenerateClass("tin", "shovel", false, TIN_TOOL, "1", "1"),
            new ItemGenerateClass("tin", "hoe", false, TIN_TOOL, "1", "1"),
            new ItemGenerateClass("tin", "helmet", false, TIN_ARMOR, "1", "1"),
            new ItemGenerateClass("tin", "chestplate", false, TIN_ARMOR, "1", "1"),
            new ItemGenerateClass("tin", "leggings", false, TIN_ARMOR, "1", "1"),
            new ItemGenerateClass("tin", "boots", false, TIN_ARMOR, "1", "1"),

            /*TITANE*/
            new ItemGenerateClass("titane", "ingot", false, "1", "2"),
            new ItemGenerateClass("titane", "nugget", false, "1", "2"),
            new ItemGenerateClass("titane", "sword", false, TITANE_TOOL, "1", "2"),
            new ItemGenerateClass("titane", "pickaxe", false, TITANE_TOOL, "1", "2"),
            new ItemGenerateClass("titane", "axe", false, TITANE_TOOL, "1", "2"),
            new ItemGenerateClass("titane", "shovel", false, TITANE_TOOL, "1", "2"),
            new ItemGenerateClass("titane", "hoe", false, TITANE_TOOL, "1", "2"),
            new ItemGenerateClass("titane", "helmet", false, TITANE_ARMOR, "1", "2"),
            new ItemGenerateClass("titane", "chestplate", false, TITANE_ARMOR, "1", "2"),
            new ItemGenerateClass("titane", "leggings", false, TITANE_ARMOR, "1", "2"),
            new ItemGenerateClass("titane", "boots", false, TITANE_ARMOR, "1", "2"),

            /*VOLCANIUM*/
            new ItemGenerateClass("volcanium", "ingot", false, "1", "IUM"),
            new ItemGenerateClass("volcanium", "sword", false, VOLCANIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("volcanium", "pickaxe", false, VOLCANIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("volcanium", "axe", false, VOLCANIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("volcanium", "shovel", false, VOLCANIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("volcanium", "hoe", false, VOLCANIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("volcanium", "helmet", true, VOLCANIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("volcanium", "chestplate", true, VOLCANIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("volcanium", "leggings", true, VOLCANIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("volcanium", "boots", true, VOLCANIUM_ARMOR, "1", "IUM"),

            /*ADAMANTIUM*/
            new ItemGenerateClass("adamantium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("adamantium", "sword", false, ADAMANTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "pickaxe", false, ADAMANTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "axe", false, ADAMANTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "shovel", false, ADAMANTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "hoe", false, ADAMANTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "helmet", true, ADAMANTIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("adamantium", "chestplate", true, ADAMANTIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("adamantium", "leggings", true, ADAMANTIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("adamantium", "boots", true, ADAMANTIUM_ARMOR, "3", "IUM"),

            /*ARGONITE*/
            new ItemGenerateClass("argonite", "ingot", false, "3", "3"),
            new ItemGenerateClass("argonite", "sword", false, ARGONITE_TOOL, "3", "3"),
            new ItemGenerateClass("argonite", "pickaxe", false, ARGONITE_TOOL, "3", "3"),
            new ItemGenerateClass("argonite", "axe", false, ARGONITE_TOOL, "3", "3"),
            new ItemGenerateClass("argonite", "shovel", false, ARGONITE_TOOL, "3", "3"),
            new ItemGenerateClass("argonite", "hoe", false, ARGONITE_TOOL, "3", "3"),
            new ItemGenerateClass("argonite", "helmet", false, ARGONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("argonite", "chestplate", false, ARGONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("argonite", "leggings", false, ARGONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("argonite", "boots", false, ARGONITE_ARMOR, "3", "3"),

            /*ASHSTONE*/
            new ItemGenerateClass("ashstone", "ingot", false, "3", "3"),
            new ItemGenerateClass("ashstone", "sword", false, ASHSTONE_TOOL, "3", "3"),
            new ItemGenerateClass("ashstone", "pickaxe", false, ASHSTONE_TOOL, "3", "3"),
            new ItemGenerateClass("ashstone", "axe", false, ASHSTONE_TOOL, "3", "3"),
            new ItemGenerateClass("ashstone", "shovel", false, ASHSTONE_TOOL, "3", "3"),
            new ItemGenerateClass("ashstone", "hoe", false, ASHSTONE_TOOL, "3", "3"),
            new ItemGenerateClass("ashstone", "helmet", false, ASHSTONE_ARMOR, "3", "3"),
            new ItemGenerateClass("ashstone", "chestplate", false, ASHSTONE_ARMOR, "3", "3"),
            new ItemGenerateClass("ashstone", "leggings", false, ASHSTONE_ARMOR, "3", "3"),
            new ItemGenerateClass("ashstone", "boots", false, ASHSTONE_ARMOR, "3", "3"),

            /*AURORE*/
            new ItemGenerateClass("aurore", "ingot", false, "3", "2"),
            new ItemGenerateClass("aurore", "sword", false, AURORE_TOOL, "3", "2"),
            new ItemGenerateClass("aurore", "pickaxe", false, AURORE_TOOL, "3", "2"),
            new ItemGenerateClass("aurore", "axe", false, AURORE_TOOL, "3", "2"),
            new ItemGenerateClass("aurore", "shovel", false, AURORE_TOOL, "3", "2"),
            new ItemGenerateClass("aurore", "hoe", false, AURORE_TOOL, "3", "2"),
            new ItemGenerateClass("aurore", "helmet", false, AURORE_ARMOR, "3", "2"),
            new ItemGenerateClass("aurore", "chestplate", false, AURORE_ARMOR, "3", "2"),
            new ItemGenerateClass("aurore", "leggings", false, AURORE_ARMOR, "3", "2"),
            new ItemGenerateClass("aurore", "boots", false, AURORE_ARMOR, "3", "2"),

            /*BRONZE*/
            new ItemGenerateClass("bronze", "ingot", false, "3", "2"),
            new ItemGenerateClass("bronze", "sword", false, BRONZE_TOOL, "3", "2"),
            new ItemGenerateClass("bronze", "pickaxe", false, BRONZE_TOOL, "3", "2"),
            new ItemGenerateClass("bronze", "axe", false, BRONZE_TOOL, "3", "2"),
            new ItemGenerateClass("bronze", "shovel", false, BRONZE_TOOL, "3", "2"),
            new ItemGenerateClass("bronze", "hoe", false, BRONZE_TOOL, "3", "2"),
            new ItemGenerateClass("bronze", "helmet", false, BRONZE_ARMOR, "3", "2"),
            new ItemGenerateClass("bronze", "chestplate", false, BRONZE_ARMOR, "3", "2"),
            new ItemGenerateClass("bronze", "leggings", false, BRONZE_ARMOR, "3", "2"),
            new ItemGenerateClass("bronze", "boots", false, BRONZE_ARMOR, "3", "2"),

            /*DROCONITE*/
            new ItemGenerateClass("draconite", "ingot", false, "3", "3"),
            new ItemGenerateClass("draconite", "powder", false, "3", "3"),
            new ItemGenerateClass("draconite", "sword", false, DROCONITE_TOOL, "3", "3"),
            new ItemGenerateClass("draconite", "pickaxe", false, DROCONITE_TOOL, "3", "3"),
            new ItemGenerateClass("draconite", "axe", false, DROCONITE_TOOL, "3", "3"),
            new ItemGenerateClass("draconite", "shovel", false, DROCONITE_TOOL, "3", "3"),
            new ItemGenerateClass("draconite", "hoe", false, DROCONITE_TOOL, "3", "3"),
            new ItemGenerateClass("draconite", "helmet", false, DROCONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("draconite", "chestplate", false, DROCONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("draconite", "leggings", false, DROCONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("draconite", "boots", false, DROCONITE_ARMOR, "3", "3"),

            /*DRACONIUM*/
            new ItemGenerateClass("draconium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("draconium", "sword", false, DRACONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("draconium", "pickaxe", false, DRACONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("draconium", "axe", false, DRACONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("draconium", "shovel", false, DRACONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("draconium", "hoe", false, DRACONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("draconium", "helmet", true, DRACONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("draconium", "chestplate", true, DRACONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("draconium", "leggings", true, DRACONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("draconium", "boots", true, DRACONIUM_ARMOR, "3", "IUM"),

            /*DRAGONSTONE*/
            new ItemGenerateClass("dragonstone", "gem", false, "3", "3"),
            new ItemGenerateClass("dragonstone", "sword", false, DRAGONSTONE_TOOL, "3", "3"),
            new ItemGenerateClass("dragonstone", "pickaxe", false, DRAGONSTONE_TOOL, "3", "3"),
            new ItemGenerateClass("dragonstone", "axe", false, DRAGONSTONE_TOOL, "3", "3"),
            new ItemGenerateClass("dragonstone", "shovel", false, DRAGONSTONE_TOOL, "3", "3"),
            new ItemGenerateClass("dragonstone", "hoe", false, DRAGONSTONE_TOOL, "3", "3"),
            new ItemGenerateClass("dragonstone", "helmet", false, DRAGONSTONE_ARMOR, "3", "3"),
            new ItemGenerateClass("dragonstone", "chestplate", false, DRAGONSTONE_ARMOR, "3", "3"),
            new ItemGenerateClass("dragonstone", "leggings", false, DRAGONSTONE_ARMOR, "3", "3"),
            new ItemGenerateClass("dragonstone", "boots", false, DRAGONSTONE_ARMOR, "3", "3"),

            /*FYRITE*/
            new ItemGenerateClass("fyrite", "ingot", false, "3", "3"),
            new ItemGenerateClass("fyrite", "sword", false, FYRITE_TOOL, "3", "3"),
            new ItemGenerateClass("fyrite", "pickaxe", false, FYRITE_TOOL, "3", "3"),
            new ItemGenerateClass("fyrite", "axe", false, FYRITE_TOOL, "3", "3"),
            new ItemGenerateClass("fyrite", "shovel", false, FYRITE_TOOL, "3", "3"),
            new ItemGenerateClass("fyrite", "hoe", false, FYRITE_TOOL, "3", "3"),
            new ItemGenerateClass("fyrite", "helmet", false, FYRITE_ARMOR, "3", "3"),
            new ItemGenerateClass("fyrite", "chestplate", false, FYRITE_ARMOR, "3", "3"),
            new ItemGenerateClass("fyrite", "leggings", false, FYRITE_ARMOR, "3", "3"),
            new ItemGenerateClass("fyrite", "boots", false, FYRITE_ARMOR, "3", "3"),

            /*ILLUMENITE*/
            new ItemGenerateClass("illumenite", "ingot", false, "3", "3"),
            new ItemGenerateClass("illumenite", "sword", false, ILLUMENITE_TOOL, "3", "3"),
            new ItemGenerateClass("illumenite", "pickaxe", false, ILLUMENITE_TOOL, "3", "3"),
            new ItemGenerateClass("illumenite", "axe", false, ILLUMENITE_TOOL, "3", "3"),
            new ItemGenerateClass("illumenite", "shovel", false, ILLUMENITE_TOOL, "3", "3"),
            new ItemGenerateClass("illumenite", "hoe", false, ILLUMENITE_TOOL, "3", "3"),
            new ItemGenerateClass("illumenite", "helmet", false, ILLUMENITE_ARMOR, "3", "3"),
            new ItemGenerateClass("illumenite", "chestplate", false, ILLUMENITE_ARMOR, "3", "3"),
            new ItemGenerateClass("illumenite", "leggings", false, ILLUMENITE_ARMOR, "3", "3"),
            new ItemGenerateClass("illumenite", "boots", false, ILLUMENITE_ARMOR, "3", "3"),

            /*JADE*/
            new ItemGenerateClass("jade", "classic", false, "3", "3"),
            new ItemGenerateClass("jade", "sword", false, JADE_TOOL, "3", "3"),
            new ItemGenerateClass("jade", "pickaxe", false, JADE_TOOL, "3", "3"),
            new ItemGenerateClass("jade", "axe", false, JADE_TOOL, "3", "3"),
            new ItemGenerateClass("jade", "shovel", false, JADE_TOOL, "3", "3"),
            new ItemGenerateClass("jade", "hoe", false, JADE_TOOL, "3", "3"),
            new ItemGenerateClass("jade", "helmet", false, JADE_ARMOR, "3", "3"),
            new ItemGenerateClass("jade", "chestplate", false, JADE_ARMOR, "3", "3"),
            new ItemGenerateClass("jade", "leggings", false, JADE_ARMOR, "3", "3"),
            new ItemGenerateClass("jade", "boots", false, JADE_ARMOR, "3", "3"),

            /*MALACHITE*/
            new ItemGenerateClass("malachite", "ingot", false, "3", "3"),
            new ItemGenerateClass("malachite", "sword", false, MALACHITE_TOOL, "3", "3"),
            new ItemGenerateClass("malachite", "pickaxe", false, MALACHITE_TOOL, "3", "3"),
            new ItemGenerateClass("malachite", "axe", false, MALACHITE_TOOL, "3", "3"),
            new ItemGenerateClass("malachite", "shovel", false, MALACHITE_TOOL, "3", "3"),
            new ItemGenerateClass("malachite", "hoe", false, MALACHITE_TOOL, "3", "3"),
            new ItemGenerateClass("malachite", "helmet", false, MALACHITE_ARMOR, "3", "3"),
            new ItemGenerateClass("malachite", "chestplate", false, MALACHITE_ARMOR, "3", "3"),
            new ItemGenerateClass("malachite", "leggings", false, MALACHITE_ARMOR, "3", "3"),
            new ItemGenerateClass("malachite", "boots", false, MALACHITE_ARMOR, "3", "3"),

            /*MYTHRIL*/
            new ItemGenerateClass("mythril", "ingot", false, "3", "2"),
            new ItemGenerateClass("mythril", "sword", false, MYTHRIL_TOOL, "3", "2"),
            new ItemGenerateClass("mythril", "pickaxe", false, MYTHRIL_TOOL, "3", "2"),
            new ItemGenerateClass("mythril", "axe", false, MYTHRIL_TOOL, "3", "2"),
            new ItemGenerateClass("mythril", "shovel", false, MYTHRIL_TOOL, "3", "2"),
            new ItemGenerateClass("mythril", "hoe", false, MYTHRIL_TOOL, "3", "2"),
            new ItemGenerateClass("mythril", "helmet", false, MYTHRIL_ARMOR, "3", "2"),
            new ItemGenerateClass("mythril", "chestplate", false, MYTHRIL_ARMOR, "3", "2"),
            new ItemGenerateClass("mythril", "leggings", false, MYTHRIL_ARMOR, "3", "2"),
            new ItemGenerateClass("mythril", "boots", false, MYTHRIL_ARMOR, "3", "2"),

            /*ONIX*/
            new ItemGenerateClass("onix", "gem", false, "3", "3"),
            new ItemGenerateClass("onix", "sword", false, ONIX_TOOL, "3", "3"),
            new ItemGenerateClass("onix", "pickaxe", false, ONIX_TOOL, "3", "3"),
            new ItemGenerateClass("onix", "axe", false, ONIX_TOOL, "3", "3"),
            new ItemGenerateClass("onix", "shovel", false, ONIX_TOOL, "3", "3"),
            new ItemGenerateClass("onix", "hoe", false, ONIX_TOOL, "3", "3"),
            new ItemGenerateClass("onix", "helmet", false, ONIX_ARMOR, "3", "3"),
            new ItemGenerateClass("onix", "chestplate", false, ONIX_ARMOR, "3", "3"),
            new ItemGenerateClass("onix", "leggings", false, ONIX_ARMOR, "3", "3"),
            new ItemGenerateClass("onix", "boots", false, ONIX_ARMOR, "3", "3"),

            /*SINISITE*/
            new ItemGenerateClass("sinisite", "ingot", false, "3", "3"),
            new ItemGenerateClass("sinisite", "stick", false, "3", "3"),
            new ItemGenerateClass("sinisite", "sword", false, SINISITE_TOOL, "3", "3"),
            new ItemGenerateClass("sinisite", "pickaxe", false, SINISITE_TOOL, "3", "3"),
            new ItemGenerateClass("sinisite", "axe", false, SINISITE_TOOL, "3", "3"),
            new ItemGenerateClass("sinisite", "shovel", false, SINISITE_TOOL, "3", "3"),
            new ItemGenerateClass("sinisite", "hoe", false, SINISITE_TOOL, "3", "3"),
            new ItemGenerateClass("sinisite", "helmet", false, SINISITE_ARMOR, "3", "3"),
            new ItemGenerateClass("sinisite", "chestplate", false, SINISITE_ARMOR, "3", "3"),
            new ItemGenerateClass("sinisite", "leggings", false, SINISITE_ARMOR, "3", "3"),
            new ItemGenerateClass("sinisite", "boots", false, SINISITE_ARMOR, "3", "3"),

            /*STEEL*/
            new ItemGenerateClass("steel", "ingot", false, "3", "2"),
            new ItemGenerateClass("steel", "sword", false, STEEL_TOOL, "3", "2"),
            new ItemGenerateClass("steel", "pickaxe", false, STEEL_TOOL, "3", "2"),
            new ItemGenerateClass("steel", "axe", false, STEEL_TOOL, "3", "2"),
            new ItemGenerateClass("steel", "shovel", false, STEEL_TOOL, "3", "2"),
            new ItemGenerateClass("steel", "hoe", false, STEEL_TOOL, "3", "2"),
            new ItemGenerateClass("steel", "helmet", false, STEEL_ARMOR, "3", "2"),
            new ItemGenerateClass("steel", "chestplate", false, STEEL_ARMOR, "3", "2"),
            new ItemGenerateClass("steel", "leggings", false, STEEL_ARMOR, "3", "2"),
            new ItemGenerateClass("steel", "boots", false, STEEL_ARMOR, "3", "2"),

            /*STEELIUM*/
            new ItemGenerateClass("steelium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("steelium", "sword", false, STEELIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("steelium", "pickaxe", false, STEELIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("steelium", "axe", false, STEELIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("steelium", "shovel", false, STEELIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("steelium", "hoe", false, STEELIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("steelium", "helmet", true, STEELIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("steelium", "chestplate", true, STEELIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("steelium", "leggings", true, STEELIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("steelium", "boots", true, STEELIUM_ARMOR, "3", "IUM"),

            /*THYRIUM*/
            new ItemGenerateClass("thyrium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("thyrium", "sword", false, THYRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("thyrium", "pickaxe", false, THYRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("thyrium", "axe", false, THYRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("thyrium", "shovel", false, THYRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("thyrium", "hoe", false, THYRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("thyrium", "helmet", true, THYRIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("thyrium", "chestplate", true, THYRIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("thyrium", "leggings", true, THYRIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("thyrium", "boots", true, THYRIUM_ARMOR, "3", "IUM"),

            /*SUNSTONE*/
            new ItemGenerateClass("sunstone", "ingot", false, "3", "0"),
            new ItemGenerateClass("sunstone", "powder", false, "3", "0"),
            new ItemGenerateClass("sunstone", "sword", false, SUNSTONE_TOOL, "3", "0"),
            new ItemGenerateClass("sunstone", "pickaxe", false, SUNSTONE_TOOL, "3", "0"),
            new ItemGenerateClass("sunstone", "axe", false, SUNSTONE_TOOL, "3", "0"),
            new ItemGenerateClass("sunstone", "shovel", false, SUNSTONE_TOOL, "3", "0"),
            new ItemGenerateClass("sunstone", "hoe", false, SUNSTONE_TOOL, "3", "0"),
            new ItemGenerateClass("sunstone", "helmet", false, SUNSTONE_ARMOR, "3", "0"),
            new ItemGenerateClass("sunstone", "chestplate", false, SUNSTONE_ARMOR, "3", "0"),
            new ItemGenerateClass("sunstone", "leggings", false, SUNSTONE_ARMOR, "3", "0"),
            new ItemGenerateClass("sunstone", "boots", false, SUNSTONE_ARMOR, "3", "0"),

            /*LAPIS LAZULI*/
            new ItemGenerateClass("lapis_lazuli", "ingot", false, "v3", "0"),
            new ItemGenerateClass("lapis_lazuli", "stick", false, "v3", "0"),
            new ItemGenerateClass("lapis_lazuli", "sword", false, LAPIS_LAZULI_TOOL, "v3", "0"),
            new ItemGenerateClass("lapis_lazuli", "pickaxe", false, LAPIS_LAZULI_TOOL, "v3", "0"),
            new ItemGenerateClass("lapis_lazuli", "axe", false, LAPIS_LAZULI_TOOL, "v3", "0"),
            new ItemGenerateClass("lapis_lazuli", "shovel", false, LAPIS_LAZULI_TOOL, "v3", "0"),
            new ItemGenerateClass("lapis_lazuli", "hoe", false, LAPIS_LAZULI_TOOL, "v3", "0"),
            new ItemGenerateClass("lapis_lazuli", "helmet", false, LAPIS_LAZULI_ARMOR, "v3", "0"),
            new ItemGenerateClass("lapis_lazuli", "chestplate", false, LAPIS_LAZULI_ARMOR, "v3", "0"),
            new ItemGenerateClass("lapis_lazuli", "leggings", false, LAPIS_LAZULI_ARMOR, "v3", "0"),
            new ItemGenerateClass("lapis_lazuli", "boots", false, LAPIS_LAZULI_ARMOR, "v3", "0"),

            /*NETHERITE*/
            new ItemGenerateClass("netherite", "ingot", false, "V", "3"),
            new ItemGenerateClass("netherite", "scrap", false, "V", "3"),
            new ItemGenerateClass("netherite", "sword", false, NETHERITE_TOOL, "V", "3"),
            new ItemGenerateClass("netherite", "pickaxe", false, NETHERITE_TOOL, "V", "3"),
            new ItemGenerateClass("netherite", "axe", false, NETHERITE_TOOL, "V", "3"),
            new ItemGenerateClass("netherite", "shovel", false, NETHERITE_TOOL, "V", "3"),
            new ItemGenerateClass("netherite", "hoe", false, NETHERITE_TOOL, "V", "3"),
            new ItemGenerateClass("netherite", "helmet", false, NETHERITE_ARMOR, "V", "3"),
            new ItemGenerateClass("netherite", "chestplate", false, NETHERITE_ARMOR, "V", "3"),
            new ItemGenerateClass("netherite", "leggings", false, NETHERITE_ARMOR, "V", "3"),
            new ItemGenerateClass("netherite", "boots", false, NETHERITE_ARMOR, "V", "3"),

            /*COAL*/
            new ItemGenerateClass("coal", "ingot", false, "v3", "0"),
            new ItemGenerateClass("coal", "sword", false, COAL_TOOL, "v3", "0"),
            new ItemGenerateClass("coal", "pickaxe", false, COAL_TOOL, "v3", "0"),
            new ItemGenerateClass("coal", "axe", false, COAL_TOOL, "v3", "0"),
            new ItemGenerateClass("coal", "shovel", false, COAL_TOOL, "v3", "0"),
            new ItemGenerateClass("coal", "hoe", false, COAL_TOOL, "v3", "0"),
            new ItemGenerateClass("coal", "helmet", false, COAL_ARMOR, "v3", "0"),
            new ItemGenerateClass("coal", "chestplate", false, COAL_ARMOR, "v3", "0"),
            new ItemGenerateClass("coal", "leggings", false, COAL_ARMOR, "v3", "0"),
            new ItemGenerateClass("coal", "boots", false, COAL_ARMOR, "v3", "0"),

            /*WOOD*/
            new ItemGenerateClass("oak", "helmet", false, OAK_ARMOR, "v1", "0"),
            new ItemGenerateClass("oak", "chestplate", false, OAK_ARMOR, "v1", "0"),
            new ItemGenerateClass("oak", "leggings", false, OAK_ARMOR, "v1", "0"),
            new ItemGenerateClass("oak", "boots", false, OAK_ARMOR, "v1", "0"),
            new ItemGenerateClass("spruce", "helmet", false, SPRUCE_ARMOR, "v3", "0"),
            new ItemGenerateClass("spruce", "chestplate", false, SPRUCE_ARMOR, "v3", "0"),
            new ItemGenerateClass("spruce", "leggings", false, SPRUCE_ARMOR, "v3", "0"),
            new ItemGenerateClass("spruce", "boots", false, SPRUCE_ARMOR, "v3", "0"),
            new ItemGenerateClass("birch", "helmet", false, BIRCH_ARMOR, "v3", "0"),
            new ItemGenerateClass("birch", "chestplate", false, BIRCH_ARMOR, "v3", "0"),
            new ItemGenerateClass("birch", "leggings", false, BIRCH_ARMOR, "v3", "0"),
            new ItemGenerateClass("birch", "boots", false, BIRCH_ARMOR, "v3", "0"),
            new ItemGenerateClass("jungle", "helmet", false, JUNGLE_ARMOR, "v3", "0"),
            new ItemGenerateClass("jungle", "chestplate", false, JUNGLE_ARMOR, "v3", "0"),
            new ItemGenerateClass("jungle", "leggings", false, JUNGLE_ARMOR, "v3", "0"),
            new ItemGenerateClass("jungle", "boots", false, JUNGLE_ARMOR, "v3", "0"),
            new ItemGenerateClass("acacia", "helmet", false, ACACIA_ARMOR, "v3", "0"),
            new ItemGenerateClass("acacia", "chestplate", false, ACACIA_ARMOR, "v3", "0"),
            new ItemGenerateClass("acacia", "leggings", false, ACACIA_ARMOR, "v3", "0"),
            new ItemGenerateClass("acacia", "boots", false, ACACIA_ARMOR, "v3", "0"),
            new ItemGenerateClass("darkoak", "helmet", false, DARKOAK_ARMOR, "v3", "0"),
            new ItemGenerateClass("darkoak", "chestplate", false, DARKOAK_ARMOR, "v3", "0"),
            new ItemGenerateClass("darkoak", "leggings", false, DARKOAK_ARMOR, "v3", "0"),
            new ItemGenerateClass("darkoak", "boots", false, DARKOAK_ARMOR, "v3", "0"),

            /*STONE*/
            new ItemGenerateClass("stone", "nugget", false, "v1", "0"),
            new ItemGenerateClass("stone", "helmet", false, STONE_ARMOR, "v1", "0"),
            new ItemGenerateClass("stone", "chestplate", false, STONE_ARMOR, "v1", "0"),
            new ItemGenerateClass("stone", "leggings", false, STONE_ARMOR, "v1", "0"),
            new ItemGenerateClass("stone", "boots", false, STONE_ARMOR, "v1", "0"),

            /*CLAY*/
            new ItemGenerateClass("clay", "sword", false, CLAY_TOOL, "v3", "0"),
            new ItemGenerateClass("clay", "pickaxe", false, CLAY_TOOL, "v3", "0"),
            new ItemGenerateClass("clay", "axe", false, CLAY_TOOL, "v3", "0"),
            new ItemGenerateClass("clay", "shovel", false, CLAY_TOOL, "v3", "0"),
            new ItemGenerateClass("clay", "hoe", false, CLAY_TOOL, "v3", "0"),
            new ItemGenerateClass("clay", "helmet", false, CLAY_ARMOR, "v3", "0"),
            new ItemGenerateClass("clay", "chestplate", false, CLAY_ARMOR, "v3", "0"),
            new ItemGenerateClass("clay", "leggings", false, CLAY_ARMOR, "v3", "0"),
            new ItemGenerateClass("clay", "boots", false, CLAY_ARMOR, "v3", "0"),

            /*VOLCANITE*/
            new ItemGenerateClass("volcanite", "classic", false, "3", "2"),
            new ItemGenerateClass("volcanite", "sword", false, VOLCANITE_TOOL, "3", "2"),
            new ItemGenerateClass("volcanite", "pickaxe", false, VOLCANITE_TOOL, "3", "2"),
            new ItemGenerateClass("volcanite", "axe", false, VOLCANITE_TOOL, "3", "2"),
            new ItemGenerateClass("volcanite", "shovel", false, VOLCANITE_TOOL, "3", "2"),
            new ItemGenerateClass("volcanite", "hoe", false, VOLCANITE_TOOL, "3", "2"),
            new ItemGenerateClass("volcanite", "helmet", false, VOLCANITE_ARMOR, "3", "2"),
            new ItemGenerateClass("volcanite", "chestplate", false, VOLCANITE_ARMOR, "3", "2"),
            new ItemGenerateClass("volcanite", "leggings", false, VOLCANITE_ARMOR, "3", "2"),
            new ItemGenerateClass("volcanite", "boots", false, VOLCANITE_ARMOR, "3", "2"),

            /*TYROLITE*/
            new ItemGenerateClass("tyrolite", "ingot", false, "3", "3"),
            new ItemGenerateClass("tyrolite", "sword", false, TYROLITE_TOOL, "3", "3"),
            new ItemGenerateClass("tyrolite", "pickaxe", false, TYROLITE_TOOL, "3", "3"),
            new ItemGenerateClass("tyrolite", "axe", false, TYROLITE_TOOL, "3", "3"),
            new ItemGenerateClass("tyrolite", "shovel", false, TYROLITE_TOOL, "3", "3"),
            new ItemGenerateClass("tyrolite", "hoe", false, TYROLITE_TOOL, "3", "3"),
            new ItemGenerateClass("tyrolite", "helmet", false, TYROLITE_ARMOR, "3", "3"),
            new ItemGenerateClass("tyrolite", "chestplate", false, TYROLITE_ARMOR, "3", "3"),
            new ItemGenerateClass("tyrolite", "leggings", false, TYROLITE_ARMOR, "3", "3"),
            new ItemGenerateClass("tyrolite", "boots", false, TYROLITE_ARMOR, "3", "3"),

            /*RHODONIUM*/
            new ItemGenerateClass("rhodonium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "nugget", false, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "sword", false, RHODONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "pickaxe", false, RHODONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "axe", false, RHODONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "shovel", false, RHODONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "hoe", false, RHODONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "helmet", true, RHODONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "chestplate", true, RHODONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "leggings", true, RHODONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "boots", true, RHODONIUM_ARMOR, "3", "IUM"),

            /*YELLORIUM*/
            new ItemGenerateClass("yellorium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("yellorium", "sword", false, YELLORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("yellorium", "pickaxe", false, YELLORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("yellorium", "axe", false, YELLORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("yellorium", "shovel", false, YELLORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("yellorium", "hoe", false, YELLORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("yellorium", "helmet", true, YELLORIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("yellorium", "chestplate", true, YELLORIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("yellorium", "leggings", true, YELLORIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("yellorium", "boots", true, YELLORIUM_ARMOR, "3", "IUM"),

            /*OBSIDIUM*/
            new ItemGenerateClass("obsidium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("obsidium", "gem", false, "3", "IUM"),
            new ItemGenerateClass("obsidium", "sword", false, OBSIDIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("obsidium", "pickaxe", false, OBSIDIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("obsidium", "axe", false, OBSIDIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("obsidium", "shovel", false, OBSIDIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("obsidium", "hoe", false, OBSIDIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("obsidium", "helmet", true, OBSIDIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("obsidium", "chestplate", true, OBSIDIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("obsidium", "leggings", true, OBSIDIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("obsidium", "boots", true, OBSIDIUM_ARMOR, "3", "IUM"),

            /*ENDERIUM*/
            new ItemGenerateClass("enderium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("enderium", "sword", false, ENDERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("enderium", "pickaxe", false, ENDERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("enderium", "axe", false, ENDERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("enderium", "shovel", false, ENDERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("enderium", "hoe", false, ENDERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("enderium", "helmet", true, ENDERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("enderium", "chestplate", true, ENDERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("enderium", "leggings", true, ENDERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("enderium", "boots", true, ENDERIUM_ARMOR, "3", "IUM"),

            /*ENDERITE*/
            new ItemGenerateClass("enderite", "ingot", false, "3", "2"),
            new ItemGenerateClass("enderite", "sword", false, ENDERITE_TOOL, "3", "2"),
            new ItemGenerateClass("enderite", "pickaxe", false, ENDERITE_TOOL, "3", "2"),
            new ItemGenerateClass("enderite", "axe", false, ENDERITE_TOOL, "3", "2"),
            new ItemGenerateClass("enderite", "shovel", false, ENDERITE_TOOL, "3", "2"),
            new ItemGenerateClass("enderite", "hoe", false, ENDERITE_TOOL, "3", "2"),
            new ItemGenerateClass("enderite", "helmet", false, ENDERITE_ARMOR, "3", "2"),
            new ItemGenerateClass("enderite", "chestplate", false, ENDERITE_ARMOR, "3", "2"),
            new ItemGenerateClass("enderite", "leggings", false, ENDERITE_ARMOR, "3", "2"),
            new ItemGenerateClass("enderite", "boots", false, ENDERITE_ARMOR, "3", "2"),

            /*COPPERIUM*/
            new ItemGenerateClass("copperium", "gem", false, "3", "IUM"),
            new ItemGenerateClass("copperium", "sword", false, COPPERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("copperium", "pickaxe", false, COPPERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("copperium", "axe", false, COPPERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("copperium", "shovel", false, COPPERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("copperium", "hoe", false, COPPERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("copperium", "helmet", true, COPPERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("copperium", "chestplate", true, COPPERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("copperium", "leggings", true, COPPERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("copperium", "boots", true, COPPERIUM_ARMOR, "3", "IUM"),

            /*AVENTURIUM*/
            new ItemGenerateClass("aventurium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("aventurium", "sword", false, AVENTURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("aventurium", "pickaxe", false, AVENTURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("aventurium", "axe", false, AVENTURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("aventurium", "shovel", false, AVENTURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("aventurium", "hoe", false, AVENTURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("aventurium", "helmet", true, AVENTURIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("aventurium", "chestplate", true, AVENTURIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("aventurium", "leggings", true, AVENTURIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("aventurium", "boots", true, AVENTURIUM_ARMOR, "3", "IUM"),

            /*PURIFIED IRON*/
            new ItemGenerateClass("purified_iron", "gem", false, "3", "1"),
            new ItemGenerateClass("purified_iron", "sword", false, PURIFIED_IRON_TOOL, "3", "1"),
            new ItemGenerateClass("purified_iron", "pickaxe", false, PURIFIED_IRON_TOOL, "3", "1"),
            new ItemGenerateClass("purified_iron", "axe", false, PURIFIED_IRON_TOOL, "3", "1"),
            new ItemGenerateClass("purified_iron", "shovel", false, PURIFIED_IRON_TOOL, "3", "1"),
            new ItemGenerateClass("purified_iron", "hoe", false, PURIFIED_IRON_TOOL, "3", "1"),
            new ItemGenerateClass("purified_iron", "helmet", false, PURIFIED_IRON_ARMOR, "3", "1"),
            new ItemGenerateClass("purified_iron", "chestplate", false, PURIFIED_IRON_ARMOR, "3", "1"),
            new ItemGenerateClass("purified_iron", "leggings", false, PURIFIED_IRON_ARMOR, "3", "1"),
            new ItemGenerateClass("purified_iron", "boots", false, PURIFIED_IRON_ARMOR, "3", "1"),

            /*PURIFIED DIAMOND*/
            new ItemGenerateClass("purified_diamond", "ingot", false, "3", "2"),
            new ItemGenerateClass("purified_diamond", "nugget", false, "3", "2"),
            new ItemGenerateClass("purified_diamond", "sword", false, PURIFIED_DIAMOND_TOOL, "3", "2"),
            new ItemGenerateClass("purified_diamond", "pickaxe", false, PURIFIED_DIAMOND_TOOL, "3", "2"),
            new ItemGenerateClass("purified_diamond", "axe", false, PURIFIED_DIAMOND_TOOL, "3", "2"),
            new ItemGenerateClass("purified_diamond", "shovel", false, PURIFIED_DIAMOND_TOOL, "3", "2"),
            new ItemGenerateClass("purified_diamond", "hoe", false, PURIFIED_DIAMOND_TOOL, "3", "2"),
            new ItemGenerateClass("purified_diamond", "helmet", false, PURIFIED_DIAMOND_ARMOR, "3", "2"),
            new ItemGenerateClass("purified_diamond", "chestplate", false, PURIFIED_DIAMOND_ARMOR, "3", "2"),
            new ItemGenerateClass("purified_diamond", "leggings", false, PURIFIED_DIAMOND_ARMOR, "3", "2"),
            new ItemGenerateClass("purified_diamond", "boots", false, PURIFIED_DIAMOND_ARMOR, "3", "2"),

            /*TITANIUM*/
            new ItemGenerateClass("titanium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("titanium", "sword", false, TITANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("titanium", "pickaxe", false, TITANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("titanium", "axe", false, TITANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("titanium", "shovel", false, TITANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("titanium", "hoe", false, TITANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("titanium", "helmet", true, TITANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("titanium", "chestplate", true, TITANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("titanium", "leggings", true, TITANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("titanium", "boots", true, TITANIUM_ARMOR, "3", "IUM"),

            /*SAPPHIRIUM*/
            new ItemGenerateClass("sapphirium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "sword", false, SAPPHIRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "pickaxe", false, SAPPHIRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "axe", false, SAPPHIRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "shovel", false, SAPPHIRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "hoe", false, SAPPHIRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "helmet", true, SAPPHIRIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "chestplate", true, SAPPHIRIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "leggings", true, SAPPHIRIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "boots", true, SAPPHIRIUM_ARMOR, "3", "IUM"),

            /*MERCURIUM*/
            new ItemGenerateClass("mercurium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("mercurium", "nugget", false, "3", "IUM"),
            new ItemGenerateClass("mercurium", "sword", false, MERCURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("mercurium", "pickaxe", false, MERCURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("mercurium", "axe", false, MERCURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("mercurium", "shovel", false, MERCURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("mercurium", "hoe", false, MERCURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("mercurium", "helmet", true, MERCURIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("mercurium", "chestplate", true, MERCURIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("mercurium", "leggings", true, MERCURIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("mercurium", "boots", true, MERCURIUM_ARMOR, "3", "IUM"),

            /*PLATINE*/
            new ItemGenerateClass("platine", "ingot", false, "3", "3"),
            new ItemGenerateClass("platine", "sword", false, PLATINE_TOOL, "3", "3"),
            new ItemGenerateClass("platine", "pickaxe", false, PLATINE_TOOL, "3", "3"),
            new ItemGenerateClass("platine", "axe", false, PLATINE_TOOL, "3", "3"),
            new ItemGenerateClass("platine", "shovel", false, PLATINE_TOOL, "3", "3"),
            new ItemGenerateClass("platine", "hoe", false, PLATINE_TOOL, "3", "3"),
            new ItemGenerateClass("platine", "helmet", false, PLATINE_ARMOR, "3", "3"),
            new ItemGenerateClass("platine", "chestplate", false, PLATINE_ARMOR, "3", "3"),
            new ItemGenerateClass("platine", "leggings", false, PLATINE_ARMOR, "3", "3"),
            new ItemGenerateClass("platine", "boots", false, PLATINE_ARMOR, "3", "3"),

            /*PLATINIUM*/
            new ItemGenerateClass("platinium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("platinium", "sword", false, PLATINIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("platinium", "pickaxe", false, PLATINIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("platinium", "axe", false, PLATINIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("platinium", "shovel", false, PLATINIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("platinium", "hoe", false, PLATINIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("platinium", "helmet", true, PLATINIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("platinium", "chestplate", true, PLATINIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("platinium", "leggings", true, PLATINIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("platinium", "boots", true, PLATINIUM_ARMOR, "3", "IUM"),

            /*VAPONITE*/
            new ItemGenerateClass("vaponite", "classic", false, "3", "3"),
            new ItemGenerateClass("vaponite", "sword", false, VAPONITE_TOOL, "3", "3"),
            new ItemGenerateClass("vaponite", "pickaxe", false, VAPONITE_TOOL, "3", "3"),
            new ItemGenerateClass("vaponite", "axe", false, VAPONITE_TOOL, "3", "3"),
            new ItemGenerateClass("vaponite", "shovel", false, VAPONITE_TOOL, "3", "3"),
            new ItemGenerateClass("vaponite", "hoe", false, VAPONITE_TOOL, "3", "3"),
            new ItemGenerateClass("vaponite", "helmet", false, VAPONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("vaponite", "chestplate", false, VAPONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("vaponite", "leggings", false, VAPONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("vaponite", "boots", false, VAPONITE_ARMOR, "3", "3"),

            /*VAPORIUM*/
            new ItemGenerateClass("vaporium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("vaporium", "nugget", false, "3", "IUM"),
            new ItemGenerateClass("vaporium", "sword", false, VAPORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("vaporium", "pickaxe", false, VAPORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("vaporium", "axe", false, VAPORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("vaporium", "shovel", false, VAPORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("vaporium", "hoe", false, VAPORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("vaporium", "helmet", true, VAPORIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("vaporium", "chestplate", true, VAPORIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("vaporium", "leggings", true, VAPORIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("vaporium", "boots", true, VAPORIUM_ARMOR, "3", "IUM"),

            /*PROTON*/
            new ItemGenerateClass("proton", "ingot", false, "3", "3"),
            new ItemGenerateClass("proton", "sword", false, PROTON_TOOL, "3", "3"),
            new ItemGenerateClass("proton", "pickaxe", false, PROTON_TOOL, "3", "3"),
            new ItemGenerateClass("proton", "axe", false, PROTON_TOOL, "3", "3"),
            new ItemGenerateClass("proton", "shovel", false, PROTON_TOOL, "3", "3"),
            new ItemGenerateClass("proton", "hoe", false, PROTON_TOOL, "3", "3"),
            new ItemGenerateClass("proton", "helmet", false, PROTON_ARMOR, "3", "3"),
            new ItemGenerateClass("proton", "chestplate", false, PROTON_ARMOR, "3", "3"),
            new ItemGenerateClass("proton", "leggings", false, PROTON_ARMOR, "3", "3"),
            new ItemGenerateClass("proton", "boots", false, PROTON_ARMOR, "3", "3"),

            /*RITONITE*/
            new ItemGenerateClass("ritonite", "ingot", false, "3", "3"),
            new ItemGenerateClass("ritonite", "nugget", false, "3", "3"),
            new ItemGenerateClass("ritonite", "sword", false, RITONITE_TOOL, "3", "3"),
            new ItemGenerateClass("ritonite", "pickaxe", false, RITONITE_TOOL, "3", "3"),
            new ItemGenerateClass("ritonite", "axe", false, RITONITE_TOOL, "3", "3"),
            new ItemGenerateClass("ritonite", "shovel", false, RITONITE_TOOL, "3", "3"),
            new ItemGenerateClass("ritonite", "hoe", false, RITONITE_TOOL, "3", "3"),
            new ItemGenerateClass("ritonite", "helmet", false, RITONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("ritonite", "chestplate", false, RITONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("ritonite", "leggings", false, RITONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("ritonite", "boots", false, RITONITE_ARMOR, "3", "3"),

            /*RITONIUM*/
            new ItemGenerateClass("ritonium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("ritonium", "nugget", false, "3", "IUM"),
            new ItemGenerateClass("ritonium", "sword", false, RITONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ritonium", "pickaxe", false, RITONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ritonium", "axe", false, RITONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ritonium", "shovel", false, RITONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ritonium", "hoe", false, RITONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ritonium", "helmet", true, RITONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("ritonium", "chestplate", true, RITONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("ritonium", "leggings", true, RITONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("ritonium", "boots", true, RITONIUM_ARMOR, "3", "IUM"),

            /*GOLDONITE*/
            new ItemGenerateClass("goldonite", "classic", false, "3", "3"),
            new ItemGenerateClass("goldonite", "sword", false, GOLDONITE_TOOL, "3", "3"),
            new ItemGenerateClass("goldonite", "pickaxe", false, GOLDONITE_TOOL, "3", "3"),
            new ItemGenerateClass("goldonite", "axe", false, GOLDONITE_TOOL, "3", "3"),
            new ItemGenerateClass("goldonite", "shovel", false, GOLDONITE_TOOL, "3", "3"),
            new ItemGenerateClass("goldonite", "hoe", false, GOLDONITE_TOOL, "3", "3"),
            new ItemGenerateClass("goldonite", "helmet", false, GOLDONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("goldonite", "chestplate", false, GOLDONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("goldonite", "leggings", false, GOLDONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("goldonite", "boots", false, GOLDONITE_ARMOR, "3", "3"),

            /*GOLDONIUM*/
            new ItemGenerateClass("goldonium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("goldonium", "sword", false, GOLDONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("goldonium", "pickaxe", false, GOLDONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("goldonium", "axe", false, GOLDONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("goldonium", "shovel", false, GOLDONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("goldonium", "hoe", false, GOLDONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("goldonium", "helmet", true, GOLDONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("goldonium", "chestplate", true, GOLDONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("goldonium", "leggings", true, GOLDONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("goldonium", "boots", true, GOLDONIUM_ARMOR, "3", "IUM"),

            /*OMEGA*/
            new ItemGenerateClass("omega", "classic", false, "3", "3"),
            new ItemGenerateClass("omega", "sword", false, OMEGA_TOOL, "3", "3"),
            new ItemGenerateClass("omega", "pickaxe", false, OMEGA_TOOL, "3", "3"),
            new ItemGenerateClass("omega", "axe", false, OMEGA_TOOL, "3", "3"),
            new ItemGenerateClass("omega", "shovel", false, OMEGA_TOOL, "3", "3"),
            new ItemGenerateClass("omega", "hoe", false, OMEGA_TOOL, "3", "3"),
            new ItemGenerateClass("omega", "helmet", false, OMEGA_ARMOR, "3", "3"),
            new ItemGenerateClass("omega", "chestplate", false, OMEGA_ARMOR, "3", "3"),
            new ItemGenerateClass("omega", "leggings", false, OMEGA_ARMOR, "3", "3"),
            new ItemGenerateClass("omega", "boots", false, OMEGA_ARMOR, "3", "3"),

            /*OMEGANIUM*/
            new ItemGenerateClass("omeganium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("omeganium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("omeganium", "sword", false, OMEGANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("omeganium", "pickaxe", false, OMEGANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("omeganium", "axe", false, OMEGANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("omeganium", "shovel", false, OMEGANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("omeganium", "hoe", false, OMEGANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("omeganium", "helmet", true, OMEGANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("omeganium", "chestplate", true, OMEGANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("omeganium", "leggings", true, OMEGANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("omeganium", "boots", true, OMEGANIUM_ARMOR, "3", "IUM"),

            /*NETHERIUM*/
            new ItemGenerateClass("netherium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("netherium", "sword", false, NETHERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("netherium", "pickaxe", false, NETHERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("netherium", "axe", false, NETHERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("netherium", "shovel", false, NETHERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("netherium", "hoe", false, NETHERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("netherium", "helmet", true, NETHERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("netherium", "chestplate", true, NETHERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("netherium", "leggings", true, NETHERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("netherium", "boots", true, NETHERIUM_ARMOR, "3", "IUM"),

            /*URANITE*/
            new ItemGenerateClass("uranite", "gem", false, "3", "3"),
            new ItemGenerateClass("uranite", "sword", false, URANITE_TOOL, "3", "3"),
            new ItemGenerateClass("uranite", "pickaxe", false, URANITE_TOOL, "3", "3"),
            new ItemGenerateClass("uranite", "axe", false, URANITE_TOOL, "3", "3"),
            new ItemGenerateClass("uranite", "shovel", false, URANITE_TOOL, "3", "3"),
            new ItemGenerateClass("uranite", "hoe", false, URANITE_TOOL, "3", "3"),
            new ItemGenerateClass("uranite", "helmet", false, URANITE_ARMOR, "3", "3"),
            new ItemGenerateClass("uranite", "chestplate", false, URANITE_ARMOR, "3", "3"),
            new ItemGenerateClass("uranite", "leggings", false, URANITE_ARMOR, "3", "3"),
            new ItemGenerateClass("uranite", "boots", false, URANITE_ARMOR, "3", "3"),

            /*URANIUM*/
            new ItemGenerateClass("uranium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("uranium", "powder", false, "3", "IUM"),
            new ItemGenerateClass("uranium", "sword", false, URANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("uranium", "pickaxe", false, URANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("uranium", "axe", false, URANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("uranium", "shovel", false, URANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("uranium", "hoe", false, URANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("uranium", "helmet", true, URANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("uranium", "chestplate", true, URANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("uranium", "leggings", true, URANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("uranium", "boots", true, URANIUM_ARMOR, "3", "IUM"),

            /*PLUTONITE*/
            new ItemGenerateClass("plutonite", "ingot", false, "3", "3"),
            new ItemGenerateClass("plutonite", "sword", false, PLUTONITE_TOOL, "3", "3"),
            new ItemGenerateClass("plutonite", "pickaxe", false, PLUTONITE_TOOL, "3", "3"),
            new ItemGenerateClass("plutonite", "axe", false, PLUTONITE_TOOL, "3", "3"),
            new ItemGenerateClass("plutonite", "shovel", false, PLUTONITE_TOOL, "3", "3"),
            new ItemGenerateClass("plutonite", "hoe", false, PLUTONITE_TOOL, "3", "3"),
            new ItemGenerateClass("plutonite", "helmet", false, PLUTONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("plutonite", "chestplate", false, PLUTONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("plutonite", "leggings", false, PLUTONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("plutonite", "boots", false, PLUTONITE_ARMOR, "3", "3"),

            /*PLUTONIUM*/
            new ItemGenerateClass("plutonium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("plutonium", "sword", false, PLUTONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("plutonium", "pickaxe", false, PLUTONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("plutonium", "axe", false, PLUTONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("plutonium", "shovel", false, PLUTONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("plutonium", "hoe", false, PLUTONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("plutonium", "helmet", true, PLUTONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("plutonium", "chestplate", true, PLUTONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("plutonium", "leggings", true, PLUTONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("plutonium", "boots", true, PLUTONIUM_ARMOR, "3", "IUM"),

            /*POLONITE*/
            new ItemGenerateClass("polonite", "classic", false, "3", "3"),
            new ItemGenerateClass("polonite", "sword", false, POLONITE_TOOL, "3", "3"),
            new ItemGenerateClass("polonite", "pickaxe", false, POLONITE_TOOL, "3", "3"),
            new ItemGenerateClass("polonite", "axe", false, POLONITE_TOOL, "3", "3"),
            new ItemGenerateClass("polonite", "shovel", false, POLONITE_TOOL, "3", "3"),
            new ItemGenerateClass("polonite", "hoe", false, POLONITE_TOOL, "3", "3"),
            new ItemGenerateClass("polonite", "helmet", false, POLONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("polonite", "chestplate", false, POLONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("polonite", "leggings", false, POLONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("polonite", "boots", false, POLONITE_ARMOR, "3", "3"),

            /*POLONIUM*/
            new ItemGenerateClass("polonium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("polonium", "sword", false, POLONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("polonium", "pickaxe", false, POLONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("polonium", "axe", false, POLONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("polonium", "shovel", false, POLONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("polonium", "hoe", false, POLONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("polonium", "helmet", true, POLONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("polonium", "chestplate", true, POLONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("polonium", "leggings", true, POLONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("polonium", "boots", true, POLONIUM_ARMOR, "3", "IUM"),

            /*CHRONITE*/
            new ItemGenerateClass("chronite", "classic", false, "3", "3"),
            new ItemGenerateClass("chronite", "sword", false, CHRONITE_TOOL, "3", "3"),
            new ItemGenerateClass("chronite", "pickaxe", false, CHRONITE_TOOL, "3", "3"),
            new ItemGenerateClass("chronite", "axe", false, CHRONITE_TOOL, "3", "3"),
            new ItemGenerateClass("chronite", "shovel", false, CHRONITE_TOOL, "3", "3"),
            new ItemGenerateClass("chronite", "hoe", false, CHRONITE_TOOL, "3", "3"),
            new ItemGenerateClass("chronite", "helmet", false, CHRONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("chronite", "chestplate", false, CHRONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("chronite", "leggings", false, CHRONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("chronite", "boots", false, CHRONITE_ARMOR, "3", "3"),

            /*CHROMITIUM*/
            new ItemGenerateClass("chromitium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("chromitium", "sword", false, CHROMITIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("chromitium", "pickaxe", false, CHROMITIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("chromitium", "axe", false, CHROMITIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("chromitium", "shovel", false, CHROMITIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("chromitium", "hoe", false, CHROMITIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("chromitium", "helmet", true, CHROMITIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("chromitium", "chestplate", true, CHROMITIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("chromitium", "leggings", true, CHROMITIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("chromitium", "boots", true, CHROMITIUM_ARMOR, "3", "IUM"),

            /*CORANITE*/
            new ItemGenerateClass("coranite", "classic", false, "3", "3"),
            new ItemGenerateClass("coranite", "sword", false, CORANITE_TOOL, "3", "3"),
            new ItemGenerateClass("coranite", "pickaxe", false, CORANITE_TOOL, "3", "3"),
            new ItemGenerateClass("coranite", "axe", false, CORANITE_TOOL, "3", "3"),
            new ItemGenerateClass("coranite", "shovel", false, CORANITE_TOOL, "3", "3"),
            new ItemGenerateClass("coranite", "hoe", false, CORANITE_TOOL, "3", "3"),
            new ItemGenerateClass("coranite", "helmet", false, CORANITE_ARMOR, "3", "3"),
            new ItemGenerateClass("coranite", "chestplate", false, CORANITE_ARMOR, "3", "3"),
            new ItemGenerateClass("coranite", "leggings", false, CORANITE_ARMOR, "3", "3"),
            new ItemGenerateClass("coranite", "boots", false, CORANITE_ARMOR, "3", "3"),

            /*CORANIUM*/
            new ItemGenerateClass("coranium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("coranium", "sword", false, CORANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("coranium", "pickaxe", false, CORANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("coranium", "axe", false, CORANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("coranium", "shovel", false, CORANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("coranium", "hoe", false, CORANIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("coranium", "helmet", true, CORANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("coranium", "chestplate", true, CORANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("coranium", "leggings", true, CORANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("coranium", "boots", true, CORANIUM_ARMOR, "3", "IUM"),

            /*MACRONITE*/
            new ItemGenerateClass("macronite", "classic", false, "3", "3"),
            new ItemGenerateClass("macronite", "sword", false, MACRONITE_TOOL, "3", "3"),
            new ItemGenerateClass("macronite", "pickaxe", false, MACRONITE_TOOL, "3", "3"),
            new ItemGenerateClass("macronite", "axe", false, MACRONITE_TOOL, "3", "3"),
            new ItemGenerateClass("macronite", "shovel", false, MACRONITE_TOOL, "3", "3"),
            new ItemGenerateClass("macronite", "hoe", false, MACRONITE_TOOL, "3", "3"),
            new ItemGenerateClass("macronite", "helmet", false, MACRONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("macronite", "chestplate", false, MACRONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("macronite", "leggings", false, MACRONITE_ARMOR, "3", "3"),
            new ItemGenerateClass("macronite", "boots", false, MACRONITE_ARMOR, "3", "3"),

            /*MACRONIUM*/
            new ItemGenerateClass("macronium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("macronium", "sword", false, MACRONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("macronium", "pickaxe", false, MACRONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("macronium", "axe", false, MACRONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("macronium", "shovel", false, MACRONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("macronium", "hoe", false, MACRONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("macronium", "helmet", true, MACRONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("macronium", "chestplate", true, MACRONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("macronium", "leggings", true, MACRONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("macronium", "boots", true, MACRONIUM_ARMOR, "3", "IUM"),

            /*GALACTITE*/
            new ItemGenerateClass("galactite", "ingot", false, "3", "3"),
            new ItemGenerateClass("galactite", "nugget", false, "3", "3"),
            new ItemGenerateClass("galactite", "sword", false, GALACTITE_TOOL, "3", "3"),
            new ItemGenerateClass("galactite", "pickaxe", false, GALACTITE_TOOL, "3", "3"),
            new ItemGenerateClass("galactite", "axe", false, GALACTITE_TOOL, "3", "3"),
            new ItemGenerateClass("galactite", "shovel", false, GALACTITE_TOOL, "3", "3"),
            new ItemGenerateClass("galactite", "hoe", false, GALACTITE_TOOL, "3", "3"),
            new ItemGenerateClass("galactite", "helmet", false, GALACTITE_ARMOR, "3", "3"),
            new ItemGenerateClass("galactite", "chestplate", false, GALACTITE_ARMOR, "3", "3"),
            new ItemGenerateClass("galactite", "leggings", false, GALACTITE_ARMOR, "3", "3"),
            new ItemGenerateClass("galactite", "boots", false, GALACTITE_ARMOR, "3", "3"),

            /*TOPAZ*/
            new ItemGenerateClass("topaz", "classic", false, "3", "3"),
            new ItemGenerateClass("topaz", "sword", false, TOPAZ_TOOL, "3", "3"),
            new ItemGenerateClass("topaz", "pickaxe", false, TOPAZ_TOOL, "3", "3"),
            new ItemGenerateClass("topaz", "axe", false, TOPAZ_TOOL, "3", "3"),
            new ItemGenerateClass("topaz", "shovel", false, TOPAZ_TOOL, "3", "3"),
            new ItemGenerateClass("topaz", "hoe", false, TOPAZ_TOOL, "3", "3"),
            new ItemGenerateClass("topaz", "helmet", false, TOPAZ_ARMOR, "3", "3"),
            new ItemGenerateClass("topaz", "chestplate", false, TOPAZ_ARMOR, "3", "3"),
            new ItemGenerateClass("topaz", "leggings", false, TOPAZ_ARMOR, "3", "3"),
            new ItemGenerateClass("topaz", "boots", false, TOPAZ_ARMOR, "3", "3"),

            /*PROTONIUM*/
            new ItemGenerateClass("protonium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("protonium", "sword", false, PROTONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("protonium", "pickaxe", false, PROTONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("protonium", "axe", false, PROTONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("protonium", "shovel", false, PROTONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("protonium", "hoe", false, PROTONIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("protonium", "helmet", true, PROTONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("protonium", "chestplate", true, PROTONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("protonium", "leggings", true, PROTONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("protonium", "boots", true, PROTONIUM_ARMOR, "3", "IUM"),

            /*SILVERIUM*/
            new ItemGenerateClass("silverium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("silverium", "sword", false, SILVERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silverium", "pickaxe", false, SILVERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silverium", "axe", false, SILVERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silverium", "shovel", false, SILVERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silverium", "hoe", false, SILVERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silverium", "helmet", true, SILVERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("silverium", "chestplate", true, SILVERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("silverium", "leggings", true, SILVERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("silverium", "boots", true, SILVERIUM_ARMOR, "3", "IUM"),

            /*SILICIUM*/
            new ItemGenerateClass("silicium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("silicium", "sword", false, SILICIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silicium", "pickaxe", false, SILICIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silicium", "axe", false, SILICIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silicium", "shovel", false, SILICIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silicium", "hoe", false, SILICIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silicium", "helmet", true, SILICIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("silicium", "chestplate", true, SILICIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("silicium", "leggings", true, SILICIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("silicium", "boots", true, SILICIUM_ARMOR, "3", "IUM"),

            /*IUM*/
            new ItemGenerateClass("ium", "ingot", false, "3", "0"),
            new ItemGenerateClass("ium", "powder", false, "3", "0"),
            new ItemGenerateClass("ium", "sword", false, IUM_TOOL, "3", "0"),
            new ItemGenerateClass("ium", "pickaxe", false, IUM_TOOL, "3", "0"),
            new ItemGenerateClass("ium", "axe", false, IUM_TOOL, "3", "0"),
            new ItemGenerateClass("ium", "shovel", false, IUM_TOOL, "3", "0"),
            new ItemGenerateClass("ium", "hoe", false, IUM_TOOL, "3", "0"),
            new ItemGenerateClass("ium", "helmet", false, IUM_ARMOR, "3", "0"),
            new ItemGenerateClass("ium", "chestplate", false, IUM_ARMOR, "3", "0"),
            new ItemGenerateClass("ium", "leggings", false, IUM_ARMOR, "3", "0"),
            new ItemGenerateClass("ium", "boots", false, IUM_ARMOR, "3", "0"),

            /*ULTIUM*/
            new ItemGenerateClass("ultium", "classic", false, "3", "FINAL"),
            new ItemGenerateClass("ultium", "powder", false, "3", "FINAL"),
            new ItemGenerateClass("ultium", "sword", false, ULTIUM_TOOL, "3", "FINAL"),
            new ItemGenerateClass("ultium", "pickaxe", false, ULTIUM_TOOL, "3", "FINAL"),
            new ItemGenerateClass("ultium", "axe", false, ULTIUM_TOOL, "3", "FINAL"),
            new ItemGenerateClass("ultium", "shovel", false, ULTIUM_TOOL, "3", "FINAL"),
            new ItemGenerateClass("ultium", "hoe", false, ULTIUM_TOOL, "3", "FINAL"),
            new ItemGenerateClass("ultium", "helmet", false, ULTIUM_ARMOR, "3", "FINAL"),
            new ItemGenerateClass("ultium", "chestplate", false, ULTIUM_ARMOR, "3", "FINAL"),
            new ItemGenerateClass("ultium", "leggings", false, ULTIUM_ARMOR, "3", "FINAL"),
            new ItemGenerateClass("ultium", "boots", false, ULTIUM_ARMOR, "3", "FINAL"),

            /*HAMMER*/
            new ItemGenerateClass("tyrolium", "hammer", false, TYROLIUM_HAMMER, "1", "IUM"),
            new ItemGenerateClass("rhodonium", "hammer", false, RHODONIUM_HAMMER, "3", "IUM"),
            new ItemGenerateClass("titanium", "hammer", false, TITANIUM_HAMMER, "3", "IUM"),
            new ItemGenerateClass("yellorium", "hammer", false, YELLORIUM_HAMMER, "3", "IUM"),
            new ItemGenerateClass("thyrium", "hammer", false, THYRIUM_HAMMER, "3", "IUM"),
            new ItemGenerateClass("mercure", "hammer", false, MERCURE_HAMMER, "1", "0"),

            /*SWORDFIRE*/
            new ItemGenerateClass("tyrolium", "sword_fire", false, TYROLIUM_SWORD_FIRE, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "sword_fire", false, RHODONIUM_SWORD_FIRE, "3", "IUM"),
            new ItemGenerateClass("yellorium", "sword_fire", false, YELLORIUM_SWORD_FIRE, "3", "IUM"),
            new ItemGenerateClass("thyrium", "sword_fire", false, THYRIUM_SWORD_FIRE, "3", "IUM"),
            new ItemGenerateClass("copperium", "sword_fire", false, COPPERIUM_SWORD_FIRE, "3", "IUM"),

            /*FOOD*/
            new ItemGenerateClass("tyrolium", "apple", false, "1"),
            new ItemGenerateClass("volcanium", "apple", false, "1"),
            new ItemGenerateClass("purified", "flesh", false, "1"),

            /*UTILS*/
            new ItemGenerateClass("radar", "classic", true, "3"),
            new ItemGenerateClass("heart_portal", "classic", false, "3"),

                /* *******
                 * SERVER
                 * *******/

            /*RING*/
            new ItemGenerateClass("angel","ring", true, "1"),

            /*COIN*/
            new ItemGenerateClass("blue","coin", true, "1"),
            new ItemGenerateClass("bronze","coin", true, "1"),
            new ItemGenerateClass("gold","coin", true, "1"),
            new ItemGenerateClass("iron","coin", true, "1"),
            new ItemGenerateClass("red","coin", true, "1"),

            /*GEAR*/
            new ItemGenerateClass("blue","gear", true, "1"),
            new ItemGenerateClass("bronze","gear", true, "1"),
            new ItemGenerateClass("gold","gear", true, "1"),
            new ItemGenerateClass("iron","gear", true, "1"),
            new ItemGenerateClass("red","gear", true, "1"),

            /*KEYCARD*/
            new ItemGenerateClass("blue","keycard", true, "1"),
            new ItemGenerateClass("orange","keycard", true, "1"),
            new ItemGenerateClass("pink","keycard", true, "1"),
            new ItemGenerateClass("purple","keycard", true, "1"),
            new ItemGenerateClass("red","keycard", true, "1"),
            new ItemGenerateClass("yellow","keycard", true, "1"),
            new ItemGenerateClass("tyrolium","keycard", true, "1"),

            /*PLATE*/
            new ItemGenerateClass("iron","plate", true, "1"),

            /*SYMBOL*/
            new ItemGenerateClass("doom","symbol", true, "1"),
            new ItemGenerateClass("error","symbol", true, "1"),
            new ItemGenerateClass("lock","symbol", true, "1"),
            new ItemGenerateClass("love","symbol", true, "1"),
            new ItemGenerateClass("no","symbol", true, "1"),
            new ItemGenerateClass("question","symbol", true, "1"),
            new ItemGenerateClass("relapse","symbol", true, "1"),
            new ItemGenerateClass("troll","symbol", true, "1"),
            new ItemGenerateClass("unvalide","symbol", true, "1"),
            new ItemGenerateClass("valide","symbol", true, "1"),

            /*WRENCH*/
            new ItemGenerateClass("blue","wrench", true, "1"),
            new ItemGenerateClass("gold","wrench", true, "1"),
            new ItemGenerateClass("iron","wrench", true, "1"),
            new ItemGenerateClass("red","wrench", true, "1"),

    };

    public static DefaultItem[] items;
    public static DefaultSword[] swords;
    public static DefaultPickaxe[] pickaxes;
    public static DefaultAxe[] axes;
    public static DefaultShovel[] shovels;
    public static DefaultHoe[] hoes;
    public static DefaultHammer[] hammers;
    public static DefaultSwordFire[] swordFires;
    public static DefaultFood[] foods;
    public static DefaultArmor[] armors;
    private static final Map<String, Item> itemCustomClass = new HashMap<>();


    static {

        items = new DefaultItem[ItemList.length];
        swords = new DefaultSword[ItemList.length];
        pickaxes = new DefaultPickaxe[ItemList.length];
        axes = new DefaultAxe[ItemList.length];
        shovels = new DefaultShovel[ItemList.length];
        hoes = new DefaultHoe[ItemList.length];
        hammers = new DefaultHammer[ItemList.length];
        swordFires = new DefaultSwordFire[ItemList.length];
        foods = new DefaultFood[ItemList.length];
        armors = new DefaultArmor[ItemList.length];

        for (int i = 0; i < ItemList.length; i++) {

//            System.out.println("New Item : " + ItemList[i].getName() + ItemList[i].getTypeName() + " (" + i + ") ");

            /* className NoCustom */
            if (!ItemList[i].getClassName()) {

                if (ItemList[i].getType() == "classic") {

                    if (ItemList[i].isOre() == "true") {
                        items[i] = new DefaultItem(ItemList[i].getName(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "i" + i);
                        _STOCKDB(ItemList[i].getName(), i, ItemList[i].getOreTier(), 0, ItemList[i].getModVersion(), "item");
                    } else {
                        items[i] = new DefaultItem(ItemList[i].getName(), ItemList[i].getModVersion(), "i" + i);
                        _STOCKDB(ItemList[i].getName(), i, "6", 0, ItemList[i].getModVersion(), "item");
                    }


                } else if (ItemList[i].getType() == "sword"){

                    swords[i] = new DefaultSword(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "s" + i);
                    _STOCKDB(ItemList[i].getName()+ ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 0, ItemList[i].getModVersion(), "sword");

                } else if (ItemList[i].getType() == "pickaxe"){

                    pickaxes[i] = new DefaultPickaxe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "p" + i);
                    _STOCKDB(ItemList[i].getName()+ ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 0, ItemList[i].getModVersion(), "pickaxe");

                } else if (ItemList[i].getType() == "axe"){

                    axes[i] = new DefaultAxe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "ax" + i);
                    _STOCKDB(ItemList[i].getName()+ ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 0, ItemList[i].getModVersion(), "axe");

                } else if (ItemList[i].getType() == "shovel"){

                    shovels[i] = new DefaultShovel(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "sh" + i);
                    _STOCKDB(ItemList[i].getName()+ ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 0, ItemList[i].getModVersion(), "shovel");

                } else if (ItemList[i].getType() == "hoe"){

                    hoes[i] = new DefaultHoe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "h" + i);
                    _STOCKDB(ItemList[i].getName()+ ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 0, ItemList[i].getModVersion(), "hoe");

                } else if (ItemList[i].getType() == "hammer"){

                    hammers[i] = new DefaultHammer(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "ha" + i);
                    _STOCKDB(ItemList[i].getName()+ ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 0, ItemList[i].getModVersion(), "hammer");

                } else if (ItemList[i].getType() == "sword_fire"){

                    swordFires[i] = new DefaultSwordFire(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "sf" + i);
                    _STOCKDB(ItemList[i].getName()+ ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 0, ItemList[i].getModVersion(), "sword_fire");

                } else if (ItemList[i].getType() == "apple" || ItemList[i].getType() == "flesh"){

                    foods[i] = new DefaultFood(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getModVersion(), "f" + i, 6, false);
                    _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, "6", 0, ItemList[i].getModVersion(), "food");

                } else if (ItemList[i].isArmor() == "true"){

                    armors[i] = new DefaultArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "a" + i);
                    _STOCKDB(ItemList[i].getName()+ ItemList[i].getTypeName(), i, "6", 0, ItemList[i].getModVersion(), "armor");

                } else {

                    if (ItemList[i].isOre() == "true") {
                        items[i] = new DefaultItem(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "i" + i);
                        _STOCKDB(ItemList[i].getName()+ ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 0, ItemList[i].getModVersion(), "item");
                    } else {
                        items[i] = new DefaultItem(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getModVersion(), "i" + i);
                        _STOCKDB(ItemList[i].getName()+ ItemList[i].getTypeName(), i, "6", 0, ItemList[i].getModVersion(), "item");
                    }


                }

            } else {
            /* custom className*/

                /*TYROLIUM*/
                if (ItemList[i].getName() == "tyrolium" && ItemList[i].getType() != "keycard") {

                    if (ItemList[i].getType() == "classic") {
                        itemCustomClass.put("c"+i, new Tyrolium(ItemList[i].getName(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "item");
                    } else if (ItemList[i].getType() == "sword"){
                        itemCustomClass.put("c"+i, new TyroliumSword(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "sword");
                    } else if (ItemList[i].getType() == "pickaxe"){
                        itemCustomClass.put("c"+i, new TyroliumPickaxe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "pickaxe");
                    } else if (ItemList[i].getType() == "axe"){
                        itemCustomClass.put("c"+i, new TyroliumAxe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "axe");
                    } else if (ItemList[i].getType() == "shovel"){
                        itemCustomClass.put("c"+i, new TyroliumShovel(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "shovel");
                    } else if (ItemList[i].getType() == "hoe"){
                        itemCustomClass.put("c"+i, new TyroliumHoe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "hoe");
                    } else if (ItemList[i].isArmor() == "true"){
                        itemCustomClass.put("c"+i, new TyroliumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }

                }

                /*ARMOR*/
                if (ItemList[i].isArmor() == "true" && ItemList[i].getName() != "tyrolium") {

                    if (ItemList[i].getName() == "adamantium") {
                        itemCustomClass.put("c"+1, new AdamantiumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "aventurium") {
                        itemCustomClass.put("c"+1, new AventuriumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "chromitium") {
                        itemCustomClass.put("c"+1, new ChromitiumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "copperium") {
                        itemCustomClass.put("c"+1, new CopperiumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "coranium") {
                        itemCustomClass.put("c"+1, new CoraniumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "draconium") {
                        itemCustomClass.put("c"+1, new DraconiumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "enderium") {
                        itemCustomClass.put("c"+1, new EnderiumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "goldonium") {
                        itemCustomClass.put("c"+1, new GoldoniumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "macronium") {
                        itemCustomClass.put("c"+1, new MacroniumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "mercurium") {
                        itemCustomClass.put("c"+1, new MercuriumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "netherium") {
                        itemCustomClass.put("c"+1, new NetheriumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "obsidium") {
                        itemCustomClass.put("c"+1, new ObsidiumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "omeganium") {
                        itemCustomClass.put("c"+1, new OmeganiumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "platinium") {
                        itemCustomClass.put("c"+1, new PlatiniumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "plutonium") {
                        itemCustomClass.put("c"+1, new PlutoniumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "polonium") {
                        itemCustomClass.put("c"+1, new PoloniumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "protonium") {
                        itemCustomClass.put("c"+1, new ProtoniumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "rhodonium") {
                        itemCustomClass.put("c"+1, new RhodoniumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "ritonium") {
                        itemCustomClass.put("c"+1, new RitoniumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "sapphirium") {
                        itemCustomClass.put("c"+1, new SapphiriumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "silicium") {
                        itemCustomClass.put("c"+1, new SiliciumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "silverium") {
                        itemCustomClass.put("c"+1, new SilveriumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "steelium") {
                        itemCustomClass.put("c"+1, new SteeliumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "thyrium") {
                        itemCustomClass.put("c"+1, new ThyriumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "titanium") {
                        itemCustomClass.put("c"+1, new TitaniumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "uranium") {
                        itemCustomClass.put("c"+1, new UraniumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "vaporium") {
                        itemCustomClass.put("c"+1, new VaporiumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "volcanium") {
                        itemCustomClass.put("c"+1, new VolcaniumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }
                    if (ItemList[i].getName() == "yellorium") {
                        itemCustomClass.put("c"+1, new YelloriumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                        _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, ItemList[i].getOreTier(), 1, ItemList[i].getModVersion(), "armor");
                    }

                }


                /*SERVER*/
                if (ItemList[i].getType() == "keycard" || ItemList[i].getType() == "symbol" || ItemList[i].getType() == "wrench" || ItemList[i].getType() == "gear" || ItemList[i].getType() == "coin" || ItemList[i].getType() == "ring" || ItemList[i].getType() == "plate") {
                    itemCustomClass.put("c"+i, new ServerItem(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getModVersion(), "c" + i));
                    _STOCKDB(ItemList[i].getName() + ItemList[i].getTypeName(), i, "6", 1, ItemList[i].getModVersion(), "item");
                }

                /*RADAR*/
                if (ItemList[i].getName() == "radar") {
                    itemCustomClass.put("c"+i, new Radar(ItemList[i].getName(), ItemList[i].getModVersion(), "c" + i));
                    _STOCKDB(ItemList[i].getName(), i, "6", 1, ItemList[i].getModVersion(), "item");

                }

            }



        }

    }

    public static Item getItemCustomClass(String nameItem) {
        return itemCustomClass.get(nameItem);
    }

    public static void _STOCKDB(String name, int tyroid, String tier, int customClass, String version, String className){

        if (Global.DB_LAUNCH_ITEM == 1) {

            String customClassDB;
            if (customClass == 0) {
                customClassDB = "zero";
            } else {
                customClassDB = String.valueOf(customClass);
            }
            String tierDB;
            if (tier.equals("0")) {
                tierDB = "6";
            } else {
                tierDB = String.valueOf(tier);
            }
            String tyroidDB;
            if (tyroid == 0) {
                tyroidDB = "zero";
            } else {
                tyroidDB = String.valueOf(tyroid);
            }


            String apiUrl = Global.API_FUSION + "insert.php?name="+ name +"&tyroid="+ tyroidDB + "&tier=" + tierDB + "&customClass=" + customClassDB+ "&version=" + version + "&className=" + className;
            System.out.println("url : " + apiUrl);
            try {
                URL url = new URL(apiUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setDoOutput(true);

                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                in.close();
                conn.disconnect();

                String result = content.toString();
                System.out.println("Reponse du serveur : " + result);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
