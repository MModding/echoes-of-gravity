package com.mmodding.echoes_of_gravity;

import com.mmodding.mmodding_lib.library.config.Config;
import com.mmodding.mmodding_lib.library.config.ConfigObject;
import com.mmodding.mmodding_lib.library.config.ConfigScreen;
import com.mmodding.mmodding_lib.library.config.ConfigScreenOptions;
import net.minecraft.text.Text;

public class EchoesOfGravityConfig implements Config {

	@Override
	public String getConfigName() {
		return "echoes_of_gravity";
	}

	@Override
	public String getFileName() {
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
	public ConfigScreenOptions getConfigOptions() {
		return new ConfigScreenOptions(Text.of("Echoes of Gravity Common Config"), new ConfigScreen.BlockTextureLocation("emerald_block.png"));
	}
}
