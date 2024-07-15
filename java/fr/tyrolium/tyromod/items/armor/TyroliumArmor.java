package fr.tyrolium.tyromod.items.armor;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.global.DefaultArmor;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.util.handlers.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TyroliumArmor extends DefaultArmor implements IHasModel {

    public TyroliumArmor(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn, String version, String tier, String id){
        super(name, materialIn, equipmentSlotIn, version, tier, id);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {

        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof TyroliumArmor) {
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 10, 0, false, false));
        }

        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof TyroliumArmor
            && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof TyroliumArmor
            && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof TyroliumArmor
            && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof TyroliumArmor) {

            player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 10, 1, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 1, false, false));

        }
    }

}
