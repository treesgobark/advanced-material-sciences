package com.treesgobark.advanced_material_sciences;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class MyBlockStateProvider extends BlockStateProvider
{
    public MyBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, AdvancedMaterialSciences.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        Block block = AdvancedMaterialSciences.FROBBLESTONE_BLOCK.get();

        // Create a simple block model with the same texture on each side.
        // The texture must be located at assets/<namespace>/textures/block/<path>.png, where
        // <namespace> and <path> are the block's registry name's namespace and path, respectively.
        // Used by the majority of (full) blocks, such as planks, cobblestone or bricks.
        simpleBlock(block);
    }
}
