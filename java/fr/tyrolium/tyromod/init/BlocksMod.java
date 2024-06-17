package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.blocks.*;
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
    public static Block ELEVATOR_BLOCK = new ElevatorBlock("elevator_block", Material.ANVIL, "3", "cb999999");

    /* GENERATION */
    public static BlockGenerateClass[] BlockList = {

            /*TYROLIUM*/
            new BlockGenerateClass("tyrolium", "ore", true, "1", "IUM"),
            new BlockGenerateClass("tyrolium", "block", true, "1", "IUM"),
            new BlockGenerateClass("tyrolium", "command_block", true, "1"),

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
            new BlockGenerateClass("volcanium_cave", "classic", true, "1"),
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

            /*SUNSTONE*/
            new BlockGenerateClass("sunstone", "block", false, "3", "0"),

            /*NETHERITE*/
            new BlockGenerateClass("netherite", "ore", false, "V", "3"),
            new BlockGenerateClass("netherite", "block", false, "V", "3"),

            /*VOLCANITE*/
            new BlockGenerateClass("volcanite", "ore", false, "3", "2"),
            new BlockGenerateClass("volcanite", "block", false, "3", "2"),

            /*TYROLITE*/
            new BlockGenerateClass("tyrolite", "block", false, "3", "3"),

            /*RHODONIUM*/
            new BlockGenerateClass("rhodonium", "block", false, "3", "IUM"),

            /*YELLORIUM*/
            new BlockGenerateClass("yellorium", "block", false, "3", "IUM"),

            /*OBSIDIUM*/
            new BlockGenerateClass("obsidium", "block", false, "3", "IUM"),

            /*ENDERIUM*/
            new BlockGenerateClass("enderium", "block", false, "3", "IUM"),

            /*ENDERITE*/
            new BlockGenerateClass("enderite", "block", false, "3", "IUM"),

            /*COPPERIUM*/
            new BlockGenerateClass("copperium", "block", false, "3", "IUM"),

            /*AVENTURIUM*/
            new BlockGenerateClass("aventurium", "block", false, "3", "IUM"),

            /*PURIFIED IRON*/
            new BlockGenerateClass("purified_iron", "block", false, "3", "IUM"),

            /*PURIFIED DIAMOND*/
            new BlockGenerateClass("purified_diamond", "block", false, "3", "IUM"),

            /*TITANIUM*/
            new BlockGenerateClass("titanium", "block", false, "3", "IUM"),

            /*SAPPHIRIUM*/
            new BlockGenerateClass("sapphirium", "block", false, "3", "IUM"),

            /*MERCURIUM*/
            new BlockGenerateClass("mercurium", "block", false, "3", "IUM"),

            /*PLATINE*/
            new BlockGenerateClass("platine", "block", false, "3", "IUM"),

            /*PLATINIUM*/
            new BlockGenerateClass("platinium", "block", false, "3", "IUM"),

            /*VAPONITE*/
            new BlockGenerateClass("vaponite", "block", false, "3", "IUM"),

            /*VAPONIUM*/
            new BlockGenerateClass("vaporium", "block", false, "3", "3"),

            /*PROTON*/
            new BlockGenerateClass("proton", "block", false, "3", "3"),

            /*RITONITE*/
            new BlockGenerateClass("ritonite", "block", false, "3", "3"),

            /*RITONIUM*/
            new BlockGenerateClass("ritonium", "block", false, "3", "IUM"),

            /*GOLDONITE*/
            new BlockGenerateClass("goldonite", "block", false, "3", "3"),

            /*GOLDONIUM*/
            new BlockGenerateClass("goldonium", "block", false, "3", "IUM"),

            /*OMEGA*/
            new BlockGenerateClass("omega", "block", false, "3", "3"),

            /*OMEGANIUM*/
            new BlockGenerateClass("omeganium", "block", false, "3", "IUM"),

            /*NETHERIUM*/
            new BlockGenerateClass("netherium", "block", false, "3", "IUM"),

            /*URANITE*/
            new BlockGenerateClass("uranite", "block", false, "3", "3"),

            /*URANIUM*/
            new BlockGenerateClass("uranium", "block", false, "3", "IUM"),

            /*PLUTONITE*/
            new BlockGenerateClass("plutonite", "block", false, "3", "3"),

            /*PLUTONIUM*/
            new BlockGenerateClass("plutonium", "block", false, "3", "IUM"),

            /*POLONITE*/
            new BlockGenerateClass("polonite", "block", false, "3", "3"),

            /*POLONIUM*/
            new BlockGenerateClass("polonium", "block", false, "3", "IUM"),

            /*CHRONITE*/
            new BlockGenerateClass("chronite", "block", false, "3", "3"),

            /*CHROMITIUM*/
            new BlockGenerateClass("chromitium", "block", false, "3", "IUM"),

            /*CORANITE*/
            new BlockGenerateClass("coranite", "block", false, "3", "3"),

            /*CORANIUM*/
            new BlockGenerateClass("coranium", "block", false, "3", "IUM"),

            /*MACRONITE*/
            new BlockGenerateClass("macronite", "block", false, "3", "3"),

            /*MACRONIUM*/
            new BlockGenerateClass("macronium", "block", false, "3", "IUM"),

            /*GALACTITE*/
            new BlockGenerateClass("galactite", "block", false, "3", "3"),

            /*TOPAZ*/
            new BlockGenerateClass("topaz", "block", false, "3", "3"),

            /*PROTONIUM*/
            new BlockGenerateClass("protonium", "block", false, "3", "IUM"),

            /*SILVERIUM*/
            new BlockGenerateClass("silverium", "block", false, "3", "IUM"),

            /*SILICIUM*/
            new BlockGenerateClass("silicium", "block", false, "3", "IUM"),

            /*IUM*/
            new BlockGenerateClass("ium", "ore", false, "3", "IUM"),
            new BlockGenerateClass("ium", "block", false, "3", "IUM"),

            /*ULTIUM*/
            new BlockGenerateClass("ultium", "block", false, "3", "IUM"),
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
                if (BlockList[i].getName() == "volcanium_cave" && BlockList[i].getType() == "classic") {
                    blockCustomClass.put("bc"+i, new VolcaniumCave(BlockList[i].getName(), BlockList[i].getMaterial(), BlockList[i].getModVersion(), "bc" + i));
                }
                if (BlockList[i].getName() == "tyrolium" && BlockList[i].getType() == "command_block") {
                    blockCustomClass.put("bc"+i, new TyroliumCommandBlock(BlockList[i].getName() + BlockList[i].getTypeName(), BlockList[i].getMaterial(), BlockList[i].getModVersion(), "bc" + i));
                }

            }
        }

    }

    public static Block getBlockCustomClass(String nameBlock) {
        return blockCustomClass.get(nameBlock);
    }

}
