package fr.tyrolium.tyromod.tileentity.gui;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.tileentity.TileEntityFusionBlockFinal;
import fr.tyrolium.tyromod.tileentity.container.FusionBlockFinalContainer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class FusionBlockFinalGui extends GuiContainer {

    private static final ResourceLocation TEXTURES = new ResourceLocation(Global.MODID + ":textures/gui/fusion_block_final.png");
    private final InventoryPlayer player;
    private final TileEntityFusionBlockFinal tileentity;

	public FusionBlockFinalGui(InventoryPlayer player, TileEntityFusionBlockFinal tileentity)
    {
        super(new FusionBlockFinalContainer(player, tileentity));
        this.player = player;
        this.tileentity = tileentity;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        String tileName = this.tileentity.getDisplayName().getUnformattedText();
//        this.fontRenderer.drawString(tileName, (this.xSize / 2 - this.fontRenderer.getStringWidth(tileName) / 2) + 3, 8, 4210752);
        this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 122, this.ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(TEXTURES);
        this.drawTexturedModalRect(this.guiLeft - 4, this.guiTop - 18, 0, 0, 184, 184);

        if(TileEntityFusionBlockFinal.isBurning(tileentity))
        {
            int k = this.getBurnLeftScaled(13);
            this.drawTexturedModalRect(this.guiLeft + 133, this.guiTop + 44 + 12 - k, 184, 12 - k, 14, k + 1);
        }

        int l = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(this.guiLeft + 44, this.guiTop + 36, 184, 14, l + 1, 16);
    }

    private int getBurnLeftScaled(int pixels)
    {
        int i = this.tileentity.getField(1);
        if(i == 0) i = 200;
        return this.tileentity.getField(0) * pixels / i;
    }

    private int getCookProgressScaled(int pixels)
    {
        int i = this.tileentity.getField(2);
        int j = this.tileentity.getField(3);
        return j != 0 && i != 0 ? i * pixels / j : 0;
    }
}
