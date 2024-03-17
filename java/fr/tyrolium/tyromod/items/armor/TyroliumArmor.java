package fr.tyrolium.tyromod.items.armor;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.global.DefaultArmor;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.util.handlers.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class TyroliumArmor extends DefaultArmor implements IHasModel {

    public TyroliumArmor(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn){
        super(name, materialIn, equipmentSlotIn);
    }


}
