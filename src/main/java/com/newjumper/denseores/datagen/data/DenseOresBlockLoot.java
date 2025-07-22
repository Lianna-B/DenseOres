package com.newjumper.denseores.datagen.data;

import com.newjumper.denseores.content.DenseBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class DenseOresBlockLoot extends BlockLootSubProvider {
    public DenseOresBlockLoot(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        add(DenseBlocks.DENSE_COAL_ORE.get(), denseOreDrop(DenseBlocks.DENSE_COAL_ORE.get(), Items.COAL, 2, 4));
        add(DenseBlocks.DENSE_DEEPSLATE_COAL_ORE.get(), denseOreDrop(DenseBlocks.DENSE_DEEPSLATE_COAL_ORE.get(), Items.COAL, 2, 4));
        add(DenseBlocks.DENSE_IRON_ORE.get(), denseOreDrop(DenseBlocks.DENSE_IRON_ORE.get(), Items.RAW_IRON, 2, 4));
        add(DenseBlocks.DENSE_DEEPSLATE_IRON_ORE.get(), denseOreDrop(DenseBlocks.DENSE_DEEPSLATE_IRON_ORE.get(), Items.RAW_IRON, 2, 4));
        add(DenseBlocks.DENSE_COPPER_ORE.get(), denseOreDrop(DenseBlocks.DENSE_COPPER_ORE.get(), Items.RAW_COPPER, 4, 12));
        add(DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE.get(), denseOreDrop(DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE.get(), Items.RAW_COPPER, 4, 12));
        add(DenseBlocks.DENSE_GOLD_ORE.get(), denseOreDrop(DenseBlocks.DENSE_GOLD_ORE.get(), Items.RAW_GOLD, 2, 4));
        add(DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE.get(), denseOreDrop(DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE.get(), Items.RAW_GOLD, 2, 4));
        add(DenseBlocks.DENSE_REDSTONE_ORE.get(), denseOreDrop(DenseBlocks.DENSE_REDSTONE_ORE.get(), Items.REDSTONE, 6, 12));
        add(DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.get(), denseOreDrop(DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.get(), Items.REDSTONE, 6, 12));
        add(DenseBlocks.DENSE_EMERALD_ORE.get(), denseOreDrop(DenseBlocks.DENSE_EMERALD_ORE.get(), Items.EMERALD, 2, 3));
        add(DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE.get(), denseOreDrop(DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE.get(), Items.EMERALD, 2, 3));
        add(DenseBlocks.DENSE_LAPIS_ORE.get(), denseOreDrop(DenseBlocks.DENSE_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 6, 18));
        add(DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE.get(), denseOreDrop(DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 6, 18));
        add(DenseBlocks.DENSE_DIAMOND_ORE.get(), denseOreDrop(DenseBlocks.DENSE_DIAMOND_ORE.get(), Items.DIAMOND, 2, 3));
        add(DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.get(), denseOreDrop(DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.get(), Items.DIAMOND, 2, 3));

        add(DenseBlocks.DENSE_NETHER_GOLD_ORE.get(), denseOreDrop(DenseBlocks.DENSE_NETHER_GOLD_ORE.get(), Items.GOLD_NUGGET, 4, 12));
        add(DenseBlocks.DENSE_NETHER_QUARTZ_ORE.get(), denseOreDrop(DenseBlocks.DENSE_NETHER_QUARTZ_ORE.get(), Items.QUARTZ, 2, 4));
        add(DenseBlocks.ANCIENT_NETHER_ORE.get(), denseOreDrop(DenseBlocks.ANCIENT_NETHER_ORE.get(), Items.NETHERITE_SCRAP, 1, 2));
    }

    private LootTable.Builder denseOreDrop(Block block, Item item, int min, int max) {
        return createSilkTouchDispatchTable(block, applyExplosionDecay(block, LootItem.lootTableItem(item).apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max))).apply(ApplyBonusCount.addUniformBonusCount(registries.holderOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return DenseBlocks.BLOCKS.getEntries().stream().map(block -> block.getDelegate().value())::iterator;
    }
}
