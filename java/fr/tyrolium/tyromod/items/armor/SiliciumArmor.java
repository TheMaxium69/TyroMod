package fr.tyrolium.tyromod.items.armor;

import fr.tyrolium.tyromod.global.DefaultArmor;
import fr.tyrolium.tyromod.util.handlers.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SiliciumArmor extends DefaultArmor implements IHasModel {
    public SiliciumArmor(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn, String version, String tier, String id) {
        super(name, materialIn, equipmentSlotIn, version, tier, id);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {

        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof SiliciumArmor) {
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 10, 1, false, false));
        }

        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof SiliciumArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof SiliciumArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof SiliciumArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof SiliciumArmor) {

            player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 10, 1, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 10, 1, false, false));

        }
    }
}
