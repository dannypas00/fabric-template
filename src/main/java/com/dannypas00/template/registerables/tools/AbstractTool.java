package com.dannypas00.template.registerables.tools;

import com.dannypas00.template.Util;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.registry.Registry;

public abstract class AbstractTool extends ToolItem {
    public AbstractTool(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    public void register() {
        Registry.register(Registry.ITEM, Util.createIdentifierFromClass(this.getClass()), this);
    }
}
