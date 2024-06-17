package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.generate.ItemGenerateClass;
import fr.tyrolium.tyromod.global.*;

import fr.tyrolium.tyromod.items.ServerItem;
import fr.tyrolium.tyromod.items.Radar;
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
    public static final ArmorMaterial RHODONITE_ARMOR = EnumHelper.addArmorMaterial("rhodonite_armor", Global.MODID + ":rhodonite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial AMETHYS_ARMOR = EnumHelper.addArmorMaterial("amethys_armor", Global.MODID + ":amethys", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial YELLORITE_ARMOR = EnumHelper.addArmorMaterial("yellorite_armor", Global.MODID + ":yellorite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial AVENTURINE_ARMOR = EnumHelper.addArmorMaterial("aventurine_armor", Global.MODID + ":aventurine", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial COPPER_ARMOR = EnumHelper.addArmorMaterial("copper_armor", Global.MODID + ":copper", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial EMERALD_ARMOR = EnumHelper.addArmorMaterial("emerald_armor", Global.MODID + ":emerald", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial ENDER_ARMOR = EnumHelper.addArmorMaterial("ender_armor", Global.MODID + ":ender", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial ENDERINE_ARMOR = EnumHelper.addArmorMaterial("enderine_armor", Global.MODID + ":enderine", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial FLINT_ARMOR = EnumHelper.addArmorMaterial("flint_armor", Global.MODID + ":flint", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial GRAVEL_ARMOR = EnumHelper.addArmorMaterial("gravel_armor", Global.MODID + ":gravel", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial GUARDIAN_ARMOR = EnumHelper.addArmorMaterial("guardian_armor", Global.MODID + ":guardian", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial MERCURE_ARMOR = EnumHelper.addArmorMaterial("mercure_armor", Global.MODID + ":mercure", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial OBSIDIAN_ARMOR = EnumHelper.addArmorMaterial("obsidian_armor", Global.MODID + ":obsidian", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial OBSIDIAN_RED_ARMOR = EnumHelper.addArmorMaterial("obsidian_red_armor", Global.MODID + ":obsidian_red", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial PURIFIED_GOLD_ARMOR = EnumHelper.addArmorMaterial("purified_gold_armor", Global.MODID + ":purified_gold", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial REDSTONE_ARMOR = EnumHelper.addArmorMaterial("redstone_armor", Global.MODID + ":redstone", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial RUBY_ARMOR = EnumHelper.addArmorMaterial("ruby_armor", Global.MODID + ":ruby", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial SAPPHIRE_ARMOR = EnumHelper.addArmorMaterial("sapphire_armor", Global.MODID + ":sapphire", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial TIN_ARMOR = EnumHelper.addArmorMaterial("tin_armor", Global.MODID + ":tin", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial TITANE_ARMOR = EnumHelper.addArmorMaterial("titane_armor", Global.MODID + ":titane", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial VOLCANIUM_ARMOR = EnumHelper.addArmorMaterial("volcanium_armor", Global.MODID + ":volcanium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial ADAMANTIUM_ARMOR = EnumHelper.addArmorMaterial("adamantium_armor", Global.MODID + ":adamantium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial ARGONITE_ARMOR = EnumHelper.addArmorMaterial("argonite_armor", Global.MODID + ":argonite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial ASHSTONE_ARMOR = EnumHelper.addArmorMaterial("ashstone_armor", Global.MODID + ":ashstone", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial AURORE_ARMOR = EnumHelper.addArmorMaterial("aurore_armor", Global.MODID + ":aurore", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial BRONZE_ARMOR = EnumHelper.addArmorMaterial("bronze_armor", Global.MODID + ":bronze", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial DROCONITE_ARMOR = EnumHelper.addArmorMaterial("draconite_armor", Global.MODID + ":draconite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial DRACONIUM_ARMOR = EnumHelper.addArmorMaterial("draconium_armor", Global.MODID + ":draconium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial DRAGONSTONE_ARMOR = EnumHelper.addArmorMaterial("dragonstone_armor", Global.MODID + ":dragonstone", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial FYRITE_ARMOR = EnumHelper.addArmorMaterial("fyrite_armor", Global.MODID + ":fyrite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial ILLUMENITE_ARMOR = EnumHelper.addArmorMaterial("illumenite_armor", Global.MODID + ":illumenite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial JADE_ARMOR = EnumHelper.addArmorMaterial("jade_armor", Global.MODID + ":jade", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial MALACHITE_ARMOR = EnumHelper.addArmorMaterial("malachite_armor", Global.MODID + ":malachite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial MYTHRIL_ARMOR = EnumHelper.addArmorMaterial("mythril_armor", Global.MODID + ":mythril", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial ONIX_ARMOR = EnumHelper.addArmorMaterial("onix_armor", Global.MODID + ":onix", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial SINISITE_ARMOR = EnumHelper.addArmorMaterial("sinisite_armor", Global.MODID + ":sinisite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial STEEL_ARMOR = EnumHelper.addArmorMaterial("steel_armor", Global.MODID + ":steel", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial STEELIUM_ARMOR = EnumHelper.addArmorMaterial("steelium_armor", Global.MODID + ":steelium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial THYRIUM_ARMOR = EnumHelper.addArmorMaterial("thyrium_armor", Global.MODID + ":thyrium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial SUNSTONE_ARMOR = EnumHelper.addArmorMaterial("sunstone_armor", Global.MODID + ":sunstone", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial LAPIS_LAZULI_ARMOR = EnumHelper.addArmorMaterial("lapis_lazuli_armor", Global.MODID + ":lapis_lazuli", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial NETHERITE_ARMOR = EnumHelper.addArmorMaterial("netherite_armor", Global.MODID + ":netherite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial COAL_ARMOR = EnumHelper.addArmorMaterial("coal_armor", Global.MODID + ":coal", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial OAK_ARMOR = EnumHelper.addArmorMaterial("oak_armor", Global.MODID + ":oak", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial SPRUCE_ARMOR = EnumHelper.addArmorMaterial("spruce_armor", Global.MODID + ":spruce", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial BIRCH_ARMOR = EnumHelper.addArmorMaterial("birch_armor", Global.MODID + ":birch", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial JUNGLE_ARMOR = EnumHelper.addArmorMaterial("jungle_armor", Global.MODID + ":jungle", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial ACACIA_ARMOR = EnumHelper.addArmorMaterial("acacia_armor", Global.MODID + ":acacia", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial DARKOAK_ARMOR = EnumHelper.addArmorMaterial("darkoak_armor", Global.MODID + ":darkoak", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial STONE_ARMOR = EnumHelper.addArmorMaterial("stone_armor", Global.MODID + ":stone", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial CLAY_ARMOR = EnumHelper.addArmorMaterial("clay_armor", Global.MODID + ":clay", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial VOLCANITE_ARMOR = EnumHelper.addArmorMaterial("volcanite_armor", Global.MODID + ":volcanite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial TYROLITE_ARMOR = EnumHelper.addArmorMaterial("tyrolite_armor", Global.MODID + ":tyrolite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial RHODONIUM_ARMOR = EnumHelper.addArmorMaterial("rhodonium_armor", Global.MODID + ":rhodonium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial YELLORIUM_ARMOR = EnumHelper.addArmorMaterial("yellorium_armor", Global.MODID + ":yellorium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial OBSIDIUM_ARMOR = EnumHelper.addArmorMaterial("obsidium_armor", Global.MODID + ":obsidium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial ENDERIUM_ARMOR = EnumHelper.addArmorMaterial("enderium_armor", Global.MODID + ":enderium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial ENDERITE_ARMOR = EnumHelper.addArmorMaterial("enderite_armor", Global.MODID + ":enderite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial COPPERIUM_ARMOR = EnumHelper.addArmorMaterial("copperium_armor", Global.MODID + ":copperium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial AVENTURIUM_ARMOR = EnumHelper.addArmorMaterial("aventurium_armor", Global.MODID + ":aventurium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial PURIFIED_IRON_ARMOR = EnumHelper.addArmorMaterial("purified_iron_armor", Global.MODID + ":purified_iron", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial PURIFIED_DIAMOND_ARMOR = EnumHelper.addArmorMaterial("purified_diamond_armor", Global.MODID + ":purified_diamond", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial TITANIUM_ARMOR = EnumHelper.addArmorMaterial("titanium_armor", Global.MODID + ":titanium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial SAPPHIRIUM_ARMOR = EnumHelper.addArmorMaterial("sapphirium_armor", Global.MODID + ":sapphirium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial MERCURIUM_ARMOR = EnumHelper.addArmorMaterial("mercurium_armor", Global.MODID + ":mercurium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial PLATINE_ARMOR = EnumHelper.addArmorMaterial("platine_armor", Global.MODID + ":platine", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial PLATINIUM_ARMOR = EnumHelper.addArmorMaterial("platinium_armor", Global.MODID + ":platinium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial VAPONITE_ARMOR = EnumHelper.addArmorMaterial("vaponite_armor", Global.MODID + ":vaponite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial VAPORIUM_ARMOR = EnumHelper.addArmorMaterial("vaporium_armor", Global.MODID + ":vaporium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial PROTON_ARMOR = EnumHelper.addArmorMaterial("proton_armor", Global.MODID + ":proton", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial RITONITE_ARMOR = EnumHelper.addArmorMaterial("ritonite_armor", Global.MODID + ":ritonite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial RITONIUM_ARMOR = EnumHelper.addArmorMaterial("ritonium_armor", Global.MODID + ":ritonium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial GOLDONITE_ARMOR = EnumHelper.addArmorMaterial("goldonite_armor", Global.MODID + ":goldonite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial GOLDONIUM_ARMOR = EnumHelper.addArmorMaterial("goldonium_armor", Global.MODID + ":goldonium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial OMEGA_ARMOR = EnumHelper.addArmorMaterial("omega_armor", Global.MODID + ":omega", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial OMEGANIUM_ARMOR = EnumHelper.addArmorMaterial("omeganium_armor", Global.MODID + ":omeganium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial NETHERIUM_ARMOR = EnumHelper.addArmorMaterial("netherium_armor", Global.MODID + ":netherium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial URANITE_ARMOR = EnumHelper.addArmorMaterial("uranite_armor", Global.MODID + ":uranite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial URANIUM_ARMOR = EnumHelper.addArmorMaterial("uranium_armor", Global.MODID + ":uranium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial PLUTONITE_ARMOR = EnumHelper.addArmorMaterial("plutonite_armor", Global.MODID + ":plutonite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial PLUTONIUM_ARMOR = EnumHelper.addArmorMaterial("plutonium_armor", Global.MODID + ":plutonium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial POLONITE_ARMOR = EnumHelper.addArmorMaterial("polonite_armor", Global.MODID + ":polonite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial POLONIUM_ARMOR = EnumHelper.addArmorMaterial("polonium_armor", Global.MODID + ":polonium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial CHRONITE_ARMOR = EnumHelper.addArmorMaterial("chronite_armor", Global.MODID + ":chronite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial CHROMITIUM_ARMOR = EnumHelper.addArmorMaterial("chromitium_armor", Global.MODID + ":chromitium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial CORANITE_ARMOR = EnumHelper.addArmorMaterial("coranite_armor", Global.MODID + ":coranite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial CORANIUM_ARMOR = EnumHelper.addArmorMaterial("coranium_armor", Global.MODID + ":coranium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial MACRONITE_ARMOR = EnumHelper.addArmorMaterial("macronite_armor", Global.MODID + ":macronite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial MACRONIUM_ARMOR = EnumHelper.addArmorMaterial("macronium_armor", Global.MODID + ":macronium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial GALACTITE_ARMOR = EnumHelper.addArmorMaterial("galactite_armor", Global.MODID + ":galactite", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial TOPAZ_ARMOR = EnumHelper.addArmorMaterial("topaz_armor", Global.MODID + ":topaz", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial PROTONIUM_ARMOR = EnumHelper.addArmorMaterial("protonium_armor", Global.MODID + ":protonium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial SILVERIUM_ARMOR = EnumHelper.addArmorMaterial("silverium_armor", Global.MODID + ":silverium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial SILICIUM_ARMOR = EnumHelper.addArmorMaterial("silicium_armor", Global.MODID + ":silicium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial IUM_ARMOR = EnumHelper.addArmorMaterial("ium_armor", Global.MODID + ":ium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ArmorMaterial ULTIUM_ARMOR = EnumHelper.addArmorMaterial("ultium_armor", Global.MODID + ":ultium", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);

    //Tool Materials
    public static final ToolMaterial TYROLIUM_TOOL = EnumHelper.addToolMaterial("tyrolium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial RHODONITE_TOOL = EnumHelper.addToolMaterial("rhodonite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial AMETHYS_TOOL = EnumHelper.addToolMaterial("amethys_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial YELLORITE_TOOL = EnumHelper.addToolMaterial("yellorite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial AVENTURINE_TOOL = EnumHelper.addToolMaterial("aventurine_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial COPPER_TOOL = EnumHelper.addToolMaterial("copper_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial EMERALD_TOOL = EnumHelper.addToolMaterial("emerald_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial ENDER_TOOL = EnumHelper.addToolMaterial("ender_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial ENDERINE_TOOL = EnumHelper.addToolMaterial("enderine_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial FLINT_TOOL = EnumHelper.addToolMaterial("flint_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial GRAVEL_TOOL = EnumHelper.addToolMaterial("gravel_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial GUARDIAN_TOOL = EnumHelper.addToolMaterial("guardian_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial MERCURE_TOOL = EnumHelper.addToolMaterial("mercure_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial OBSIDIAN_TOOL = EnumHelper.addToolMaterial("obsidian_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial OBSIDIAN_RED_TOOL = EnumHelper.addToolMaterial("obsidian_red_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial PURIFIED_GOLD_TOOL = EnumHelper.addToolMaterial("purified_gold_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial REDSTONE_TOOL = EnumHelper.addToolMaterial("redstone_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial RUBY_TOOL = EnumHelper.addToolMaterial("ruby_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial SAPPHIRE_TOOL = EnumHelper.addToolMaterial("sapphire_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial TIN_TOOL = EnumHelper.addToolMaterial("tin_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial TITANE_TOOL = EnumHelper.addToolMaterial("titane_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial VOLCANIUM_TOOL = EnumHelper.addToolMaterial("volcanium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial ADAMANTIUM_TOOL = EnumHelper.addToolMaterial("adamantium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial ARGONITE_TOOL = EnumHelper.addToolMaterial("argonite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial ASHSTONE_TOOL = EnumHelper.addToolMaterial("ashstone_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial AURORE_TOOL = EnumHelper.addToolMaterial("aurore_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial BRONZE_TOOL = EnumHelper.addToolMaterial("bronze_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial DROCONITE_TOOL = EnumHelper.addToolMaterial("draconite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial DRACONIUM_TOOL = EnumHelper.addToolMaterial("draconium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial DRAGONSTONE_TOOL = EnumHelper.addToolMaterial("dragonstone_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial FYRITE_TOOL = EnumHelper.addToolMaterial("fyrite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial ILLUMENITE_TOOL = EnumHelper.addToolMaterial("illumenite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial JADE_TOOL = EnumHelper.addToolMaterial("jade_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial MALACHITE_TOOL = EnumHelper.addToolMaterial("malachite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial MYTHRIL_TOOL = EnumHelper.addToolMaterial("mythril_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial ONIX_TOOL = EnumHelper.addToolMaterial("onix_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial SINISITE_TOOL = EnumHelper.addToolMaterial("sinisite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial STEEL_TOOL = EnumHelper.addToolMaterial("steel_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial STEELIUM_TOOL = EnumHelper.addToolMaterial("steelium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial THYRIUM_TOOL = EnumHelper.addToolMaterial("thyrium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial SUNSTONE_TOOL = EnumHelper.addToolMaterial("sunstone_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial LAPIS_LAZULI_TOOL = EnumHelper.addToolMaterial("lapis_lazuli_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial NETHERITE_TOOL = EnumHelper.addToolMaterial("netherite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial COAL_TOOL = EnumHelper.addToolMaterial("coal_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial CLAY_TOOL = EnumHelper.addToolMaterial("clay_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial VOLCANITE_TOOL = EnumHelper.addToolMaterial("volcanite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial TYROLITE_TOOL = EnumHelper.addToolMaterial("tyrolite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial RHODONIUM_TOOL = EnumHelper.addToolMaterial("rhodonium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial YELLORIUM_TOOL = EnumHelper.addToolMaterial("yellorium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial OBSIDIUM_TOOL = EnumHelper.addToolMaterial("obsidium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial ENDERIUM_TOOL = EnumHelper.addToolMaterial("enderium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial ENDERITE_TOOL = EnumHelper.addToolMaterial("enderite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial COPPERIUM_TOOL = EnumHelper.addToolMaterial("copperium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial AVENTURIUM_TOOL = EnumHelper.addToolMaterial("aventurium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial PURIFIED_IRON_TOOL = EnumHelper.addToolMaterial("purified_iron_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial PURIFIED_DIAMOND_TOOL = EnumHelper.addToolMaterial("purified_diamond_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial TITANIUM_TOOL = EnumHelper.addToolMaterial("titanium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial SAPPHIRIUM_TOOL = EnumHelper.addToolMaterial("sapphirium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial MERCURIUM_TOOL = EnumHelper.addToolMaterial("mercurium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial PLATINE_TOOL = EnumHelper.addToolMaterial("platine_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial PLATINIUM_TOOL = EnumHelper.addToolMaterial("platinium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial VAPONITE_TOOL = EnumHelper.addToolMaterial("vaponite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial VAPORIUM_TOOL = EnumHelper.addToolMaterial("vaporium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial PROTON_TOOL = EnumHelper.addToolMaterial("proton_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial RITONITE_TOOL = EnumHelper.addToolMaterial("ritonite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial RITONIUM_TOOL = EnumHelper.addToolMaterial("ritonium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial GOLDONITE_TOOL = EnumHelper.addToolMaterial("goldonite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial GOLDONIUM_TOOL = EnumHelper.addToolMaterial("goldonium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial OMEGA_TOOL = EnumHelper.addToolMaterial("omega_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial OMEGANIUM_TOOL = EnumHelper.addToolMaterial("omeganium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial NETHERIUM_TOOL = EnumHelper.addToolMaterial("netherium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial URANITE_TOOL = EnumHelper.addToolMaterial("uranite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial URANIUM_TOOL = EnumHelper.addToolMaterial("uranium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial PLUTONITE_TOOL = EnumHelper.addToolMaterial("plutonite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial PLUTONIUM_TOOL = EnumHelper.addToolMaterial("plutonium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial POLONITE_TOOL = EnumHelper.addToolMaterial("polonite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial POLONIUM_TOOL = EnumHelper.addToolMaterial("polonium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial CHRONITE_TOOL = EnumHelper.addToolMaterial("chronite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial CHROMITIUM_TOOL = EnumHelper.addToolMaterial("chromitium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial CORANITE_TOOL = EnumHelper.addToolMaterial("coranite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial CORANIUM_TOOL = EnumHelper.addToolMaterial("coranium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial MACRONITE_TOOL = EnumHelper.addToolMaterial("macronite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial MACRONIUM_TOOL = EnumHelper.addToolMaterial("macronium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial GALACTITE_TOOL = EnumHelper.addToolMaterial("galactite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial TOPAZ_TOOL = EnumHelper.addToolMaterial("topaz_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial PROTONIUM_TOOL = EnumHelper.addToolMaterial("protonium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial SILVERIUM_TOOL = EnumHelper.addToolMaterial("silverium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial SILICIUM_TOOL = EnumHelper.addToolMaterial("silicium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial IUM_TOOL = EnumHelper.addToolMaterial("ium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final ToolMaterial ULTIUM_TOOL = EnumHelper.addToolMaterial("ultium_tool", 2, 400, 3.0f, 5.0f, 20);

    /* MANUEL */
    public static Item tyrolium_hammer = new DefaultHammer("tyrolium_hammer", TYROLIUM_TOOL, "1", "IUM", "c99999");
    public static Item rhodonite_hammer = new DefaultHammer("rhodonite_hammer", RHODONITE_TOOL, "1", "IUM", "c99999");
    public static Item yellorite_hammer = new DefaultHammer("yellorite_hammer", YELLORITE_TOOL, "1", "IUM", "c99999");
    public static Item aventurine_hammer = new DefaultHammer("aventurine_hammer", AVENTURINE_TOOL, "1", "IUM", "c99999");
    public static Item amethys_hammer = new DefaultHammer("amethys_hammer", AMETHYS_TOOL, "1", "IUM", "c99999");
    public static Item mercure_hammer = new DefaultHammer("mercure_hammer", MERCURE_TOOL, "1", "IUM", "c99999");
    public static Item tyrolium_sword_fire = new DefaultSwordFire("tyrolium_sword_fire", TYROLIUM_TOOL, "1", "IUM", "c999999");
    public static Item tyrolium_apple = new DefaultFood("tyrolium_apple", "1", "c999999", 6, false);
    public static Item volcanium_apple = new DefaultFood("volcanium_apple", "1", "c9999990", 6, false);
    public static Item RADAR = new Radar("radar", "3", "c999");

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
            new ItemGenerateClass("volcanium", "helmet", false, VOLCANIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("volcanium", "chestplate", false, VOLCANIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("volcanium", "leggings", false, VOLCANIUM_ARMOR, "1", "IUM"),
            new ItemGenerateClass("volcanium", "boots", false, VOLCANIUM_ARMOR, "1", "IUM"),

            /*ADAMANTIUM*/
            new ItemGenerateClass("adamantium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("adamantium", "sword", false, ADAMANTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "pickaxe", false, ADAMANTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "axe", false, ADAMANTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "shovel", false, ADAMANTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "hoe", false, ADAMANTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("adamantium", "helmet", false, ADAMANTIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("adamantium", "chestplate", false, ADAMANTIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("adamantium", "leggings", false, ADAMANTIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("adamantium", "boots", false, ADAMANTIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("draconium", "helmet", false, DRACONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("draconium", "chestplate", false, DRACONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("draconium", "leggings", false, DRACONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("draconium", "boots", false, DRACONIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("steelium", "helmet", false, STEELIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("steelium", "chestplate", false, STEELIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("steelium", "leggings", false, STEELIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("steelium", "boots", false, STEELIUM_ARMOR, "3", "IUM"),

            /*THYRIUM*/
            new ItemGenerateClass("thyrium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("thyrium", "sword", false, THYRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("thyrium", "pickaxe", false, THYRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("thyrium", "axe", false, THYRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("thyrium", "shovel", false, THYRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("thyrium", "hoe", false, THYRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("thyrium", "helmet", false, THYRIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("thyrium", "chestplate", false, THYRIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("thyrium", "leggings", false, THYRIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("thyrium", "boots", false, THYRIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("rhodonium", "helmet", false, RHODONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "chestplate", false, RHODONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "leggings", false, RHODONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("rhodonium", "boots", false, RHODONIUM_ARMOR, "3", "IUM"),

            /*YELLORIUM*/
            new ItemGenerateClass("yellorium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("yellorium", "sword", false, YELLORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("yellorium", "pickaxe", false, YELLORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("yellorium", "axe", false, YELLORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("yellorium", "shovel", false, YELLORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("yellorium", "hoe", false, YELLORIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("yellorium", "helmet", false, YELLORIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("yellorium", "chestplate", false, YELLORIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("yellorium", "leggings", false, YELLORIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("yellorium", "boots", false, YELLORIUM_ARMOR, "3", "IUM"),

            /*OBSIDIUM*/
            new ItemGenerateClass("obsidium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("obsidium", "gem", false, "3", "IUM"),
            new ItemGenerateClass("obsidium", "sword", false, OBSIDIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("obsidium", "pickaxe", false, OBSIDIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("obsidium", "axe", false, OBSIDIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("obsidium", "shovel", false, OBSIDIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("obsidium", "hoe", false, OBSIDIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("obsidium", "helmet", false, OBSIDIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("obsidium", "chestplate", false, OBSIDIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("obsidium", "leggings", false, OBSIDIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("obsidium", "boots", false, OBSIDIUM_ARMOR, "3", "IUM"),

            /*ENDERIUM*/
            new ItemGenerateClass("enderium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("enderium", "sword", false, ENDERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("enderium", "pickaxe", false, ENDERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("enderium", "axe", false, ENDERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("enderium", "shovel", false, ENDERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("enderium", "hoe", false, ENDERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("enderium", "helmet", false, ENDERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("enderium", "chestplate", false, ENDERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("enderium", "leggings", false, ENDERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("enderium", "boots", false, ENDERIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("copperium", "helmet", false, COPPERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("copperium", "chestplate", false, COPPERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("copperium", "leggings", false, COPPERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("copperium", "boots", false, COPPERIUM_ARMOR, "3", "IUM"),

            /*AVENTURIUM*/
            new ItemGenerateClass("aventurium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("aventurium", "sword", false, AVENTURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("aventurium", "pickaxe", false, AVENTURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("aventurium", "axe", false, AVENTURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("aventurium", "shovel", false, AVENTURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("aventurium", "hoe", false, AVENTURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("aventurium", "helmet", false, AVENTURIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("aventurium", "chestplate", false, AVENTURIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("aventurium", "leggings", false, AVENTURIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("aventurium", "boots", false, AVENTURIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("titanium", "helmet", false, TITANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("titanium", "chestplate", false, TITANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("titanium", "leggings", false, TITANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("titanium", "boots", false, TITANIUM_ARMOR, "3", "IUM"),

            /*SAPPHIRIUM*/
            new ItemGenerateClass("sapphirium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "sword", false, SAPPHIRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "pickaxe", false, SAPPHIRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "axe", false, SAPPHIRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "shovel", false, SAPPHIRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "hoe", false, SAPPHIRIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "helmet", false, SAPPHIRIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "chestplate", false, SAPPHIRIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "leggings", false, SAPPHIRIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("sapphirium", "boots", false, SAPPHIRIUM_ARMOR, "3", "IUM"),

            /*MERCURIUM*/
            new ItemGenerateClass("mercurium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("mercurium", "nugget", false, "3", "IUM"),
            new ItemGenerateClass("mercurium", "sword", false, MERCURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("mercurium", "pickaxe", false, MERCURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("mercurium", "axe", false, MERCURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("mercurium", "shovel", false, MERCURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("mercurium", "hoe", false, MERCURIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("mercurium", "helmet", false, MERCURIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("mercurium", "chestplate", false, MERCURIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("mercurium", "leggings", false, MERCURIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("mercurium", "boots", false, MERCURIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("platinium", "helmet", false, PLATINIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("platinium", "chestplate", false, PLATINIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("platinium", "leggings", false, PLATINIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("platinium", "boots", false, PLATINIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("vaporium", "helmet", false, VAPORIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("vaporium", "chestplate", false, VAPORIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("vaporium", "leggings", false, VAPORIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("vaporium", "boots", false, VAPORIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("ritonite", "classic", false, "3", "3"),
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
            new ItemGenerateClass("ritonium", "helmet", false, RITONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("ritonium", "chestplate", false, RITONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("ritonium", "leggings", false, RITONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("ritonium", "boots", false, RITONIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("goldonium", "helmet", false, GOLDONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("goldonium", "chestplate", false, GOLDONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("goldonium", "leggings", false, GOLDONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("goldonium", "boots", false, GOLDONIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("omeganium", "helmet", false, OMEGANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("omeganium", "chestplate", false, OMEGANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("omeganium", "leggings", false, OMEGANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("omeganium", "boots", false, OMEGANIUM_ARMOR, "3", "IUM"),

            /*NETHERIUM*/
            new ItemGenerateClass("netherium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("netherium", "sword", false, NETHERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("netherium", "pickaxe", false, NETHERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("netherium", "axe", false, NETHERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("netherium", "shovel", false, NETHERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("netherium", "hoe", false, NETHERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("netherium", "helmet", false, NETHERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("netherium", "chestplate", false, NETHERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("netherium", "leggings", false, NETHERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("netherium", "boots", false, NETHERIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("uranium", "helmet", false, URANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("uranium", "chestplate", false, URANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("uranium", "leggings", false, URANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("uranium", "boots", false, URANIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("plutonium", "helmet", false, PLUTONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("plutonium", "chestplate", false, PLUTONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("plutonium", "leggings", false, PLUTONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("plutonium", "boots", false, PLUTONIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("polonium", "helmet", false, POLONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("polonium", "chestplate", false, POLONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("polonium", "leggings", false, POLONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("polonium", "boots", false, POLONIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("chromitium", "helmet", false, CHROMITIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("chromitium", "chestplate", false, CHROMITIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("chromitium", "leggings", false, CHROMITIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("chromitium", "boots", false, CHROMITIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("coranium", "helmet", false, CORANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("coranium", "chestplate", false, CORANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("coranium", "leggings", false, CORANIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("coranium", "boots", false, CORANIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("macronium", "helmet", false, MACRONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("macronium", "chestplate", false, MACRONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("macronium", "leggings", false, MACRONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("macronium", "boots", false, MACRONIUM_ARMOR, "3", "IUM"),

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
            new ItemGenerateClass("protonium", "helmet", false, PROTONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("protonium", "chestplate", false, PROTONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("protonium", "leggings", false, PROTONIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("protonium", "boots", false, PROTONIUM_ARMOR, "3", "IUM"),

            /*SILVERIUM*/
            new ItemGenerateClass("silverium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("silverium", "sword", false, SILVERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silverium", "pickaxe", false, SILVERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silverium", "axe", false, SILVERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silverium", "shovel", false, SILVERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silverium", "hoe", false, SILVERIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silverium", "helmet", false, SILVERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("silverium", "chestplate", false, SILVERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("silverium", "leggings", false, SILVERIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("silverium", "boots", false, SILVERIUM_ARMOR, "3", "IUM"),

            /*SILICIUM*/
            new ItemGenerateClass("silicium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("silicium", "sword", false, SILICIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silicium", "pickaxe", false, SILICIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silicium", "axe", false, SILICIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silicium", "shovel", false, SILICIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silicium", "hoe", false, SILICIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("silicium", "helmet", false, SILICIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("silicium", "chestplate", false, SILICIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("silicium", "leggings", false, SILICIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("silicium", "boots", false, SILICIUM_ARMOR, "3", "IUM"),

            /*IUM*/
            new ItemGenerateClass("ium", "ingot", false, "3", "IUM"),
            new ItemGenerateClass("ium", "powder", false, "3", "IUM"),
            new ItemGenerateClass("ium", "sword", false, IUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ium", "pickaxe", false, IUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ium", "axe", false, IUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ium", "shovel", false, IUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ium", "hoe", false, IUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ium", "helmet", false, IUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("ium", "chestplate", false, IUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("ium", "leggings", false, IUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("ium", "boots", false, IUM_ARMOR, "3", "IUM"),

            /*ULTIUM*/
            new ItemGenerateClass("ultium", "classic", false, "3", "IUM"),
            new ItemGenerateClass("ultium", "powder", false, "3", "IUM"),
            new ItemGenerateClass("ultium", "sword", false, ULTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ultium", "pickaxe", false, ULTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ultium", "axe", false, ULTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ultium", "shovel", false, ULTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ultium", "hoe", false, ULTIUM_TOOL, "3", "IUM"),
            new ItemGenerateClass("ultium", "helmet", false, ULTIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("ultium", "chestplate", false, ULTIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("ultium", "leggings", false, ULTIUM_ARMOR, "3", "IUM"),
            new ItemGenerateClass("ultium", "boots", false, ULTIUM_ARMOR, "3", "IUM"),

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
        armors = new DefaultArmor[ItemList.length];

        for (int i = 0; i < ItemList.length; i++) {

//            System.out.println("New Item : " + ItemList[i].getName() + ItemList[i].getTypeName() + " (" + i + ") ");

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

                    pickaxes[i] = new DefaultPickaxe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "p" + i);

                } else if (ItemList[i].getType() == "axe"){

                    axes[i] = new DefaultAxe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "ax" + i);

                } else if (ItemList[i].getType() == "shovel"){

                    shovels[i] = new DefaultShovel(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "sh" + i);

                } else if (ItemList[i].getType() == "hoe"){

                    hoes[i] = new DefaultHoe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "h" + i);

                } else if (ItemList[i].getType() == "hammer"){

                    hammers[i] = new DefaultHammer(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "ha" + i);

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
                if (ItemList[i].getName() == "tyrolium" && ItemList[i].getType() != "keycard") {

                    if (ItemList[i].getType() == "classic") {
                        itemCustomClass.put("c"+i, new Tyrolium(ItemList[i].getName(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                    } else if (ItemList[i].getType() == "sword"){
                        itemCustomClass.put("c"+i, new TyroliumSword(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                    } else if (ItemList[i].getType() == "pickaxe"){
                        itemCustomClass.put("c"+i, new TyroliumPickaxe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                    } else if (ItemList[i].getType() == "axe"){
                        itemCustomClass.put("c"+i, new TyroliumAxe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                    } else if (ItemList[i].getType() == "shovel"){
                        itemCustomClass.put("c"+i, new TyroliumShovel(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                    } else if (ItemList[i].getType() == "hoe"){
                        itemCustomClass.put("c"+i, new TyroliumHoe(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getToolMaterial(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                    } else if (ItemList[i].isArmor() == "true"){
                        itemCustomClass.put("c"+i, new TyroliumArmor(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getArmorMaterial(), ItemList[i].getEntityEquipmentSlot(), ItemList[i].getModVersion(), ItemList[i].getOreTier(), "c" + i));
                    }

                }

                if (ItemList[i].getType() == "keycard" || ItemList[i].getType() == "symbol" || ItemList[i].getType() == "wrench" || ItemList[i].getType() == "gear" || ItemList[i].getType() == "coin" || ItemList[i].getType() == "ring" || ItemList[i].getType() == "plate") {
                    itemCustomClass.put("c"+i, new ServerItem(ItemList[i].getName() + ItemList[i].getTypeName(), ItemList[i].getModVersion(), "c" + i));
                }

            }



        }

    }

    public static Item getItemCustomClass(String nameItem) {
        return itemCustomClass.get(nameItem);
    }



}
