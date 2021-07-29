package fr.tyrolium.maxime.armor;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.ArmorMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class GuardianArmor extends ItemArmor {
    public GuardianArmor(int metadata, String name) {
        super(MaterialMod.GUARDIAN_ARMOR, 0, metadata);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == ArmorMod.guardian_leggings) {
            return InfoMod.MOD_TEXTURE + "textures/models/armor/guardian_layer_2.png";
        } else if (stack.getItem() == ArmorMod.guardian_helmet || stack.getItem() == ArmorMod.guardian_chestplate || stack.getItem() == ArmorMod.guardian_boots) {
            return InfoMod.MOD_TEXTURE + "textures/models/armor/guardian_layer_1.png";
        }
        return null;
    }
}

