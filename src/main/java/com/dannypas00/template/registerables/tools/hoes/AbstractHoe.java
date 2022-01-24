package com.dannypas00.template.registerables.tools.hoes;

import com.dannypas00.template.Util;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.registry.Registry;

public abstract class AbstractHoe extends HoeItem {
    protected static Settings defaultSettings = new FabricItemSettings().group(ItemGroup.TOOLS);

    public AbstractHoe(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public HoeItem register() {
        return Registry.register(Registry.ITEM, Util.createIdentifierFromClass(this.getClass()), this);
    }
}
