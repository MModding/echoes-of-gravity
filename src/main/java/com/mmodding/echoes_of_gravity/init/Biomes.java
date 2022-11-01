package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.Utils;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import com.mmodding.mmodding_lib.library.utils.BiomeUtils;
import com.mmodding.mmodding_lib.library.utils.RegistrationUtils;
import net.minecraft.util.Identifier;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;

public class Biomes implements ElementsInitializer {

	private static Biome deadGround() {
		SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
		GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();

		return (new Biome.Builder())
			.precipitation(Biome.Precipitation.NONE)
			.downfall(0.0F)
			.temperature(0.25F)
			.effects((new BiomeEffects.Builder())
					.waterColor(0x1c3563)
					.waterFogColor(0x1c3563)
					.fogColor(0x565b66)
					.skyColor(0x616469)
					.build())
			.spawnSettings(spawnSettings.build())
			.generationSettings(generationSettings.build())
			.build();
	}

	private static Biome gravitySpace() {
		SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
		GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();

		return (new Biome.Builder())
			.precipitation(Biome.Precipitation.NONE)
			.downfall(0.0F)
			.temperature(0.25F)
			.effects((new BiomeEffects.Builder())
					.waterColor(0x010554)
					.waterFogColor(0x010554)
					.fogColor(0x000000)
					.skyColor(0x070d29)
					.build())
			.spawnSettings(spawnSettings.build())
			.generationSettings(generationSettings.build())
			.build();
	}

	public static Identifier DEAD_GROUND_KEY = Utils.newIdentifier("dead_ground");
	public static Identifier GRAVITY_SPACE_KEY = Utils.newIdentifier("gravity_space");

	public static Biome getDeadGround(WorldAccess world) {
		return BiomeUtils.getBiome(world, DEAD_GROUND_KEY);
	}

	public static Biome getGravitySpace(WorldAccess world) {
		return BiomeUtils.getBiome(world, GRAVITY_SPACE_KEY);
	}

	@Override
	public void register() {
		RegistrationUtils.registerBiome(DEAD_GROUND_KEY, deadGround());
		RegistrationUtils.registerBiome(GRAVITY_SPACE_KEY, gravitySpace());
	}
}
