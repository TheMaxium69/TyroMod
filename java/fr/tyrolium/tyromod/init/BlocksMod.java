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
            new BlockGenerateClass("tyrolium_ore", false),
            new BlockGenerateClass("tyrolium_block", false),
            new BlockGenerateClass("rhodonite_ore", false),
            new BlockGenerateClass("rhodonite_block", false),
            new BlockGenerateClass("amethys_ore", false),
            new BlockGenerateClass("amethys_block", false),
            new BlockGenerateClass("yellorite_ore", false),
            new BlockGenerateClass("yellorite_block", false),
            new BlockGenerateClass("adamentium_ore", false),
            new BlockGenerateClass("adamentium_block", false),
            new BlockGenerateClass("argonite_ore", false),
            new BlockGenerateClass("argonite_block", false)
    };



    public static DefaultBlock[] blocks;

    static {

        blocks = new DefaultBlock[BlockList.length];

        for (int i = 0; i < BlockList.length; i++) {

            if (BlockList[i].getName().contains("_ore")) {
                blocks[i] = new DefaultBlock(BlockList[i].getName(), Material.ROCK);
            } else if (BlockList[i].getName().contains("_block")) {
                blocks[i] = new DefaultBlock(BlockList[i].getName(), Material.IRON);
            } else {
                blocks[i] = new DefaultBlock(BlockList[i].getName(), Material.AIR);
            }

        }

    }

}
