package fr.tyrolium.tyromod.tileentity.gui;

import java.time.Duration;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiRadar extends Gui {
    private static Minecraft mc;

    public static int amountTiles = 0;

    FontRenderer fontRender;

    final ResourceLocation te0 = new ResourceLocation(Global.MODID + ":textures/gui/radar_empty.png");
    final ResourceLocation te0_5 = new ResourceLocation(Global.MODID + ":textures/gui/radar_0-5.png");
    final ResourceLocation te6_10 = new ResourceLocation(Global.MODID + ":textures/gui/radar_6-10.png");
    final ResourceLocation te11_25 = new ResourceLocation(Global.MODID + ":textures/gui/radar_11-25.png");
    final ResourceLocation te26_more = new ResourceLocation(Global.MODID + ":textures/gui/radar_26+.png");

    public GuiRadar()
    {
        this.mc = Minecraft.getMinecraft();
        this.fontRender = this.mc.fontRenderer;
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onRenderPre(RenderGameOverlayEvent.Pre event)
    {

        if(event.getType() == RenderGameOverlayEvent.ElementType.HELMET && mc.player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemsMod.getItemCustomClass("c973") /*&& ItemRadar.isUsed == 1*/)
        {

            amountTiles = mc.world.getChunkFromChunkCoords(mc.player.chunkCoordX + 0,
                    mc.player.chunkCoordZ + 0).getTileEntityMap().values().size();

            amountTiles = amountTiles + mc.world.getChunkFromChunkCoords(mc.player.chunkCoordX + 0,
                    mc.player.chunkCoordZ + 1).getTileEntityMap().values().size();

            amountTiles = amountTiles + mc.world.getChunkFromChunkCoords(mc.player.chunkCoordX + 0,
                    mc.player.chunkCoordZ - 1).getTileEntityMap().values().size();

            amountTiles = amountTiles + mc.world.getChunkFromChunkCoords(mc.player.chunkCoordX + 1,
                    mc.player.chunkCoordZ).getTileEntityMap().values().size();

            amountTiles = amountTiles + mc.world.getChunkFromChunkCoords(mc.player.chunkCoordX - 1,
                    mc.player.chunkCoordZ).getTileEntityMap().values().size();

            if (amountTiles <= 0) {

                mc.getTextureManager().bindTexture(this.te0);

                drawModalRectWithCustomSizedTexture(5,5,0,0,32,32,32,32);

            }
            else if(amountTiles <= 5 && amountTiles > 0)
            {
                mc.getTextureManager().bindTexture(this.te0_5);

                drawModalRectWithCustomSizedTexture(5,5,0,0,32,32,32,32);
            }
            else if(amountTiles <= 10 && amountTiles >=6)
            {
                mc.getTextureManager().bindTexture(this.te6_10);

                drawModalRectWithCustomSizedTexture(5,5,0,0,32,32,32,32);
            }
            else if(amountTiles <= 25 && amountTiles >=11)
            {
                mc.getTextureManager().bindTexture(this.te11_25);

                drawModalRectWithCustomSizedTexture(5,5,0,0,32,32,32,32);
            }
            else if(amountTiles >=26)
            {
                mc.getTextureManager().bindTexture(this.te26_more);

                drawModalRectWithCustomSizedTexture(5,5,0,0,32,32,32,32);
            }
            drawCenteredString(this.mc.fontRenderer, this.amountTiles + "%", 23, 39, -1);
//            drawCenteredString(this.mc.fontRenderer, this.formatDuration(), 23, 48, -1);


            event.setCanceled(true);
        }
    }

    public static String formatDuration()
    {
        ItemStack stack = mc.player.getHeldItem(EnumHand.MAIN_HAND);

        int maxD = stack.getMaxDamage();
        int itemD = stack.getItemDamage();

        int damage = maxD - itemD;

        Duration duration = Duration.ofSeconds(damage / 20);
        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%d:%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60,
                absSeconds % 60);
        return seconds < 0 ? "-" + positive : positive;
    }
}
