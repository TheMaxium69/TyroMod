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
            new BlockGenerateClass("tyrolium", "ore", false),
            new BlockGenerateClass("tyrolium", "block", false),
            new BlockGenerateClass("rhodonite", "ore", false),
            new BlockGenerateClass("rhodonite", "block", false),
            new BlockGenerateClass("amethys", "ore", false),
            new BlockGenerateClass("amethys", "block", false),
            new BlockGenerateClass("yellorite", "ore", false),
            new BlockGenerateClass("yellorite", "block", false),
            new BlockGenerateClass("adamentium", "ore", false),
            new BlockGenerateClass("adamentium", "block", false),
            new BlockGenerateClass("argonite", "ore", false),
            new BlockGenerateClass("argonite", "block", false)
    };



    public static DefaultBlock[] blocks;

    static {

        blocks = new DefaultBlock[BlockList.length];

        for (int i = 0; i < BlockList.length; i++) {

            if (BlockList[i].getType() == "classic") {
                blocks[i] = new DefaultBlock(BlockList[i].getName(), BlockList[i].getMaterial());
            } else {
                blocks[i] = new DefaultBlock(BlockList[i].getName() + BlockList[i].getTypeName(), BlockList[i].getMaterial());
            }

        }

    }

}
