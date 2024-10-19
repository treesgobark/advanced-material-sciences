package com.treesgobark.advanced_material_sciences;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class MyItemModelProvider extends ItemModelProvider {
    public MyItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        Item item = AdvancedMaterialSciences.FROBBLESTONE_SHARD.asItem();
        basicItem(item);
    }
}
