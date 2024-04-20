package com.mmodding.echoes_of_gravity;

import com.mmodding.mmodding_lib.library.config.Config;
import com.mmodding.mmodding_lib.library.config.ConfigObject;
import com.mmodding.mmodding_lib.library.config.ConfigOptions;
import com.mmodding.mmodding_lib.library.utils.TextureLocation;
import net.minecraft.text.Text;

public class EchoesOfGravityConfig implements Config {

	@Override
	public String getQualifier() {
		return "echoes_of_gravity_chapter_one";
	}

	@Override
	public String getFilePath() {
		return "echoes_of_gravity/chapter_one/common";
	}

	@Override
	public ConfigObject defaultConfig() {
		return new ConfigObject.Builder()
			.addIntegerParameter("dragonMonumentXSpawnCoordinate", 100000)
			.addIntegerParameter("dragonMonumentZSpawnCoordinate", 100000)
			.build();
	}

	@Override
	public ConfigOptions getConfigOptions() {
		return new ConfigOptions(Text.of("Echoes of Gravity Common Config"), new TextureLocation.Block("echoes_of_gravity", "magenite"));
	}
}
