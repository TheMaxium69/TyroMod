package fr.tyrolium.tyromod.proxy;

import fr.tyrolium.tyromod.security.LauncherToken;
import fr.tyrolium.tyromod.security.PacketToken;
import fr.tyrolium.tyromod.tileentity.gui.GuiRadar;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Client extends CommonProxy{

    @Override
    public void registerModel(Item item, int metadata)
    {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        MinecraftForge.EVENT_BUS.register(new GuiRadar());


        LauncherToken.Token();

    }


}
