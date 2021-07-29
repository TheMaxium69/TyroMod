package fr.tyrolium.maxime.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.*;
import net.minecraft.item.ItemStack;

public class CraftMod {
    public CraftMod() {
    }
    public static void register() {
        //Craft
        GameRegistry.addRecipe(new ItemStack(BlockMod.amethys_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.amethys});
        GameRegistry.addRecipe(new ItemStack(ItemMod.amethys, 1), new Object[]{"###", "###", "###", '#', ItemMod.amethys_nugget});
        GameRegistry.addRecipe(new ItemStack(ItemMod.amethys_nugget, 9), new Object[]{"#", '#', ItemMod.amethys});
        GameRegistry.addRecipe(new ItemStack(ItemMod.amethys, 9), new Object[]{"#", '#', BlockMod.amethys_block});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.amethys_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.amethys});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.amethys_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.amethys});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.amethys_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.amethys});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.amethys_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.amethys});
        GameRegistry.addRecipe(new ItemStack(ToolMod.amethys_sword, 1), new Object[]{"%", "%", "F", '%', ItemMod.amethys, 'F', ToolMod.mercure_sword});
        GameRegistry.addRecipe(new ItemStack(ToolMod.amethys_pickaxe, 1), new Object[]{"%%%", " F ", " F ", '%', ItemMod.amethys, 'F', ToolMod.mercure_pickaxe});
        GameRegistry.addRecipe(new ItemStack(ToolMod.amethys_axe, 1), new Object[]{"%% ", "%F ", " F ", '%', ItemMod.amethys, 'F', ToolMod.mercure_axe});
        GameRegistry.addRecipe(new ItemStack(ToolMod.amethys_shovel, 1), new Object[]{"%", "F", "F", '%', ItemMod.amethys, 'F', ToolMod.mercure_shovel});
        GameRegistry.addRecipe(new ItemStack(ToolMod.amethys_hoe, 1), new Object[]{"%% ", " F ", " F ", '%', ItemMod.amethys, 'F', ToolMod.mercure_hoe});
        //GameRegistry.addRecipe(new ItemStack(CAmethys.amethys_hammer, 1), new Object[]{"%%%", "%#%", " F ", '%', CAmethys.amethys, 'F', CMercure.mercure_hammer, '#', CVolcanium.volcanium_ingot});

        GameRegistry.addRecipe(new ItemStack(BlockMod.aventurine_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.aventurine});
        GameRegistry.addRecipe(new ItemStack(ItemMod.aventurine, 1), new Object[]{"###", "#*#", "###", '#', ItemMod.aventurine_nugget, '*', ItemMod.aventurine_gem});
        GameRegistry.addRecipe(new ItemStack(ItemMod.aventurine_gem, 1), new Object[]{"###", "#*#", "###", '#', ItemMod.aventurine_nugget, '*', ItemMod.tyrolium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.aventurine_nugget, 1), new Object[]{"###", "###", "###", '#', ItemMod.aventurine_powder});
        //GameRegistry.addRecipe(new ItemStack(CAventurine.aventurine_powder, 1), new Object[]{"CVC", "TGT", "CVC", 'C', CCompressed.compressed_full, 'V', CVolcanium.volcanium_block, 'T', CTyrolium.tyrolium_block, 'G', Items.field_151016_H});
        GameRegistry.addRecipe(new ItemStack(ItemMod.aventurine_powder, 9), new Object[]{"#", '#', ItemMod.aventurine_nugget});
        GameRegistry.addRecipe(new ItemStack(ItemMod.aventurine, 9), new Object[]{"#", '#', BlockMod.aventurine_block});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.aventurine_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.aventurine});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.aventurine_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.aventurine});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.aventurine_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.aventurine});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.aventurine_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.aventurine});
        GameRegistry.addRecipe(new ItemStack(ToolMod.aventurine_sword, 1), new Object[]{"M", "M", "F", 'M', ItemMod.aventurine, 'F', ToolMod.mercure_sword});
        GameRegistry.addRecipe(new ItemStack(ToolMod.aventurine_pickaxe, 1), new Object[]{"MMM", " F ", " F ", 'M', ItemMod.aventurine, 'F', ToolMod.mercure_pickaxe});
        GameRegistry.addRecipe(new ItemStack(ToolMod.aventurine_axe, 1), new Object[]{"MM ", "MF ", " F ", 'M', ItemMod.aventurine, 'F', ToolMod.mercure_axe});
        GameRegistry.addRecipe(new ItemStack(ToolMod.aventurine_shovel, 1), new Object[]{"M", "F", "F", 'M', ItemMod.aventurine, 'F', ToolMod.mercure_shovel});
        GameRegistry.addRecipe(new ItemStack(ToolMod.aventurine_hoe, 1), new Object[]{"MM ", " F ", " F ", 'M', ItemMod.aventurine, 'F', ToolMod.mercure_hoe});
        //GameRegistry.addRecipe(new ItemStack(CAventurine.aventurine_hammer, 1), new Object[]{"MMM", "M%M", " F ", 'M', CAventurine.aventurine, 'F', CMercure.mercure_hammer, '%', CVolcanium.volcanium_ingot});

        GameRegistry.addRecipe(new ItemStack(BlockMod.copper_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.copper_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.copper_ingot, 9), new Object[]{"#", '#', BlockMod.copper_block});
        GameRegistry.addRecipe(new ItemStack(ItemMod.copper_ingot, 1), new Object[]{"###", "###", "###", '#', ItemMod.copper_nugget});
        GameRegistry.addRecipe(new ItemStack(ItemMod.copper_nugget, 9), new Object[]{"#", '#', ItemMod.copper_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.copper_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.copper_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.copper_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.copper_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.copper_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.copper_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.copper_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.copper_ingot});
        GameRegistry.addRecipe(new ItemStack(ToolMod.copper_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.copper_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.copper_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.copper_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.copper_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.copper_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.copper_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.copper_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.copper_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.copper_ingot, 'F', Items.stick});

        GameRegistry.addRecipe(new ItemStack(ArmorMod.emerald_helmet, 1), new Object[]{"###", "# #", '#', Items.emerald});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.emerald_chestplate, 1), new Object[]{"# #", "###", "###", '#', Items.emerald});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.emerald_leggings, 1), new Object[]{"###", "# #", "# #", '#', Items.emerald});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.emerald_boots, 1), new Object[]{"# #", "# #", '#', Items.emerald});
        GameRegistry.addRecipe(new ItemStack(ToolMod.emerald_sword, 1), new Object[]{"#", "#", "F", '#', Items.emerald, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.emerald_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', Items.emerald, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.emerald_axe, 1), new Object[]{"## ", "#F ", " F ", '#', Items.emerald, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.emerald_shovel, 1), new Object[]{"#", "F", "F", '#', Items.emerald, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.emerald_hoe, 1), new Object[]{"## ", " F ", " F ", '#', Items.emerald, 'F', Items.stick});

        GameRegistry.addRecipe(new ItemStack(ItemMod.ender_gem, 1), new Object[]{"###", "#*#", "###", '#', ItemMod.enderine_ingot, '*', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(BlockMod.ender_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.ender_gem});
        GameRegistry.addRecipe(new ItemStack(ItemMod.ender_gem, 9), new Object[]{"#", '#', BlockMod.ender_block});
        GameRegistry.addRecipe(new ItemStack(ItemMod.ender_gem, 1), new Object[]{"###", "###", "###", '#', ItemMod.ender_nugget});
        GameRegistry.addRecipe(new ItemStack(ItemMod.ender_nugget, 9), new Object[]{"#", '#', ItemMod.ender_gem});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.ender_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.ender_gem});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.ender_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.ender_gem});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.ender_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.ender_gem});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.ender_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.ender_gem});
        GameRegistry.addRecipe(new ItemStack(ToolMod.ender_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.ender_gem, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.ender_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.ender_gem, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.ender_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.ender_gem, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.ender_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.ender_gem, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.ender_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.ender_gem, 'F', Items.stick});

        GameRegistry.addRecipe(new ItemStack(BlockMod.enderine_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.enderine_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.enderine_ingot, 1), new Object[]{"###", "###", "###", '#', ItemMod.enderine_nugget});
        GameRegistry.addRecipe(new ItemStack(ItemMod.enderine_nugget, 9), new Object[]{"#", '#', ItemMod.enderine_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.enderine_ingot, 9), new Object[]{"#", '#', BlockMod.enderine_block});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.enderine_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.enderine_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.enderine_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.enderine_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.enderine_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.enderine_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.enderine_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.enderine_ingot});
        GameRegistry.addRecipe(new ItemStack(ToolMod.enderine_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.enderine_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.enderine_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.enderine_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.enderine_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.enderine_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.enderine_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.enderine_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.enderine_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.enderine_ingot, 'F', Items.stick});

        GameRegistry.addRecipe(new ItemStack(ItemMod.flint_gem, 1), new Object[]{"##", "##", '#', Items.flint});
        GameRegistry.addRecipe(new ItemStack(Items.flint, 4), new Object[]{"#", '#', ItemMod.flint_gem});
        GameRegistry.addRecipe(new ItemStack(BlockMod.flint_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.flint_gem});
        GameRegistry.addRecipe(new ItemStack(ItemMod.flint_gem, 9), new Object[]{"#", '#', BlockMod.flint_block});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.flint_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.flint_gem});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.flint_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.flint_gem});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.flint_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.flint_gem});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.flint_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.flint_gem});
        GameRegistry.addRecipe(new ItemStack(ToolMod.flint_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.flint_gem, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.flint_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.flint_gem, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.flint_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.flint_gem, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.flint_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.flint_gem, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.flint_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.flint_gem, 'F', Items.stick});

        GameRegistry.addRecipe(new ItemStack(ToolMod.gravel_sword, 1), new Object[]{"#", "#", "F", '#', Blocks.gravel, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.gravel_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', Blocks.gravel, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.gravel_axe, 1), new Object[]{"## ", "#F ", " F ", '#', Blocks.gravel, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.gravel_shovel, 1), new Object[]{"#", "F", "F", '#', Blocks.gravel, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.gravel_hoe, 1), new Object[]{"## ", " F ", " F ", '#', Blocks.gravel, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.gravel_helmet, 1), new Object[]{"###", "# #", '#', Blocks.gravel});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.gravel_chestplate, 1), new Object[]{"# #", "###", "###", '#', Blocks.gravel});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.gravel_leggings, 1), new Object[]{"###", "# #", "# #", '#', Blocks.gravel});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.gravel_boots, 1), new Object[]{"# #", "# #", '#', Blocks.gravel});

        GameRegistry.addRecipe(new ItemStack(BlockMod.guardian_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.guardian_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.guardian_ingot, 1), new Object[]{"###", "#*#", "###", '#', ItemMod.obsidian_ingot, '*', ItemMod.purified_gold_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.guardian_ingot, 9), new Object[]{"#", '#', BlockMod.guardian_block});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.guardian_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.guardian_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.guardian_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.guardian_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.guardian_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.guardian_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.guardian_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.guardian_ingot});
        GameRegistry.addRecipe(new ItemStack(ToolMod.guardian_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.guardian_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.guardian_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.guardian_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.guardian_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.guardian_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.guardian_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.guardian_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.guardian_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.guardian_ingot, 'F', Items.stick});

        GameRegistry.addRecipe(new ItemStack(BlockMod.mercure_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.mercure_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.mercure_ingot, 1), new Object[]{"###", "###", "###", '#', ItemMod.mercure_nugget});
        GameRegistry.addRecipe(new ItemStack(ItemMod.mercure_nugget, 9), new Object[]{"#", '#', ItemMod.mercure_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.mercure_ingot, 9), new Object[]{"#", '#', BlockMod.mercure_block});
        GameRegistry.addRecipe(new ItemStack(ItemMod.mercure_stick, 4), new Object[]{"#", "#", '#', ItemMod.mercure_ingot});
        GameRegistry.addRecipe(new ItemStack(BlockMod.fake_bedrock, 1), new Object[]{"###", "#F#", "###", '#', ItemMod.mercure_nugget, 'F', BlockMod.mercure_block});
        GameRegistry.addRecipe(new ItemStack(ToolMod.mercure_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.mercure_ingot, 'F', ItemMod.mercure_stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.mercure_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.mercure_ingot, 'F', ItemMod.mercure_stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.mercure_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.mercure_ingot, 'F', ItemMod.mercure_stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.mercure_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.mercure_ingot, 'F', ItemMod.mercure_stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.mercure_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.mercure_ingot, 'F', ItemMod.mercure_stick});
        //GameRegistry.addRecipe(new ItemStack(ToolMod.mercure_hammer, 1), new Object[]{"###", "#%#", " F ", '#', CMercure.mercure_ingot, 'F', CMercure.mercure_stick, '%', CObsidianRed.obsidian_red_ingot});

        GameRegistry.addRecipe(new ItemStack(ItemMod.obsidian_ingot, 1), new Object[]{"##", "##", '#', Blocks.obsidian});
        GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, 4), new Object[]{"#", '#', ItemMod.obsidian_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.obsidian_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.obsidian_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.obsidian_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.obsidian_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.obsidian_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.obsidian_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.obsidian_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.obsidian_ingot});
        GameRegistry.addRecipe(new ItemStack(ToolMod.obsidian_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.obsidian_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.obsidian_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.obsidian_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.obsidian_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.obsidian_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.obsidian_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.obsidian_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.obsidian_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.obsidian_ingot, 'F', Items.stick});

        GameRegistry.addRecipe(new ItemStack(ItemMod.obsidian_red_ingot, 1), new Object[]{"##", "##", '#', BlockMod.obsidian_renforced});
        GameRegistry.addRecipe(new ItemStack(BlockMod.obsidian_renforced, 4), new Object[]{"#", '#', ItemMod.obsidian_red_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.obsidian_red_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.obsidian_red_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.obsidian_red_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.obsidian_red_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.obsidian_red_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.obsidian_red_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.obsidian_red_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.obsidian_red_ingot});
        GameRegistry.addRecipe(new ItemStack(ToolMod.obsidian_red_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.obsidian_red_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.obsidian_red_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.obsidian_red_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.obsidian_red_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.obsidian_red_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.obsidian_red_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.obsidian_red_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.obsidian_red_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.obsidian_red_ingot, 'F', Items.stick});

        GameRegistry.addRecipe(new ItemStack(Blocks.stone, 1), new Object[]{"##", "##", '#', ItemMod.stone_nugget});

        GameRegistry.addRecipe(new ItemStack(BlockMod.purified_gold_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.purified_gold_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.purified_gold_ingot, 1), new Object[]{"###", "###", "###", '#', ItemMod.purified_gold_nugget});
        GameRegistry.addRecipe(new ItemStack(ItemMod.purified_gold_nugget, 9), new Object[]{"#", '#', ItemMod.purified_gold_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.purified_gold_ingot, 9), new Object[]{"#", '#', BlockMod.purified_gold_block});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.purified_gold_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.purified_gold_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.purified_gold_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.purified_gold_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.purified_gold_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.purified_gold_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.purified_gold_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.purified_gold_ingot});
        GameRegistry.addRecipe(new ItemStack(ToolMod.purified_gold_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.purified_gold_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.purified_gold_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.purified_gold_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.purified_gold_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.purified_gold_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.purified_gold_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.purified_gold_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.purified_gold_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.purified_gold_ingot, 'F', Items.stick});

        GameRegistry.addRecipe(new ItemStack(ItemMod.redstone_ingot, 1), new Object[]{"##", "##", '#', Items.redstone});
        GameRegistry.addRecipe(new ItemStack(ItemMod.redstone_stick, 1), new Object[]{"#", "#", '#', ItemMod.redstone_ingot});
        GameRegistry.addRecipe(new ItemStack(Items.redstone, 9), new Object[]{"#", '#', ItemMod.redstone_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.redstone_helmet, 1), new Object[]{"###", "# #", '#', Items.redstone});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.redstone_chestplate, 1), new Object[]{"# #", "###", "###", '#', Items.redstone});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.redstone_leggings, 1), new Object[]{"###", "# #", "# #", '#', Items.redstone});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.redstone_boots, 1), new Object[]{"# #", "# #", '#', Items.redstone});
        GameRegistry.addRecipe(new ItemStack(ToolMod.redstone_sword, 1), new Object[]{"#", "#", "F", '#', Items.redstone, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.redstone_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', Items.redstone, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.redstone_axe, 1), new Object[]{"## ", "#F ", " F ", '#', Items.redstone, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.redstone_shovel, 1), new Object[]{"#", "F", "F", '#', Items.redstone, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.redstone_hoe, 1), new Object[]{"## ", " F ", " F ", '#', Items.redstone, 'F', Items.stick});


        GameRegistry.addRecipe(new ItemStack(BlockMod.rhodonite_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.rhodonite});
        GameRegistry.addRecipe(new ItemStack(ItemMod.rhodonite, 1), new Object[]{"###", "###", "###", '#', ItemMod.rhodonite_nugget});
        GameRegistry.addRecipe(new ItemStack(ItemMod.rhodonite_nugget, 9), new Object[]{"#", '#', ItemMod.rhodonite});
        GameRegistry.addRecipe(new ItemStack(ItemMod.rhodonite, 9), new Object[]{"#", '#', BlockMod.rhodonite_block});
        GameRegistry.addRecipe(new ItemStack(BlockMod.obsidian_renforced, 1), new Object[]{"CCC", "C#C", "CCC", 'C', ItemMod.rhodonite_nugget, '#', Blocks.obsidian});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.rhodonite_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.rhodonite});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.rhodonite_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.rhodonite});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.rhodonite_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.rhodonite});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.rhodonite_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.rhodonite});
        GameRegistry.addRecipe(new ItemStack(ToolMod.rhodonite_sword, 1), new Object[]{"$", "$", "F", '$', ItemMod.rhodonite, 'F', ToolMod.mercure_sword});
        GameRegistry.addRecipe(new ItemStack(ToolMod.rhodonite_pickaxe, 1), new Object[]{"$$$", " F ", " F ", '$', ItemMod.rhodonite, 'F', ToolMod.mercure_pickaxe});
        GameRegistry.addRecipe(new ItemStack(ToolMod.rhodonite_axe, 1), new Object[]{"$$ ", "$F ", " F ", '$', ItemMod.rhodonite, 'F', ToolMod.mercure_axe});
        GameRegistry.addRecipe(new ItemStack(ToolMod.rhodonite_shovel, 1), new Object[]{"$", "F", "F", '$', ItemMod.rhodonite, 'F', ToolMod.mercure_shovel});
        GameRegistry.addRecipe(new ItemStack(ToolMod.rhodonite_hoe, 1), new Object[]{"$$ ", " F ", " F ", '$', ItemMod.rhodonite, 'F', ToolMod.mercure_hoe});
        //GameRegistry.addRecipe(new ItemStack(CRhodonite.rhodonite_hammer, 1), new Object[]{"$$$", "$#$", " F ", '$', CRhodonite.rhodonite, 'F', CMercure.mercure_hammer, '#', CVolcanium.volcanium_ingot});

        GameRegistry.addRecipe(new ItemStack(BlockMod.ruby_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.ruby});
        GameRegistry.addRecipe(new ItemStack(ItemMod.ruby, 9), new Object[]{"#", '#', BlockMod.ruby_block});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.ruby_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.ruby});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.ruby_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.ruby});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.ruby_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.ruby});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.ruby_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.ruby});
        GameRegistry.addRecipe(new ItemStack(ToolMod.ruby_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.ruby, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.ruby_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.ruby, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.ruby_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.ruby, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.ruby_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.ruby, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.ruby_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.ruby, 'F', Items.stick});

        GameRegistry.addRecipe(new ItemStack(BlockMod.sapphire_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.sapphire});
        GameRegistry.addRecipe(new ItemStack(ItemMod.sapphire, 9), new Object[]{"#", '#', BlockMod.sapphire_block});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.sapphire_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.sapphire});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.sapphire_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.sapphire});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.sapphire_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.sapphire});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.sapphire_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.sapphire});
        GameRegistry.addRecipe(new ItemStack(ToolMod.sapphire_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.sapphire, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.sapphire_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.sapphire, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.sapphire_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.sapphire, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.sapphire_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.sapphire, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.sapphire_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.sapphire, 'F', Items.stick});

        GameRegistry.addRecipe(new ItemStack(ArmorMod.stone_helmet, 1), new Object[]{"###", "# #", '#', Blocks.stone});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.stone_chestplate, 1), new Object[]{"# #", "###", "###", '#', Blocks.stone});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.stone_leggings, 1), new Object[]{"###", "# #", "# #", '#', Blocks.stone});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.stone_boots, 1), new Object[]{"# #", "# #", '#', Blocks.stone});

        GameRegistry.addRecipe(new ItemStack(BlockMod.tin_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.tin_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.tin_ingot, 9), new Object[]{"#", '#', BlockMod.tin_block});
        GameRegistry.addRecipe(new ItemStack(ItemMod.tin_ingot, 1), new Object[]{"###", "###", "###", '#', ItemMod.tin_nugget});
        GameRegistry.addRecipe(new ItemStack(ItemMod.tin_nugget, 9), new Object[]{"#", '#', ItemMod.tin_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.tin_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.tin_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.tin_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.tin_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.tin_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.tin_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.tin_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.tin_ingot});
        GameRegistry.addRecipe(new ItemStack(ToolMod.tin_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.tin_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.tin_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.tin_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.tin_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.tin_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.tin_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.tin_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.tin_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.tin_ingot, 'F', Items.stick});

        GameRegistry.addRecipe(new ItemStack(BlockMod.titane_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.titane_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.titane_ingot, 1), new Object[]{"###", "###", "###", '#', ItemMod.titane_nugget});
        GameRegistry.addRecipe(new ItemStack(ItemMod.titane_nugget, 9), new Object[]{"#", '#', ItemMod.titane_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.titane_ingot, 9), new Object[]{"#", '#', BlockMod.titane_block});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.titane_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.titane_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.titane_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.titane_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.titane_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.titane_ingot});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.titane_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.titane_ingot});
        GameRegistry.addRecipe(new ItemStack(ToolMod.titane_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.titane_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.titane_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.titane_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.titane_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.titane_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.titane_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.titane_ingot, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.titane_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.titane_ingot, 'F', Items.stick});

        GameRegistry.addRecipe(new ItemStack(BlockMod.tyrolium_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.tyrolium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.tyrolium, 1), new Object[]{"###", "###", "###", '#', ItemMod.tyrolium_nugget});
        GameRegistry.addRecipe(new ItemStack(ItemMod.tyrolium_nugget, 9), new Object[]{"#", '#', ItemMod.tyrolium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.tyrolium, 9), new Object[]{"#", '#', BlockMod.tyrolium_block});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.tyrolium_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.tyrolium});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.tyrolium_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.tyrolium});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.tyrolium_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.tyrolium});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.tyrolium_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.tyrolium});
        GameRegistry.addRecipe(new ItemStack(ToolMod.tyrolium_sword, 1), new Object[]{"#", "#", "F", '#', ItemMod.tyrolium, 'F', ToolMod.mercure_sword});
        GameRegistry.addRecipe(new ItemStack(ToolMod.tyrolium_pickaxe, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.tyrolium, 'F', ToolMod.mercure_pickaxe});
        GameRegistry.addRecipe(new ItemStack(ToolMod.tyrolium_axe, 1), new Object[]{"## ", "#F ", " F ", '#', ItemMod.tyrolium, 'F', ToolMod.mercure_axe});
        GameRegistry.addRecipe(new ItemStack(ToolMod.tyrolium_shovel, 1), new Object[]{"#", "F", "F", '#', ItemMod.tyrolium, 'F', ToolMod.mercure_shovel});
        GameRegistry.addRecipe(new ItemStack(ToolMod.tyrolium_hoe, 1), new Object[]{"## ", " F ", " F ", '#', ItemMod.tyrolium, 'F', ToolMod.mercure_hoe});
        //GameRegistry.addRecipe(new ItemStack(CTyrolium.tyrolium_hammer, 1), new Object[]{"###", "#%#", " F ", '#', CTyrolium.tyrolium, 'F', CMercure.mercure_hammer, '%', CVolcanium.volcanium_ingot});
        //GameRegistry.addRecipe(new ItemStack(CTyrolium.tyrolium_apple, 1), new Object[]{"###", "#*#", "###", '#', CTyrolium.tyrolium, '*', Items.field_151034_e});

        GameRegistry.addRecipe(new ItemStack(BlockMod.volcanium_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.volcanium_ingot});
        GameRegistry.addRecipe(new ItemStack(BlockMod.fake_lava, 1), new Object[]{"###", "###", "###", '#', ItemMod.volcanium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.volcanium_ingot, 1), new Object[]{"##", "##", '#', ItemMod.volcanium});
        GameRegistry.addRecipe(new ItemStack(ItemMod.volcanium, 4), new Object[]{"#", '#', ItemMod.volcanium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.volcanium_ingot, 9), new Object[]{"#", '#', BlockMod.volcanium_block});
        GameRegistry.addRecipe(new ItemStack(ItemMod.volcanium, 9), new Object[]{"#", '#', BlockMod.fake_lava});
        GameRegistry.addRecipe(new ItemStack(BlockMod.volcanium_cave, 4), new Object[]{"###", "#*#", "###", '#', ItemMod.volcanium, '*', Blocks.glass});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.volcanium_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.volcanium});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.volcanium_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.volcanium});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.volcanium_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.volcanium});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.volcanium_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.volcanium});
        GameRegistry.addRecipe(new ItemStack(ToolMod.volcanium_sword, 1), new Object[]{"V", "V", "F", 'V', ItemMod.volcanium, 'F', ItemMod.mercure_stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.volcanium_pickaxe, 1), new Object[]{"VVV", " F ", " F ", 'V', ItemMod.volcanium, 'F', ItemMod.mercure_stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.volcanium_axe, 1), new Object[]{"VV ", "VF ", " F ", 'V', ItemMod.volcanium, 'F', ItemMod.mercure_stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.volcanium_shovel, 1), new Object[]{"V", "F", "F", 'V', ItemMod.volcanium, 'F', ItemMod.mercure_stick});
        GameRegistry.addRecipe(new ItemStack(ToolMod.volcanium_hoe, 1), new Object[]{"VV ", " F ", " F ", 'V', ItemMod.volcanium, 'F', ItemMod.mercure_stick});
        //GameRegistry.addRecipe(new ItemStack(CVolcanium.volcanium_apple, 1), new Object[]{"###", "#*#", "###", '#', ItemMod.volcanium_ingot, '*', Items.field_151034_e});

        GameRegistry.addRecipe(new ItemStack(BlockMod.yellorite_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.yellorite});
        GameRegistry.addRecipe(new ItemStack(ItemMod.yellorite, 1), new Object[]{"###", "###", "###", '#', ItemMod.yellorite_nugget});
        GameRegistry.addRecipe(new ItemStack(ItemMod.yellorite_nugget, 9), new Object[]{"#", '#', ItemMod.yellorite});
        GameRegistry.addRecipe(new ItemStack(ItemMod.yellorite, 9), new Object[]{"#", '#', BlockMod.yellorite_block});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.yellorite_helmet, 1), new Object[]{"###", "# #", '#', ItemMod.yellorite});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.yellorite_chestplate, 1), new Object[]{"# #", "###", "###", '#', ItemMod.yellorite});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.yellorite_leggings, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.yellorite});
        GameRegistry.addRecipe(new ItemStack(ArmorMod.yellorite_boots, 1), new Object[]{"# #", "# #", '#', ItemMod.yellorite});
        GameRegistry.addRecipe(new ItemStack(ToolMod.yellorite_sword, 1), new Object[]{"Y", "Y", "F", 'Y', ItemMod.yellorite, 'F', ToolMod.mercure_sword});
        GameRegistry.addRecipe(new ItemStack(ToolMod.yellorite_pickaxe, 1), new Object[]{"YYY", " F ", " F ", 'Y', ItemMod.yellorite, 'F', ToolMod.mercure_pickaxe});
        GameRegistry.addRecipe(new ItemStack(ToolMod.yellorite_axe, 1), new Object[]{"YY ", "YF ", " F ", 'Y', ItemMod.yellorite, 'F', ToolMod.mercure_axe});
        GameRegistry.addRecipe(new ItemStack(ToolMod.yellorite_shovel, 1), new Object[]{"Y", "F", "F", 'Y', ItemMod.yellorite, 'F', ToolMod.mercure_shovel});
        GameRegistry.addRecipe(new ItemStack(ToolMod.yellorite_hoe, 1), new Object[]{"YY ", " F ", " F ", 'Y', ItemMod.yellorite, 'F', ToolMod.mercure_hoe});
        //GameRegistry.addRecipe(new ItemStack(ToolMod.yellorite_hammer, 1), new Object[]{"YYY", "Y#Y", " F ", 'Y', ItemMod.yellorite, 'F', CMercure.mercure_hammer, '#', CVolcanium.volcanium_ingot});

        //Furnace
        GameRegistry.addSmelting(BlockMod.amethys_ore, new ItemStack(ItemMod.amethys, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.copper_ore, new ItemStack(ItemMod.copper_ingot, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.enderine_ore, new ItemStack(ItemMod.enderine_ingot, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.mercure_ore, new ItemStack(ItemMod.mercure_ingot, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.dirt_ore, new ItemStack(ItemMod.stone_nugget, 2), 1.0F);
        //GameRegistry.addSmelting(Items.field_151078_bh, new ItemStack(ItemMod.seasoned_flesh, 1), 1.0F);
        GameRegistry.addSmelting(Items.gold_ingot, new ItemStack(ItemMod.purified_gold_ingot, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.rhodonite_ore, new ItemStack(ItemMod.rhodonite, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.ruby_ore, new ItemStack(ItemMod.ruby, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.sapphire_ore, new ItemStack(ItemMod.sapphire, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.tin_ore, new ItemStack(ItemMod.tin_ingot, 1), 1.0F);
        GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(ItemMod.titane_ingot, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.tyrolium_ore, new ItemStack(ItemMod.tyrolium, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.volcanium_ore, new ItemStack(ItemMod.volcanium, 1), 1.0F);
        GameRegistry.addSmelting(BlockMod.yellorite_ore, new ItemStack(ItemMod.yellorite, 1), 1.0F);


    }
}
