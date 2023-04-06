package fr.tyrolium.tyromod.utils;

import fr.tyrolium.tyromod.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum CustomItemTiers implements IItemTier {


    TYROLIUM(1, 420, 4.8f, 1.5f, 10, new LazyValue<>(() -> {
        return Ingredient.of(ModItems.TYROLIUM.get());
    })),


    TYROLIUM_TOOL(1, 420, 4.8f, 1.5f, 10, new LazyValue<>(() -> {
        return Ingredient.of(ModItems.TYROLIUM.get());
    })),

    ADAMENTIUM_TOOL(1, 420, 4.8f, 1.5f, 10, new LazyValue<>(() -> {
        return Ingredient.of(ModItems.ADAMENTIUM.get());
    })),



    ;

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    CustomItemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, LazyValue<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
}
