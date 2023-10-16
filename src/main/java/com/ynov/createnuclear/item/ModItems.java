package com.ynov.createnuclear.item;

import com.ynov.createnuclear.CreateNuclear;
import com.ynov.createnuclear.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item URANIUM = registerItem("uranium", new Item(new FabricItemSettings()));
    public static final Item URANIUM_ROD = registerItem("uranium_rod", new Item(new FabricItemSettings()));
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item URANIUM_COAL = registerItem("uranium_coal", new Item(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    private static void addItemToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(URANIUM);
        entries.add(URANIUM_ROD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateNuclear.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CreateNuclear.LOGGER.info("Registering Mod Items for " + CreateNuclear.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientItemGroup);
    }
}
