package fr.tyrolium.tyromod.global;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.proxy.Client;
import fr.tyrolium.tyromod.util.handlers.IHasModel;
import net.minecraft.item.Item;

public class DefaultItem extends Item implements IHasModel {

    public DefaultItem(String name) {

        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(TyroMod.TyroModTab);


        ItemsMod.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        TyroMod.proxy.registerModel(this, 0);
    }

}
