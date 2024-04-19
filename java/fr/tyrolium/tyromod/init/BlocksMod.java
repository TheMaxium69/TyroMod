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
            new BlockGenerateClass("tyrolium", "ore", false),
            new BlockGenerateClass("tyrolium", "block", false),
            new BlockGenerateClass("tyrolium", "command_block", false),

            /*RHODONITE*/
            new BlockGenerateClass("rhodonite", "ore", false),
            new BlockGenerateClass("rhodonite", "block", false),

            /*AMETHYS*/
            new BlockGenerateClass("amethys", "ore", false),
            new BlockGenerateClass("amethys", "block", false),

            /*YELLORITE*/
            new BlockGenerateClass("yellorite", "ore", false),
            new BlockGenerateClass("yellorite", "block", false),

            /*AVENTURINE*/
            new BlockGenerateClass("aventurine", "block", false),

            /*COPPER*/
            new BlockGenerateClass("copper", "ore", false),
            new BlockGenerateClass("copper", "block", false),

            /*ENDER*/
            new BlockGenerateClass("ender", "block", false),

            /*ENDERINE*/
            new BlockGenerateClass("enderine", "ore", false),
            new BlockGenerateClass("enderine", "block", false),

            /*FLINT*/
            new BlockGenerateClass("flint", "block", false),

            /*GUARDIAN*/
            new BlockGenerateClass("guardian", "block", false),

            /*MERCURE*/
            new BlockGenerateClass("mercure", "ore", false),
            new BlockGenerateClass("mercure", "block", false),
            new BlockGenerateClass("fake_bedrock", "classic", false),

            /*OBSIDIAN RED*/
            new BlockGenerateClass("obsidian_renforced", "classic", false),

            /*PURIFIED GOLD*/
            new BlockGenerateClass("purified_gold", "block", false),

            /*RUBY*/
            new BlockGenerateClass("ruby", "ore", false),
            new BlockGenerateClass("ruby", "block", false),

            /*SAPPHIRE*/
            new BlockGenerateClass("sapphire", "ore", false),
            new BlockGenerateClass("sapphire", "block", false),

            /*TIN*/
            new BlockGenerateClass("tin", "ore", false),
            new BlockGenerateClass("tin", "block", false),

            /*TIN*/
            new BlockGenerateClass("titane", "block", false),

            /*VOLCANIUM*/
            new BlockGenerateClass("volcanium", "ore", false),
            new BlockGenerateClass("volcanium", "block", false),
            new BlockGenerateClass("volcanium_cave", "classic", false),
            new BlockGenerateClass("fake_lava", "classic", false),

            /*ADAMANTIUM*/
            new BlockGenerateClass("adamantium", "ore", false),
            new BlockGenerateClass("adamantium", "block", false),

            /*ARGONITE*/
            new BlockGenerateClass("argonite", "block", false)
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
                        blocks[i] = new DefaultBlock(BlockList[i].getName(), BlockList[i].getMaterial());
                    }
                } else {
                    blocks[i] = new DefaultBlock(BlockList[i].getName() + BlockList[i].getTypeName(), BlockList[i].getMaterial());
                }

            } else {
            /* custom className*/

            }
        }

    }

}
