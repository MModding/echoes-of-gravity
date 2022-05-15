package com.mmodding.echoes_of_gravity;

import com.mmodding.echoes_of_gravity.init.Blocks;
import com.mmodding.echoes_of_gravity.init.Entities;
import com.mmodding.echoes_of_gravity.init.Items;
import com.mmodding.echoes_of_gravity.init.Structures;
import com.mmodding.mmodding_lib.lib.base.MModdingModInitializer;
import com.mmodding.mmodding_lib.lib.initializers.ElementsInitializer;
import org.quiltmc.loader.api.ModContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class EchoesOfGravity implements MModdingModInitializer {

	public static ModContainer mod;

	public static final Logger LOGGER = LoggerFactory.getLogger("Echoes of Gravity");

	@Override
	public List<ElementsInitializer> getElementsInitializers() {
		List<ElementsInitializer> initializers = new ArrayList<>();
		initializers.add(new Blocks());
		initializers.add(new Items());
		initializers.add(new Entities());
		initializers.add(new Structures());
		return initializers;
	}

	@Override
	public void onInitialize(ModContainer mod) {
		MModdingModInitializer.super.onInitialize(mod);
		EchoesOfGravity.mod = mod;
	}
}
