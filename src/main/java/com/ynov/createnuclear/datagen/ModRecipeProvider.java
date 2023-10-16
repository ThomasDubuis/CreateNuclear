package com.ynov.createnuclear.datagen;

import com.ynov.createnuclear.block.ModBlocks;
import com.ynov.createnuclear.item.ModItems;
import com.ynov.createnuclear.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> URANIUM_SMELTABLES = List.of(ModBlocks.URANIUM_ORE, ModBlocks.NETHER_URANIUM_ORE, ModBlocks.DEEPSLATE_URANIUM_ORE, ModBlocks.END_STONE_URANIUM_ORE);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM, 0.7f, 200, "uranium");
        offerBlasting(exporter, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM, 0.7f, 100, "uranium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.URANIUM, RecipeCategory.DECORATIONS, ModBlocks.URANIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.URANIUM_ROD, 1)
                .pattern("  U")
                .pattern(" U ")
                .pattern("U  ")
                .input('U', ModItems.URANIUM)
                .criterion(hasItem(ModItems.URANIUM), conditionsFromItem(ModItems.URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.URANIUM_ROD)));

    }
}
