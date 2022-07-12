package fr.tyrolium.tyromod.init;

import fr.tyrolium.tyromod.TyroMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryBuilder;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TyroMod.ModId);

    public static final RegistryObject<Item> TYROLIUM_SWORD = ITEMS.register("tyrolium_sword", () -> new Item(new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TYROLIUM = ITEMS.register("tyrolium", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

}
