package fr.tyrolium.tyromod.global;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.util.handlers.IHasModel;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class DefaultHammer extends ItemPickaxe implements IHasModel {
    private String modVersion;
    private String oreTier;
    private String tyroId;
    public DefaultHammer(String name, ToolMaterial materialIn, String version, String tier, String id)
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


    public boolean onBlockDestroyed(ItemStack stack, World world, IBlockState block, BlockPos pos, EntityLivingBase living)
    {
        if(living instanceof EntityPlayer && !world.isRemote)
        {
            for(int x1 = -2; x1 < 3; x1++)
            {
                for(int y1 = -2; y1 < 3; y1++)
                {
                    for(int z1 = -2; z1 < 3; z1++)
                    {
                        int x = pos.getX();
                        int y = pos.getY();
                        int z = pos.getZ();

                        TileEntity te = new TileEntity() {};

                        BlockPos pos1 = new BlockPos(x + x1, y + y1, z + z1);
                        if(world.getBlockState(pos1).getBlockHardness(world, pos1) >= 0) {
                            world.getBlockState(pos1).getBlock().harvestBlock(world, (EntityPlayer)living, pos1, block, te,stack);
                            world.setBlockToAir(pos1);
                        }

                        int exp = world.getBlockState(pos).getBlock().getExpDrop(world.getBlockState(pos), world, pos1, 0);
                        if(exp > 0) {
                            EntityXPOrb expOrb = new EntityXPOrb(world, x, y, z, exp);
                            world.spawnEntity(expOrb);
                        }
                    }
                }
            }
        }
        return super.onBlockDestroyed(stack, world, block, pos, living);
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
                setCreativeTab(CreativeTabs.TOOLS);
            }

        }

    }
}
