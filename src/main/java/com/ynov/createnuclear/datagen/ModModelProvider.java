package com.ynov.createnuclear.datagen;

import com.ynov.createnuclear.block.ModBlocks;
import com.ynov.createnuclear.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_URANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_URANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_URANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REACTOR_CORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REACTOR_CONTROLLER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REACTOR_CASING_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REACTOR_MAIN_FRAME_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REACTOR_COLLING_FRAME_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.URANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM_ROD, Models.GENERATED);
    }
}
