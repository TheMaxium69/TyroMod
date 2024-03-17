package fr.tyrolium.tyromod.util.handlers;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.tileentity.TileEntityFusionBlock;
import fr.tyrolium.tyromod.tileentity.container.FusionBlockContainer;
import fr.tyrolium.tyromod.tileentity.gui.FusionBlockGui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == Global.GUI_FUSION_BLOCK) return new FusionBlockContainer(player.inventory, (TileEntityFusionBlock) world.getTileEntity(new BlockPos(x,y,z)));
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == Global.GUI_FUSION_BLOCK) return new FusionBlockGui(player.inventory, (TileEntityFusionBlock)world.getTileEntity(new BlockPos(x,y,z)));
       return null;
    }
}

