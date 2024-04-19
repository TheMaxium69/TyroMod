package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.blocks.FusionBlock;
import fr.tyrolium.tyromod.generate.BlockGenerateClass;
import fr.tyrolium.tyromod.global.DefaultBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Global.MODID)
public class BlocksMod {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    /* MANUEL */
    public static Block fusion_block = new FusionBlock("fusion_block", Material.ANVIL);

    /* GENERATION */
    public static BlockGenerateClass[] BlockList = {

            /*TYROLIUM*/
            new BlockGenerateClass("tyrolium", "ore", false, "1", "IUM"),
            new BlockGenerateClass("tyrolium", "block", false, "1", "IUM"),
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
            new BlockGenerateClass("mercure", "ore", false, "1"),
            new BlockGenerateClass("mercure", "block", false, "1"),
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
            new BlockGenerateClass("volcanium", "ore", false, "1", "IUM"),
            new BlockGenerateClass("volcanium", "block", false, "1", "IUM"),
            new BlockGenerateClass("volcanium_cave", "classic", false, "1"),
            new BlockGenerateClass("fake_lava", "classic", false, "1"),

            /*ADAMANTIUM*/
            new BlockGenerateClass("adamantium", "ore", false, "3", "IUM"),
            new BlockGenerateClass("adamantium", "block", false, "3", "IUM"),

            /*ARGONITE*/
            new BlockGenerateClass("argonite", "block", false, "3", "3")
    };



    public static DefaultBlock[] blocks;

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

            }
        }

    }

}
