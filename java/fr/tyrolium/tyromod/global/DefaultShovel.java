package fr.tyrolium.tyromod.global;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.util.handlers.IHasModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class DefaultShovel extends ItemSpade implements IHasModel {
    private String modVersion;
    private String oreTier;
    private String tyroId;

    public DefaultShovel(String name, ToolMaterial materialIn, String version, String tier, String id)
    {
        super(materialIn);

        this.tyroId = id;
        this.modVersion = version;
        this.oreTier = tier;

        setUnlocalizedName(name);
        setRegistryName(name);
        chooseCreativeTab(version, true);

        ItemsMod.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        TyroMod.proxy.registerModel(this, 0);
    }

    @Override
    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {

        if (Minecraft.getMinecraft().gameSettings.advancedItemTooltips) {

            /*FUSION TOOLTIP*/
            if (this.oreTier != "0") {

                if (this.oreTier == "FINAL"){
                    tooltip.add("\u00a77Fusion: \u00a75\u00a7lTier " + this.oreTier);
                } else if (this.oreTier == "IUM"){
                    tooltip.add("\u00a77Fusion: \u00a71\u00a7lTier " + this.oreTier);
                } else if (this.oreTier == "3"){
                    tooltip.add("\u00a77Fusion: \u00a74\u00a7lTier " + this.oreTier);
                } else if (this.oreTier == "2"){
                    tooltip.add("\u00a77Fusion: \u00a72\u00a7lTier " + this.oreTier);
                } else if (this.oreTier == "1"){
                    tooltip.add("\u00a77Fusion: \u00a7d\u00a7lTier " + this.oreTier);
                }

            }

            /*VERSION TOOLTIP*/
            if (this.modVersion == "1") {
                tooltip.add("\u00a77Version: \u00a7cTyroMod V1");
            } else if (this.modVersion == "13") {
                tooltip.add("\u00a77Version: \u00a7cTyroMod V1 \u00a77- \u00a7aV3");
            } else if (this.modVersion == "V1" || this.modVersion == "v1") {
                tooltip.add("\u00a77Version: \u00a7fVanilla \u00a77- \u00a7cTyroMod V1");
            } else if (this.modVersion == "3") {
                tooltip.add("\u00a77Version: \u00a7aTyroMod V3");
            } else if (this.modVersion == "V3" || this.modVersion == "v3") {
                tooltip.add("\u00a77Version: \u00a7fVanilla \u00a77- \u00a7aTyroMod V3");
            } else {
                tooltip.add("\u00a77Version: \u00a7fCreate By TyroMod");
            }

            /*ID TOOLTIP*/
            tooltip.add("\u00a78tyro-id:" + this.tyroId);
        }

        if (!Minecraft.getMinecraft().gameSettings.advancedItemTooltips && this.oreTier != "0") {

            if (this.oreTier == "IUM"){
                tooltip.add("\u00a77Fusion: \u00a79\u00a7lTier " + this.oreTier);
            } else if (this.oreTier == "3"){
                tooltip.add("\u00a77Fusion: \u00a74\u00a7lTier " + this.oreTier);
            } else if (this.oreTier == "2"){
                tooltip.add("\u00a77Fusion: \u00a73\u00a7lTier " + this.oreTier);
            } else if (this.oreTier == "1"){
                tooltip.add("\u00a77Fusion: \u00a75\u00a7lTier " + this.oreTier);
            }
        }

        super.addInformation(stack, player, tooltip, advanced);
    }


    public void chooseCreativeTab(String version, Boolean isOre) {

        if (!isOre) {

            setCreativeTab(TyroMod.TyroModTabUtils);

        } else {

            if (version == "1" || version == "13" || version == "V1" || version == "v1") {
                setCreativeTab(TyroMod.TyroModTabV1);
            } else if (version == "3" || version == "V3" || version == "v3"){
                setCreativeTab(TyroMod.TyroModTabV3);
            } else {
                setCreativeTab(CreativeTabs.TOOLS);
            }

        }

    }
}