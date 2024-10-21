package com.treesgobark.advanced_material_sciences.common.items;

import com.treesgobark.advanced_material_sciences.common.AdvancedMaterialSciences;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.treesgobark.advanced_material_sciences.common.blocks.AMSBlocks.FROBBLESTONE_BLOCK;

public class AMSItems {
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AdvancedMaterialSciences.MODID);

    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final DeferredItem<BlockItem> FROBBLESTONE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("frobblestone_block", FROBBLESTONE_BLOCK);
    // Creates a new food item with the id "examplemod:example_id", nutrition 1 and saturation 2
    public static final DeferredItem<Item> FROBBLESTONE_SHARD = ITEMS.registerSimpleItem("frobblestone_shard", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build()));
}
