package com.mmodding.echoes_of_gravity.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;

public class GravityBiomeCreator {

	public static Biome createGravitySpace() {
		SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
		GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();

		return (new Biome.Builder())
				.precipitation(Biome.Precipitation.NONE)
				.category(Biome.Category.NONE)
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
}
