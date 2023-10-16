package com.ynov.createnuclear.datagen;

import com.ynov.createnuclear.block.ModBlocks;
import com.ynov.createnuclear.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SOUND_BLOCK);
        addDrop(ModBlocks.URANIUM_BLOCK);

        addDrop(ModBlocks.REACTOR_CASING_BLOCK);
        addDrop(ModBlocks.REACTOR_CORE_BLOCK);
        addDrop(ModBlocks.REACTOR_CONTROLLER_BLOCK);
        addDrop(ModBlocks.REACTOR_COLLING_FRAME_BLOCK);
        addDrop(ModBlocks.REACTOR_MAIN_FRAME_BLOCK);

        addDrop(ModBlocks.URANIUM_ORE, uraniumOreDrops(ModBlocks.URANIUM_ORE, ModItems.URANIUM, UniformLootNumberProvider.create(3.0f, 5.0f)));
        addDrop(ModBlocks.NETHER_URANIUM_ORE, uraniumOreDrops(ModBlocks.NETHER_URANIUM_ORE, ModItems.URANIUM, UniformLootNumberProvider.create(3.0f, 5.0f)));
        addDrop(ModBlocks.END_STONE_URANIUM_ORE, uraniumOreDrops(ModBlocks.END_STONE_URANIUM_ORE, ModItems.URANIUM, UniformLootNumberProvider.create(6.0f, 12.0f)));
        addDrop(ModBlocks.DEEPSLATE_URANIUM_ORE, uraniumOreDrops(ModBlocks.DEEPSLATE_URANIUM_ORE, ModItems.URANIUM, UniformLootNumberProvider.create(3.0f, 5.0f)));

        addDrop(ModBlocks.URANIUM_STAIRS);
        addDrop(ModBlocks.URANIUM_TRAPDOOR);
        addDrop(ModBlocks.URANIUM_WALL);
        addDrop(ModBlocks.URANIUM_FENCE);
        addDrop(ModBlocks.URANIUM_FENCE_GATE);
        addDrop(ModBlocks.URANIUM_BUTTON);
        addDrop(ModBlocks.URANIUM_PRESSURE_PLATE);

        addDrop(ModBlocks.URANIUM_DOOR, doorDrops(ModBlocks.URANIUM_DOOR));
        addDrop(ModBlocks.URANIUM_SLAB, slabDrops(ModBlocks.URANIUM_SLAB));
    }


    public LootTable.Builder uraniumOreDrops(Block dropWithSilkTouch, Item drop, UniformLootNumberProvider dropRate) {
        return BlockLootTableGenerator.dropsWithSilkTouch(dropWithSilkTouch, (LootPoolEntry.Builder)this.applyExplosionDecay(dropWithSilkTouch, ((LeafEntry.Builder) ItemEntry.builder(drop).apply(SetCountLootFunction.builder(dropRate))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
