package fr.tyrolium.maxime.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.tyrolium.maxime.tool.axe.*;
import fr.tyrolium.maxime.tool.pickaxe.*;
import fr.tyrolium.maxime.tool.shovel.*;
import fr.tyrolium.maxime.tool.sword.*;
import fr.tyrolium.maxime.tool.hoe.*;
import net.minecraft.item.*;

public class ToolMod {
    public static ItemSword amethys_sword,
                            aventurine_sword,
                            copper_sword,
                            emerald_sword,
                            ender_sword,
                            enderine_sword,
                            flint_sword,
                            gravel_sword,
                            guardian_sword,
                            mercure_sword,
                            obsidian_sword,
                            obsidian_red_sword,
                            purified_gold_sword,
                            redstone_sword,
                            rhodonite_sword,
                            ruby_sword,
                            sapphire_sword,
                            tin_sword,
                            titane_sword,
                            tyrolium_sword,
                            volcanium_sword,
                            yellorite_sword;
    public static ItemPickaxe amethys_pickaxe,
                              aventurine_pickaxe,
                              copper_pickaxe,
                              emerald_pickaxe,
                              ender_pickaxe,
                              enderine_pickaxe,
                              flint_pickaxe,
                              gravel_pickaxe,
                              guardian_pickaxe,
                              mercure_pickaxe,
                              obsidian_pickaxe,
                              obsidian_red_pickaxe,
                              purified_gold_pickaxe,
                              redstone_pickaxe,
                              rhodonite_pickaxe,
                              ruby_pickaxe,
                              sapphire_pickaxe,
                              tin_pickaxe,
                              titane_pickaxe,
                              tyrolium_pickaxe,
                              volcanium_pickaxe,
                              yellorite_pickaxe;
    public static ItemAxe amethys_axe,
                          aventurine_axe,
                          copper_axe,
                          emerald_axe,
                          ender_axe,
                          enderine_axe,
                          flint_axe,
                          gravel_axe,
                          guardian_axe,
                          mercure_axe,
                          obsidian_axe,
                          obsidian_red_axe,
                          purified_gold_axe,
                          redstone_axe,
                          rhodonite_axe,
                          ruby_axe,
                          sapphire_axe,
                          tin_axe,
                          titane_axe,
                          tyrolium_axe,
                          volcanium_axe,
                          yellorite_axe;
    public static ItemSpade amethys_shovel,
                            aventurine_shovel,
                            copper_shovel,
                            emerald_shovel,
                            ender_shovel,
                            enderine_shovel,
                            flint_shovel,
                            gravel_shovel,
                            guardian_shovel,
                            mercure_shovel,
                            obsidian_shovel,
                            obsidian_red_shovel,
                            purified_gold_shovel,
                            redstone_shovel,
                            rhodonite_shovel,
                            ruby_shovel,
                            sapphire_shovel,
                            tin_shovel,
                            titane_shovel,
                            tyrolium_shovel,
                            volcanium_shovel,
                            yellorite_shovel;
    public static ItemHoe amethys_hoe,
                          aventurine_hoe,
                          copper_hoe,
                          emerald_hoe,
                          ender_hoe,
                          enderine_hoe,
                          flint_hoe,
                          gravel_hoe,
                          guardian_hoe,
                          mercure_hoe,
                          obsidian_hoe,
                          obsidian_red_hoe,
                          purified_gold_hoe,
                          redstone_hoe,
                          rhodonite_hoe,
                          ruby_hoe,
                          sapphire_hoe,
                          tin_hoe,
                          titane_hoe,
                          tyrolium_hoe,
                          volcanium_hoe,
                          yellorite_hoe;
    public static ItemPickaxe tyrolium_hammer;
    public static ItemSword tyrolium_sword_fire;

    public ToolMod(){
    }

