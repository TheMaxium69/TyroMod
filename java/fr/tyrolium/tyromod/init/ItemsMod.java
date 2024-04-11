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

    // Item
    public static Item tyrolium = new Tyrolium("tyrolium");
    public static Item rhodonite = new Rhodonite("rhodonite");
    public static Item amethys = new Amethys("amethys");
    public static Item yellorite = new Yellorite("yellorite");

    //Armour Materials
    public static final ArmorMaterial TYROLIUM_ARMOR = EnumHelper.addArmorMaterial("tyrolium_armor", Global.MODID + ":tyrolium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);

    //Tool Materials
    public static final ToolMaterial TYROLIUM_TOOL = EnumHelper.addToolMaterial("tyrolium_tool", 2, 400, 3.0f, 5.0f, 20);

    //Armour
    public static final Item tyrolium_helmet = new TyroliumArmor("tyrolium_helmet", TYROLIUM_ARMOR, EntityEquipmentSlot.HEAD);
    public static final Item tyrolium_chestplate = new TyroliumArmor("tyrolium_chestplate", TYROLIUM_ARMOR, EntityEquipmentSlot.CHEST);
    public static final Item tyrolium_leggings = new TyroliumArmor("tyrolium_leggings", TYROLIUM_ARMOR, EntityEquipmentSlot.LEGS);
    public static final Item tyrolium_boots = new TyroliumArmor("tyrolium_boots", TYROLIUM_ARMOR, EntityEquipmentSlot.FEET);

    //Tools
//    public static final Item tyrolium_sword = new TyroliumSword("tyrolium_sword", TYROLIUM_TOOL);
    public static final Item tyrolium_pickaxe = new TyroliumPickaxe("tyrolium_pickaxe", TYROLIUM_TOOL);
    public static final Item tyrolium_axe = new TyroliumAxe("tyrolium_axe", TYROLIUM_TOOL);
    public static final Item tyrolium_shovel = new TyroliumShovel("tyrolium_shovel", TYROLIUM_TOOL);
    public static final Item tyrolium_hoe = new TyroliumHoe("tyrolium_hoe", TYROLIUM_TOOL);


    /* GENERATION */
    public static ItemGenerateClass[] ItemList = {
            new ItemGenerateClass("tyrolium", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("rhodonite", "sword", false, TYROLIUM_TOOL),
            new ItemGenerateClass("rhodonite", "pickaxe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("rhodonite", "axe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("rhodonite", "shovel", false, TYROLIUM_TOOL),
            new ItemGenerateClass("rhodonite", "hoe", false, TYROLIUM_TOOL),
            new ItemGenerateClass("rhodonite", "helmet", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("rhodonite", "chestplate", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("rhodonite", "leggings", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("rhodonite", "boots", false, TYROLIUM_ARMOR),
            new ItemGenerateClass("adamentium", "classic", false),
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
