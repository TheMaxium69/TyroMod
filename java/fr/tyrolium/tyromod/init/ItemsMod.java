package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.generate.ItemGenerateClass;
import fr.tyrolium.tyromod.global.*;

import fr.tyrolium.tyromod.items.Tyrolium;
import fr.tyrolium.tyromod.items.armor.TyroliumArmor;
import fr.tyrolium.tyromod.items.tool.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(modid = Global.MODID)
public class ItemsMod {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Armour Materials
    public static final ArmorMaterial TYROLIUM_ARMOR = EnumHelper.addArmorMaterial("tyrolium_armor", Global.MODID + ":tyrolium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);

    //Tool Materials
    public static final ToolMaterial TYROLIUM_TOOL = EnumHelper.addToolMaterial("tyrolium_tool", 2, 400, 3.0f, 5.0f, 20);


    /* GENERATION */
    public static ItemGenerateClass[] ItemList = {

            /*TYROLIUM */
            new ItemGenerateClass("tyrolium", "classic", false, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "nugget", false, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "sword", true, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "pickaxe", false, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "axe", false, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "shovel", false, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "hoe", false, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "helmet", false, TYROLIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "chestplate", false, TYROLIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "leggings", false, TYROLIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("tyrolium", "boots", false, TYROLIUM_ARMOR, "1", "IUM"),

            /*RHODONITE*/
            new ItemGenerateClass("rhodonite", "classic", false, "1", "3"),
            new ItemGenerateClass("rhodonite", "nugget", false, "1", "3"),
            new ItemGenerateClass("rhodonite", "sword", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("rhodonite", "pickaxe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("rhodonite", "axe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("rhodonite", "shovel", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("rhodonite", "hoe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("rhodonite", "helmet", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("rhodonite", "chestplate", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("rhodonite", "leggings", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("rhodonite", "boots", false, TYROLIUM_ARMOR, "1", "3"),

            /*AMETHYS*/
            new ItemGenerateClass("amethys", "classic", false, "1", "2"),
            new ItemGenerateClass("amethys", "nugget", false, "1", "2"),
            new ItemGenerateClass("amethys", "sword", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("amethys", "pickaxe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("amethys", "axe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("amethys", "shovel", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("amethys", "hoe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("amethys", "helmet", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("amethys", "chestplate", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("amethys", "leggings", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("amethys", "boots", false, TYROLIUM_ARMOR, "1", "2"),

            /*YELLORITE*/
            new ItemGenerateClass("yellorite", "classic", false, "1", "2"),
            new ItemGenerateClass("yellorite", "nugget", false, "1", "2"),
            new ItemGenerateClass("yellorite", "sword", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("yellorite", "pickaxe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("yellorite", "axe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("yellorite", "shovel", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("yellorite", "hoe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("yellorite", "helmet", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("yellorite", "chestplate", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("yellorite", "leggings", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("yellorite", "boots", false, TYROLIUM_ARMOR, "1", "2"),

            /*AVENTURINE*/
            new ItemGenerateClass("aventurine", "classic", false, "1", "3"),
            new ItemGenerateClass("aventurine", "gem", false, "1", "3"),
            new ItemGenerateClass("aventurine", "nugget", false, "1", "3"),
            new ItemGenerateClass("aventurine", "powder", false, "1", "3"),
            new ItemGenerateClass("aventurine", "sword", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("aventurine", "pickaxe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("aventurine", "axe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("aventurine", "shovel", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("aventurine", "hoe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("aventurine", "helmet", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("aventurine", "chestplate", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("aventurine", "leggings", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("aventurine", "boots", false, TYROLIUM_ARMOR, "1", "3"),

            /*COPPER*/
            new ItemGenerateClass("copper", "ingot", false, "1", "1"),
            new ItemGenerateClass("copper", "nugget", false, "1", "1"),
            new ItemGenerateClass("copper", "sword", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("copper", "pickaxe", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("copper", "axe", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("copper", "shovel", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("copper", "hoe", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("copper", "helmet", false, TYROLIUM_ARMOR, "1", "1"),
            new ItemGenerateClass("copper", "chestplate", false, TYROLIUM_ARMOR, "1", "1"),
            new ItemGenerateClass("copper", "leggings", false, TYROLIUM_ARMOR, "1", "1"),
            new ItemGenerateClass("copper", "boots", false, TYROLIUM_ARMOR, "1", "1"),

            /*EMERALD*/
            new ItemGenerateClass("emerald", "sword", false, TYROLIUM_TOOL, "V1", "2"),
            new ItemGenerateClass("emerald", "pickaxe", false, TYROLIUM_TOOL, "V1", "2"),
            new ItemGenerateClass("emerald", "axe", false, TYROLIUM_TOOL, "V1", "2"),
            new ItemGenerateClass("emerald", "shovel", false, TYROLIUM_TOOL, "V1", "2"),
            new ItemGenerateClass("emerald", "hoe", false, TYROLIUM_TOOL, "V1", "2"),
            new ItemGenerateClass("emerald", "helmet", false, TYROLIUM_ARMOR, "V1", "2"),
            new ItemGenerateClass("emerald", "chestplate", false, TYROLIUM_ARMOR, "V1", "2"),
            new ItemGenerateClass("emerald", "leggings", false, TYROLIUM_ARMOR, "V1", "2"),
            new ItemGenerateClass("emerald", "boots", false, TYROLIUM_ARMOR, "V1", "2"),

            /*ENDER*/
            new ItemGenerateClass("ender", "gem", false, "1", "3"),
            new ItemGenerateClass("ender", "nugget", false, "1", "3"),
            new ItemGenerateClass("ender", "sword", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("ender", "pickaxe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("ender", "axe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("ender", "shovel", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("ender", "hoe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("ender", "helmet", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("ender", "chestplate", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("ender", "leggings", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("ender", "boots", false, TYROLIUM_ARMOR, "1", "3"),

            /*ENDERINE*/
            new ItemGenerateClass("enderine", "ingot", false, "1", "1"),
            new ItemGenerateClass("enderine", "nugget", false, "1", "1"),
            new ItemGenerateClass("enderine", "sword", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("enderine", "pickaxe", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("enderine", "axe", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("enderine", "shovel", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("enderine", "hoe", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("enderine", "helmet", false, TYROLIUM_ARMOR, "1", "1"),
            new ItemGenerateClass("enderine", "chestplate", false, TYROLIUM_ARMOR, "1", "1"),
            new ItemGenerateClass("enderine", "leggings", false, TYROLIUM_ARMOR, "1", "1"),
            new ItemGenerateClass("enderine", "boots", false, TYROLIUM_ARMOR, "1", "1"),

            /*FLINT*/
            new ItemGenerateClass("flint", "gem", false, "V1", "1"),
            new ItemGenerateClass("flint", "sword", false, TYROLIUM_TOOL, "V1", "1"),
            new ItemGenerateClass("flint", "pickaxe", false, TYROLIUM_TOOL, "V1", "1"),
            new ItemGenerateClass("flint", "axe", false, TYROLIUM_TOOL, "V1", "1"),
            new ItemGenerateClass("flint", "shovel", false, TYROLIUM_TOOL, "V1", "1"),
            new ItemGenerateClass("flint", "hoe", false, TYROLIUM_TOOL, "V1", "1"),
            new ItemGenerateClass("flint", "helmet", false, TYROLIUM_ARMOR, "V1", "1"),
            new ItemGenerateClass("flint", "chestplate", false, TYROLIUM_ARMOR, "V1", "1"),
            new ItemGenerateClass("flint", "leggings", false, TYROLIUM_ARMOR, "V1", "1"),
            new ItemGenerateClass("flint", "boots", false, TYROLIUM_ARMOR, "V1", "1"),

            /*GRAVEL*/
            new ItemGenerateClass("gravel", "sword", false, TYROLIUM_TOOL, "V1", "0"),
            new ItemGenerateClass("gravel", "pickaxe", false, TYROLIUM_TOOL, "V1", "0"),
            new ItemGenerateClass("gravel", "axe", false, TYROLIUM_TOOL, "V1", "0"),
            new ItemGenerateClass("gravel", "shovel", false, TYROLIUM_TOOL, "V1", "0"),
            new ItemGenerateClass("gravel", "hoe", false, TYROLIUM_TOOL, "V1", "0"),
            new ItemGenerateClass("gravel", "helmet", false, TYROLIUM_ARMOR, "V1", "0"),
            new ItemGenerateClass("gravel", "chestplate", false, TYROLIUM_ARMOR, "V1", "0"),
            new ItemGenerateClass("gravel", "leggings", false, TYROLIUM_ARMOR, "V1", "0"),
            new ItemGenerateClass("gravel", "boots", false, TYROLIUM_ARMOR, "V1", "0"),

            /*GUARDIAN*/
            new ItemGenerateClass("guardian", "ingot", false, "1", "3"),
            new ItemGenerateClass("guardian", "sword", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("guardian", "pickaxe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("guardian", "axe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("guardian", "shovel", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("guardian", "hoe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("guardian", "helmet", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("guardian", "chestplate", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("guardian", "leggings", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("guardian", "boots", false, TYROLIUM_ARMOR, "1", "3"),

            /*MERCURE*/
            new ItemGenerateClass("mercure", "ingot", false, "13", "0"),
            new ItemGenerateClass("mercure", "nugget", false, "13", "0"),
            new ItemGenerateClass("mercure", "stick", false, "13", "0"),
            new ItemGenerateClass("mercure", "sword", false, TYROLIUM_TOOL, "13", "0"),
            new ItemGenerateClass("mercure", "pickaxe", false, TYROLIUM_TOOL, "13", "0"),
            new ItemGenerateClass("mercure", "axe", false, TYROLIUM_TOOL, "13", "0"),
            new ItemGenerateClass("mercure", "shovel", false, TYROLIUM_TOOL, "13", "0"),
            new ItemGenerateClass("mercure", "hoe", false, TYROLIUM_TOOL, "13", "0"),
            new ItemGenerateClass("mercure", "helmet", false, TYROLIUM_ARMOR, "13", "0"),
            new ItemGenerateClass("mercure", "chestplate", false, TYROLIUM_ARMOR, "13", "0"),
            new ItemGenerateClass("mercure", "leggings", false, TYROLIUM_ARMOR, "13", "0"),
            new ItemGenerateClass("mercure", "boots", false, TYROLIUM_ARMOR, "13", "0"),

            /*OBSIDIAN*/
            new ItemGenerateClass("obsidian", "ingot", false, "V1", "2"),
            new ItemGenerateClass("obsidian", "sword", false, TYROLIUM_TOOL, "V1", "2"),
            new ItemGenerateClass("obsidian", "pickaxe", false, TYROLIUM_TOOL, "V1", "2"),
            new ItemGenerateClass("obsidian", "axe", false, TYROLIUM_TOOL, "V1", "2"),
            new ItemGenerateClass("obsidian", "shovel", false, TYROLIUM_TOOL, "V1", "2"),
            new ItemGenerateClass("obsidian", "hoe", false, TYROLIUM_TOOL, "V1", "2"),
            new ItemGenerateClass("obsidian", "helmet", false, TYROLIUM_ARMOR, "V1", "2"),
            new ItemGenerateClass("obsidian", "chestplate", false, TYROLIUM_ARMOR, "V1", "2"),
            new ItemGenerateClass("obsidian", "leggings", false, TYROLIUM_ARMOR, "V1", "2"),
            new ItemGenerateClass("obsidian", "boots", false, TYROLIUM_ARMOR, "V1", "2"),

            /*OBSIDIAN RED*/
            new ItemGenerateClass("obsidian_red", "ingot", false, "1", "3"),
            new ItemGenerateClass("obsidian_red", "sword", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("obsidian_red", "pickaxe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("obsidian_red", "axe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("obsidian_red", "shovel", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("obsidian_red", "hoe", false, TYROLIUM_TOOL, "1", "3"),
            new ItemGenerateClass("obsidian_red", "helmet", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("obsidian_red", "chestplate", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("obsidian_red", "leggings", false, TYROLIUM_ARMOR, "1", "3"),
            new ItemGenerateClass("obsidian_red", "boots", false, TYROLIUM_ARMOR, "1", "3"),

            /*PURIFIED GOLD*/
            new ItemGenerateClass("purified_gold", "ingot", false, "1", "2"),
            new ItemGenerateClass("purified_gold", "nugget", false, "1", "2"),
            new ItemGenerateClass("purified_gold", "sword", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("purified_gold", "pickaxe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("purified_gold", "axe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("purified_gold", "shovel", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("purified_gold", "hoe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("purified_gold", "helmet", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("purified_gold", "chestplate", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("purified_gold", "leggings", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("purified_gold", "boots", false, TYROLIUM_ARMOR, "1", "2"),

            /*REDSTONE*/
            new ItemGenerateClass("redstone", "ingot", false, "V1", "0"),
            new ItemGenerateClass("redstone", "stick", false, "V1", "0"),
            new ItemGenerateClass("redstone", "sword", false, TYROLIUM_TOOL, "V1", "0"),
            new ItemGenerateClass("redstone", "pickaxe", false, TYROLIUM_TOOL, "V1", "0"),
            new ItemGenerateClass("redstone", "axe", false, TYROLIUM_TOOL, "V1", "0"),
            new ItemGenerateClass("redstone", "shovel", false, TYROLIUM_TOOL, "V1", "0"),
            new ItemGenerateClass("redstone", "hoe", false, TYROLIUM_TOOL, "V1", "0"),
            new ItemGenerateClass("redstone", "helmet", false, TYROLIUM_ARMOR, "V1", "0"),
            new ItemGenerateClass("redstone", "chestplate", false, TYROLIUM_ARMOR, "V1", "0"),
            new ItemGenerateClass("redstone", "leggings", false, TYROLIUM_ARMOR, "V1", "0"),
            new ItemGenerateClass("redstone", "boots", false, TYROLIUM_ARMOR, "V1", "0"),

            /*RUBY*/
            new ItemGenerateClass("ruby", "classic", false, "1", "2"),
            new ItemGenerateClass("ruby", "sword", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("ruby", "pickaxe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("ruby", "axe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("ruby", "shovel", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("ruby", "hoe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("ruby", "helmet", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("ruby", "chestplate", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("ruby", "leggings", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("ruby", "boots", false, TYROLIUM_ARMOR, "1", "2"),

            /*SAPPHIRE*/
            new ItemGenerateClass("sapphire", "classic", false, "1", "2"),
            new ItemGenerateClass("sapphire", "sword", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("sapphire", "pickaxe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("sapphire", "axe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("sapphire", "shovel", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("sapphire", "hoe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("sapphire", "helmet", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("sapphire", "chestplate", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("sapphire", "leggings", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("sapphire", "boots", false, TYROLIUM_ARMOR, "1", "2"),

            /*TIN*/
            new ItemGenerateClass("tin", "ingot", false, "1", "1"),
            new ItemGenerateClass("tin", "nugget", false, "1", "1"),
            new ItemGenerateClass("tin", "sword", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("tin", "pickaxe", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("tin", "axe", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("tin", "shovel", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("tin", "hoe", false, TYROLIUM_TOOL, "1", "1"),
            new ItemGenerateClass("tin", "helmet", false, TYROLIUM_ARMOR, "1", "1"),
            new ItemGenerateClass("tin", "chestplate", false, TYROLIUM_ARMOR, "1", "1"),
            new ItemGenerateClass("tin", "leggings", false, TYROLIUM_ARMOR, "1", "1"),
            new ItemGenerateClass("tin", "boots", false, TYROLIUM_ARMOR, "1", "1"),

            /*TITANE*/
            new ItemGenerateClass("titane", "ingot", false, "1", "2"),
            new ItemGenerateClass("titane", "nugget", false, "1", "2"),
            new ItemGenerateClass("titane", "sword", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("titane", "pickaxe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("titane", "axe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("titane", "shovel", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("titane", "hoe", false, TYROLIUM_TOOL, "1", "2"),
            new ItemGenerateClass("titane", "helmet", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("titane", "chestplate", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("titane", "leggings", false, TYROLIUM_ARMOR, "1", "2"),
            new ItemGenerateClass("titane", "boots", false, TYROLIUM_ARMOR, "1", "2"),

            /*VOLCANIUM*/
            new ItemGenerateClass("volcanium", "classic", false, "1", "IUM"),
            new ItemGenerateClass("volcanium", "ingot", false, "1", "IUM"),
            new ItemGenerateClass("volcanium", "stick", false, "1", "IUM"),
            new ItemGenerateClass("volcanium", "sword", false, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("volcanium", "pickaxe", false, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("volcanium", "axe", false, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("volcanium", "shovel", false, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("volcanium", "hoe", false, TYROLIUM_TOOL, "1", "IUM"),
            new ItemGenerateClass("volcanium", "helmet", false, TYROLIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("volcanium", "chestplate", false, TYROLIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("volcanium", "leggings", false, TYROLIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("volcanium", "boots", false, TYROLIUM_ARMOR, "1", "IUM"),

            /*ADAMANTIUM*/
            new ItemGenerateClass("adamantium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("adamantium", "sword", false, TYROLIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "pickaxe", false, TYROLIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "axe", false, TYROLIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "shovel", false, TYROLIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "hoe", false, TYROLIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "helmet", false, TYROLIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("adamantium", "chestplate", false, TYROLIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("adamantium", "leggings", false, TYROLIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("adamantium", "boots", false, TYROLIUM_ARMOR, "3", "IUM"),

            /*ARGONITE*/
            new ItemGenerateClass("argonite", "ingot", false, "3", "3"),
            new ItemGenerateClass("argonite", "sword", false, TYROLIUM_TOOL, "3", "3"),
            new ItemGenerateClass("argonite", "pickaxe", false, TYROLIUM_TOOL, "3", "3"),
            new ItemGenerateClass("argonite", "axe", false, TYROLIUM_TOOL, "3", "3"),
            new ItemGenerateClass("argonite", "shovel", false, TYROLIUM_TOOL, "3", "3"),
            new ItemGenerateClass("argonite", "hoe", false, TYROLIUM_TOOL, "3", "3"),
            new ItemGenerateClass("argonite", "helmet", false, TYROLIUM_ARMOR, "3", "3"),
            new ItemGenerateClass("argonite", "chestplate", false, TYROLIUM_ARMOR, "3", "3"),
            new ItemGenerateClass("argonite", "leggings", false, TYROLIUM_ARMOR, "3", "3"),
            new ItemGenerateClass("argonite", "boots", false, TYROLIUM_ARMOR, "3", "3"),
    };


    public static DefaultItem[] items;
    public static DefaultSword[] swords;
    public static DefaultPickaxe[] pickaxes;
    public static DefaultAxe[] axes;
    public static DefaultShovel[] shovels;
    public static DefaultHoe[] hoes;
    public static DefaultArmor[] armors;
    private static final Map<String, Item> itemCustomClass = new HashMap<>();


    static {

        items = new DefaultItem[ItemList.length];
        swords = new DefaultSword[ItemList.length];
        pickaxes = new DefaultPickaxe[ItemList.length];
        axes = new DefaultAxe[ItemList.length];
        shovels = new DefaultShovel[ItemList.length];
        hoes = new DefaultHoe[ItemList.length];
        armors = new DefaultArmor[ItemList.length];

        for (int i = 0; i < ItemList.length; i++) {

            System.out.println("New Item : " + ItemList[i].getName() + ItemList[i].getTypeName() + " (" + i + ") ");

            /* className NoCustom */
            if (!ItemList[i].getClassName()) {

                if (ItemList[i].getType() == "classic") {

                    if (ItemList[i].isOre() == "true") {
                        items[i] = new DefaultItem(ItemList[i].getName(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "i" + i);
                    } else {
                        items[i] = new DefaultItem(ItemList[i].getName(), ItemList[i].getModVersion(), "i" + i);
                    }

                } else if (ItemList[i].getType() == "sword"){

                    swords[i] = new DefaultSword(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "s" + i);

                } else if (ItemList[i].getType() == "pickaxe"){

                    pickaxes[i] = new DefaultPickaxe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial());

                } else if (ItemList[i].getType() == "axe"){

                    axes[i] = new DefaultAxe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial());

                } else if (ItemList[i].getType() == "shovel"){

                    shovels[i] = new DefaultShovel(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial());

                } else if (ItemList[i].getType() == "hoe"){

                    hoes[i] = new DefaultHoe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial());

                } else if (ItemList[i].isArmor() == "true"){

                    armors[i] = new DefaultArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "a" + i);

                } else {

                    if (ItemList[i].isOre() == "true") {
                        items[i] = new DefaultItem(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "i" + i);
                    } else {
                        items[i] = new DefaultItem(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getModVersion(), "i" + i);
                    }


                }

            } else {
            /* custom className*/

                /*TYROLIUM*/
                if (ItemList[i].getName() == "tyrolium") {


                    if (ItemList[i].getType() == "classic") {
                        itemCustomClass.put("c"+i, new Tyrolium(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                    } else if (ItemList[i].getType() == "sword"){
                        itemCustomClass.put("c"+i, new TyroliumSword(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                    } else if (ItemList[i].getType() == "pickaxe"){

                    } else if (ItemList[i].getType() == "axe"){

                    } else if (ItemList[i].getType() == "shovel"){

                    } else if (ItemList[i].getType() == "hoe"){

                    } else if (ItemList[i].isArmor() == "true"){
                        itemCustomClass.put("c"+i, new TyroliumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                    } else {

                    }



                }

            }



        }

    }

    public static Item getItemCustomClass(String nameItem) {
        return itemCustomClass.get(nameItem);
    }



}
