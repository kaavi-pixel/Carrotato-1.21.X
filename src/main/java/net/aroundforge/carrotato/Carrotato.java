package net.aroundforge.carrotato;

import net.aroundforge.carrotato.registry.ModBlocks;
import net.aroundforge.carrotato.registry.ModItems;
import net.aroundforge.carrotato.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Carrotato implements ModInitializer {
	public static final String MOD_ID = "carrotato";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEffects.registerModEffects();

		ModWorldGen.generateModWorldGen();
	}
}