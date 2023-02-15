package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.utils.CustomItemTiers;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TyroMod.ModId);

    // Tyrolium
    public static final RegistryObject<Item> TYROLIUM = ITEMS.register("tyrolium", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> TYROLIUM_NUGGET = ITEMS.register("tyrolium_nugget", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> TYROLIUM_SWORD_FIRE = ITEMS.register("tyrolium_sword_fire", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TYROLIUM_SWORD = ITEMS.register("tyrolium_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TYROLIUM_PICKAXE = ITEMS.register("tyrolium_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> TYROLIUM_AXE = ITEMS.register("tyrolium_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> TYROLIUM_SHOVEL = ITEMS.register("tyrolium_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> TYROLIUM_HOE = ITEMS.register("tyrolium_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> TYROLIUM_HAMMER = ITEMS.register("tyrolium_hammer", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

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

    //Aurore
    public static final RegistryObject<Item> AURORE = ITEMS.register("aurore", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> AURORE_SWORD = ITEMS.register("aurore_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> AURORE_PICKAXE = ITEMS.register("aurore_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> AURORE_AXE = ITEMS.register("aurore_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> AURORE_SHOVEL = ITEMS.register("aurore_shovel", () -> new ShovelItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> AURORE_HOE = ITEMS.register("aurore_hoe", () -> new HoeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

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
    public static final RegistryObject<Item> MERCURE_SWORD = ITEMS.register("mercure_sword", () -> new SwordItem(CustomItemTiers.TYROLIUM, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> MERCURE_PICKAXE = ITEMS.register("mercure_pickaxe", () -> new PickaxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> MERCURE_AXE = ITEMS.register("mercure_axe", () -> new AxeItem(CustomItemTiers.TYROLIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));


    //Other Item
    //public static final RegistryObject<Item> ANGEL_RING = ITEMS.register("angel_ring", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

}

