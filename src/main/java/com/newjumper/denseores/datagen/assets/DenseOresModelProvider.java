package com.newjumper.denseores.datagen.assets;

import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.content.DenseBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import org.jetbrains.annotations.NotNull;

public class DenseOresModelProvider extends ModelProvider {
    public DenseOresModelProvider(PackOutput output) {
        super(output, DenseOres.MOD_ID);
    }

    @Override
    protected void registerModels(@NotNull BlockModelGenerators blockModels, @NotNull ItemModelGenerators itemModels) {
        blockModels.createTrivialCube(DenseBlocks.DENSE_COAL_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_DEEPSLATE_COAL_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_IRON_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_DEEPSLATE_IRON_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_COPPER_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_GOLD_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_EMERALD_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_LAPIS_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_DIAMOND_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.get());

        blockModels.createTrivialCube(DenseBlocks.DENSE_NETHER_GOLD_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.DENSE_NETHER_QUARTZ_ORE.get());
        blockModels.createTrivialCube(DenseBlocks.ANCIENT_NETHER_ORE.get());
    }
}
