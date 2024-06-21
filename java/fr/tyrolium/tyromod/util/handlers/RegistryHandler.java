package fr.tyrolium.tyromod.util.handlers;

import fr.tyrolium.tyromod.Global;
import fr.tyrolium.tyromod.TyroMod;
import fr.tyrolium.tyromod.init.BlocksMod;
import fr.tyrolium.tyromod.init.ItemsMod;
import fr.tyrolium.tyromod.init.RecipesMod;
import fr.tyrolium.tyromod.proxy.Client;
import fr.tyrolium.tyromod.world.generation.WorldGenOres;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemsMod.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BlocksMod.BLOCKS.toArray(new Block[0]));
        TileEntityHandler.registerTileEntities();
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {

        for(Item item : ItemsMod.ITEMS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }

        for(Block block : BlocksMod.BLOCKS)
        {
            if(block instanceof IHasModel)
            {
                ((IHasModel)block).registerModels();
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent e)
    {
        EntityPlayer player = e.player;
        if(e.player.world.getBlockState(new BlockPos(player.posX, player.posY - 1, player.posZ)).getBlock() == BlocksMod.getBlockCustomClass("bc106"))
        {
            if(player.isSneaking())
            {
                for(int i = (int)(player.posY - 2); i > 0; i--)
                {
                    if(e.player.world.getBlockState(new BlockPos(player.posX, i, player.posZ)).getBlock() == BlocksMod.getBlockCustomClass("bc106"))
                    {
                        BlockPos pos = new BlockPos(player.posX, i, player.posZ);

                        player.setPosition(player.posX, pos.getY() + 1, player.posZ);

                    }
                }
            }
        }
    }

    public static double getElevatorJump(EntityPlayer player)
    {
        int u = 0;

        for(int i = (int)player.posY + 1; i < 256; i++)
        {

            BlockPos pos = new BlockPos(player.posX, i, player.posZ);

            if(player.world.getBlockState(pos).getBlock() == BlocksMod.getBlockCustomClass("bc106"))
            {
                u = i;
                return i;
            }
        }
        return u;
    }

    @SubscribeEvent
    public static void playerJumpingEvent(LivingEvent.LivingJumpEvent e)
    {
        if(e.getEntityLiving() instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer)e.getEntityLiving();

            if(player.world.getBlockState(new BlockPos(player.posX, player.posY - 1, player.posZ)).getBlock() == BlocksMod.getBlockCustomClass("bc106"))
            {
                player.setPosition(player.posX, getElevatorJump(player) + 1, player.posZ);
            }
        }
    }

    public static void preInitRegistries(FMLPreInitializationEvent event)
    {

        GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);

    }

    public static void initRegistries(FMLInitializationEvent event)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(TyroMod.instance, new GuiHandler());
        RecipesMod.init();

    }

    public static void postInitRegistries(FMLPostInitializationEvent event)
    {

    }
}
