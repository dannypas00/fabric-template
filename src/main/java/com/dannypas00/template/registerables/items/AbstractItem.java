package com.dannypas00.template.registerables.items;

import com.dannypas00.template.Util;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public abstract class AbstractItem extends Item implements FabricItem {
    public AbstractItem(Settings settings) {
        super(settings);
    }

    public Item register() {
        return Registry.register(Registry.ITEM, Util.createIdentifierFromClass(this.getClass()), this);
    }
}