    public static void init() {
        amethys_sword = new AmethysSword();
        aventurine_sword = new AventurineSword();
        copper_sword = new CopperSword();
        emerald_sword = new EmeraldSword();
        ender_sword = new EnderSword();
        enderine_sword = new EnderineSword();
        flint_sword = new FlintSword();
        gravel_sword = new GravelSword();
        guardian_sword = new GuardianSword();
        mercure_sword = new MercureSword();
        obsidian_sword = new ObsidianSword();
        obsidian_red_sword = new ObsidianRedSword();
        purified_gold_sword = new PurifiedGoldSword();
        redstone_sword = new RedstoneSword();
        rhodonite_sword = new RhodoniteSword();
        ruby_sword = new RubySword();
        sapphire_sword = new SapphireSword();
        tin_sword = new TinSword();
        titane_sword = new TitaneSword();
        tyrolium_sword = new TyroliumSword();
        volcanium_sword = new VolcaniumSword();
        yellorite_sword = new YelloriteSword();
        amethys_pickaxe = new AmethysPickaxe();
        aventurine_pickaxe = new AventurinePickaxe();
        copper_pickaxe = new CopperPickaxe();
        emerald_pickaxe = new EmeraldPickaxe();
        ender_pickaxe = new EnderPickaxe();
        enderine_pickaxe = new EnderinePickaxe();
        flint_pickaxe = new FlintPickaxe();
        gravel_pickaxe = new GravelPickaxe();
        guardian_pickaxe = new GuardianPickaxe();
        mercure_pickaxe = new MercurePickaxe();
        obsidian_pickaxe = new ObsidianPickaxe();
        obsidian_red_pickaxe = new ObsidianRedPickaxe();
        purified_gold_pickaxe = new PurifiedGoldPickaxe();
        redstone_pickaxe = new RedstonePickaxe();
        rhodonite_pickaxe = new RhodonitePickaxe();
        ruby_pickaxe = new RubyPickaxe();
        sapphire_pickaxe = new SapphirePickaxe();
        tin_pickaxe = new TinPickaxe();
        titane_pickaxe = new TitanePickaxe();
        tyrolium_pickaxe = new TyroliumPickaxe();
        volcanium_pickaxe = new VolcaniumPickaxe();
        yellorite_pickaxe = new YelloritePickaxe();
        amethys_axe = new AmethysAxe();
        aventurine_axe = new AventurineAxe();
        copper_axe = new CopperAxe();
        emerald_axe = new EmeraldAxe();
        ender_axe = new EnderAxe();
        enderine_axe = new EnderineAxe();
        flint_axe = new FlintAxe();
        gravel_axe = new GravelAxe();
        guardian_axe = new GuardianAxe();
        mercure_axe = new MercureAxe();
        obsidian_axe = new ObsidianAxe();
        obsidian_red_axe = new ObsidianRedAxe();
        purified_gold_axe = new PurifiedGoldAxe();
        redstone_axe = new RedstoneAxe();
        rhodonite_axe = new RhodoniteAxe();
        ruby_axe = new RubyAxe();
        sapphire_axe = new SapphireAxe();
        tin_axe = new TinAxe();
        titane_axe = new TitaneAxe();
        tyrolium_axe = new TyroliumAxe();
        volcanium_axe = new VolcaniumAxe();
        yellorite_axe = new YelloriteAxe();
        amethys_shovel = new AmethysShovel();
        aventurine_shovel = new AventurineShovel();
        copper_shovel = new CopperShovel();
        emerald_shovel = new EmeraldShovel();
        ender_shovel = new EnderShovel();
        enderine_shovel = new EnderineShovel();
        flint_shovel = new FlintShovel();
        gravel_shovel = new GravelShovel();
        guardian_shovel = new GuardianShovel();
        mercure_shovel = new MercureShovel();
        obsidian_shovel = new ObsidianShovel();
        obsidian_red_shovel = new ObsidianRedShovel();
        purified_gold_shovel = new PurifiedGoldShovel();
        redstone_shovel = new RedstoneShovel();
        rhodonite_shovel = new RhodoniteShovel();
        ruby_shovel = new RubyShovel();
        sapphire_shovel = new SapphireShovel();
        tin_shovel = new TinShovel();
        titane_shovel = new TitaneShovel();
        tyrolium_shovel = new TyroliumShovel();
        volcanium_shovel = new VolcaniumShovel();
        yellorite_shovel = new YelloriteShovel();
        amethys_hoe = new AmethysHoe();
        aventurine_hoe = new AventurineHoe();
        copper_hoe = new CopperHoe();
        emerald_hoe = new EmeraldHoe();
        ender_hoe = new EnderHoe();
        enderine_hoe = new EnderineHoe();
        flint_hoe = new FlintHoe();
        gravel_hoe = new GravelHoe();
        guardian_hoe = new GuardianHoe();
        mercure_hoe = new MercureHoe();
        obsidian_hoe = new ObsidianHoe();
        obsidian_red_hoe = new ObsidianRedHoe();
        purified_gold_hoe = new PurifiedGoldHoe();
        redstone_hoe = new RedstoneHoe();
        rhodonite_hoe = new RhodoniteHoe();
        ruby_hoe = new RubyHoe();
        sapphire_hoe = new SapphireHoe();
        tin_hoe = new TinHoe();
        titane_hoe = new TitaneHoe();
        tyrolium_hoe = new TyroliumHoe();
        volcanium_hoe = new VolcaniumHoe();
        yellorite_hoe = new YelloriteHoe();
        //tyrolium_hammer = new TyroliumHammer();
        //tyrolium_sword_fire = new TyroliumSwordFire();
    }

