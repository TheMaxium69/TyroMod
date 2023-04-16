package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.item.*;
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

    // Copper
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new CopperIngot());
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new CopperNugget());
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new CopperSword());
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new CopperPickaxe());
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new CopperAxe());
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new CopperShovel());
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new CopperHoe());
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new CopperHelmet());
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new CopperChestplate());
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new CopperLeggings());
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new CopperBoots());

}

