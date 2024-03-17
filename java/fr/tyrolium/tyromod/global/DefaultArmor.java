package fr.tyrolium.tyromod.global;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.util.handlers.IHasModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class DefaultArmor extends ItemArmor implements IHasModel {

    public DefaultArmor(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn){
        super(materialIn, 1, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TyroMod.TyroModTab);
        setMaxStackSize(1);

        ItemsMod.ITEMS.add(this);

    }

    @Override
    public void registerModels() {
        TyroMod.proxy.registerModel(this, 0);
    }


}
