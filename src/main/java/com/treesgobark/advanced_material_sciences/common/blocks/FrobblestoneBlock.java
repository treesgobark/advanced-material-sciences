package com.treesgobark.advanced_material_sciences.common.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FrobblestoneBlock extends Block {
    public FrobblestoneBlock(Properties properties) {
        super(properties);
    }

    @Override
    public MapCodec<FrobblestoneBlock> codec() {
        return SIMPLE_CODEC.value();
    }

    public static final DeferredRegister<MapCodec<? extends Block>> REGISTRAR = DeferredRegister.create(BuiltInRegistries.BLOCK_TYPE, "yourmodid");

    public static final DeferredHolder<MapCodec<? extends Block>, MapCodec<FrobblestoneBlock>> SIMPLE_CODEC = REGISTRAR.register(
            "simple",
            () -> simpleCodec(FrobblestoneBlock::new)
    );
}
