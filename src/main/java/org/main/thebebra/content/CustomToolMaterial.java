package org.main.thebebra.content;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import org.main.thebebra.content.items.Items;

import java.util.function.Supplier;

public enum CustomToolMaterial implements ToolMaterial {
    BEBRONIUM(4, 2866, 11.5F, 0, 20, () -> Ingredient.ofItems(Items.Bebronium)),
    HIPEPSIUM(5, 3412, 13F, 0, 23, () -> Ingredient.ofItems(Items.Hipepsium));
    public final int miningLevel;
    public final int itemDurability;
    public final float miningSpeed;
    public final float attackDamage;
    public final int enchantability;
    public final Supplier<Ingredient> repairIngredient;

    CustomToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
