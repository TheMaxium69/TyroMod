package fr.tyrolium.tyromod.item;

import fr.tyrolium.tyromod.TyroMod;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import javax.annotation.Nullable;
import java.util.List;

public class Tyrolium extends Item {
    public Tyrolium(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        if(Screen.hasShiftDown()) {
            tooltip.add(new TranslationTextComponent("tooltip."+ TyroMod.ModId +".tyrolium_shift"));
        } else {
            tooltip.add(new TranslationTextComponent("tooltip."+ TyroMod.ModId +".tyrolium"));
        }

        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }

}
