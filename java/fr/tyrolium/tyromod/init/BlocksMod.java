package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.blocks.FusionBlock;
import fr.tyrolium.tyromod.blocks.TyroliumBlock;
import fr.tyrolium.tyromod.blocks.TyroliumOre;
import fr.tyrolium.tyromod.generate.BlockGenerateClass;
import fr.tyrolium.tyromod.generate.ItemGenerateClass;
import fr.tyrolium.tyromod.global.DefaultBlock;
import fr.tyrolium.tyromod.items.Tyrolium;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mod.EventBusSubscriber(modid = Global.MODID)
public class BlocksMod {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    /* MANUEL */
//    public static Block fusion_block = new FusionBlock("fusion_block", Material.ANVIL);

    /* GENERATION */
    public static BlockGenerateClass[] BlockList = {

            /*TYROLIUM*/
            new BlockGenerateClass("tyrolium", "ore", true, "1", "IUM"),
            new BlockGenerateClass("tyrolium", "block", true, "1", "IUM"),
            new BlockGenerateClass("tyrolium", "command_block", false, "1"),

            /*RHODONITE*/
            new BlockGenerateClass("rhodonite", "ore", false, "1", "3"),
            new BlockGenerateClass("rhodonite", "block", false, "1", "3"),

            /*AMETHYS*/
            new BlockGenerateClass("amethys", "ore", false, "1", "2"),
            new BlockGenerateClass("amethys", "block", false, "1", "2"),

            /*YELLORITE*/
            new BlockGenerateClass("yellorite", "ore", false, "1", "2"),
            new BlockGenerateClass("yellorite", "block", false, "1", "2"),

            /*AVENTURINE*/
            new BlockGenerateClass("aventurine", "block", false, "1", "3"),

            /*COPPER*/
            new BlockGenerateClass("copper", "ore", false, "1", "1"),
            new BlockGenerateClass("copper", "block", false, "1", "1"),

            /*ENDER*/
            new BlockGenerateClass("ender", "block", false, "1", "3"),

            /*ENDERINE*/
            new BlockGenerateClass("enderine", "ore", false, "1", "1"),
            new BlockGenerateClass("enderine", "block", false, "1", "1"),

            /*FLINT*/
            new BlockGenerateClass("flint", "block", false, "V1", "1"),

            /*GUARDIAN*/
            new BlockGenerateClass("guardian", "block", false, "1", "3"),

            /*MERCURE*/
            new BlockGenerateClass("mercure", "ore", false, "1", "0"),
            new BlockGenerateClass("mercure", "block", false, "1", "0"),
            new BlockGenerateClass("fake_bedrock", "classic", false, "1"),

            /*OBSIDIAN RED*/
            new BlockGenerateClass("obsidian_renforced", "classic", false, "1", "3"),

            /*PURIFIED GOLD*/
            new BlockGenerateClass("purified_gold", "block", false, "1", "2"),

            /*RUBY*/
            new BlockGenerateClass("ruby", "ore", false, "1", "2"),
            new BlockGenerateClass("ruby", "block", false, "1", "2"),

            /*SAPPHIRE*/
            new BlockGenerateClass("sapphire", "ore", false, "1", "2"),
            new BlockGenerateClass("sapphire", "block", false, "1", "2"),

            /*TIN*/
            new BlockGenerateClass("tin", "ore", false, "1", "1"),
            new BlockGenerateClass("tin", "block", false, "1", "1"),

            /*TITANE*/
            new BlockGenerateClass("titane", "block", false, "1", "2"),

            /*VOLCANIUM*/
            new BlockGenerateClass("volcanium", "block", false, "1", "IUM"),
            new BlockGenerateClass("volcanium_cave", "classic", false, "1"),
            new BlockGenerateClass("fake_lava", "classic", false, "1"),

            /*OTHER*/
            new BlockGenerateClass("fusion_block", "classic", true, "3"),

            /*ADAMANTIUM*/
            new BlockGenerateClass("adamantium", "ore", false, "3", "IUM"),
            new BlockGenerateClass("adamantium", "block", false, "3", "IUM"),

            /*ARGONITE*/
            new BlockGenerateClass("argonite", "block", false, "3", "3"),

            /*ASHSTONE*/
            new BlockGenerateClass("ashstone", "block", false, "3", "3"),

            /*AURORE*/
            new BlockGenerateClass("aurore", "block", false, "3", "2"),

            /*BRONZE*/
            new BlockGenerateClass("bronze", "block", false, "3", "2"),

            /*DRACONITE*/
            new BlockGenerateClass("draconite", "block", false, "3", "3"),

            /*DRACONIUM*/
            new BlockGenerateClass("draconium", "block", false, "3", "IUM"),

            /*DRAGONSTONE*/
            new BlockGenerateClass("dragonstone", "block", false, "3", "3"),

            /*FYRITE*/
            new BlockGenerateClass("fyrite", "block", false, "3", "3"),

            /*ILLUMENITE*/
            new BlockGenerateClass("illumenite", "block", false, "3", "3"),

            /*JADE*/
            new BlockGenerateClass("jade", "ore", false, "3", "3"),
            new BlockGenerateClass("jade", "block", false, "3", "3"),

            /*MALACHITE*/
            new BlockGenerateClass("malachite", "block", false, "3", "3"),

            /*MYTHRIL*/
            new BlockGenerateClass("mythril", "ore", false, "3", "2"),
            new BlockGenerateClass("mythril", "block", false, "3", "2"),

            /*ONIX*/
            new BlockGenerateClass("onix", "block", false, "3", "3"),

            /*SINISITE*/
            new BlockGenerateClass("sinisite", "block", false, "3", "3"),

            /*STEEL*/
            new BlockGenerateClass("steel", "block", false, "3", "2"),

            /*STEELIUM*/
            new BlockGenerateClass("steelium", "block", false, "3", "IUM"),

            /*THYRIUM*/
            new BlockGenerateClass("thyrium", "block", false, "3", "IUM"),

            /*THYRIUM*/
            new BlockGenerateClass("sunstone", "block", false, "3", "0"),

            /*NETHERITE*/
            new BlockGenerateClass("netherite", "ore", false, "V", "3"),
            new BlockGenerateClass("netherite", "block", false, "V", "3"),

            /*VOLCANITE*/
            new BlockGenerateClass("volcanite", "ore", false, "3", "2"),
            new BlockGenerateClass("volcanite", "block", false, "3", "2"),
    };



