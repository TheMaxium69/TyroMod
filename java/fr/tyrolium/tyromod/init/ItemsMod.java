package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.generate.BlockGenerateClass;
import fr.tyrolium.tyromod.generate.ItemGenerateClass;
import fr.tyrolium.tyromod.global.*;
import fr.tyrolium.tyromod.items.Amethys;
import fr.tyrolium.tyromod.items.Rhodonite;
import fr.tyrolium.tyromod.items.Tyrolium;
import fr.tyrolium.tyromod.items.Yellorite;

import fr.tyrolium.tyromod.items.armor.TyroliumArmor;
import fr.tyrolium.tyromod.items.tool.*;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import java.util.ArrayList;
import java.util.List;

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
            new ItemGenerateClass("tyrolium", "classic", false),
            new ItemGenerateClass("tyrolium", "nugget", false),
            new ItemGenerateClass("tyrolium", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("tyrolium", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("tyrolium", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("tyrolium", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("tyrolium", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("tyrolium", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("tyrolium", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("tyrolium", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("tyrolium", "boots", false, TYROLIUM_ARMOR),

            /*RHODONITE*/
            new ItemGenerateClass("rhodonite", "classic", false),
            new ItemGenerateClass("rhodonite", "nugget", false),
            new ItemGenerateClass("rhodonite", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("rhodonite", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("rhodonite", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("rhodonite", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("rhodonite", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("rhodonite", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("rhodonite", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("rhodonite", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("rhodonite", "boots", false, TYROLIUM_ARMOR),

            /*AMETHYS*/
            new ItemGenerateClass("amethys", "classic", false),
            new ItemGenerateClass("amethys", "nugget", false),
            new ItemGenerateClass("amethys", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("amethys", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("amethys", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("amethys", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("amethys", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("amethys", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("amethys", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("amethys", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("amethys", "boots", false, TYROLIUM_ARMOR),

            /*YELLORITE*/
            new ItemGenerateClass("yellorite", "classic", false),
            new ItemGenerateClass("yellorite", "nugget", false),
            new ItemGenerateClass("yellorite", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("yellorite", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("yellorite", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("yellorite", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("yellorite", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("yellorite", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("yellorite", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("yellorite", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("yellorite", "boots", false, TYROLIUM_ARMOR),

            /*AVENTURINE*/
            new ItemGenerateClass("aventurine", "classic", false),
            new ItemGenerateClass("aventurine", "gem", false),
            new ItemGenerateClass("aventurine", "nugget", false),
            new ItemGenerateClass("aventurine", "powder", false),
            new ItemGenerateClass("aventurine", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("aventurine", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("aventurine", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("aventurine", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("aventurine", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("aventurine", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("aventurine", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("aventurine", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("aventurine", "boots", false, TYROLIUM_ARMOR),

            /*COPPER*/
            new ItemGenerateClass("copper", "ingot", false),
            new ItemGenerateClass("copper", "nugget", false),
            new ItemGenerateClass("copper", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("copper", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("copper", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("copper", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("copper", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("copper", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("copper", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("copper", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("copper", "boots", false, TYROLIUM_ARMOR),

            /*EMERALD*/
            new ItemGenerateClass("emerald", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("emerald", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("emerald", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("emerald", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("emerald", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("emerald", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("emerald", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("emerald", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("emerald", "boots", false, TYROLIUM_ARMOR),

            /*ENDER*/
            new ItemGenerateClass("ender", "gem", false),
            new ItemGenerateClass("ender", "nugget", false),
            new ItemGenerateClass("ender", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("ender", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("ender", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("ender", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("ender", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("ender", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("ender", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("ender", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("ender", "boots", false, TYROLIUM_ARMOR),

            /*ENDERINE*/
            new ItemGenerateClass("enderine", "ingot", false),
            new ItemGenerateClass("enderine", "nugget", false),
            new ItemGenerateClass("enderine", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("enderine", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("enderine", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("enderine", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("enderine", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("enderine", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("enderine", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("enderine", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("enderine", "boots", false, TYROLIUM_ARMOR),

            /*FLINT*/
            new ItemGenerateClass("flint", "gem", false),
            new ItemGenerateClass("flint", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("flint", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("flint", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("flint", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("flint", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("flint", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("flint", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("flint", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("flint", "boots", false, TYROLIUM_ARMOR),

            /*GRAVEL*/
            new ItemGenerateClass("gravel", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("gravel", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("gravel", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("gravel", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("gravel", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("gravel", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("gravel", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("gravel", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("gravel", "boots", false, TYROLIUM_ARMOR),

            /*GUARDIAN*/
            new ItemGenerateClass("guardian", "ingot", false),
            new ItemGenerateClass("guardian", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("guardian", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("guardian", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("guardian", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("guardian", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("guardian", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("guardian", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("guardian", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("guardian", "boots", false, TYROLIUM_ARMOR),

            /*MERCURE*/
            new ItemGenerateClass("mercure", "ingot", false),
            new ItemGenerateClass("mercure", "nugget", false),
            new ItemGenerateClass("mercure", "stick", false),
            new ItemGenerateClass("mercure", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("mercure", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("mercure", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("mercure", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("mercure", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("mercure", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("mercure", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("mercure", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("mercure", "boots", false, TYROLIUM_ARMOR),

            /*OBSIDIAN*/
            new ItemGenerateClass("obsidian", "ingot", false),
            new ItemGenerateClass("obsidian", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("obsidian", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("obsidian", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("obsidian", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("obsidian", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("obsidian", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("obsidian", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("obsidian", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("obsidian", "boots", false, TYROLIUM_ARMOR),

            /*OBSIDIAN RED*/
            new ItemGenerateClass("obsidian_red", "ingot", false),
            new ItemGenerateClass("obsidian_red", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("obsidian_red", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("obsidian_red", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("obsidian_red", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("obsidian_red", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("obsidian_red", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("obsidian_red", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("obsidian_red", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("obsidian_red", "boots", false, TYROLIUM_ARMOR),

            /*PURIFIED GOLD*/
            new ItemGenerateClass("prufied_gold", "ingot", false),
            new ItemGenerateClass("prufied_gold", "nugget", false),
            new ItemGenerateClass("prufied_gold", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("prufied_gold", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("prufied_gold", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("prufied_gold", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("prufied_gold", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("prufied_gold", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("prufied_gold", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("prufied_gold", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("prufied_gold", "boots", false, TYROLIUM_ARMOR),

            /*REDSTONE*/
            new ItemGenerateClass("redstone", "ingot", false),
            new ItemGenerateClass("redstone", "stick", false),
            new ItemGenerateClass("redstone", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("redstone", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("redstone", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("redstone", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("redstone", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("redstone", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("redstone", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("redstone", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("redstone", "boots", false, TYROLIUM_ARMOR),

            /*RUBY*/
            new ItemGenerateClass("ruby", "classic", false),
            new ItemGenerateClass("ruby", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("ruby", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("ruby", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("ruby", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("ruby", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("ruby", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("ruby", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("ruby", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("ruby", "boots", false, TYROLIUM_ARMOR),

            /*SAPPHIRE*/
            new ItemGenerateClass("sapphire", "classic", false),
            new ItemGenerateClass("sapphire", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("sapphire", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("sapphire", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("sapphire", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("sapphire", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("sapphire", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("sapphire", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("sapphire", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("sapphire", "boots", false, TYROLIUM_ARMOR),

            /*TIN*/
            new ItemGenerateClass("tin", "ingot", false),
            new ItemGenerateClass("tin", "nugget", false),
            new ItemGenerateClass("tin", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("tin", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("tin", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("tin", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("tin", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("tin", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("tin", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("tin", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("tin", "boots", false, TYROLIUM_ARMOR),

            /*TITANE*/
            new ItemGenerateClass("titane", "ingot", false),
            new ItemGenerateClass("titane", "nugget", false),
            new ItemGenerateClass("titane", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("titane", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("titane", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("titane", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("titane", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("titane", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("titane", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("titane", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("titane", "boots", false, TYROLIUM_ARMOR),

            /*VOLCANIUM*/
            new ItemGenerateClass("volcanium", "classic", false),
            new ItemGenerateClass("volcanium", "ingot", false),
            new ItemGenerateClass("volcanium", "stick", false),
            new ItemGenerateClass("volcanium", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("volcanium", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("volcanium", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("volcanium", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("volcanium", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("volcanium", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("volcanium", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("volcanium", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("volcanium", "boots", false, TYROLIUM_ARMOR),

            /*ADAMENTIUM*/
            new ItemGenerateClass("adamentium", "classic", false),

            /*ARGONITE*/
            new ItemGenerateClass("argonite", "classic", false),
    };


    public static DefaultItem[] items;
    public static DefaultSword[] swords;
    public static DefaultPickaxe[] pickaxes;
    public static DefaultAxe[] axes;
    public static DefaultShovel[] shovels;
    public static DefaultHoe[] hoes;
    public static DefaultArmor[] armors;

    static {

        items = new DefaultItem[ItemList.length];
        swords = new DefaultSword[ItemList.length];
        pickaxes = new DefaultPickaxe[ItemList.length];
        axes = new DefaultAxe[ItemList.length];
        shovels = new DefaultShovel[ItemList.length];
        hoes = new DefaultHoe[ItemList.length];
        armors = new DefaultArmor[ItemList.length];

        for (int i = 0; i < ItemList.length; i++) {


            /* className NoCustom */
            if (!ItemList[i].getClassName()) {

                if (ItemList[i].getType() == "classic") {

                    items[i] = new DefaultItem(ItemList[i].getName());

                } else if (ItemList[i].getType() == "sword"){

                    swords[i] = new DefaultSword(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial());

                } else if (ItemList[i].getType() == "pickaxe"){

                    pickaxes[i] = new DefaultPickaxe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial());

                } else if (ItemList[i].getType() == "axe"){

                    axes[i] = new DefaultAxe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial());

                } else if (ItemList[i].getType() == "shovel"){

                    shovels[i] = new DefaultShovel(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial());

                } else if (ItemList[i].getType() == "hoe"){

                    hoes[i] = new DefaultHoe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial());

                } else if (ItemList[i].isArmor() == "true"){

                    armors[i] = new DefaultArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot());

                } else {

                    System.out.println("CCC ERR : " + ItemList[i].getName());

                    items[i] = new DefaultItem(ItemList[i].getName() + ItemList[i].getTypeName());

                }

            } else {
            /* custom className*/

                /*TYROLIUM*/
                if (ItemList[i].getName() == "tyrolium") {


                    if (ItemList[i].getType() == "classic") {

                    } else if (ItemList[i].getType() == "sword"){
                        final Item tyrolium_sword = new TyroliumSword(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial());
                    } else if (ItemList[i].getType() == "pickaxe"){

                    } else if (ItemList[i].getType() == "axe"){

                    } else if (ItemList[i].getType() == "shovel"){

                    } else if (ItemList[i].getType() == "hoe"){

                    } else if (ItemList[i].isArmor() == "true"){

                    } else {

                    }



                }

            }



        }

    }




}
