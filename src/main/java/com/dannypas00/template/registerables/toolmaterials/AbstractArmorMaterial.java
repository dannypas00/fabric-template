package com.dannypas00.template.registerables.toolmaterials;

import com.dannypas00.template.Util;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public abstract class AbstractArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final float[] BASE_PROTECTION = new float[]{1, 2, 2.5f, 1};


    @Override
    public int getDurability(EquipmentSlot slot) {
        return Math.round(BASE_DURABILITY[slot.getEntitySlotId()] * this.getDurabilityMultiplier());
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return Math.round(BASE_PROTECTION[slot.getEntitySlotId()] * this.getProtectionMultiplier());
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0f;
    }

    @Override
    public String getName() {
        return Util.pathFromClass(this.getClass());
    }

    /**
     * Leather: 15
     * Chain: 12
     * Iron: 9
     * Gold: 25
     * Diamond: 10
     * Turtle: 9
     * Netherite: 15
     */
    @Override
    public abstract int getEnchantability();

    /**
     * Leather: 1.2
     * Iron: 2.5
     * Diamond: 3
     * Netherite: 3
     */
    public abstract float getProtectionMultiplier();

    /**
     * Diamond: 2
     * Netherite: 3
     * All else: 0
     */
    @Override
    public abstract float getToughness();

    /**
     * Leather: 5
     * Chain: 15
     * Iron: 15
     * Gold: 7
     * Diamond: 33
     * Turtle: 25
     * Netherite: 37
     */
    public abstract float getDurabilityMultiplier();

    @Override
    public abstract SoundEvent getEquipSound();

    @Override
    public abstract Ingredient getRepairIngredient();
}
