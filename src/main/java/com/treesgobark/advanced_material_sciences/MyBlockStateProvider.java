package com.treesgobark.advanced_material_sciences;

import com.treesgobark.advanced_material_sciences.common.blocks.AMSBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static com.treesgobark.advanced_material_sciences.common.AdvancedMaterialSciences.MODID;

public class MyBlockStateProvider extends BlockStateProvider
{
    public MyBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        ModelFile model = models().withExistingParent(AMSBlocks.FROBBLESTONE_BLOCK.getId().getPath(), mcLoc("block/cobblestone"));
        Block block = AMSBlocks.FROBBLESTONE_BLOCK.get();

        simpleBlock(block);
        simpleBlockItem(block, model);
    }
}

