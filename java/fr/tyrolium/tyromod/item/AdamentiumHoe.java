package fr.tyrolium.tyromod.item;
import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.ModItemGroup;
import fr.tyrolium.tyromod.utils.CustomItemTiers;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class AdamentiumHoe extends HoeItem {

    public static String itemString = "adamentium_hoe";
    public static ItemGroup modItemGroup = ModItemGroup.TAB_TYROMOD;
    public static Properties properties = new Item.Properties().stacksTo(1).tab(modItemGroup);

    public static IItemTier toolTier = CustomItemTiers.ADAMENTIUM_TOOL;
    public static int attackDamageIn = 0;
    public static float attackSpeedIn = -2.4f;

    public AdamentiumHoe() {
        super(toolTier, attackDamageIn, attackSpeedIn, properties);
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


