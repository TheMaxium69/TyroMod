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
            new ItemGenerateClass("yellorite", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("yellorite", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("yellorite", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("yellorite", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("yellorite", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("yellorite", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("yellorite", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("yellorite", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("yellorite", "boots", false, TYROLIUM_ARMOR),

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

                } else if (ItemList[i].isArmor()){

                    armors[i] = new DefaultArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot());

                } else {

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

                    } else if (ItemList[i].isArmor()){

                    } else {

                    }



                }

            }



        }

    }




}
