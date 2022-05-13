package com.mmodding.echoes_of_gravity;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EchoesOfGravity implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("Echoes of Gravity");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("{} - Initialization", mod.metadata().name());
	}
}
