package fr.tyrolium.maxime.armor;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.ArmorMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class AmethysArmor extends ItemArmor {
    public AmethysArmor(int metadata, String name) {
        super(MaterialMod.AMETHYS_ARMOR, 0, metadata);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == ArmorMod.amethys_leggings) {
            return InfoMod.MOD_TEXTURE + "textures/models/armor/amethys_layer_4.png";
        } else if (stack.getItem() == ArmorMod.amethys_helmet || stack.getItem() == ArmorMod.amethys_chestplate || stack.getItem() == ArmorMod.amethys_boots) {
            return InfoMod.MOD_TEXTURE + "textures/models/armor/amethys_layer_3.png";
        }
        return null;
    }
}
