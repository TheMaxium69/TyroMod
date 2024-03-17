package fr.tyrolium.tyromod.global;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.BlocksMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.proxy.Client;
import fr.tyrolium.tyromod.util.handlers.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class DefaultBlock extends Block implements IHasModel {
    public DefaultBlock(String name, Material materialIn) {
        super(materialIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TyroMod.TyroModTab);

        BlocksMod.BLOCKS.add(this);
        ItemsMod.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public void registerModels()
    {
        TyroMod.proxy.registerModel(Item.getItemFromBlock(this), 0);
    }
}
