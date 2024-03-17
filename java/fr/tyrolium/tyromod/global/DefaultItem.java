package fr.tyrolium.tyromod.global;

import fr.tyrolium.tyromod.TyroMod;
import net.minecraft.item.Item;

public class DefaultItem extends Item {

    public DefaultItem(String name) {

        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(TyroMod.TyroModTab);
    }

}
