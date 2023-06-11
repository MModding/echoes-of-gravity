package com.mmodding.echoes_of_gravity;

import com.mmodding.echoes_of_gravity.init.*;
import com.mmodding.mmodding_lib.library.base.MModdingModContainer;
import com.mmodding.mmodding_lib.library.base.MModdingModInitializer;
import com.mmodding.mmodding_lib.library.config.Config;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import org.quiltmc.loader.api.ModContainer;

import java.util.ArrayList;
import java.util.List;

public class EchoesOfGravity implements MModdingModInitializer {

	public static MModdingModContainer mod;

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

	@Nullable
	@Override
	public Config getConfig() {
		return new EchoesOfGravityConfig();
	}

	@Override
	public void onInitialize(ModContainer mod) {
		MModdingModInitializer.super.onInitialize(mod);
		EchoesOfGravity.mod = MModdingModContainer.from(mod);
	}

	public static String id() {
		return "echoes_of_gravity";
	}

	public static Identifier createId(String identifier) {
		return new Identifier(EchoesOfGravity.id(), identifier);
	}
}
