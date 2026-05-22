package com.newjumper.denseores.content;

import com.newjumper.denseores.DenseOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class DenseOresTags {
    public static class Blocks {
        public static final TagKey<Block> DENSE_STONE_ORES = tag("dense_stone_ores");
        public static final TagKey<Block> DENSE_DEEPSLATE_ORES = tag("dense_deepslate_ores");
        public static final TagKey<Block> DENSE_NETHERRACK_ORES = tag("dense_netherrack_ores");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(DenseOres.rl(name));
        }
    }

    public static class Items {
        public static final TagKey<Item> DENSE_STONE_ORES = tag("dense_stone_ores");
        public static final TagKey<Item> DENSE_DEEPSLATE_ORES = tag("dense_deepslate_ores");
        public static final TagKey<Item> DENSE_NETHERRACK_ORES = tag("dense_netherrack_ores");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(DenseOres.rl(name));
        }
    }

    public static class Biomes {
        public static final TagKey<Biome> IS_MOUNTAIN = TagKey.create(Registries.BIOME, DenseOres.rl("is_mountain"));
    }
}
