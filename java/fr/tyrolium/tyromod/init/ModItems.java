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

    // Rhodonite
    public static final RegistryObject<Item> RHODONITE = ITEMS.register("rhodonite", () -> new Rhodonite());
    public static final RegistryObject<Item> RHODONITE_NUGGET = ITEMS.register("rhodonite_nugget", () -> new RhodoniteNugget());
    public static final RegistryObject<Item> RHODONITE_SWORD = ITEMS.register("rhodonite_sword", () -> new RhodoniteSword());
    public static final RegistryObject<Item> RHODONITE_PICKAXE = ITEMS.register("rhodonite_pickaxe", () -> new RhodonitePickaxe());
    public static final RegistryObject<Item> RHODONITE_AXE = ITEMS.register("rhodonite_axe", () -> new RhodoniteAxe());
    public static final RegistryObject<Item> RHODONITE_SHOVEL = ITEMS.register("rhodonite_shovel", () -> new RhodoniteShovel());
    public static final RegistryObject<Item> RHODONITE_HOE = ITEMS.register("rhodonite_hoe", () -> new RhodoniteHoe());
    public static final RegistryObject<Item> RHODONITE_HAMMER = ITEMS.register("rhodonite_hammer", () -> new RhodoniteHammer());
    public static final RegistryObject<Item> RHODONITE_SWORD_FIRE = ITEMS.register("rhodonite_sword_fire", () -> new RhodoniteSwordFire());
    public static final RegistryObject<Item> RHODONITE_HELMET = ITEMS.register("rhodonite_helmet", () -> new RhodoniteHelmet());
    public static final RegistryObject<Item> RHODONITE_CHESTPLATE = ITEMS.register("rhodonite_chestplate", () -> new RhodoniteChestplate());
    public static final RegistryObject<Item> RHODONITE_LEGGINGS = ITEMS.register("rhodonite_leggings", () -> new RhodoniteLeggings());
    public static final RegistryObject<Item> RHODONITE_BOOTS = ITEMS.register("rhodonite_boots", () -> new RhodoniteBoots());

}