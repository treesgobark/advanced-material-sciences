package com.treesgobark.advanced_material_sciences.common.blocks;

import com.treesgobark.advanced_material_sciences.common.AdvancedMaterialSciences;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AMSBlocks {
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AdvancedMaterialSciences.MODID);

    // Creates a new Block with the id "examplemod:example_block", combining the namespace and path
    public static final DeferredBlock<Block> FROBBLESTONE_BLOCK = BLOCKS.registerSimpleBlock("frobblestone_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
}
