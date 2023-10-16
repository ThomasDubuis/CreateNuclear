package com.ynov.createnuclear.item;

import com.ynov.createnuclear.CreateNuclear;
import com.ynov.createnuclear.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup URANIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CreateNuclear.MOD_ID, "createnucleargroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.createnuclear"))
                    .icon(()-> new ItemStack(ModItems.URANIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.URANIUM);
                        entries.add(ModItems.URANIUM_ROD);

                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.URANIUM_COAL);
                        entries.add(ModBlocks.SOUND_BLOCK);

                        entries.add(ModBlocks.REACTOR_CASING_BLOCK);
                        entries.add(ModBlocks.REACTOR_COLLING_FRAME_BLOCK);
                        entries.add(ModBlocks.REACTOR_CONTROLLER_BLOCK);
                        entries.add(ModBlocks.REACTOR_CORE_BLOCK);
                        entries.add(ModBlocks.REACTOR_MAIN_FRAME_BLOCK);
                        entries.add(ModBlocks.URANIUM_BLOCK);
                        entries.add(ModBlocks.URANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_URANIUM_ORE);
                        entries.add(ModBlocks.NETHER_URANIUM_ORE);
                        entries.add(ModBlocks.END_STONE_URANIUM_ORE);

                        entries.add(ModBlocks.URANIUM_STAIRS);
                        entries.add(ModBlocks.URANIUM_SLAB);
                        entries.add(ModBlocks.URANIUM_FENCE);
                        entries.add(ModBlocks.URANIUM_FENCE_GATE);
                        entries.add(ModBlocks.URANIUM_WALL);
                        entries.add(ModBlocks.URANIUM_BUTTON);
                        entries.add(ModBlocks.URANIUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.URANIUM_DOOR);
                        entries.add(ModBlocks.URANIUM_TRAPDOOR);


                    }).build());
    public static void  registerItemGroups() {
        CreateNuclear.LOGGER.info("Registering Mod Items Groups for " + CreateNuclear.MOD_ID);
    }
}
