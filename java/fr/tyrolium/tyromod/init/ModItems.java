package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.item.Adamentium;
import fr.tyrolium.tyromod.item.AdamentiumPickaxe;
import fr.tyrolium.tyromod.item.AdamentiumSword;
import fr.tyrolium.tyromod.item.*;
import fr.tyrolium.tyromod.utils.CustomItemTiers;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TyroMod.ModId);

    // Tyrolium
    public static final RegistryObject<Item> TYROLIUM = ITEMS.register("tyrolium", () -> new Tyrolium());
    public static final RegistryObject<Item> TYROLIUM_NUGGET = ITEMS.register("tyrolium_nugget", () -> new TyroliumNugget());
    public static final RegistryObject<Item> TYROLIUM_SWORD_FIRE = ITEMS.register("tyrolium_sword_fire", () -> new TyroliumSwordFire());
    public static final RegistryObject<Item> TYROLIUM_SWORD = ITEMS.register("tyrolium_sword", () -> new TyroliumSword());
    public static final RegistryObject<Item> TYROLIUM_PICKAXE = ITEMS.register("tyrolium_pickaxe", () -> new TyroliumPickaxe());
    public static final RegistryObject<Item> TYROLIUM_AXE = ITEMS.register("tyrolium_axe", () -> new TyroliumAxe());
    public static final RegistryObject<Item> TYROLIUM_SHOVEL = ITEMS.register("tyrolium_shovel", () -> new TyroliumShovel());
    public static final RegistryObject<Item> TYROLIUM_HOE = ITEMS.register("tyrolium_hoe", () -> new TyroliumHoe());
    public static final RegistryObject<Item> TYROLIUM_HAMMER = ITEMS.register("tyrolium_hammer", () -> new TyroliumHammer());
    public static final RegistryObject<Item> TYROLIUM_HELMET = ITEMS.register("tyrolium_helmet", () -> new TyroliumHelmet());
    public static final RegistryObject<Item> TYROLIUM_CHESTPLATE = ITEMS.register("tyrolium_chestplate", () -> new TyroliumChestplate());
    public static final RegistryObject<Item> TYROLIUM_LEGGINGS = ITEMS.register("tyrolium_leggings", () -> new TyroliumLeggings());
    public static final RegistryObject<Item> TYROLIUM_BOOTS = ITEMS.register("tyrolium_boots", () -> new TyroliumBoots());

    // Adamentium
    public static final RegistryObject<Item> ADAMENTIUM = ITEMS.register("adamentium", () -> new Adamentium());
    public static final RegistryObject<Item> ADAMENTIUM_SWORD = ITEMS.register("adamentium_sword", () -> new AdamentiumSword());
    public static final RegistryObject<Item> ADAMENTIUM_PICKAXE = ITEMS.register("adamentium_pickaxe", () -> new AdamentiumPickaxe());
    public static final RegistryObject<Item> ADAMENTIUM_AXE = ITEMS.register("adamentium_axe", () -> new AdamentiumAxe());
    public static final RegistryObject<Item> ADAMENTIUM_SHOVEL = ITEMS.register("adamentium_shovel", () -> new AdamentiumShovel());
    public static final RegistryObject<Item> ADAMENTIUM_HOE = ITEMS.register("adamentium_hoe", () -> new AdamentiumHoe());
    public static final RegistryObject<Item> ADAMENTIUM_HAMMER = ITEMS.register("adamentium_hammer", () -> new AdamentiumHammer());
    public static final RegistryObject<Item> ADAMENTIUM_HELMET = ITEMS.register("adamentium_helmet", () -> new AdamentiumHelmet());
    public static final RegistryObject<Item> ADAMENTIUM_CHESTPLATE = ITEMS.register("adamentium_chestplate", () -> new AdamentiumChestplate());
    public static final RegistryObject<Item> ADAMENTIUM_LEGGINGS = ITEMS.register("adamentium_leggings", () -> new AdamentiumLeggings());
    public static final RegistryObject<Item> ADAMENTIUM_BOOTS = ITEMS.register("adamentium_boots", () -> new AdamentiumBoots());
