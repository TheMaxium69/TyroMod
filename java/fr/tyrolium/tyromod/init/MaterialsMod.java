package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialsMod {

        /********************
         * Armour Materials
         *******************/

    /*AUTRE*/
    public static final ItemArmor.ArmorMaterial GRAVEL_ARMOR = EnumHelper.addArmorMaterial("gravel_armor", Global.MODID + ":gravel", 15, new int[] {1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial MERCURE_ARMOR = EnumHelper.addArmorMaterial("mercure_armor", Global.MODID + ":mercure", 40, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F);
    public static final ItemArmor.ArmorMaterial REDSTONE_ARMOR = EnumHelper.addArmorMaterial("redstone_armor", Global.MODID + ":redstone", 10, new int[] {2, 5, 6, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial IUM_ARMOR = EnumHelper.addArmorMaterial("ium_armor", Global.MODID + ":ium", 15, new int[] {3, 6, 8, 3}, 35, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial LAPIS_LAZULI_ARMOR = EnumHelper.addArmorMaterial("lapis_lazuli_armor", Global.MODID + ":lapis_lazuli", 10, new int[] {2, 5, 6, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial COAL_ARMOR = EnumHelper.addArmorMaterial("coal_armor", Global.MODID + ":coal", 10, new int[] {1, 2, 3, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial OAK_ARMOR = EnumHelper.addArmorMaterial("oak_armor", Global.MODID + ":oak", 10, new int[] {1, 2, 3, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial SPRUCE_ARMOR = EnumHelper.addArmorMaterial("spruce_armor", Global.MODID + ":spruce", 10, new int[] {1, 2, 3, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial BIRCH_ARMOR = EnumHelper.addArmorMaterial("birch_armor", Global.MODID + ":birch", 10, new int[] {1, 2, 3, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial JUNGLE_ARMOR = EnumHelper.addArmorMaterial("jungle_armor", Global.MODID + ":jungle", 10, new int[] {1, 2, 3, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial ACACIA_ARMOR = EnumHelper.addArmorMaterial("acacia_armor", Global.MODID + ":acacia", 10, new int[] {1, 2, 3, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial DARKOAK_ARMOR = EnumHelper.addArmorMaterial("darkoak_armor", Global.MODID + ":darkoak", 10, new int[] {1, 2, 3, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial STONE_ARMOR = EnumHelper.addArmorMaterial("stone_armor", Global.MODID + ":stone", 15, new int[] {1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial SUNSTONE_ARMOR = EnumHelper.addArmorMaterial("sunstone_armor", Global.MODID + ":sunstone", 15, new int[] {3, 6, 8, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial CLAY_ARMOR = EnumHelper.addArmorMaterial("clay_armor", Global.MODID + ":clay", 15, new int[] {3, 5, 6, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);

    /*TIER 1*/
    public static final ItemArmor.ArmorMaterial COPPER_ARMOR = EnumHelper.addArmorMaterial("copper_armor", Global.MODID + ":copper", 15, new int[] {1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial ENDERINE_ARMOR = EnumHelper.addArmorMaterial("enderine_armor", Global.MODID + ":enderine", 33, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ItemArmor.ArmorMaterial FLINT_ARMOR = EnumHelper.addArmorMaterial("flint_armor", Global.MODID + ":flint", 15, new int[] {3, 5, 6, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial TIN_ARMOR = EnumHelper.addArmorMaterial("tin_armor", Global.MODID + ":tin", 10, new int[] {1, 2, 3, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f);
    public static final ItemArmor.ArmorMaterial PURIFIED_IRON_ARMOR = EnumHelper.addArmorMaterial("purified_iron_armor", Global.MODID + ":purified_iron", 30, new int[] {3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);

    /*TIER 2*/
    public static final ItemArmor.ArmorMaterial TITANE_ARMOR = EnumHelper.addArmorMaterial("titane_armor", Global.MODID + ":titane", 35, new int[] {3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ItemArmor.ArmorMaterial PURIFIED_DIAMOND_ARMOR = EnumHelper.addArmorMaterial("purified_diamond_armor", Global.MODID + ":purified_diamond", 38, new int[] {4, 7, 9, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ItemArmor.ArmorMaterial ENDERITE_ARMOR = EnumHelper.addArmorMaterial("enderite_armor", Global.MODID + ":enderite", 36, new int[] {4, 8, 10, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ItemArmor.ArmorMaterial VOLCANITE_ARMOR = EnumHelper.addArmorMaterial("volcanite_armor", Global.MODID + ":volcanite", 33, new int[] {3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ItemArmor.ArmorMaterial RUBY_ARMOR = EnumHelper.addArmorMaterial("ruby_armor", Global.MODID + ":ruby", 15, new int[] {4, 8, 10, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ItemArmor.ArmorMaterial SAPPHIRE_ARMOR = EnumHelper.addArmorMaterial("sapphire_armor", Global.MODID + ":sapphire", 15, new int[] {4, 8, 10, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ItemArmor.ArmorMaterial PURIFIED_GOLD_ARMOR = EnumHelper.addArmorMaterial("purified_gold_armor", Global.MODID + ":purified_gold", 30, new int[] {3, 6, 8, 3}, 28, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ItemArmor.ArmorMaterial OBSIDIAN_ARMOR = EnumHelper.addArmorMaterial("obsidian_armor", Global.MODID + ":obsidian", 100, new int[] {4, 8, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ItemArmor.ArmorMaterial EMERALD_ARMOR = EnumHelper.addArmorMaterial("emerald_armor", Global.MODID + ":emerald", 15, new int[] {4, 8, 10, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ItemArmor.ArmorMaterial YELLORITE_ARMOR = EnumHelper.addArmorMaterial("yellorite_armor", Global.MODID + ":yellorite", 36, new int[] {4, 8, 10, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ItemArmor.ArmorMaterial AMETHYS_ARMOR = EnumHelper.addArmorMaterial("amethys_armor", Global.MODID + ":amethys", 40, new int[] {5, 8, 10, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
    public static final ItemArmor.ArmorMaterial STEEL_ARMOR = EnumHelper.addArmorMaterial("steel_armor", Global.MODID + ":steel", 35, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F);
    public static final ItemArmor.ArmorMaterial MYTHRIL_ARMOR = EnumHelper.addArmorMaterial("mythril_armor", Global.MODID + ":mythril", 34, new int[] {4, 7, 9, 4}, 16, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F);
    public static final ItemArmor.ArmorMaterial AURORE_ARMOR = EnumHelper.addArmorMaterial("aurore_armor", Global.MODID + ":aurore", 35, new int[] {4, 7, 9, 4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F);
    public static final ItemArmor.ArmorMaterial BRONZE_ARMOR = EnumHelper.addArmorMaterial("bronze_armor", Global.MODID + ":bronze", 30, new int[] {3, 6, 8, 3}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F);

    /*TIER 3*/
    public static final ItemArmor.ArmorMaterial ARGONITE_ARMOR = EnumHelper.addArmorMaterial("argonite_armor", Global.MODID + ":argonite", 50, new int[] {6, 9, 12, 6}, 27, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial ASHSTONE_ARMOR = EnumHelper.addArmorMaterial("ashstone_armor", Global.MODID + ":ashstone", 50, new int[] {6, 9, 12, 6}, 27, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial DROCONITE_ARMOR = EnumHelper.addArmorMaterial("draconite_armor", Global.MODID + ":draconite", 49, new int[] {6, 9, 12, 6}, 28, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial DRAGONSTONE_ARMOR = EnumHelper.addArmorMaterial("dragonstone_armor", Global.MODID + ":dragonstone", 55, new int[] {6, 9, 12, 6}, 28, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial FYRITE_ARMOR = EnumHelper.addArmorMaterial("fyrite_armor", Global.MODID + ":fyrite", 49, new int[] {6, 9, 13, 6}, 28, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial ILLUMENITE_ARMOR = EnumHelper.addArmorMaterial("illumenite_armor", Global.MODID + ":illumenite", 40, new int[] {6, 9, 12, 6}, 28, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial JADE_ARMOR = EnumHelper.addArmorMaterial("jade_armor", Global.MODID + ":jade", 35, new int[] {6, 9, 12, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial MALACHITE_ARMOR = EnumHelper.addArmorMaterial("malachite_armor", Global.MODID + ":malachite", 50, new int[] {6, 9, 12, 6}, 26, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial ONIX_ARMOR = EnumHelper.addArmorMaterial("onix_armor", Global.MODID + ":onix", 95, new int[] {6, 9, 12, 6}, 24, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial SINISITE_ARMOR = EnumHelper.addArmorMaterial("sinisite_armor", Global.MODID + ":sinisite", 55, new int[] {6, 9, 12, 6}, 28, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial RHODONITE_ARMOR = EnumHelper.addArmorMaterial("rhodonite_armor", Global.MODID + ":rhodonite", 55, new int[] {6, 9, 13, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial AVENTURINE_ARMOR = EnumHelper.addArmorMaterial("aventurine_armor", Global.MODID + ":aventurine", 50, new int[] {6, 9, 13, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial ENDER_ARMOR = EnumHelper.addArmorMaterial("ender_armor", Global.MODID + ":ender", 50, new int[] {6, 9, 12, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial GUARDIAN_ARMOR = EnumHelper.addArmorMaterial("guardian_armor", Global.MODID + ":guardian", 200, new int[] {6, 9, 12, 6}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial OBSIDIAN_RED_ARMOR = EnumHelper.addArmorMaterial("obsidian_red_armor", Global.MODID + ":obsidian_red", 200, new int[] {6, 9, 12, 6}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial TYROLITE_ARMOR = EnumHelper.addArmorMaterial("tyrolite_armor", Global.MODID + ":tyrolite", 48, new int[] {6, 9, 13, 6}, 26, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial NETHERITE_ARMOR = EnumHelper.addArmorMaterial("netherite_armor", Global.MODID + ":netherite", 37, new int[] {3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial PLATINE_ARMOR = EnumHelper.addArmorMaterial("platine_armor", Global.MODID + ":platine", 48, new int[] {6, 9, 12, 6}, 33, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial VAPONITE_ARMOR = EnumHelper.addArmorMaterial("vaponite_armor", Global.MODID + ":vaponite", 48, new int[] {6, 9, 12, 6}, 22, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial PROTON_ARMOR = EnumHelper.addArmorMaterial("proton_armor", Global.MODID + ":proton", 48, new int[] {6, 9, 12, 5}, 33, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial RITONITE_ARMOR = EnumHelper.addArmorMaterial("ritonite_armor", Global.MODID + ":ritonite", 55, new int[] {6, 9, 12, 5}, 33, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial GOLDONITE_ARMOR = EnumHelper.addArmorMaterial("goldonite_armor", Global.MODID + ":goldonite", 40, new int[] {6, 9, 12, 6}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial OMEGA_ARMOR = EnumHelper.addArmorMaterial("omega_armor", Global.MODID + ":omega", 55, new int[] {6, 9, 12, 6}, 32, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial URANITE_ARMOR = EnumHelper.addArmorMaterial("uranite_armor", Global.MODID + ":uranite", 46, new int[] {6, 9, 11, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial PLUTONITE_ARMOR = EnumHelper.addArmorMaterial("plutonite_armor", Global.MODID + ":plutonite", 55, new int[] {6, 9, 11, 5}, 27, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial POLONITE_ARMOR = EnumHelper.addArmorMaterial("polonite_armor", Global.MODID + ":polonite", 46, new int[] {6, 9, 12, 5}, 27, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial CHRONITE_ARMOR = EnumHelper.addArmorMaterial("chronite_armor", Global.MODID + ":chronite", 43, new int[] {6, 9, 11, 5}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial CORANITE_ARMOR = EnumHelper.addArmorMaterial("coranite_armor", Global.MODID + ":coranite", 43, new int[] {6, 9, 11, 5}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial MACRONITE_ARMOR = EnumHelper.addArmorMaterial("macronite_armor", Global.MODID + ":macronite", 40, new int[] {6, 8, 11, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial GALACTITE_ARMOR = EnumHelper.addArmorMaterial("galactite_armor", Global.MODID + ":galactite", 50, new int[] {6, 9, 12, 6}, 29, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
    public static final ItemArmor.ArmorMaterial TOPAZ_ARMOR = EnumHelper.addArmorMaterial("topaz_armor", Global.MODID + ":topaz", 35, new int[] {6, 9, 12, 6}, 29, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);

    /*TIER IUM*/
    public static final ItemArmor.ArmorMaterial ADAMANTIUM_ARMOR = EnumHelper.addArmorMaterial("adamantium_armor", Global.MODID + ":adamantium", 75, new int[] {8, 10, 11, 7}, 38, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial VOLCANIUM_ARMOR = EnumHelper.addArmorMaterial("volcanium_armor", Global.MODID + ":volcanium", 80, new int[] {8, 10, 11, 8}, 35, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial COPPERIUM_ARMOR = EnumHelper.addArmorMaterial("copperium_armor", Global.MODID + ":copperium", 80, new int[] {8, 10, 11, 8}, 35, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial PLATINIUM_ARMOR = EnumHelper.addArmorMaterial("platinium_armor", Global.MODID + ":platinium", 75, new int[] {8, 10, 11, 8}, 38, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial NETHERIUM_ARMOR = EnumHelper.addArmorMaterial("netherium_armor", Global.MODID + ":netherium", 95, new int[] {8, 10, 11, 8}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial CORANIUM_ARMOR = EnumHelper.addArmorMaterial("coranium_armor", Global.MODID + ":coranium", 69, new int[] {8, 9, 11, 7}, 36, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial DRACONIUM_ARMOR = EnumHelper.addArmorMaterial("draconium_armor", Global.MODID + ":draconium", 78, new int[] {9, 10, 12, 8}, 39, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial RHODONIUM_ARMOR = EnumHelper.addArmorMaterial("rhodonium_armor", Global.MODID + ":rhodonium", 95, new int[] {8, 10, 12, 8}, 39, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial AVENTURIUM_ARMOR = EnumHelper.addArmorMaterial("aventurium_armor", Global.MODID + ":aventurium", 69, new int[] {8, 10, 11, 8}, 39, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial VAPORIUM_ARMOR = EnumHelper.addArmorMaterial("vaporium_armor", Global.MODID + ":vaporium", 79, new int[] {7, 10, 11, 7}, 36, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial URANIUM_ARMOR = EnumHelper.addArmorMaterial("uranium_armor", Global.MODID + ":uranium", 76, new int[] {8, 10, 11, 7}, 36, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial MACRONIUM_ARMOR = EnumHelper.addArmorMaterial("macronium_armor", Global.MODID + ":macronium", 72, new int[] {8, 9, 10, 8}, 37, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial STEELIUM_ARMOR = EnumHelper.addArmorMaterial("steelium_armor", Global.MODID + ":steelium", 95, new int[] {8, 9, 11, 7}, 35, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial YELLORIUM_ARMOR = EnumHelper.addArmorMaterial("yellorium_armor", Global.MODID + ":yellorium", 69, new int[] {8, 10, 11, 8}, 39, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial TITANIUM_ARMOR = EnumHelper.addArmorMaterial("titanium_armor", Global.MODID + ":titanium", 87, new int[] {7, 10, 11, 7}, 36, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial RITONIUM_ARMOR = EnumHelper.addArmorMaterial("ritonium_armor", Global.MODID + ":ritonium", 87, new int[] {8, 9, 10, 8}, 36, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial PLUTONIUM_ARMOR = EnumHelper.addArmorMaterial("plutonium_armor", Global.MODID + ":plutonium", 89, new int[] {8, 9, 10, 8}, 36, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial PROTONIUM_ARMOR = EnumHelper.addArmorMaterial("protonium_armor", Global.MODID + ":protonium", 89, new int[] {8, 9, 11, 7}, 36, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial THYRIUM_ARMOR = EnumHelper.addArmorMaterial("thyrium_armor", Global.MODID + ":thyrium", 67, new int[] {8, 10, 11, 8}, 39, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial OBSIDIUM_ARMOR = EnumHelper.addArmorMaterial("obsidium_armor", Global.MODID + ":obsidium", 400, new int[] {8, 10, 12, 8}, 37, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial SAPPHIRIUM_ARMOR = EnumHelper.addArmorMaterial("sapphirium_armor", Global.MODID + ":sapphirium", 55, new int[] {8, 10, 11, 7}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial GOLDONIUM_ARMOR = EnumHelper.addArmorMaterial("goldonium_armor", Global.MODID + ":goldonium", 59, new int[] {8, 10, 11, 8}, 45, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial POLONIUM_ARMOR = EnumHelper.addArmorMaterial("polonium_armor", Global.MODID + ":polonium", 79, new int[] {8, 10, 11, 7}, 37, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial SILVERIUM_ARMOR = EnumHelper.addArmorMaterial("silverium_armor", Global.MODID + ":silverium", 90, new int[] {8, 9, 10, 8}, 36, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial TYROLIUM_ARMOR = EnumHelper.addArmorMaterial("tyrolium_armor", Global.MODID + ":tyrolium", 100, new int[] {9, 10, 12, 9}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial ENDERIUM_ARMOR = EnumHelper.addArmorMaterial("enderium_armor", Global.MODID + ":enderium", 88, new int[] {8, 10, 11, 8}, 39, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial MERCURIUM_ARMOR = EnumHelper.addArmorMaterial("mercurium_armor", Global.MODID + ":mercurium", 95, new int[] {8, 10, 11, 8}, 37, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial OMEGANIUM_ARMOR = EnumHelper.addArmorMaterial("omeganium_armor", Global.MODID + ":omeganium", 86, new int[] {8, 10, 11, 8}, 39, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial CHROMITIUM_ARMOR = EnumHelper.addArmorMaterial("chromitium_armor", Global.MODID + ":chromitium", 80, new int[] {8, 9, 11, 7}, 36, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
    public static final ItemArmor.ArmorMaterial SILICIUM_ARMOR = EnumHelper.addArmorMaterial("silicium_armor", Global.MODID + ":silicium", 67, new int[] {8, 9, 10, 8}, 37, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);

    /*TIER ULTIME*/
    public static final ItemArmor.ArmorMaterial ULTIUM_ARMOR = EnumHelper.addArmorMaterial("ultium_armor", Global.MODID + ":ultium", 350, new int[] {12, 14, 16, 12}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);

        /********************
         * Tool Materials
         *******************/

    /*AUTRE*/
    public static final Item.ToolMaterial GRAVEL_TOOL = EnumHelper.addToolMaterial("gravel_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial MERCURE_TOOL = EnumHelper.addToolMaterial("mercure_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial REDSTONE_TOOL = EnumHelper.addToolMaterial("redstone_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial IUM_TOOL = EnumHelper.addToolMaterial("ium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial LAPIS_LAZULI_TOOL = EnumHelper.addToolMaterial("lapis_lazuli_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial COAL_TOOL = EnumHelper.addToolMaterial("coal_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial SUNSTONE_TOOL = EnumHelper.addToolMaterial("sunstone_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial CLAY_TOOL = EnumHelper.addToolMaterial("clay_tool", 2, 400, 3.0f, 5.0f, 20);

    /*TIER 1*/
    public static final Item.ToolMaterial COPPER_TOOL = EnumHelper.addToolMaterial("copper_tool", 2, 250, 5.0F, 2.0F, 10);
    public static final Item.ToolMaterial ENDERINE_TOOL = EnumHelper.addToolMaterial("enderine_tool", 3, 1561, 8.0F, 3.0F, 10);
    public static final Item.ToolMaterial FLINT_TOOL = EnumHelper.addToolMaterial("flint_tool", 2, 200, 4.0F, 2.0F, 5);
    public static final Item.ToolMaterial TIN_TOOL = EnumHelper.addToolMaterial("tin_tool", 1, 145, 4.0F, 1.0F, 5);
    public static final Item.ToolMaterial PURIFIED_IRON_TOOL = EnumHelper.addToolMaterial("purified_iron_tool", 3, 1400, 7.0F, 3.0F, 10);

    /*TIER 2*/
    public static final Item.ToolMaterial TITANE_TOOL = EnumHelper.addToolMaterial("titane_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial PURIFIED_DIAMOND_TOOL = EnumHelper.addToolMaterial("purified_diamond_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial ENDERITE_TOOL = EnumHelper.addToolMaterial("enderite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial VOLCANITE_TOOL = EnumHelper.addToolMaterial("volcanite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial RUBY_TOOL = EnumHelper.addToolMaterial("ruby_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial SAPPHIRE_TOOL = EnumHelper.addToolMaterial("sapphire_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial PURIFIED_GOLD_TOOL = EnumHelper.addToolMaterial("purified_gold_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial OBSIDIAN_TOOL = EnumHelper.addToolMaterial("obsidian_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial EMERALD_TOOL = EnumHelper.addToolMaterial("emerald_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial YELLORITE_TOOL = EnumHelper.addToolMaterial("yellorite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial AMETHYS_TOOL = EnumHelper.addToolMaterial("amethys_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial STEEL_TOOL = EnumHelper.addToolMaterial("steel_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial MYTHRIL_TOOL = EnumHelper.addToolMaterial("mythril_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial AURORE_TOOL = EnumHelper.addToolMaterial("aurore_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial BRONZE_TOOL = EnumHelper.addToolMaterial("bronze_tool", 2, 400, 3.0f, 5.0f, 20);

    /*TIER 3*/
    public static final Item.ToolMaterial ARGONITE_TOOL = EnumHelper.addToolMaterial("argonite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial ASHSTONE_TOOL = EnumHelper.addToolMaterial("ashstone_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial DROCONITE_TOOL = EnumHelper.addToolMaterial("draconite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial DRAGONSTONE_TOOL = EnumHelper.addToolMaterial("dragonstone_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial FYRITE_TOOL = EnumHelper.addToolMaterial("fyrite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial ILLUMENITE_TOOL = EnumHelper.addToolMaterial("illumenite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial JADE_TOOL = EnumHelper.addToolMaterial("jade_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial MALACHITE_TOOL = EnumHelper.addToolMaterial("malachite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial ONIX_TOOL = EnumHelper.addToolMaterial("onix_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial SINISITE_TOOL = EnumHelper.addToolMaterial("sinisite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial RHODONITE_TOOL = EnumHelper.addToolMaterial("rhodonite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial AVENTURINE_TOOL = EnumHelper.addToolMaterial("aventurine_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial ENDER_TOOL = EnumHelper.addToolMaterial("ender_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial GUARDIAN_TOOL = EnumHelper.addToolMaterial("guardian_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial OBSIDIAN_RED_TOOL = EnumHelper.addToolMaterial("obsidian_red_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial TYROLITE_TOOL = EnumHelper.addToolMaterial("tyrolite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial NETHERITE_TOOL = EnumHelper.addToolMaterial("netherite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial PLATINE_TOOL = EnumHelper.addToolMaterial("platine_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial VAPONITE_TOOL = EnumHelper.addToolMaterial("vaponite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial PROTON_TOOL = EnumHelper.addToolMaterial("proton_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial RITONITE_TOOL = EnumHelper.addToolMaterial("ritonite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial GOLDONITE_TOOL = EnumHelper.addToolMaterial("goldonite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial OMEGA_TOOL = EnumHelper.addToolMaterial("omega_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial URANITE_TOOL = EnumHelper.addToolMaterial("uranite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial PLUTONITE_TOOL = EnumHelper.addToolMaterial("plutonite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial POLONITE_TOOL = EnumHelper.addToolMaterial("polonite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial CHRONITE_TOOL = EnumHelper.addToolMaterial("chronite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial CORANITE_TOOL = EnumHelper.addToolMaterial("coranite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial MACRONITE_TOOL = EnumHelper.addToolMaterial("macronite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial GALACTITE_TOOL = EnumHelper.addToolMaterial("galactite_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial TOPAZ_TOOL = EnumHelper.addToolMaterial("topaz_tool", 2, 400, 3.0f, 5.0f, 20);

    /*TIER IUM*/
    public static final Item.ToolMaterial ADAMANTIUM_TOOL = EnumHelper.addToolMaterial("adamantium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial VOLCANIUM_TOOL = EnumHelper.addToolMaterial("volcanium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial COPPERIUM_TOOL = EnumHelper.addToolMaterial("copperium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial PLATINIUM_TOOL = EnumHelper.addToolMaterial("platinium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial NETHERIUM_TOOL = EnumHelper.addToolMaterial("netherium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial CORANIUM_TOOL = EnumHelper.addToolMaterial("coranium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial DRACONIUM_TOOL = EnumHelper.addToolMaterial("draconium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial RHODONIUM_TOOL = EnumHelper.addToolMaterial("rhodonium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial AVENTURIUM_TOOL = EnumHelper.addToolMaterial("aventurium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial VAPORIUM_TOOL = EnumHelper.addToolMaterial("vaporium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial URANIUM_TOOL = EnumHelper.addToolMaterial("uranium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial MACRONIUM_TOOL = EnumHelper.addToolMaterial("macronium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial STEELIUM_TOOL = EnumHelper.addToolMaterial("steelium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial YELLORIUM_TOOL = EnumHelper.addToolMaterial("yellorium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial TITANIUM_TOOL = EnumHelper.addToolMaterial("titanium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial RITONIUM_TOOL = EnumHelper.addToolMaterial("ritonium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial PLUTONIUM_TOOL = EnumHelper.addToolMaterial("plutonium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial PROTONIUM_TOOL = EnumHelper.addToolMaterial("protonium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial THYRIUM_TOOL = EnumHelper.addToolMaterial("thyrium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial OBSIDIUM_TOOL = EnumHelper.addToolMaterial("obsidium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial SAPPHIRIUM_TOOL = EnumHelper.addToolMaterial("sapphirium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial GOLDONIUM_TOOL = EnumHelper.addToolMaterial("goldonium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial POLONIUM_TOOL = EnumHelper.addToolMaterial("polonium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial SILVERIUM_TOOL = EnumHelper.addToolMaterial("silverium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial TYROLIUM_TOOL = EnumHelper.addToolMaterial("tyrolium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial ENDERIUM_TOOL = EnumHelper.addToolMaterial("enderium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial MERCURIUM_TOOL = EnumHelper.addToolMaterial("mercurium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial OMEGANIUM_TOOL = EnumHelper.addToolMaterial("omeganium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial CHROMITIUM_TOOL = EnumHelper.addToolMaterial("chromitium_tool", 2, 400, 3.0f, 5.0f, 20);
    public static final Item.ToolMaterial SILICIUM_TOOL = EnumHelper.addToolMaterial("silicium_tool", 2, 400, 3.0f, 5.0f, 20);

    /*TIER ULTIME*/
    public static final Item.ToolMaterial ULTIUM_TOOL = EnumHelper.addToolMaterial("ultium_tool", 2, 400, 3.0f, 5.0f, 20);




}
