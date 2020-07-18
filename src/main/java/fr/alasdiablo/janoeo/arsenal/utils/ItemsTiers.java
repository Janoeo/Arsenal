package fr.alasdiablo.janoeo.arsenal.utils;

import fr.alasdiablo.janoeo.ingots.IngotsItems;
import fr.alasdiablo.janoeo.tags.ItemsTags;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;

public enum ItemsTiers implements IItemTier {
    //COPPER(2, 32, 6.0f, 1.5f, 9, Ingredient.fromStacks(new ItemStack(IngotsItems.COPPER_INGOT))),
    COPPER(2, 32, 6.0f, 1.5f, 9, Ingredient.fromTag(Tags.Items.FENCES_WOODEN)),
    ALUMINIUM(2, 28, 5.0f, 1.0f, 6, Ingredient.fromStacks(new ItemStack(IngotsItems.ALUMINIUM_INGOT)));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    ItemsTiers(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Ingredient repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = repairMaterialIn;
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial;
    }
}