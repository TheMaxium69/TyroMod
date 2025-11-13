package fr.tyrolium.tyromod.tileentity;

import fr.tyrolium.tyromod.blocks.FusionBlock3;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.security.TyroLogger;
import fr.tyrolium.tyromod.tileentity.recipes.FusionBlock3Recipes;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityFusionBlock3 extends TileEntity implements IInventory, ITickable
{
    public ItemStackHandler handler = new ItemStackHandler(4);
    private String customName;
    private ItemStack smelting = ItemStack.EMPTY;

    private int burnTime;
    private int currentBurnTime;
    private int cookTime;
    private int totalCookTime = 200;

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing)
    {
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return true;
        else return false;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing)
    {
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return (T) this.handler;
        return super.getCapability(capability, facing);
    }

    @Override
    public String getName() {
        return null;
    }

    public boolean hasCustomName()
    {
        return this.customName != null && !this.customName.isEmpty();
    }

    public void setCustomName(String customName)
    {
        this.customName = customName;
    }

    @Override
    public ITextComponent getDisplayName()
    {
        return this.hasCustomName() ? new TextComponentString(this.customName) : new TextComponentTranslation("container.fusion_block3");
    }

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        this.handler.deserializeNBT(compound.getCompoundTag("Inventory"));
        this.burnTime = compound.getInteger("BurnTime");
        this.cookTime = compound.getInteger("CookTime");
        this.totalCookTime = compound.getInteger("CookTimeTotal");
        this.currentBurnTime = getItemBurnTime((ItemStack)this.handler.getStackInSlot(2));

        if(compound.hasKey("FusionBlock3", 8)) this.setCustomName(compound.getString("FusionBlock3"));
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);
        compound.setInteger("BurnTime", (short)this.burnTime);
        compound.setInteger("CookTime", (short)this.cookTime);
        compound.setInteger("CookTimeTotal", (short)this.totalCookTime);
        compound.setTag("Inventory", this.handler.serializeNBT());

        if(this.hasCustomName()) compound.setString("FusionBlock3", this.customName);
        return compound;
    }

    public boolean isBurning()
    {
        return this.burnTime > 0;
    }

    @SideOnly(Side.CLIENT)
    public static boolean isBurning(TileEntityFusionBlock3 te)
    {
        return te.getField(0) > 0;
    }

    public void update() {
        if (!world.isRemote) {
            if (this.isBurning()) {
                --this.burnTime;
                FusionBlock3.setState(true, world, pos);
            }

            ItemStack[] inputs = new ItemStack[]{handler.getStackInSlot(0), handler.getStackInSlot(1)};
            ItemStack fuel = this.handler.getStackInSlot(2);
            ItemStack result = this.handler.getStackInSlot(3);

            if (!fuel.isEmpty() && !this.handler.getStackInSlot(0).isEmpty() && !this.handler.getStackInSlot(1).isEmpty() && cookTime == 0) {

                if (FusionRegistry.verifFusion("3", inputs[0].getUnlocalizedName(), inputs[1].getUnlocalizedName())) {

                    /* REQUETE POUR LA FUSION */
                    ItemStack output = FusionBlock3Recipes.getInstance().getSinteringResult(inputs[0], inputs[1]);
                    if (!this.isBurning() && this.canSmelt(output)) {
                        this.burnTime = getItemBurnTime(fuel);
                        this.currentBurnTime = burnTime;

                        if (this.isBurning() && !fuel.isEmpty()) {
                            Item item = fuel.getItem();
                            fuel.shrink(1);

                            if (fuel.isEmpty()) {
                                ItemStack item1 = item.getContainerItem(fuel);
                                this.handler.setStackInSlot(2, item1);
                            }
                        }
                    }
                }
            }

            if (this.isBurning() && cookTime > 0) {
                if (cookTime == totalCookTime || cookTime > totalCookTime) {
                    TyroLogger.logServerFusion("3", "✅ Fusion effectuée avec succès : obtention de " + smelting.getUnlocalizedName()+ " dans le World : " + world.getWorldInfo().getWorldName() + " à x:" + pos.getX() + " y:" + pos.getY() + " z:" + pos.getZ());
                    if (handler.getStackInSlot(3).getCount() > 0) {
                        handler.insertItem(3, smelting, false);
                    } else {
                        handler.insertItem(3, smelting, false);
                    }

                    smelting = ItemStack.EMPTY;
                    cookTime = 0;
                    return;
                } else if (result == ItemStack.EMPTY || result.getItem().equals(smelting.getItem())){
                    cookTime++;
                }
            } else {
                if (!this.handler.getStackInSlot(0).isEmpty() && !this.handler.getStackInSlot(1).isEmpty() && cookTime == 0) {
                    if (FusionRegistry.verifFusion("3", inputs[0].getUnlocalizedName(), inputs[1].getUnlocalizedName()) && this.isBurning()) {

                        /* REQUETE POUR LA FUSION */
                        ItemStack output = FusionBlock3Recipes.getInstance().getSinteringResult(inputs[0], inputs[1]);
                        if (this.canSmelt(output)) {
                            if (!output.isEmpty()) {
                                TyroLogger.logServerFusion("3", "ℹ️ Fusion démarré (" + inputs[0].getUnlocalizedName() + " + " + inputs[1].getUnlocalizedName() + " = " + output.getUnlocalizedName() + ") dans le World : " + world.getWorldInfo().getWorldName() + " à x:" + pos.getX() + " y:" + pos.getY() + " z:" + pos.getZ());

                                smelting = output;
                                cookTime++;
                                inputs[0].shrink(1);
                                inputs[1].shrink(1);
                                handler.setStackInSlot(0, inputs[0]);
                                handler.setStackInSlot(1, inputs[1]);
                            }

                        }
                    }
                }
            }
        }

    }

    private boolean canSmelt(ItemStack result)
    {
        if(((ItemStack)this.handler.getStackInSlot(0)).isEmpty() || ((ItemStack)this.handler.getStackInSlot(1)).isEmpty()) {

            return false;
        }
        else
        {
            if(result.isEmpty()) {
                return false;
            }
            else
            {
                ItemStack output = (ItemStack)this.handler.getStackInSlot(3);
                if(output.isEmpty()) {
                    return true;
                }
                if(!output.isItemEqual(result)) {
                    return false;
                }
                int res = output.getCount() + result.getCount();
                return res <= 64 && res <= output.getMaxStackSize();
            }
        }
    }

    public static int getItemBurnTime(ItemStack fuel)
    {
        if(fuel.isEmpty()) return 0;
        else
        {
            Item item = fuel.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.AIR)
            {
                Block block = Block.getBlockFromItem(item);

//                if (block == Blocks.WOODEN_SLAB) return 150;
            }

            if (item == ItemsMod.items[937]) return 201;


            return GameRegistry.getFuelValue(fuel);
        }
    }

    public static boolean isItemFuel(ItemStack fuel)
    {
        return getItemBurnTime(fuel) > 0;
    }

    @Override
    public int getSizeInventory() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return null;
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        return null;
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {

    }

    @Override
    public int getInventoryStackLimit() {
        return 0;
    }

    public boolean isUsableByPlayer(EntityPlayer player)
    {
        return this.world.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return false;
    }

    public int getField(int id)
    {
        switch(id)
        {
            case 0:
                return this.burnTime;
            case 1:
                return this.currentBurnTime;
            case 2:
                return this.cookTime;
            case 3:
                return this.totalCookTime;
            default:
                return 0;
        }
    }

    public void setField(int id, int value)
    {
        switch(id)
        {
            case 0:
                this.burnTime = value;
                break;
            case 1:
                this.currentBurnTime = value;
                break;
            case 2:
                this.cookTime = value;
                break;
            case 3:
                this.totalCookTime = value;
        }
    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {

    }
}