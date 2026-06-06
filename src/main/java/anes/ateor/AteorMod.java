package anes.ateor;

import anes.ateor.CustomCreativeTab.ModTabs;
import anes.ateor.block.ModBlocks;
import anes.ateor.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AteorMod implements ModInitializer {
	public static final String MOD_ID = "ateor";
	// Logger
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello world from usfl");
		// Code Runs As Soon As Game Initializes.
		ModBlocks.registerModBlocks();
		ModTabs.registertabs();
		ModItems.registerModItem();
	}
}