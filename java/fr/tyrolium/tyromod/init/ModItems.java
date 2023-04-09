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

}