package fr.tyrolium.tyromod.util.handlers;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.tileentity.TileEntityFusionBlock;
import fr.tyrolium.tyromod.tileentity.TileEntityFusionBlock2;
import fr.tyrolium.tyromod.tileentity.TileEntityFusionBlock3;
import fr.tyrolium.tyromod.tileentity.container.FusionBlock3Container;
import fr.tyrolium.tyromod.tileentity.container.FusionBlock2Container;
import fr.tyrolium.tyromod.tileentity.container.FusionBlockContainer;
import fr.tyrolium.tyromod.tileentity.gui.FusionBlockGui;
import fr.tyrolium.tyromod.tileentity.gui.FusionBlock2Gui;
import fr.tyrolium.tyromod.tileentity.gui.FusionBlock3Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == Global.GUI_FUSION_BLOCK) return new FusionBlockContainer(player.inventory, (TileEntityFusionBlock)world.getTileEntity(new BlockPos(x,y,z)));
        if(ID == Global.GUI_FUSION_BLOCK2) return new FusionBlock2Container(player.inventory, (TileEntityFusionBlock2)world.getTileEntity(new BlockPos(x,y,z)));
        if(ID == Global.GUI_FUSION_BLOCK3) return new FusionBlock3Container(player.inventory, (TileEntityFusionBlock3)world.getTileEntity(new BlockPos(x,y,z)));
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == Global.GUI_FUSION_BLOCK) return new FusionBlockGui(player.inventory, (TileEntityFusionBlock)world.getTileEntity(new BlockPos(x,y,z)));
        if(ID == Global.GUI_FUSION_BLOCK2) return new FusionBlock2Gui(player.inventory, (TileEntityFusionBlock2)world.getTileEntity(new BlockPos(x,y,z)));
        if(ID == Global.GUI_FUSION_BLOCK3) return new FusionBlock3Gui(player.inventory, (TileEntityFusionBlock3)world.getTileEntity(new BlockPos(x,y,z)));
       return null;
    }
}

