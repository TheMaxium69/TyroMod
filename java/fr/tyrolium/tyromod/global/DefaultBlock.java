package fr.tyrolium.tyromod.global;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.BlocksMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.proxy.Client;
import fr.tyrolium.tyromod.util.handlers.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class DefaultBlock extends Block implements IHasModel {
    private Boolean isOre;
    private String modVersion;
    private String oreTier;
    private String tyroId;
    private Item ItemLoot = ItemsMod.RADAR;

    public DefaultBlock(String name, Material materialIn, String version, String id) {
        super(materialIn);

        this.tyroId = id;
        this.modVersion = version;
        this.isOre = false;

        setUnlocalizedName(name);
        setRegistryName(name);
        chooseCreativeTab(version, this.isOre);

        // A RENDRE DIRENT PAR BLOCK
        setHardness(5.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 2);

        BlocksMod.BLOCKS.add(this);
        ItemsMod.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    public DefaultBlock(String name, Material materialIn, String version, String tier, String id) {
        super(materialIn);

        this.tyroId = id;
        this.modVersion = version;
        this.oreTier = tier;
        this.isOre = true;

        setUnlocalizedName(name);
        setRegistryName(name);
        chooseCreativeTab(version, this.isOre);

        // A RENDRE DIRENT PAR BLOCK
        setHardness(5.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 2);

        BlocksMod.BLOCKS.add(this);
        ItemsMod.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public void registerModels()
    {
        TyroMod.proxy.registerModel(Item.getItemFromBlock(this), 0);
    }

    @Override
    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {

        if (Minecraft.getMinecraft().gameSettings.advancedItemTooltips) {

            /*FUSION TOOLTIP*/
            if (this.oreTier != "0") {

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
                setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
            }

        }

    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        if(isOre)
        {
            return ItemLoot;
        }
        else
        {
            return Item.getItemFromBlock(this);
        }
    }

    public int quantityDropped(Random rand)
    {
        if (isOre) {
            int max = 4;
            int min = 1;
            return rand.nextInt(max) + min;

        } else {
            return 1;
        }
    }



}
