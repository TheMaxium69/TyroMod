package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.global.DefaultSword;
import fr.tyrolium.tyromod.items.Amethys;
import fr.tyrolium.tyromod.items.Rhodonite;
import fr.tyrolium.tyromod.items.Tyrolium;
import fr.tyrolium.tyromod.items.Yellorite;

import fr.tyrolium.tyromod.items.armor.TyroliumArmor;
import fr.tyrolium.tyromod.items.tool.*;
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
    public static final Item tyrolium_sword = new TyroliumSword("tyrolium_sword", TYROLIUM_TOOL);
    public static final Item tyrolium_pickaxe = new TyroliumPickaxe("tyrolium_pickaxe", TYROLIUM_TOOL);
    public static final Item tyrolium_axe = new TyroliumAxe("tyrolium_axe", TYROLIUM_TOOL);
    public static final Item tyrolium_shovel = new TyroliumShovel("tyrolium_shovel", TYROLIUM_TOOL);
    public static final Item tyrolium_hoe = new TyroliumHoe("tyrolium_hoe", TYROLIUM_TOOL);

}
