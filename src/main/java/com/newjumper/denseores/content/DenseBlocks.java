package com.newjumper.denseores.content;

import com.newjumper.denseores.DenseOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DenseBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DenseOres.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DenseOres.MOD_ID);

    public static final DeferredBlock<Block> DENSE_COAL_ORE = oreBlock("dense_coal_ore", Blocks.COAL_ORE, 2, 4);
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_COAL_ORE = oreBlock("dense_deepslate_coal_ore", Blocks.DEEPSLATE_COAL_ORE, 2, 4);
    public static final DeferredBlock<Block> DENSE_IRON_ORE = block("dense_iron_ore", Blocks.IRON_ORE);
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_IRON_ORE = block("dense_deepslate_iron_ore", Blocks.DEEPSLATE_IRON_ORE);
    public static final DeferredBlock<Block> DENSE_COPPER_ORE = block("dense_copper_ore", Blocks.COPPER_ORE);
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_COPPER_ORE = block("dense_deepslate_copper_ore", Blocks.DEEPSLATE_COPPER_ORE);
    public static final DeferredBlock<Block> DENSE_GOLD_ORE = block("dense_gold_ore", Blocks.GOLD_ORE);
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_GOLD_ORE = block("dense_deepslate_gold_ore", Blocks.DEEPSLATE_GOLD_ORE);
    public static final DeferredBlock<Block> DENSE_REDSTONE_ORE = register("dense_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE).setId(key("dense_redstone_ore"))));
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_REDSTONE_ORE = register("dense_deepslate_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(DENSE_REDSTONE_ORE.get()).setId(key("dense_deepslate_redstone_ore"))));
    public static final DeferredBlock<Block> DENSE_EMERALD_ORE = oreBlock("dense_emerald_ore", Blocks.EMERALD_ORE, 5, 9);
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_EMERALD_ORE = oreBlock("dense_deepslate_emerald_ore", Blocks.DEEPSLATE_EMERALD_ORE, 5, 9);
    public static final DeferredBlock<Block> DENSE_LAPIS_ORE = oreBlock("dense_lapis_ore", Blocks.LAPIS_ORE, 4, 7);
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_LAPIS_ORE = oreBlock("dense_deepslate_lapis_ore", Blocks.DEEPSLATE_LAPIS_ORE, 4, 7);
    public static final DeferredBlock<Block> DENSE_DIAMOND_ORE = oreBlock("dense_diamond_ore", Blocks.DIAMOND_ORE, 5, 9);
    public static final DeferredBlock<Block> DENSE_DEEPSLATE_DIAMOND_ORE = oreBlock("dense_deepslate_diamond_ore", Blocks.DEEPSLATE_DIAMOND_ORE, 5, 9);

    public static final DeferredBlock<Block> DENSE_NETHER_GOLD_ORE = oreBlock("dense_nether_gold_ore", Blocks.NETHER_GOLD_ORE, 2, 3);
    public static final DeferredBlock<Block> DENSE_NETHER_QUARTZ_ORE = oreBlock("dense_nether_quartz_ore", Blocks.NETHER_QUARTZ_ORE, 4, 7);
    public static final DeferredBlock<Block> ANCIENT_NETHER_ORE = register("ancient_nether_ore", () -> new DropExperienceBlock(UniformInt.of(2, 3), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).strength(12, 100).setId(key("ancient_nether_ore"))));

    private static DeferredBlock<Block> block(String name, Block copy) {
        return register(name, () -> new Block(BlockBehaviour.Properties.ofFullCopy(copy).setId(key(name))));
    }

    private static DeferredBlock<Block> oreBlock(String name, Block copy, int minExp, int maxExp) {
        return register(name, () -> new DropExperienceBlock(UniformInt.of(minExp, maxExp), BlockBehaviour.Properties.ofFullCopy(copy).setId(key(name))));
    }

    private static ResourceKey<Block> key(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(DenseOres.MOD_ID, name));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Supplier<T> properties) {
        DeferredBlock<T> block = BLOCKS.register(name, properties);
        ITEMS.registerSimpleBlockItem(name, block);
        return block;
    }
}
