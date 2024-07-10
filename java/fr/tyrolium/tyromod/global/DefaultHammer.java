package fr.tyrolium.tyromod.global;

import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.util.handlers.IHasModel;
import net.minecraft.block.material.Material;
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
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
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


//    public boolean onBlockDestroyed(ItemStack stack, World world, IBlockState block, BlockPos pos, EntityLivingBase living)
//    {
//        if(living instanceof EntityPlayer && !world.isRemote)
//        {
//
//            int taille = 2;
//
////            for (int x1 = -taille + 1; x1 < taille; x1++) {
//            int x1 = 0;
//
//                for (int y1 = -taille + 1; y1 < taille; y1++) {
//
//                    for (int z1 = -taille + 1; z1 < taille; z1++) {
//
//                        int x = pos.getX();
//                        int y = pos.getY();
//                        int z = pos.getZ();
//
//                        TileEntity te = new TileEntity() {};
//
//                        BlockPos pos1 = new BlockPos(x + x1, y + y1, z + z1);
//                        if(world.getBlockState(pos1).getBlockHardness(world, pos1) >= 0) {
//                            world.getBlockState(pos1).getBlock().harvestBlock(world, (EntityPlayer)living, pos1, block, te,stack);
//                            world.setBlockToAir(pos1);
//                        }
//
//                        int exp = world.getBlockState(pos).getBlock().getExpDrop(world.getBlockState(pos), world, pos1, 0);
//                        if(exp > 0) {
//                            EntityXPOrb expOrb = new EntityXPOrb(world, x, y, z, exp);
//                            world.spawnEntity(expOrb);
//                        }
//                    }
//                }
////            }
//        }
//        return super.onBlockDestroyed(stack, world, block, pos, living);
//    }



    public RayTraceResult rayTrace(double blockReachDistance, float partialTicks, World world, EntityLivingBase e)
    {
        Vec3d vec3d = e.getPositionEyes(partialTicks);
        Vec3d vec3d1 = e.getLook(partialTicks);
        Vec3d vec3d2 = vec3d.addVector(vec3d1.x * blockReachDistance, vec3d1.y * blockReachDistance, vec3d1.z * blockReachDistance);
        return world.rayTraceBlocks(vec3d, vec3d2, false, false, true);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack breaker, World w, IBlockState state, BlockPos pos, EntityLivingBase e)
    {
        if(e instanceof EntityPlayer && !w.isRemote)
        {
            EntityPlayer p = (EntityPlayer)e;
            RayTraceResult r = this.rayTrace(5.0D, 0.0f, w, e);

            if(r.typeOfHit == RayTraceResult.Type.BLOCK)
            {
                int x = pos.getX();
                int y = pos.getY();
                int z = pos.getZ();

                EnumFacing side = r.sideHit;

                if(side == EnumFacing.DOWN || side == EnumFacing.UP)
                {
                    this.destroyAndDropBlock(w, p, breaker, x + 1, y, z - 1);
                    this.destroyAndDropBlock(w, p, breaker, x + 1, y, z);
                    this.destroyAndDropBlock(w, p, breaker, x + 1, y, z + 1);
                    this.destroyAndDropBlock(w, p, breaker, x, y, z - 1);
                    // Middle block
                    this.destroyAndDropBlock(w, p, breaker, x, y, z + 1);
                    this.destroyAndDropBlock(w, p, breaker, x - 1, y, z - 1);
                    this.destroyAndDropBlock(w, p, breaker, x - 1, y, z);
                    this.destroyAndDropBlock(w, p, breaker, x - 1, y, z + 1);
                }
                // Z
                // NORTH - SOUTH
                else if(side == EnumFacing.NORTH || side == EnumFacing.SOUTH)
                {
                    this.destroyAndDropBlock(w, p, breaker, x + 1, y + 1, z);
                    this.destroyAndDropBlock(w, p, breaker, x, y + 1, z);
                    this.destroyAndDropBlock(w, p, breaker, x - 1, y + 1, z);
                    this.destroyAndDropBlock(w, p, breaker, x + 1, y, z);
                    // Middle block
                    this.destroyAndDropBlock(w, p, breaker, x - 1, y, z);
                    this.destroyAndDropBlock(w, p, breaker, x + 1, y - 1, z);
                    this.destroyAndDropBlock(w, p, breaker, x, y - 1, z);
                    this.destroyAndDropBlock(w, p, breaker, x - 1, y - 1, z);
                }
                // X
                // EAST - WEST
                else if(side == EnumFacing.EAST || side == EnumFacing.WEST)
                {
                    this.destroyAndDropBlock(w, p, breaker, x, y + 1, z + 1);
                    this.destroyAndDropBlock(w, p, breaker, x, y + 1, z);
                    this.destroyAndDropBlock(w, p, breaker, x, y + 1, z - 1);
                    this.destroyAndDropBlock(w, p, breaker, x, y, z + 1);
                    // Middle block
                    this.destroyAndDropBlock(w, p, breaker, x, y, z - 1);
                    this.destroyAndDropBlock(w, p, breaker, x, y - 1, z + 1);
                    this.destroyAndDropBlock(w, p, breaker, x, y - 1, z);
                    this.destroyAndDropBlock(w, p, breaker, x, y - 1, z - 1);
                }
                return true;
            }
        }

        breaker.damageItem(1, e);
        return super.onBlockDestroyed(breaker, w, state, pos, e);
    }

    private void destroyAndDropBlock(World w, EntityPlayer p, ItemStack breaker, int x, int y, int z)
    {
        BlockPos pos = new BlockPos(x, y, z);

        if(w.getBlockState(pos).getBlockHardness(w, pos) >= 0 && w.getBlockState(pos).getBlock().getMaterial(w.getBlockState(pos).getBlock().getDefaultState()) == Material.ROCK)
        {
            w.getBlockState(pos).getBlock().harvestBlock(w, p, pos, w.getBlockState(pos), w.getTileEntity(pos), breaker);
            w.setBlockToAir(pos);
        }
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
