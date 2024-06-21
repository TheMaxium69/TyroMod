package fr.tyrolium.tyromod.util.handlers;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.tileentity.TileEntityFusionBlock;
import fr.tyrolium.tyromod.tileentity.TileEntityFusionBlock2;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler
{
    public static void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityFusionBlock.class, new ResourceLocation(Global.MODID + ":fusion_block"));
        GameRegistry.registerTileEntity(TileEntityFusionBlock2.class, new ResourceLocation(Global.MODID + ":fusion_block2"));
    }
}

