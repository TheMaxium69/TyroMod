package fr.tyrolium.tyromod.global;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.util.handlers.IHasModel;
import net.minecraft.item.ItemSword;

public class DefaultSword extends ItemSword implements IHasModel {
    public DefaultSword(String name, ToolMaterial materialIn)
    {
        super(materialIn);
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