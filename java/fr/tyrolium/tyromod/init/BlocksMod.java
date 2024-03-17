package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.blocks.*;
import fr.tyrolium.tyromod.blocks.FusionBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Global.MODID)
public class BlocksMod {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static Block tyrolium_block = new TyroliumBlock("tyrolium_block", Material.IRON);
    public static Block tyrolium_ore = new TyroliumOre("tyrolium_ore", Material.ROCK);
    public static Block rhodonite_block = new RhodoniteBlock("rhodonite_block", Material.IRON);
    public static Block rhodonite_ore = new RhodoniteOre("rhodonite_ore", Material.ROCK);
    public static Block amethys_block = new AmethysBlock("amethys_block", Material.IRON);
    public static Block amethys_ore = new AmethysOre("amethys_ore", Material.ROCK);
    public static Block yellorite_block = new YelloriteBlock("yellorite_block", Material.IRON);
    public static Block yellorite_ore = new YelloriteOre("yellorite_ore", Material.IRON);

    public static Block fusion_block = new FusionBlock("fusion_block", Material.ANVIL);


}
