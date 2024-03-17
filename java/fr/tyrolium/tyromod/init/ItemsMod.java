package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.items.Amethys;
import fr.tyrolium.tyromod.items.Rhodonite;
import fr.tyrolium.tyromod.items.Tyrolium;
import fr.tyrolium.tyromod.items.Yellorite;
import fr.tyrolium.tyromod.proxy.Client;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Global.MODID)
public class ItemsMod {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static Item tyrolium = new Tyrolium("tyrolium");
    public static Item rhodonite = new Rhodonite("rhodonite");
    public static Item amethys = new Amethys("amethys");
    public static Item yellorite = new Yellorite("yellorite");

}
