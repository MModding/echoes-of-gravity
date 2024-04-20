package com.mmodding.echoes_of_gravity;

import com.mmodding.echoes_of_gravity.init.*;
import com.mmodding.mmodding_lib.library.base.AdvancedModContainer;
import com.mmodding.mmodding_lib.library.base.MModdingModInitializer;
import com.mmodding.mmodding_lib.library.config.Config;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class EchoesOfGravity implements MModdingModInitializer {

	@Nullable
	@Override
	public Config getConfig() {
		return new EchoesOfGravityConfig();
	}

	@Override
	public List<ElementsInitializer> getElementsInitializers() {
		List<ElementsInitializer> initializers = new ArrayList<>();
		initializers.add(new EOGBlocks());
		initializers.add(new EOGItems());
		initializers.add(new EOGEntities());
		initializers.add(new EOGBiomes());
		initializers.add(new EOGEvents());
		return initializers;
	}

	@Override
	public void onInitialize(AdvancedModContainer mod) {}

	public static String id() {
		return "echoes_of_gravity";
	}

	public static Identifier createId(String path) {
		return new Identifier(EchoesOfGravity.id(), path);
	}
}
