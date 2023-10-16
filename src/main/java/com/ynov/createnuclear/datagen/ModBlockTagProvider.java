package com.ynov.createnuclear.datagen;

import com.ynov.createnuclear.block.ModBlocks;
import com.ynov.createnuclear.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.URANIUM_ORES)
                .add(ModBlocks.URANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE)
                .add(ModBlocks.END_STONE_URANIUM_ORE)
                .add(ModBlocks.NETHER_URANIUM_ORE);
        getOrCreateTagBuilder(ModTags.Blocks.REACTOR_BLOCKS)
                .add(ModBlocks.REACTOR_CONTROLLER_BLOCK)
                .add(ModBlocks.REACTOR_CASING_BLOCK)
                .add(ModBlocks.REACTOR_CORE_BLOCK)
                .add(ModBlocks.REACTOR_COLLING_FRAME_BLOCK)
                .add(ModBlocks.REACTOR_MAIN_FRAME_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .forceAddTag(ModTags.Blocks.URANIUM_ORES)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(ModTags.Blocks.URANIUM_ORES)
                .forceAddTag(ModTags.Blocks.REACTOR_BLOCKS)
                .add(ModBlocks.SOUND_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .forceAddTag(ModTags.Blocks.URANIUM_ORES)
                .forceAddTag(ModTags.Blocks.REACTOR_BLOCKS);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.END_STONE_URANIUM_ORE);



    }
}