/*
    // Argonite
    public static final RegistryObject<Item> ARGONITE = ITEMS.register("argonite", () -> new Argonite());
    public static final RegistryObject<Item> ARGONITE_SWORD = ITEMS.register("argonite_sword", () -> new ArgoniteSword());
    public static final RegistryObject<Item> ARGONITE_PICKAXE = ITEMS.register("argonite_pickaxe", () -> new ArgonitePickaxe());
    public static final RegistryObject<Item> ARGONITE_AXE = ITEMS.register("argonite_axe", () -> new ArgoniteAxe());
    public static final RegistryObject<Item> ARGONITE_SHOVEL = ITEMS.register("argonite_shovel", () -> new ArgoniteShovel());
    public static final RegistryObject<Item> ARGONITE_HOE = ITEMS.register("argonite_hoe", () -> new ArgoniteHoe());
    public static final RegistryObject<Item> ARGONITE_HELMET = ITEMS.register("argonite_helmet", () -> new ArgoniteHelmet());
    public static final RegistryObject<Item> ARGONITE_CHESTPLATE = ITEMS.register("argonite_chestplate", () -> new ArgoniteChestplate());
    public static final RegistryObject<Item> ARGONITE_LEGGINGS = ITEMS.register("argonite_leggings", () -> new ArgoniteLeggings());
    public static final RegistryObject<Item> ARGONITE_BOOTS = ITEMS.register("argonite_boots", () -> new ArgoniteBoots());

    // Ashstone
    public static final RegistryObject<Item> ASHSTONE = ITEMS.register("ashstone", () -> new Ashstone());
    public static final RegistryObject<Item> ASHSTONE_SWORD = ITEMS.register("ashstone_sword", () -> new AshstoneSword());
    public static final RegistryObject<Item> ASHSTONE_PICKAXE = ITEMS.register("ashstone_pickaxe", () -> new AshstonePickaxe());
    public static final RegistryObject<Item> ASHSTONE_AXE = ITEMS.register("ashstone_axe", () -> new AshstoneAxe());
    public static final RegistryObject<Item> ASHSTONE_SHOVEL = ITEMS.register("ashstone_shovel", () -> new AshstoneShovel());
    public static final RegistryObject<Item> ASHSTONE_HOE = ITEMS.register("ashstone_hoe", () -> new AshstoneHoe());
    public static final RegistryObject<Item> ASHSTONE_HELMET = ITEMS.register("ashstone_helmet", () -> new AshstoneHelmet());
    public static final RegistryObject<Item> ASHSTONE_CHESTPLATE = ITEMS.register("ashstone_chestplate", () -> new AshstoneChestplate());
    public static final RegistryObject<Item> ASHSTONE_LEGGINGS = ITEMS.register("ashstone_leggings", () -> new AshstoneLeggings());
    public static final RegistryObject<Item> ASHSTONE_BOOTS = ITEMS.register("ashstone_boots", () -> new AshstoneBoots());

    // Aurore
    public static final RegistryObject<Item> AURORE = ITEMS.register("aurore", () -> new Aurore());
    public static final RegistryObject<Item> AURORE_SWORD = ITEMS.register("aurore_sword", () -> new AuroreSword());
    public static final RegistryObject<Item> AURORE_PICKAXE = ITEMS.register("aurore_pickaxe", () -> new AurorePickaxe());
    public static final RegistryObject<Item> AURORE_AXE = ITEMS.register("aurore_axe", () -> new AuroreAxe());
    public static final RegistryObject<Item> AURORE_SHOVEL = ITEMS.register("aurore_shovel", () -> new AuroreShovel());
    public static final RegistryObject<Item> AURORE_HOE = ITEMS.register("aurore_hoe", () -> new AuroreHoe());
    public static final RegistryObject<Item> AURORE_HELMET = ITEMS.register("aurore_helmet", () -> new AuroreHelmet());
    public static final RegistryObject<Item> AURORE_CHESTPLATE = ITEMS.register("aurore_chestplate", () -> new AuroreChestplate());
    public static final RegistryObject<Item> AURORE_LEGGINGS = ITEMS.register("aurore_leggings", () -> new AuroreLeggings());
    public static final RegistryObject<Item> AURORE_BOOTS = ITEMS.register("aurore_boots", () -> new AuroreBoots());

    // Bronze
    public static final RegistryObject<Item> BRONZE = ITEMS.register("bronze", () -> new Bronze());
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new BronzeSword());
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new BronzePickaxe());
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new BronzeAxe());
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new BronzeShovel());
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new BronzeHoe());
    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new BronzeHelmet());
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new BronzeChestplate());
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new BronzeLeggings());
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new BronzeBoots());

    // Draconite
    public static final RegistryObject<Item> DRACONITE = ITEMS.register("draconite", () -> new Draconite());
    public static final RegistryObject<Item> DRACONITE_SWORD = ITEMS.register("draconite_sword", () -> new DraconiteSword());
    public static final RegistryObject<Item> DRACONITE_PICKAXE = ITEMS.register("draconite_pickaxe", () -> new DraconitePickaxe());
    public static final RegistryObject<Item> DRACONITE_AXE = ITEMS.register("draconite_axe", () -> new DraconiteAxe());
    public static final RegistryObject<Item> DRACONITE_SHOVEL = ITEMS.register("draconite_shovel", () -> new DraconiteShovel());
    public static final RegistryObject<Item> DRACONITE_HOE = ITEMS.register("draconite_hoe", () -> new DraconiteHoe());
    public static final RegistryObject<Item> DRACONITE_HELMET = ITEMS.register("draconite_helmet", () -> new DraconiteHelmet());
    public static final RegistryObject<Item> DRACONITE_CHESTPLATE = ITEMS.register("draconite_chestplate", () -> new DraconiteChestplate());
    public static final RegistryObject<Item> DRACONITE_LEGGINGS = ITEMS.register("draconite_leggings", () -> new DraconiteLeggings());
    public static final RegistryObject<Item> DRACONITE_BOOTS = ITEMS.register("draconite_boots", () -> new DraconiteBoots());

    // Draconium
    public static final RegistryObject<Item> DRACONIUM = ITEMS.register("draconium", () -> new Draconium());
    public static final RegistryObject<Item> DRACONIUM_POWDER = ITEMS.register("draconium_powder", () -> new DraconiumPowder());
    public static final RegistryObject<Item> DRACONIUM_SWORD = ITEMS.register("draconium_sword", () -> new DraconiumSword());
    public static final RegistryObject<Item> DRACONIUM_PICKAXE = ITEMS.register("draconium_pickaxe", () -> new DraconiumPickaxe());
    public static final RegistryObject<Item> DRACONIUM_AXE = ITEMS.register("draconium_axe", () -> new DraconiumAxe());
    public static final RegistryObject<Item> DRACONIUM_SHOVEL = ITEMS.register("draconium_shovel", () -> new DraconiumShovel());
    public static final RegistryObject<Item> DRACONIUM_HOE = ITEMS.register("draconium_hoe", () -> new DraconiumHoe());
    public static final RegistryObject<Item> DRACONIUM_HAMMER = ITEMS.register("draconium_hammer", () -> new DraconiumHammer());
    public static final RegistryObject<Item> DRACONIUM_HELMET = ITEMS.register("draconium_helmet", () -> new DraconiumHelmet());
    public static final RegistryObject<Item> DRACONIUM_CHESTPLATE = ITEMS.register("draconium_chestplate", () -> new DraconiumChestplate());
    public static final RegistryObject<Item> DRACONIUM_LEGGINGS = ITEMS.register("draconium_leggings", () -> new DraconiumLeggings());
    public static final RegistryObject<Item> DRACONIUM_BOOTS = ITEMS.register("draconium_boots", () -> new DraconiumBoots());

    // Dragonstone
    public static final RegistryObject<Item> DRAGONSTONE = ITEMS.register("dragonstone", () -> new Dragonstone());
    public static final RegistryObject<Item> DRAGONSTONE_SWORD = ITEMS.register("dragonstone_sword", () -> new DragonstoneSword());
    public static final RegistryObject<Item> DRAGONSTONE_PICKAXE = ITEMS.register("dragonstone_pickaxe", () -> new DragonstonePickaxe());
    public static final RegistryObject<Item> DRAGONSTONE_AXE = ITEMS.register("dragonstone_axe", () -> new DragonstoneAxe());
    public static final RegistryObject<Item> DRAGONSTONE_SHOVEL = ITEMS.register("dragonstone_shovel", () -> new DragonstoneShovel());
    public static final RegistryObject<Item> DRAGONSTONE_HOE = ITEMS.register("dragonstone_hoe", () -> new DragonstoneHoe());
    public static final RegistryObject<Item> DRAGONSTONE_HELMET = ITEMS.register("dragonstone_helmet", () -> new DragonstoneHelmet());
    public static final RegistryObject<Item> DRAGONSTONE_CHESTPLATE = ITEMS.register("dragonstone_chestplate", () -> new DragonstoneChestplate());
    public static final RegistryObject<Item> DRAGONSTONE_LEGGINGS = ITEMS.register("dragonstone_leggings", () -> new DragonstoneLeggings());
    public static final RegistryObject<Item> DRAGONSTONE_BOOTS = ITEMS.register("dragonstone_boots", () -> new DragonstoneBoots());

    // Fyrite
    public static final RegistryObject<Item> FYRITE = ITEMS.register("fyrite", () -> new Fyrite());
    public static final RegistryObject<Item> FYRITE_SWORD = ITEMS.register("fyrite_sword", () -> new FyriteSword());
    public static final RegistryObject<Item> FYRITE_PICKAXE = ITEMS.register("fyrite_pickaxe", () -> new FyritePickaxe());
    public static final RegistryObject<Item> FYRITE_AXE = ITEMS.register("fyrite_axe", () -> new FyriteAxe());
    public static final RegistryObject<Item> FYRITE_SHOVEL = ITEMS.register("fyrite_shovel", () -> new FyriteShovel());
    public static final RegistryObject<Item> FYRITE_HOE = ITEMS.register("fyrite_hoe", () -> new FyriteHoe());
    public static final RegistryObject<Item> FYRITE_HELMET = ITEMS.register("fyrite_helmet", () -> new FyriteHelmet());
    public static final RegistryObject<Item> FYRITE_CHESTPLATE = ITEMS.register("fyrite_chestplate", () -> new FyriteChestplate());
    public static final RegistryObject<Item> FYRITE_LEGGINGS = ITEMS.register("fyrite_leggings", () -> new FyriteLeggings());
    public static final RegistryObject<Item> FYRITE_BOOTS = ITEMS.register("fyrite_boots", () -> new FyriteBoots());

    // Illumenite
    public static final RegistryObject<Item> ILLUMENITE = ITEMS.register("illumenite", () -> new Illumenite());
    public static final RegistryObject<Item> ILLUMENITE_SWORD = ITEMS.register("illumenite_sword", () -> new IllumeniteSword());
    public static final RegistryObject<Item> ILLUMENITE_PICKAXE = ITEMS.register("illumenite_pickaxe", () -> new IllumenitePickaxe());
    public static final RegistryObject<Item> ILLUMENITE_AXE = ITEMS.register("illumenite_axe", () -> new IllumeniteAxe());
    public static final RegistryObject<Item> ILLUMENITE_SHOVEL = ITEMS.register("illumenite_shovel", () -> new IllumeniteShovel());
    public static final RegistryObject<Item> ILLUMENITE_HOE = ITEMS.register("illumenite_hoe", () -> new IllumeniteHoe());
    public static final RegistryObject<Item> ILLUMENITE_HELMET = ITEMS.register("illumenite_helmet", () -> new IllumeniteHelmet());
    public static final RegistryObject<Item> ILLUMENITE_CHESTPLATE = ITEMS.register("illumenite_chestplate", () -> new IllumeniteChestplate());
    public static final RegistryObject<Item> ILLUMENITE_LEGGINGS = ITEMS.register("illumenite_leggings", () -> new IllumeniteLeggings());
    public static final RegistryObject<Item> ILLUMENITE_BOOTS = ITEMS.register("illumenite_boots", () -> new IllumeniteBoots());

    // Jade
    public static final RegistryObject<Item> JADE = ITEMS.register("jade", () -> new Jade());
    public static final RegistryObject<Item> JADE_SWORD = ITEMS.register("jade_sword", () -> new JadeSword());
    public static final RegistryObject<Item> JADE_PICKAXE = ITEMS.register("jade_pickaxe", () -> new JadePickaxe());
    public static final RegistryObject<Item> JADE_AXE = ITEMS.register("jade_axe", () -> new JadeAxe());
    public static final RegistryObject<Item> JADE_SHOVEL = ITEMS.register("jade_shovel", () -> new JadeShovel());
    public static final RegistryObject<Item> JADE_HOE = ITEMS.register("jade_hoe", () -> new JadeHoe());
    public static final RegistryObject<Item> JADE_HELMET = ITEMS.register("jade_helmet", () -> new JadeHelmet());
    public static final RegistryObject<Item> JADE_CHESTPLATE = ITEMS.register("jade_chestplate", () -> new JadeChestplate());
    public static final RegistryObject<Item> JADE_LEGGINGS = ITEMS.register("jade_leggings", () -> new JadeLeggings());
    public static final RegistryObject<Item> JADE_BOOTS = ITEMS.register("jade_boots", () -> new JadeBoots());
*/

    //Rhodonite
    public static final RegistryObject<Item> RHODONITE = ITEMS.register("rhodonite", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> RHODONITE_NUGGET = ITEMS.register("rhodonite_nugget", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> RHODONITE_SWORD_FIRE = ITEMS.register("rhodonite_sword_fire", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> RHODONITE_SWORD = ITEMS.register("rhodonite_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> RHODONITE_PICKAXE = ITEMS.register("rhodonite_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> RHODONITE_AXE = ITEMS.register("rhodonite_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> RHODONITE_SHOVEL = ITEMS.register("rhodonite_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> RHODONITE_HOE = ITEMS.register("rhodonite_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> RHODONITE_HAMMER = ITEMS.register("rhodonite_hammer", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Amethys
    public static final RegistryObject<Item> AMETHYS = ITEMS.register("amethys", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> AMETHYS_NUGGET = ITEMS.register("amethys_nugget", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> AMETHYS_SWORD_FIRE = ITEMS.register("amethys_sword_fire", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> AMETHYS_SWORD = ITEMS.register("amethys_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> AMETHYS_PICKAXE = ITEMS.register("amethys_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYS_AXE = ITEMS.register("amethys_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYS_SHOVEL = ITEMS.register("amethys_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYS_HOE = ITEMS.register("amethys_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYS_HAMMER = ITEMS.register("amethys_hammer", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Aventurine
    public static final RegistryObject<Item> AVENTURINE = ITEMS.register("aventurine", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> AVENTURINE_NUGGET = ITEMS.register("aventurine_nugget", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> AVENTURINE_GEM = ITEMS.register("aventurine_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> AVENTURINE_POWDER = ITEMS.register("aventurine_powder", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> AVENTURINE_SWORD_FIRE = ITEMS.register("aventurine_sword_fire", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> AVENTURINE_SWORD = ITEMS.register("aventurine_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> AVENTURINE_PICKAXE = ITEMS.register("aventurine_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> AVENTURINE_AXE = ITEMS.register("aventurine_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> AVENTURINE_SHOVEL = ITEMS.register("aventurine_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> AVENTURINE_HOE = ITEMS.register("aventurine_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> AVENTURINE_HAMMER = ITEMS.register("aventurine_hammer", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Yellorite
    public static final RegistryObject<Item> YELLORITE = ITEMS.register("yellorite", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS))); 
    public static final RegistryObject<Item> YELLORITE_NUGGET = ITEMS.register("yellorite_nugget", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> YELLORITE_SWORD_FIRE = ITEMS.register("yellorite_sword_fire", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> YELLORITE_SWORD = ITEMS.register("yellorite_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> YELLORITE_PICKAXE = ITEMS.register("yellorite_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> YELLORITE_AXE = ITEMS.register("yellorite_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> YELLORITE_SHOVEL = ITEMS.register("yellorite_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> YELLORITE_HOE = ITEMS.register("yellorite_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> YELLORITE_HAMMER = ITEMS.register("yellorite_hammer", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Copper
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Emerald
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Ender
    public static final RegistryObject<Item> ENDER_GEM = ITEMS.register("ender_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> ENDER_SWORD = ITEMS.register("ender_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> ENDER_PICKAXE = ITEMS.register("ender_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> ENDER_AXE = ITEMS.register("ender_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> ENDER_SHOVEL = ITEMS.register("ender_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> ENDER_HOE = ITEMS.register("ender_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Enderine
    public static final RegistryObject<Item> ENDERINE_INGOT = ITEMS.register("enderine_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> ENDERINE_SWORD = ITEMS.register("enderine_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> ENDERINE_PICKAXE = ITEMS.register("enderine_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> ENDERINE_AXE = ITEMS.register("enderine_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> ENDERINE_SHOVEL = ITEMS.register("enderine_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> ENDERINE_HOE = ITEMS.register("enderine_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Flint
    public static final RegistryObject<Item> FLINT_SWORD = ITEMS.register("flint_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> FLINT_PICKAXE = ITEMS.register("flint_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> FLINT_AXE = ITEMS.register("flint_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> FLINT_SHOVEL = ITEMS.register("flint_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> FLINT_HOE = ITEMS.register("flint_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Gravel
    public static final RegistryObject<Item> GRAVEL_SWORD = ITEMS.register("gravel_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GRAVEL_PICKAXE = ITEMS.register("gravel_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> GRAVEL_AXE = ITEMS.register("gravel_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> GRAVEL_SHOVEL = ITEMS.register("gravel_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> GRAVEL_HOE = ITEMS.register("gravel_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Guardian
    public static final RegistryObject<Item> GUARDIAN_INGOT = ITEMS.register("guardian_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> GUARDIAN_SWORD = ITEMS.register("guardian_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GUARDIAN_PICKAXE = ITEMS.register("guardian_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> GUARDIAN_AXE = ITEMS.register("guardian_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> GUARDIAN_SHOVEL = ITEMS.register("guardian_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> GUARDIAN_HOE = ITEMS.register("guardian_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Mercure
    public static final RegistryObject<Item> MERCURE_INGOT = ITEMS.register("mercure_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> MERCURE_STICK = ITEMS.register("mercure_stick", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> MERCURE_SWORD = ITEMS.register("mercure_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> MERCURE_PICKAXE = ITEMS.register("mercure_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MERCURE_AXE = ITEMS.register("mercure_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MERCURE_SHOVEL = ITEMS.register("mercure_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> MERCURE_HOE = ITEMS.register("mercure_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Obsidian
    public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Obsidian Red
    public static final RegistryObject<Item> OBSIDIAN_RED_INGOT = ITEMS.register("obsidian_red_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> OBSIDIAN_RED_SWORD = ITEMS.register("obsidian_red_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> OBSIDIAN_RED_PICKAXE = ITEMS.register("obsidian_red_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> OBSIDIAN_RED_AXE = ITEMS.register("obsidian_red_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> OBSIDIAN_RED_SHOVEL = ITEMS.register("obsidian_red_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> OBSIDIAN_RED_HOE = ITEMS.register("obsidian_red_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Purified Gold
    public static final RegistryObject<Item> PURIFIED_GOLD_INGOT = ITEMS.register("purified_gold_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> PURIFIED_GOLD_SWORD = ITEMS.register("purified_gold_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> PURIFIED_GOLD_PICKAXE = ITEMS.register("purified_gold_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> PURIFIED_GOLD_AXE = ITEMS.register("purified_gold_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> PURIFIED_GOLD_SHOVEL = ITEMS.register("purified_gold_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> PURIFIED_GOLD_HOE = ITEMS.register("purified_gold_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Redstone
    public static final RegistryObject<Item> REDSTONE_INGOT = ITEMS.register("redstone_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> REDSTONE_STICK = ITEMS.register("redstone_stick", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONE_AXE = ITEMS.register("redstone_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Ruby
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Saphire
    public static final RegistryObject<Item> SAPHIRE = ITEMS.register("saphire", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> SAPHIRE_SWORD = ITEMS.register("saphire_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> SAPHIRE_PICKAXE = ITEMS.register("saphire_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> SAPHIRE_AXE = ITEMS.register("saphire_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> SAPHIRE_SHOVEL = ITEMS.register("saphire_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> SAPHIRE_HOE = ITEMS.register("saphire_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Tin
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Titane
    public static final RegistryObject<Item> TITANE_INGOT = ITEMS.register("titane_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> TITANE_SWORD = ITEMS.register("titane_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TITANE_PICKAXE = ITEMS.register("titane_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> TITANE_AXE = ITEMS.register("titane_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> TITANE_SHOVEL = ITEMS.register("titane_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> TITANE_HOE = ITEMS.register("titane_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    //Volcanium
    public static final RegistryObject<Item> VOLCANIUM = ITEMS.register("volcanium", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> VOLCANIUM_INGOT = ITEMS.register("volcanium_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> VOLCANIUM_SWORD = ITEMS.register("volcanium_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> VOLCANIUM_PICKAXE = ITEMS.register("volcanium_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLCANIUM_AXE = ITEMS.register("volcanium_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLCANIUM_SHOVEL = ITEMS.register("volcanium_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> VOLCANIUM_HOE = ITEMS.register("volcanium_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));


    //Other Item
    //public static final RegistryObject<Item> ANGEL_RING = ITEMS.register("angel_ring", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

}

