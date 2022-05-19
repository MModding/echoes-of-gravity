package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.Utils;
import com.mmodding.echoes_of_gravity.biome.GravityBiomeCreator;
import com.mmodding.mmodding_lib.lib.initializers.ElementsInitializer;
import com.mmodding.mmodding_lib.lib.utils.RegistrationUtils;
import net.minecraft.world.biome.Biome;

public class Biomes implements ElementsInitializer {

	public static Biome GRAVITY_SPACE = GravityBiomeCreator.createGravitySpace();

	@Override
	public void register() {
		RegistrationUtils.registerBiome(Utils.newIdentifier("gravity_space"), GRAVITY_SPACE);
	}
}
