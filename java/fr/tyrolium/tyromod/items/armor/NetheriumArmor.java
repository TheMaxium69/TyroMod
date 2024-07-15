package fr.tyrolium.tyromod.items.armor;

import fr.tyrolium.tyromod.global.DefaultArmor;
import fr.tyrolium.tyromod.util.handlers.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class NetheriumArmor extends DefaultArmor implements IHasModel {
    public NetheriumArmor(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn, String version, String tier, String id) {
        super(name, materialIn, equipmentSlotIn, version, tier, id);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {

        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof NetheriumArmor) {
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 10, 1, false, false));
        }

        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof NetheriumArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof NetheriumArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof NetheriumArmor
                && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof NetheriumArmor) {

            player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 10, 1, false, false));

        }
    }
}
