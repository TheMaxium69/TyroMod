package fr.tyrolium.tyromod.util.handlers;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.tileentity.TileEntityFusionBlock;
import fr.tyrolium.tyromod.tileentity.TileEntityFusionBlock2;
import fr.tyrolium.tyromod.tileentity.TileEntityFusionBlock3;
import fr.tyrolium.tyromod.tileentity.TileEntityFusionBlockFinal;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler
{
    public static void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityFusionBlock.class, new ResourceLocation(Global.MODID + ":fusion_block"));
        GameRegistry.registerTileEntity(TileEntityFusionBlock2.class, new ResourceLocation(Global.MODID + ":fusion_block2"));
        GameRegistry.registerTileEntity(TileEntityFusionBlock3.class, new ResourceLocation(Global.MODID + ":fusion_block3"));
        GameRegistry.registerTileEntity(TileEntityFusionBlockFinal.class, new ResourceLocation(Global.MODID + ":fusion_block_final"));
    }
}

