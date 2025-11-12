package fr.tyrolium.tyromod.tileentity;

import fr.tyrolium.tyromod.blocks.FusionBlockFinal;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.security.TyroLogger;
import fr.tyrolium.tyromod.tileentity.recipes.FusionBlockFinalRecipes;
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

public class TileEntityFusionBlockFinal extends TileEntity implements IInventory, ITickable
{
    public ItemStackHandler handler = new ItemStackHandler(35);
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
        return this.hasCustomName() ? new TextComponentString(this.customName) : new TextComponentTranslation("container.fusion_block_final");
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

        if(compound.hasKey("FusionBlockFinal", 8)) this.setCustomName(compound.getString("FusionBlockFinal"));
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);
        compound.setInteger("BurnTime", (short)this.burnTime);
        compound.setInteger("CookTime", (short)this.cookTime);
        compound.setInteger("CookTimeTotal", (short)this.totalCookTime);
        compound.setTag("Inventory", this.handler.serializeNBT());

        if(this.hasCustomName()) compound.setString("FusionBlockFinal", this.customName);
        return compound;
    }

    public boolean isBurning()
    {
        return this.burnTime > 0;
    }

    @SideOnly(Side.CLIENT)
    public static boolean isBurning(TileEntityFusionBlockFinal te)
    {
        return te.getField(0) > 0;
    }

    public void update() {
        if (!world.isRemote) {
            if (this.isBurning()) {
                --this.burnTime;
                FusionBlockFinal.setState(true, world, pos);
            }

            ItemStack[] inputs = new ItemStack[]{
//                    handler.getStackInSlot(2), FUEL
//                    handler.getStackInSlot(3), RESULT

                    handler.getStackInSlot(0),
                    handler.getStackInSlot(1),
                    handler.getStackInSlot(4),
                    handler.getStackInSlot(22),
                    handler.getStackInSlot(5),
                    handler.getStackInSlot(6),
                    handler.getStackInSlot(7),
                    handler.getStackInSlot(8),
                    handler.getStackInSlot(9),

                    handler.getStackInSlot(10),
                    handler.getStackInSlot(11),
                    handler.getStackInSlot(12),
                    handler.getStackInSlot(31),
                    handler.getStackInSlot(13),
                    handler.getStackInSlot(14),
                    handler.getStackInSlot(15),
                    handler.getStackInSlot(16),
                    handler.getStackInSlot(17),

                    handler.getStackInSlot(18),
                    handler.getStackInSlot(19),
                    handler.getStackInSlot(20),
                    handler.getStackInSlot(30),
                    handler.getStackInSlot(21),
                    handler.getStackInSlot(23),
                    handler.getStackInSlot(24),
                    handler.getStackInSlot(25),
                    handler.getStackInSlot(26),

                    handler.getStackInSlot(27),
                    handler.getStackInSlot(28),
                    handler.getStackInSlot(29)
            };
            ItemStack fuel = this.handler.getStackInSlot(2);
            ItemStack result = this.handler.getStackInSlot(3);

//            System.out.println(inputs);

            if (!fuel.isEmpty() && !this.handler.getStackInSlot(0).isEmpty() && !this.handler.getStackInSlot(1).isEmpty() /*&& !this.handler.getStackInSlot(2).isEmpty() && !this.handler.getStackInSlot(3).isEmpty()*/ &&
                    !this.handler.getStackInSlot(4).isEmpty() && !this.handler.getStackInSlot(5).isEmpty() && !this.handler.getStackInSlot(6).isEmpty() && !this.handler.getStackInSlot(7).isEmpty() &&
                    !this.handler.getStackInSlot(8).isEmpty() && !this.handler.getStackInSlot(9).isEmpty() && !this.handler.getStackInSlot(10).isEmpty() && !this.handler.getStackInSlot(11).isEmpty() &&
                    !this.handler.getStackInSlot(12).isEmpty() && !this.handler.getStackInSlot(13).isEmpty() && !this.handler.getStackInSlot(14).isEmpty() && !this.handler.getStackInSlot(15).isEmpty() &&
                    !this.handler.getStackInSlot(16).isEmpty() && !this.handler.getStackInSlot(17).isEmpty() && !this.handler.getStackInSlot(18).isEmpty() && !this.handler.getStackInSlot(19).isEmpty() &&
                    !this.handler.getStackInSlot(20).isEmpty() && !this.handler.getStackInSlot(21).isEmpty() && !this.handler.getStackInSlot(22).isEmpty() && !this.handler.getStackInSlot(23).isEmpty() &&
                    !this.handler.getStackInSlot(24).isEmpty() && !this.handler.getStackInSlot(25).isEmpty() && !this.handler.getStackInSlot(26).isEmpty() && !this.handler.getStackInSlot(27).isEmpty() &&
                    !this.handler.getStackInSlot(28).isEmpty() && !this.handler.getStackInSlot(29).isEmpty() && !this.handler.getStackInSlot(30).isEmpty() && !this.handler.getStackInSlot(31).isEmpty() && cookTime == 0) {

                ItemStack output = FusionBlockFinalRecipes.getInstance().getSinteringResult(inputs);
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

            if (this.isBurning() && cookTime > 0) {

                if (cookTime == totalCookTime || cookTime > totalCookTime) {
                    TyroLogger.logServerFusion("Final", "✅ Fusion final réalisé");

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


                if (!this.handler.getStackInSlot(0).isEmpty() && !this.handler.getStackInSlot(1).isEmpty() /*&& !this.handler.getStackInSlot(2).isEmpty() && !this.handler.getStackInSlot(3).isEmpty()*/ &&
                        !this.handler.getStackInSlot(4).isEmpty() && !this.handler.getStackInSlot(5).isEmpty() && !this.handler.getStackInSlot(6).isEmpty() && !this.handler.getStackInSlot(7).isEmpty() &&
                        !this.handler.getStackInSlot(8).isEmpty() && !this.handler.getStackInSlot(9).isEmpty() && !this.handler.getStackInSlot(10).isEmpty() && !this.handler.getStackInSlot(11).isEmpty() &&
                        !this.handler.getStackInSlot(12).isEmpty() && !this.handler.getStackInSlot(13).isEmpty() && !this.handler.getStackInSlot(14).isEmpty() && !this.handler.getStackInSlot(15).isEmpty() &&
                        !this.handler.getStackInSlot(16).isEmpty() && !this.handler.getStackInSlot(17).isEmpty() && !this.handler.getStackInSlot(18).isEmpty() && !this.handler.getStackInSlot(19).isEmpty() &&
                        !this.handler.getStackInSlot(20).isEmpty() && !this.handler.getStackInSlot(21).isEmpty() && !this.handler.getStackInSlot(22).isEmpty() && !this.handler.getStackInSlot(23).isEmpty() &&
                        !this.handler.getStackInSlot(24).isEmpty() && !this.handler.getStackInSlot(25).isEmpty() && !this.handler.getStackInSlot(26).isEmpty() && !this.handler.getStackInSlot(27).isEmpty() &&
                        !this.handler.getStackInSlot(28).isEmpty() && !this.handler.getStackInSlot(29).isEmpty() && !this.handler.getStackInSlot(30).isEmpty() && !this.handler.getStackInSlot(31).isEmpty() && cookTime == 0) {

                    ItemStack output = FusionBlockFinalRecipes.getInstance().getSinteringResult(inputs);
                    if (this.canSmelt(output) && this.isBurning()) {
                        if (!output.isEmpty()) {
                            TyroLogger.logServerFusion("Final", "ℹ️ Fusion final démarré");

                            smelting = output;
                            cookTime++;
                            inputs[0].shrink(1);
                            inputs[1].shrink(1);
                            inputs[2].shrink(1);
                            inputs[3].shrink(1);
                            inputs[4].shrink(1);
                            inputs[5].shrink(1);
                            inputs[6].shrink(1);
                            inputs[7].shrink(1);
                            inputs[8].shrink(1);
                            inputs[9].shrink(1);
                            inputs[10].shrink(1);
                            inputs[11].shrink(1);
                            inputs[12].shrink(1);
                            inputs[13].shrink(1);
                            inputs[14].shrink(1);
                            inputs[15].shrink(1);
                            inputs[16].shrink(1);
                            inputs[17].shrink(1);
                            inputs[18].shrink(1);
                            inputs[19].shrink(1);
                            inputs[20].shrink(1);
                            inputs[21].shrink(1);
                            inputs[22].shrink(1);
                            inputs[23].shrink(1);
                            inputs[24].shrink(1);
                            inputs[25].shrink(1);
                            inputs[26].shrink(1);
                            inputs[27].shrink(1);
                            inputs[28].shrink(1);
                            inputs[29].shrink(1);

                            handler.setStackInSlot(0, inputs[0]);
                            handler.setStackInSlot(1, inputs[1]);
                            handler.setStackInSlot(4, inputs[2]);
                            handler.setStackInSlot(22, inputs[3]);
                            handler.setStackInSlot(5, inputs[4]);
                            handler.setStackInSlot(6, inputs[5]);
                            handler.setStackInSlot(7, inputs[6]);
                            handler.setStackInSlot(8, inputs[7]);
                            handler.setStackInSlot(9, inputs[8]);

                            handler.setStackInSlot(10, inputs[9]);
                            handler.setStackInSlot(11, inputs[10]);
                            handler.setStackInSlot(12, inputs[11]);
                            handler.setStackInSlot(31, inputs[12]);
                            handler.setStackInSlot(13, inputs[13]);
                            handler.setStackInSlot(14, inputs[14]);
                            handler.setStackInSlot(15, inputs[15]);
                            handler.setStackInSlot(16, inputs[16]);
                            handler.setStackInSlot(17, inputs[17]);

                            handler.setStackInSlot(18, inputs[18]);
                            handler.setStackInSlot(19, inputs[19]);
                            handler.setStackInSlot(20, inputs[20]);
                            handler.setStackInSlot(30, inputs[21]);
                            handler.setStackInSlot(21, inputs[22]);
                            handler.setStackInSlot(23, inputs[23]);
                            handler.setStackInSlot(24, inputs[24]);
                            handler.setStackInSlot(25, inputs[25]);
                            handler.setStackInSlot(26, inputs[26]);

                            handler.setStackInSlot(27, inputs[27]);
                            handler.setStackInSlot(28, inputs[28]);
                            handler.setStackInSlot(29, inputs[29]);

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