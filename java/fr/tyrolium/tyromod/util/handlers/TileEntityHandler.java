package fr.tyrolium.tyromod.util.handlers;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.tileentity.TileEntityFusionBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler
{
    public static void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityFusionBlock.class, new ResourceLocation(Global.MODID + ":fusion_block"));
    }
}

