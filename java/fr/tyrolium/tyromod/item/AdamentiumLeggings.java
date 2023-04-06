package fr.tyrolium.tyromod.item;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.ModItemGroup;
import fr.tyrolium.tyromod.utils.CustomArmorMaterials;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class AdamentiumLeggings extends ArmorItem {

    public static String itemString = "adamentium_leggings";
    public static ItemGroup modItemGroup = ModItemGroup.TAB_TYROMOD;
    public static Properties properties = new Item.Properties().tab(modItemGroup);

    public static IArmorMaterial armorTier = CustomArmorMaterials.ADAMENTIUM_ARMOR;
    public static EquipmentSlotType equipmentSlotType = EquipmentSlotType.LEGS;


    public AdamentiumLeggings() {
        super(armorTier, equipmentSlotType, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        if(Screen.hasShiftDown()) {
            tooltip.add(new TranslationTextComponent("tooltip."+ TyroMod.ModId +"."+itemString+"_shift"));
        } else {
            tooltip.add(new TranslationTextComponent("tooltip."+ TyroMod.ModId +"."+itemString));
        }

        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