    public static DefaultBlock[] blocks;
    private static final Map<String, Block> blockCustomClass = new HashMap<>();

    static {

        blocks = new DefaultBlock[BlockList.length];

        for (int i = 0; i < BlockList.length; i++) {

//            System.out.println("New Block : " + BlockList[i].getName() + BlockList[i].getTypeName() + " (" + i + ") ");

            /* className NoCustom */
            if (!BlockList[i].getClassName()) {

                if (BlockList[i].getType() == "classic") {
                    if (BlockList[i].isOre() == "true") {
                        blocks[i] = new DefaultBlock(BlockList[i].getName(), BlockList[i].getMaterial(), BlockList[i].getModVersion(), BlockList[i].getOreTier(), "b" + i);
                    } else {
                        blocks[i] = new DefaultBlock(BlockList[i].getName(), BlockList[i].getMaterial(), BlockList[i].getModVersion(), "b" + i);
                    }
                } else {

                    if (BlockList[i].isOre() == "true") {
                        blocks[i] = new DefaultBlock(BlockList[i].getName() + BlockList[i].getTypeName(), BlockList[i].getMaterial(), BlockList[i].getModVersion(), BlockList[i].getOreTier(), "b" + i);
                    } else {
                        blocks[i] = new DefaultBlock(BlockList[i].getName() + BlockList[i].getTypeName(), BlockList[i].getMaterial(), BlockList[i].getModVersion(), "b" + i);
                    }

                }

            } else {
            /* custom className*/

                if (BlockList[i].getName() == "tyrolium" && BlockList[i].getType() == "block") {
                    blockCustomClass.put("bc"+i, new TyroliumBlock(BlockList[i].getName() + BlockList[i].getTypeName(), BlockList[i].getMaterial(), BlockList[i].getModVersion(), BlockList[i].getOreTier(), "bc" + i));
                }
                if (BlockList[i].getName() == "tyrolium" && BlockList[i].getType() == "ore") {
                    blockCustomClass.put("bc"+i, new TyroliumOre(BlockList[i].getName() + BlockList[i].getTypeName(), BlockList[i].getMaterial(), BlockList[i].getModVersion(), BlockList[i].getOreTier(), "bc" + i));
                }
                if (BlockList[i].getName() == "fusion_block" && BlockList[i].getType() == "classic") {
                    blockCustomClass.put("bc"+i, new FusionBlock(BlockList[i].getName(), BlockList[i].getMaterial(), BlockList[i].getModVersion(), "bc" + i));
                }

            }
        }

    }

    public static Block getBlockCustomClass(String nameBlock) {
        return blockCustomClass.get(nameBlock);
    }

}
