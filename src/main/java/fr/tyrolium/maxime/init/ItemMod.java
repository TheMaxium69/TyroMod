package fr.tyrolium.maxime.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.tyrolium.maxime.item.*;
import net.minecraft.item.Item;

public class ItemMod {
    public static Item amethys, amethys_nugget;
    public static Item aventurine, aventurine_nugget, aventurine_powder, aventurine_gem;
    public static Item copper_ingot, copper_nugget;
    public static Item ender_gem, ender_nugget;
    public static Item enderine_ingot, enderine_nugget;
    public static Item flint_gem;
    public static Item guardian_ingot;
    public static Item mercure_ingot, mercure_nugget, mercure_stick;
    public static Item obsidian_ingot;
    public static Item obsidian_red_ingot;
    public static Item stone_nugget;
    public static Item purified_gold_nugget, purified_gold_ingot;
    public static Item redstone_ingot, redstone_stick;
    public static Item rhodonite, rhodonite_nugget;
    public static Item ruby;
    public static Item sapphire;
    public static Item tin_ingot, tin_nugget;
    public static Item titane_ingot, titane_nugget;
    public static Item tyrolium, tyrolium_nugget;
    public static Item volcanium, volcanium_ingot;
    public static Item yellorite, yellorite_nugget;

    public ItemMod(){
    }

    public static void init() {
        amethys = new Amethys();
        amethys_nugget = new AmethysNugget();
        aventurine = new Aventurine();
        aventurine_gem = new AventurineGem();
        aventurine_nugget = new AventurineNugget();
        aventurine_powder = new AventurinePowder();
        copper_ingot = new CopperIngot();
        copper_nugget = new CopperNugget();
        ender_gem = new EnderGem();
        ender_nugget = new EnderNugget();
        enderine_ingot = new EnderineIngot();
        enderine_nugget = new EnderineNugget();
        flint_gem = new FlintGem();
        guardian_ingot = new GuardianIngot();
        mercure_ingot = new MercureIngot();
        mercure_nugget = new MercureNugget();
        mercure_stick = new MercureStick();
        obsidian_ingot = new ObsidianIngot();
        obsidian_red_ingot = new ObsidianRedIngot();
        stone_nugget = new StoneNugget();
        purified_gold_ingot = new PurifiedGoldIngot();
        purified_gold_nugget = new PurifiedGoldNugget();
        redstone_ingot = new RedstoneIngot();
        redstone_stick = new RedstoneStick();
        rhodonite = new Rhodonite();
        rhodonite_nugget = new RhodoniteNugget();
        ruby = new Ruby();
        sapphire = new Sapphire();
        tin_ingot = new TinIngot();
        tin_nugget = new TinNugget();
        titane_ingot = new TitaneIngot();
        titane_nugget = new TitaneNugget();
        tyrolium = new Tyrolium();
        tyrolium_nugget = new TyroliumNugget();
        volcanium = new Volcanium();
        volcanium_ingot = new VolcaniumIngot();
        yellorite = new Yellorite();
        yellorite_nugget = new YelloriteNugget();
    }

    public static void register() {
        GameRegistry.registerItem(amethys, "amethys");
        GameRegistry.registerItem(amethys_nugget, "amethys_nugget");
        GameRegistry.registerItem(aventurine, "aventurine");
        GameRegistry.registerItem(aventurine_gem, "aventurine_gem");
        GameRegistry.registerItem(aventurine_nugget, "aventurine_nugget");
        GameRegistry.registerItem(aventurine_powder, "aventurine_powder");
        GameRegistry.registerItem(copper_ingot, "copper_ingot");
        GameRegistry.registerItem(copper_nugget, "copper_nugget");
        GameRegistry.registerItem(ender_gem, "ender_gem");
        GameRegistry.registerItem(enderine_ingot, "enderine_ingot");
        GameRegistry.registerItem(enderine_nugget, "enderine_nugget");
        GameRegistry.registerItem(ender_nugget, "ender_nugget");
        GameRegistry.registerItem(flint_gem, "flint_gem");
        GameRegistry.registerItem(guardian_ingot, "guardian_ingot");
        GameRegistry.registerItem(mercure_ingot, "mercure_ingot");
        GameRegistry.registerItem(mercure_nugget, "mercure_nugget");
        GameRegistry.registerItem(mercure_stick, "mercure_stick");
        GameRegistry.registerItem(obsidian_ingot, "obsidian_ingot");
        GameRegistry.registerItem(obsidian_red_ingot, "obsidian_red_ingot");
        GameRegistry.registerItem(purified_gold_ingot, "purified_gold_ingot");
        GameRegistry.registerItem(purified_gold_nugget, "purified_gold_nugget");
        GameRegistry.registerItem(redstone_ingot, "redstone_ingot");
        GameRegistry.registerItem(redstone_stick, "redstone_stick");
        GameRegistry.registerItem(rhodonite, "rhodonite");
        GameRegistry.registerItem(rhodonite_nugget, "rhodonite_nugget");
        GameRegistry.registerItem(ruby, "ruby");
        GameRegistry.registerItem(sapphire, "sapphire");
        GameRegistry.registerItem(stone_nugget, "stone_nugget");
        GameRegistry.registerItem(tin_ingot, "tin_ingot");
        GameRegistry.registerItem(tin_nugget, "tin_nugget");
        GameRegistry.registerItem(titane_ingot, "titane_ingot");
        GameRegistry.registerItem(titane_nugget, "titane_nugget");
        GameRegistry.registerItem(tyrolium, "tyrolium");
        GameRegistry.registerItem(tyrolium_nugget, "tyrolium_nugget");
        GameRegistry.registerItem(volcanium, "volcanium");
        GameRegistry.registerItem(volcanium_ingot, "volcanium_ingot");
        GameRegistry.registerItem(yellorite, "yellorite");
        GameRegistry.registerItem(yellorite_nugget, "yellorite_nugget");
    }
}
