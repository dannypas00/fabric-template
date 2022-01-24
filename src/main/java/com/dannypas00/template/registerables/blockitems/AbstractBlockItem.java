package com.dannypas00.template.registerables.blockitems;

import com.dannypas00.template.Util;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;

public abstract class AbstractBlockItem extends BlockItem {
    public AbstractBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    public BlockItem register() {
        return Registry.register(Registry.ITEM, Util.createIdentifierFromClass(this.getClass()), this);
    }
}
