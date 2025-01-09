package com.newjumper.denseores.datagen.data;

import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.content.DenseOresTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class DenseOresItemTagsProvider extends ItemTagsProvider {
    public DenseOresItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags, DenseOres.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(Tags.Blocks.ORES_COAL, Tags.Items.ORES_COAL);
        copy(Tags.Blocks.ORES_IRON, Tags.Items.ORES_IRON);
        copy(Tags.Blocks.ORES_COPPER, Tags.Items.ORES_COPPER);
        copy(Tags.Blocks.ORES_GOLD, Tags.Items.ORES_GOLD);
        copy(Tags.Blocks.ORES_REDSTONE, Tags.Items.ORES_REDSTONE);
        copy(Tags.Blocks.ORES_EMERALD, Tags.Items.ORES_EMERALD);
        copy(Tags.Blocks.ORES_LAPIS, Tags.Items.ORES_LAPIS);
        copy(Tags.Blocks.ORES_DIAMOND, Tags.Items.ORES_DIAMOND);
        copy(Tags.Blocks.ORES_NETHERITE_SCRAP, Tags.Items.ORES_NETHERITE_SCRAP);
        copy(Tags.Blocks.ORE_RATES_DENSE, Tags.Items.ORE_RATES_DENSE);
        copy(Tags.Blocks.ORES_IN_GROUND_STONE, Tags.Items.ORES_IN_GROUND_STONE);
        copy(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, Tags.Items.ORES_IN_GROUND_DEEPSLATE);

        copy(DenseOresTags.Blocks.DENSE_STONE_ORES, DenseOresTags.Items.DENSE_STONE_ORES);
        copy(DenseOresTags.Blocks.DENSE_DEEPSLATE_ORES, DenseOresTags.Items.DENSE_DEEPSLATE_ORES);
        copy(DenseOresTags.Blocks.DENSE_NETHERRACK_ORES, DenseOresTags.Items.DENSE_NETHERRACK_ORES);
    }
}
