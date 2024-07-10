package fr.tyrolium.tyromod.tileentity.container;

import fr.tyrolium.tyromod.tileentity.TileEntityFusionBlockFinal;
import fr.tyrolium.tyromod.tileentity.recipes.FusionBlockFinalRecipes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class FusionBlockFinalContainer extends Container
{
    private final TileEntityFusionBlockFinal tileentity;
    private int cookTime, totalCookTime, burnTime, currentBurnTime;

    public FusionBlockFinalContainer(InventoryPlayer player, TileEntityFusionBlockFinal tileentity)
    {
        this.tileentity = tileentity;
        IItemHandler handler = tileentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);

        this.addSlotToContainer(new SlotItemHandler(handler, 0, 12 - 4, 8 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 1, 30 - 4, 8 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 4, 48 - 4, 8 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 22, 66 - 4, 8 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 5, 84 - 4, 8 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 6, 102 - 4, 8 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 7, 120 - 4, 8 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 8, 138 - 4, 8 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 9, 156 - 4, 8 - 18));

        this.addSlotToContainer(new SlotItemHandler(handler, 10, 12 - 4, 26 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 11, 30 - 4, 26 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 12, 48 - 4, 26 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 31, 66 - 4, 26 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 13, 84 - 4, 26 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 14, 102 - 4, 26 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 15, 120 - 4, 26 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 16, 138 - 4, 26 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 17, 156 - 4, 26 - 18));

        this.addSlotToContainer(new SlotItemHandler(handler, 18, 12 - 4, 44 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 19, 30 - 4, 44 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 20, 48 - 4, 44 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 30, 66 - 4, 44 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 21, 84 - 4, 44 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 23, 102 - 4, 44 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 24, 120 - 4, 44 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 25, 138 - 4, 44 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 26, 156 - 4, 44 - 18));

        this.addSlotToContainer(new SlotItemHandler(handler, 27, 12 - 4, 62 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 28, 30 - 4, 62 - 18));

        /*RESULT*/ this.addSlotToContainer(new SlotItemHandler(handler, 3, 84 - 4, 72 - 18));

        this.addSlotToContainer(new SlotItemHandler(handler, 29, 138 - 4, 62 - 18));
        this.addSlotToContainer(new SlotItemHandler(handler, 2, 156 - 4, 62 - 18));

        for(int y = 0; y < 3; y++)
        {
            for(int x = 0; x < 9; x++)
            {
                this.addSlotToContainer(new Slot(player, x + y*9 + 9, 8 + x*18, 84 + y*18));
            }
        }

        for(int x = 0; x < 9; x++)
        {
            this.addSlotToContainer(new Slot(player, x, 8 + x * 18, 142));
        }
    }

    @Override
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for(int i = 0; i < this.listeners.size(); ++i)
        {
            IContainerListener listener = (IContainerListener)this.listeners.get(i);

            if(this.cookTime != this.tileentity.getField(2)) listener.sendWindowProperty(this, 2, this.tileentity.getField(2));
            if(this.burnTime != this.tileentity.getField(0)) listener.sendWindowProperty(this, 0, this.tileentity.getField(0));
            if(this.currentBurnTime != this.tileentity.getField(1)) listener.sendWindowProperty(this, 1, this.tileentity.getField(1));
            if(this.totalCookTime != this.tileentity.getField(3)) listener.sendWindowProperty(this, 3, this.tileentity.getField(3));
        }

        this.cookTime = this.tileentity.getField(2);
        this.burnTime = this.tileentity.getField(0);
        this.currentBurnTime = this.tileentity.getField(1);
        this.totalCookTime = this.tileentity.getField(3);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data)
    {
        this.tileentity.setField(id, data);
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return this.tileentity.isUsableByPlayer(playerIn);
    }
//
//    @Override
//    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
//    {
//        ItemStack stack = ItemStack.EMPTY;
//        Slot slot = (Slot)this.inventorySlots.get(index);
//
//        if(slot != null && slot.getHasStack())
//        {
//            ItemStack stack1 = slot.getStack();
//            stack = stack1.copy();
//
//            if(index == 3)
//            {
//                if(!this.mergeItemStack(stack1, 4, 40, true)) return ItemStack.EMPTY;
//                slot.onSlotChange(stack1, stack);
//            }
//            else if(index != 2 && index != 1 && index != 0)
//            {
//                Slot slot1 = (Slot)this.inventorySlots.get(index + 1);
//
//                if(!FusionBlockFinalRecipes.getInstance().getSinteringResult(stack1, slot1.getStack()).isEmpty())
//                {
//                    if(!this.mergeItemStack(stack1, 0, 2, false))
//                    {
//                        return ItemStack.EMPTY;
//                    }
//                    else if(TileEntityFusionBlockFinal.isItemFuel(stack1))
//                    {
//                        if(!this.mergeItemStack(stack1, 2, 3, false)) return ItemStack.EMPTY;
//                    }
//                    else if(TileEntityFusionBlockFinal.isItemFuel(stack1))
//                    {
//                        if(!this.mergeItemStack(stack1, 2, 3, false)) return ItemStack.EMPTY;
//                    }
//                    else if(TileEntityFusionBlockFinal.isItemFuel(stack1))
//                    {
//                        if(!this.mergeItemStack(stack1, 2, 3, false)) return ItemStack.EMPTY;
//                    }
//                    else if(index >= 4 && index < 31)
//                    {
//                        if(!this.mergeItemStack(stack1, 31, 40, false)) return ItemStack.EMPTY;
//                    }
//                    else if(index >= 31 && index < 40 && !this.mergeItemStack(stack1, 4, 31, false))
//                    {
//                        return ItemStack.EMPTY;
//                    }
//                }
//            }
//            else if(!this.mergeItemStack(stack1, 4, 40, false))
//            {
//                return ItemStack.EMPTY;
//            }
//            if(stack1.isEmpty())
//            {
//                slot.putStack(ItemStack.EMPTY);
//            }
//            else
//            {
//                slot.onSlotChanged();
//
//            }
//            if(stack1.getCount() == stack.getCount()) return ItemStack.EMPTY;
//            slot.onTake(playerIn, stack1);
//        }
//        return stack;
//    }
}
