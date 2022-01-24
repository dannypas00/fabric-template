package com.dannypas00.template.registerables.tools.pickaxes;

import com.dannypas00.template.Util;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.registry.Registry;

public abstract class AbstractPickaxe extends PickaxeItem {
    protected static Settings defaultSettings = new FabricItemSettings().group(ItemGroup.TOOLS);

    public AbstractPickaxe(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public PickaxeItem register() {
        return Registry.register(Registry.ITEM, Util.createIdentifierFromClass(this.getClass()), this);
    }
}