    public static void register() {
        GameRegistry.registerItem(amethys_sword, "amethys_sword");
        GameRegistry.registerItem(aventurine_sword, "aventurine_sword");
        GameRegistry.registerItem(copper_sword, "copper_sword");
        GameRegistry.registerItem(emerald_sword, "emerald_sword");
        GameRegistry.registerItem(ender_sword, "ender_sword");
        GameRegistry.registerItem(enderine_sword, "enderine_sword");
        GameRegistry.registerItem(flint_sword, "flint_sword");
        GameRegistry.registerItem(gravel_sword, "gravel_sword");
        GameRegistry.registerItem(guardian_sword, "guardian_sword");
        GameRegistry.registerItem(mercure_sword, "mercure_sword");
        GameRegistry.registerItem(obsidian_red_sword, "obsidian_red_sword");
        GameRegistry.registerItem(obsidian_sword, "obsidian_sword");
        GameRegistry.registerItem(purified_gold_sword, "purified_gold_sword");
        GameRegistry.registerItem(redstone_sword, "redstone_sword");
        GameRegistry.registerItem(rhodonite_sword, "rhodonite_sword");
        GameRegistry.registerItem(ruby_sword, "ruby_sword");
        GameRegistry.registerItem(sapphire_sword, "sapphire_sword");
        GameRegistry.registerItem(tin_sword, "tin_sword");
        GameRegistry.registerItem(titane_sword, "titane_sword");
        GameRegistry.registerItem(tyrolium_sword, "tyrolium_sword");
        GameRegistry.registerItem(volcanium_sword, "volcanium_sword");
        GameRegistry.registerItem(yellorite_sword, "yellorite_sword");
        GameRegistry.registerItem(amethys_pickaxe, "amethys_pickaxe");
        GameRegistry.registerItem(aventurine_pickaxe, "aventurine_pickaxe");
        GameRegistry.registerItem(copper_pickaxe, "copper_pickaxe");
        GameRegistry.registerItem(emerald_pickaxe, "emerald_pickaxe");
        GameRegistry.registerItem(enderine_pickaxe, "enderine_pickaxe");
        GameRegistry.registerItem(ender_pickaxe, "ender_pickaxe");
        GameRegistry.registerItem(flint_pickaxe, "flint_pickaxe");
        GameRegistry.registerItem(gravel_pickaxe, "gravel_pickaxe");
        GameRegistry.registerItem(guardian_pickaxe, "guardian_pickaxe");
        GameRegistry.registerItem(mercure_pickaxe, "mercure_pickaxe");
        GameRegistry.registerItem(obsidian_pickaxe, "obsidian_pickaxe");
        GameRegistry.registerItem(obsidian_red_pickaxe, "obsidian_red_pickaxe");
        GameRegistry.registerItem(purified_gold_pickaxe, "purified_gold_pickaxe");
        GameRegistry.registerItem(redstone_pickaxe, "redstone_pickaxe");
        GameRegistry.registerItem(rhodonite_pickaxe, "rhodonite_pickaxe");
        GameRegistry.registerItem(ruby_pickaxe, "ruby_pickaxe");
        GameRegistry.registerItem(sapphire_pickaxe, "sapphire_pickaxe");
        GameRegistry.registerItem(tin_pickaxe, "tin_pickaxe");
        GameRegistry.registerItem(titane_pickaxe, "titane_pickaxe");
        GameRegistry.registerItem(tyrolium_pickaxe, "tyrolium_pickaxe");
        GameRegistry.registerItem(volcanium_pickaxe, "volcanium_pickaxe");
        GameRegistry.registerItem(yellorite_pickaxe, "yellorite_pickaxe");
        GameRegistry.registerItem(amethys_axe, "amethys_axe");
        GameRegistry.registerItem(aventurine_axe, "aventurine_axe");
        GameRegistry.registerItem(copper_axe, "copper_axe");
        GameRegistry.registerItem(emerald_axe, "emerald_axe");
        GameRegistry.registerItem(ender_axe, "ender_axe");
        GameRegistry.registerItem(enderine_axe, "enderine_axe");
        GameRegistry.registerItem(flint_axe, "flint_axe");
        GameRegistry.registerItem(gravel_axe, "gravel_axe");
        GameRegistry.registerItem(guardian_axe, "guardian_axe");
        GameRegistry.registerItem(mercure_axe, "mercure_axe");
        GameRegistry.registerItem(obsidian_axe, "obsidian_axe");
        GameRegistry.registerItem(obsidian_red_axe, "obsidian_red_axe");
        GameRegistry.registerItem(purified_gold_axe, "purified_gold_axe");
        GameRegistry.registerItem(redstone_axe, "redstone_axe");
        GameRegistry.registerItem(rhodonite_axe, "rhodonite_axe");
        GameRegistry.registerItem(ruby_axe, "ruby_axe");
        GameRegistry.registerItem(sapphire_axe, "sapphire_axe");
        GameRegistry.registerItem(tin_axe, "tin_axe");
        GameRegistry.registerItem(titane_axe, "titane_axe");
        GameRegistry.registerItem(tyrolium_axe, "tyrolium_axe");
        GameRegistry.registerItem(volcanium_axe, "volcanium_axe");
        GameRegistry.registerItem(yellorite_axe, "yellorite_axe");
        GameRegistry.registerItem(amethys_shovel, "amethys_shovel");
        GameRegistry.registerItem(aventurine_shovel, "aventurine_shovel");
        GameRegistry.registerItem(copper_shovel, "copper_shovel");
        GameRegistry.registerItem(emerald_shovel, "emerald_shovel");
        GameRegistry.registerItem(ender_shovel, "ender_shovel");
        GameRegistry.registerItem(enderine_shovel, "enderine_shovel");
        GameRegistry.registerItem(flint_shovel, "flint_shovel");
        GameRegistry.registerItem(gravel_shovel, "gravel_shovel");
        GameRegistry.registerItem(guardian_shovel, "guardian_shovel");
        GameRegistry.registerItem(mercure_shovel, "mercure_shovel");
        GameRegistry.registerItem(obsidian_shovel, "obsidian_shovel");
        GameRegistry.registerItem(obsidian_red_shovel, "obsidian_red_shovel");
        GameRegistry.registerItem(purified_gold_shovel, "purified_gold_shovel");
        GameRegistry.registerItem(redstone_shovel, "redstone_shovel");
        GameRegistry.registerItem(rhodonite_shovel, "rhodonite_shovel");
        GameRegistry.registerItem(ruby_shovel, "ruby_shovel");
        GameRegistry.registerItem(sapphire_shovel, "sapphire_shovel");
        GameRegistry.registerItem(tin_shovel, "tin_shovel");
        GameRegistry.registerItem(titane_shovel, "titane_shovel");
        GameRegistry.registerItem(tyrolium_shovel, "tyrolium_shovel");
        GameRegistry.registerItem(volcanium_shovel, "volcanium_shovel");
        GameRegistry.registerItem(yellorite_shovel, "yellorite_shovel");
        GameRegistry.registerItem(amethys_hoe, "amethys_hoe");
        GameRegistry.registerItem(aventurine_hoe, "aventurine_hoe");
        GameRegistry.registerItem(copper_hoe, "copper_hoe");
        GameRegistry.registerItem(emerald_hoe, "emerald_hoe");
        GameRegistry.registerItem(ender_hoe, "ender_hoe");
        GameRegistry.registerItem(enderine_hoe, "enderine_hoe");
        GameRegistry.registerItem(flint_hoe, "flint_hoe");
        GameRegistry.registerItem(gravel_hoe, "gravel_hoe");
        GameRegistry.registerItem(guardian_hoe, "guardian_hoe");
        GameRegistry.registerItem(mercure_hoe, "mercure_hoe");
        GameRegistry.registerItem(obsidian_hoe, "obsidian_hoe");
        GameRegistry.registerItem(obsidian_red_hoe, "obsidian_red_hoe");
        GameRegistry.registerItem(purified_gold_hoe, "purified_gold_hoe");
        GameRegistry.registerItem(redstone_hoe, "redstone_hoe");
        GameRegistry.registerItem(rhodonite_hoe, "rhodonite_hoe");
        GameRegistry.registerItem(ruby_hoe, "ruby_hoe");
        GameRegistry.registerItem(sapphire_hoe, "sapphire_hoe");
        GameRegistry.registerItem(tin_hoe, "tin_hoe");
        GameRegistry.registerItem(titane_hoe, "titane_hoe");
        GameRegistry.registerItem(tyrolium_hoe, "tyrolium_hoe");
        GameRegistry.registerItem(volcanium_hoe, "volcanium_hoe");
        GameRegistry.registerItem(yellorite_hoe, "yellorite_hoe");
    }

}
