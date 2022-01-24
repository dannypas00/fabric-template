package com.dannypas00.template.registerables.tools.shovels;

import com.dannypas00.template.Util;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.registry.Registry;

public abstract class AbstractShovel extends ShovelItem {
    protected static Settings defaultSettings = new FabricItemSettings().group(ItemGroup.TOOLS);

    public AbstractShovel(ToolMaterial toolMaterial, float attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public ShovelItem register() {
        return Registry.register(Registry.ITEM, Util.createIdentifierFromClass(this.getClass()), this);
    }
}
