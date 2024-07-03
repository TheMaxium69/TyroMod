package fr.tyrolium.tyromod.items;

import fr.tyrolium.tyromod.global.DefaultItem;
import fr.tyrolium.tyromod.tileentity.gui.GuiRadar;
import fr.tyrolium.tyromod.util.handlers.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Radar extends DefaultItem  implements IHasModel {

    private static EntityPlayer player;

    private static int dura = 90 * 20 * 60;

    public static int percents = 0;

    public Radar(String name, String version, String id)
    {
        super(name, version, id);
        setMaxStackSize(1);
        this.setMaxDamage(this.dura);
        this.addPropertyOverride(new ResourceLocation("percent"), new IItemPropertyGetter()
        {

            @SideOnly(Side.CLIENT)
            @Override
            public float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn)
            {
                return percents;
            }
        });

    }


    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
    {
        this.player = (EntityPlayer)entityIn;

        if(this.player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof Radar)
        {
            if(this.dura >= 0)
            {
                this.dura--;
//                stack.damageItem(1, player);
                if(GuiRadar.amountTiles <= 25)
                {
                    this.percents = GuiRadar.amountTiles;
                }
                else if(GuiRadar.amountTiles >= 26)
                {
                    this.percents = 26;
                }
            }
        }

        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
    }

}