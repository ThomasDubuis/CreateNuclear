package com.ynov.createnuclear;

import com.ynov.createnuclear.block.ModBlocks;
import com.ynov.createnuclear.item.ModItemGroups;
import com.ynov.createnuclear.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateNuclear implements ModInitializer {
    public static final String MOD_ID = "createnuclear";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.URANIUM_COAL, 400);

	}
}