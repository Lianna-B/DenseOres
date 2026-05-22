package com.newjumper.denseores.datagen.data;

import com.google.common.collect.ImmutableList;
import com.newjumper.denseores.DenseOres;
import com.newjumper.denseores.content.DenseBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("NullableProblems")
public class SmeltingRecipesProvider extends RecipeProvider {
    private static final ImmutableList<ItemLike> DENSE_COAL_ORES = ImmutableList.of(DenseBlocks.DENSE_COAL_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_COAL_ORE.get());
    private static final ImmutableList<ItemLike> DENSE_IRON_ORES = ImmutableList.of(DenseBlocks.DENSE_IRON_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_IRON_ORE.get());
    private static final ImmutableList<ItemLike> DENSE_COPPER_ORES = ImmutableList.of(DenseBlocks.DENSE_COPPER_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_COPPER_ORE.get());
    private static final ImmutableList<ItemLike> DENSE_GOLD_ORES = ImmutableList.of(DenseBlocks.DENSE_GOLD_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_GOLD_ORE.get(), DenseBlocks.DENSE_NETHER_GOLD_ORE.get());
    private static final ImmutableList<ItemLike> DENSE_REDSTONE_ORES = ImmutableList.of(DenseBlocks.DENSE_REDSTONE_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_REDSTONE_ORE.get());
    private static final ImmutableList<ItemLike> DENSE_EMERALD_ORES = ImmutableList.of(DenseBlocks.DENSE_EMERALD_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_EMERALD_ORE.get());
    private static final ImmutableList<ItemLike> DENSE_LAPIS_ORES = ImmutableList.of(DenseBlocks.DENSE_LAPIS_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_LAPIS_ORE.get());
    private static final ImmutableList<ItemLike> DENSE_DIAMOND_ORES = ImmutableList.of(DenseBlocks.DENSE_DIAMOND_ORE.get(), DenseBlocks.DENSE_DEEPSLATE_DIAMOND_ORE.get());

    protected SmeltingRecipesProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        smelting(DENSE_COAL_ORES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.COAL, 0.4f, "coal", output);
        smelting(DENSE_IRON_ORES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.IRON_INGOT, 2.8f, "iron_ingot", output);
        smelting(DENSE_COPPER_ORES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.COPPER_INGOT, 2.8f, "copper_ingot", output);
        smelting(DENSE_GOLD_ORES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.GOLD_INGOT, 4f, "gold_ingot", output);
        smelting(DENSE_REDSTONE_ORES, RecipeCategory.REDSTONE, CookingBookCategory.BLOCKS, Items.REDSTONE, 2.8f, "redstone", output);
        smelting(DENSE_EMERALD_ORES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.EMERALD, 4f, "emerald", output);
        smelting(DENSE_LAPIS_ORES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.LAPIS_LAZULI, 0.8f, "lapis_lazuli", output);
        smelting(DENSE_DIAMOND_ORES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.DIAMOND, 4f, "diamond", output);
    }

    private void smelting(List<ItemLike> ingredients, RecipeCategory category, CookingBookCategory cookingCategory, ItemLike result, float experience, String group, RecipeOutput output) {
        for(ItemLike item : ingredients) {
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(item), category, cookingCategory, result, experience, 200).group(group).unlockedBy(getHasName(item), has(item)).save(output, DenseOres.rl(getSmeltingRecipeName(result) + "_" + getItemName(item)).toString());
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(item), category, cookingCategory, result, experience, 100).group(group).unlockedBy(getHasName(item), has(item)).save(output, DenseOres.rl(getBlastingRecipeName(result) + "_" + getItemName(item)).toString());
        }
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new SmeltingRecipesProvider(registries, output);
        }

        @Override
        public String getName() {
            return "Smelting Recipes";
        }
    }
}
