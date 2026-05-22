package com.newjumper.denseores.world;

import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.content.DenseBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class DenseConfiguredFeatures {
    public static final RuleTest STONE_REPLACEABLES = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
    public static final RuleTest DEEPSLATE_REPLACEABLES = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
    public static final RuleTest NETHER_REPLACEABLES = new BlockMatchTest(Blocks.NETHERRACK);

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_COAL = create("dense_coal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_COAL_BURIED = create("ore_dense_coal_buried");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_IRON_SMALL = create("ore_dense_iron_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_IRON_LARGE = create("ore_dense_iron_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_COPPER = create("ore_dense_copper");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_GOLD = create("ore_dense_gold");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_GOLD_EXTRA = create("ore_dense_gold_extra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_REDSTONE_UPPER = create("ore_dense_redstone_upper");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_REDSTONE_LOWER = create("ore_dense_redstone_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_EMERALD = create("ore_dense_emerald");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_LAPIS_UPPER = create("ore_dense_lapis_upper");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_LAPIS_LOWER = create("ore_dense_lapis_lower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_DIAMOND_SMALL = create("ore_dense_diamond_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_DIAMOND_LARGE = create("ore_dense_diamond_large");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_NETHER_GOLD = create("ore_dense_nether_gold");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DENSE_NETHER_QUARTZ = create("ore_dense_nether_quartz");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ANCIENT_NETHER_UPPER = create("ore_ancient_nether_upper");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ANCIENT_NETHER_LOWER = create("ore_ancient_nether_lower");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        List<OreConfiguration.TargetBlockState> DENSE_COAL_TARGET_LIST = List.of(OreConfiguration.target(STONE_REPLACEABLES, DenseBlocks.DENSE_COAL_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_REPLACEABLES, DenseBlocks.DENSE_DEEPSLATE_COAL_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> DENSE_IRON_TARGET_LIST = List.of(OreConfiguration.target(STONE_REPLACEABLES, DenseBlocks.DENSE_IRON_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_REPLACEABLES, DenseBlocks.DENSE_DEEPSLATE_IRON_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> DENSE_COPPER_TARGET_LIST = List.of(OreConfiguration.target(STONE_REPLACEABLES, DenseBlocks.DENSE_COPPER_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_REPLACEABLES, DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> DENSE_GOLD_TARGET_LIST = List.of(OreConfiguration.target(STONE_REPLACEABLES, DenseBlocks.DENSE_GOLD_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_REPLACEABLES, DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE.get().defaultBlockState()), OreConfiguration.target(NETHER_REPLACEABLES, DenseBlocks.DENSE_NETHER_GOLD_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> DENSE_REDSTONE_TARGET_LIST = List.of(OreConfiguration.target(STONE_REPLACEABLES, DenseBlocks.DENSE_REDSTONE_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_REPLACEABLES, DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> DENSE_EMERALD_TARGET_LIST = List.of(OreConfiguration.target(STONE_REPLACEABLES, DenseBlocks.DENSE_EMERALD_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_REPLACEABLES, DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> DENSE_LAPIS_TARGET_LIST = List.of(OreConfiguration.target(STONE_REPLACEABLES, DenseBlocks.DENSE_LAPIS_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_REPLACEABLES, DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> DENSE_DIAMOND_TARGET_LIST = List.of(OreConfiguration.target(STONE_REPLACEABLES, DenseBlocks.DENSE_DIAMOND_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_REPLACEABLES, DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> DENSE_QUARTZ_TARGET_LIST = List.of(OreConfiguration.target(NETHER_REPLACEABLES, DenseBlocks.DENSE_NETHER_QUARTZ_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> ANCIENT_NETHER_TARGET_LIST = List.of(OreConfiguration.target(NETHER_REPLACEABLES, DenseBlocks.ANCIENT_NETHER_ORE.get().defaultBlockState()));

        FeatureUtils.register(context, ORE_DENSE_COAL, Feature.ORE, new OreConfiguration(DENSE_COAL_TARGET_LIST, 8));
        FeatureUtils.register(context, ORE_DENSE_COAL_BURIED, Feature.ORE, new OreConfiguration(DENSE_COAL_TARGET_LIST, 10, 0.9f));
        FeatureUtils.register(context, ORE_DENSE_IRON_SMALL, Feature.ORE, new OreConfiguration(DENSE_IRON_TARGET_LIST, 7));
        FeatureUtils.register(context, ORE_DENSE_IRON_LARGE, Feature.ORE, new OreConfiguration(DENSE_IRON_TARGET_LIST, 9, 0.5f));
        FeatureUtils.register(context, ORE_DENSE_COPPER, Feature.ORE, new OreConfiguration(DENSE_COPPER_TARGET_LIST, 8, 0.7f));
        FeatureUtils.register(context, ORE_DENSE_GOLD, Feature.ORE, new OreConfiguration(DENSE_GOLD_TARGET_LIST, 8, 0.3f));
        FeatureUtils.register(context, ORE_DENSE_GOLD_EXTRA, Feature.ORE, new OreConfiguration(DENSE_GOLD_TARGET_LIST, 7, 0.2f));
        FeatureUtils.register(context, ORE_DENSE_REDSTONE_UPPER, Feature.ORE, new OreConfiguration(DENSE_REDSTONE_TARGET_LIST, 7, 0.7f));
        FeatureUtils.register(context, ORE_DENSE_REDSTONE_LOWER, Feature.ORE, new OreConfiguration(DENSE_REDSTONE_TARGET_LIST, 9, 0.6f));
        FeatureUtils.register(context, ORE_DENSE_EMERALD, Feature.ORE, new OreConfiguration(DENSE_EMERALD_TARGET_LIST, 6, 0.5f));
        FeatureUtils.register(context, ORE_DENSE_LAPIS_UPPER, Feature.ORE, new OreConfiguration(DENSE_LAPIS_TARGET_LIST, 8));
        FeatureUtils.register(context, ORE_DENSE_LAPIS_LOWER, Feature.ORE, new OreConfiguration(DENSE_LAPIS_TARGET_LIST, 9, 0.2f));
        FeatureUtils.register(context, ORE_DENSE_DIAMOND_SMALL, Feature.ORE, new OreConfiguration(DENSE_DIAMOND_TARGET_LIST, 6, 0.4f));
        FeatureUtils.register(context, ORE_DENSE_DIAMOND_LARGE, Feature.ORE, new OreConfiguration(DENSE_DIAMOND_TARGET_LIST, 9, 0.8f));

        FeatureUtils.register(context, ORE_DENSE_NETHER_GOLD, Feature.ORE, new OreConfiguration(DENSE_GOLD_TARGET_LIST, 7));
        FeatureUtils.register(context, ORE_DENSE_NETHER_QUARTZ, Feature.ORE, new OreConfiguration(DENSE_QUARTZ_TARGET_LIST, 9, 0.1f));
        FeatureUtils.register(context, ORE_ANCIENT_NETHER_UPPER, Feature.ORE, new OreConfiguration(ANCIENT_NETHER_TARGET_LIST, 8, 1f));
        FeatureUtils.register(context, ORE_ANCIENT_NETHER_LOWER, Feature.ORE, new OreConfiguration(ANCIENT_NETHER_TARGET_LIST, 7, 0.9f));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> create(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, DenseOres.rl(name));
    }
}
