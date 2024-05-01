package fr.tyrolium.tyromod.proxy;

import fr.tyrolium.tyromod.tileentity.gui.GuiRadar;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;

public class Client extends CommonProxy{

    @Override
    public void registerModel(Item item, int metadata)
    {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        MinecraftForge.EVENT_BUS.register(new GuiRadar());
    }

}
