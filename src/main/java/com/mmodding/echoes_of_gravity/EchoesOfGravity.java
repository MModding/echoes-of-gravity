package com.mmodding.echoes_of_gravity;

import com.mmodding.echoes_of_gravity.init.*;
import com.mmodding.mmodding_lib.lib.base.MModdingModContainer;
import com.mmodding.mmodding_lib.lib.base.MModdingModInitializer;
import com.mmodding.mmodding_lib.lib.initializers.ElementsInitializer;
import org.quiltmc.loader.api.ModContainer;

import java.util.ArrayList;
import java.util.List;

public class EchoesOfGravity implements MModdingModInitializer {

	public static MModdingModContainer mod;

	@Override
	public List<ElementsInitializer> getElementsInitializers() {
		List<ElementsInitializer> initializers = new ArrayList<>();
		initializers.add(new Blocks());
		initializers.add(new Items());
		initializers.add(new Entities());
		initializers.add(new Structures());
		initializers.add(new Biomes());
		return initializers;
	}

	@Override
	public void onInitialize(ModContainer mod) {
		MModdingModInitializer.super.onInitialize(mod);
		EchoesOfGravity.mod = MModdingModContainer.from(mod);
	}
}
