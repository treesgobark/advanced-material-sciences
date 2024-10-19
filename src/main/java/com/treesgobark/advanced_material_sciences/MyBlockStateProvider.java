package com.treesgobark.advanced_material_sciences;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static com.treesgobark.advanced_material_sciences.AdvancedMaterialSciences.MODID;

public class MyBlockStateProvider extends BlockStateProvider
{
    public MyBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        ModelFile model = models().withExistingParent(AdvancedMaterialSciences.FROBBLESTONE_BLOCK.getId().getPath(), "minecraft:block/cobblestone");
        Block block = AdvancedMaterialSciences.FROBBLESTONE_BLOCK.get();

        // Create a simple block model with the same texture on each side.
        // The texture must be located at assets/<namespace>/textures/block/<path>.png, where
        // <namespace> and <path> are the block's registry name's namespace and path, respectively.
        // Used by the majority of (full) blocks, such as planks, cobblestone or bricks.
        simpleBlock(block);
        simpleBlockItem(block, model);
    }
}

