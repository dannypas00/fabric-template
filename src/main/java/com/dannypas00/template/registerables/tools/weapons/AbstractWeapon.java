package com.dannypas00.template.registerables.tools.weapons;

import com.dannypas00.template.Util;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.registry.Registry;

public abstract class AbstractWeapon extends SwordItem {
    public AbstractWeapon(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public SwordItem register() {
        return Registry.register(Registry.ITEM, Util.createIdentifierFromClass(this.getClass()), this);
    }
}
