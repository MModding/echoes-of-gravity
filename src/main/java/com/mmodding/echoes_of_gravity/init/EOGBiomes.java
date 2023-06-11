package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.EchoesOfGravity;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import com.mmodding.mmodding_lib.library.utils.BiomeUtils;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class EOGBiomes implements ElementsInitializer {

	public static final RegistryKey<Biome> DEAD_GROUND_KEY = BiomeUtils.getBiomeKey(EchoesOfGravity.createId("dead_ground"));
	public static final RegistryKey<Biome> GRAVITY_SPACE_KEY = BiomeUtils.getBiomeKey(EchoesOfGravity.createId("gravity_space"));

	@Override
	public void register() {
	}
}
