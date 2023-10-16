package com.ynov.createnuclear.block;

import com.ynov.createnuclear.CreateNuclear;
import com.ynov.createnuclear.block.custom.SoundBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block REACTOR_CASING_BLOCK = registerBlock("reactor_casing_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block REACTOR_COLLING_FRAME_BLOCK = registerBlock("reactor_colling_frame_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block REACTOR_CONTROLLER_BLOCK = registerBlock("reactor_controller_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block REACTOR_CORE_BLOCK = registerBlock("reactor_core_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block REACTOR_MAIN_FRAME_BLOCK = registerBlock("reactor_main_frame_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block URANIUM_BLOCK = registerBlock("uranium_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block URANIUM_ORE = registerBlock("uranium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(5,10)));
    public static final Block DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(5,10)));
    public static final Block NETHER_URANIUM_ORE = registerBlock("nether_uranium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK), UniformIntProvider.create(8,10)));
    public static final Block END_STONE_URANIUM_ORE = registerBlock("end_stone_uranium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f), UniformIntProvider.create(8,16)));


    public static final Block SOUND_BLOCK = registerBlock("sound_block", new SoundBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CreateNuclear.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CreateNuclear.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CreateNuclear.LOGGER.info("Registering ModBlocks for " + CreateNuclear.MOD_ID);

    }
}
