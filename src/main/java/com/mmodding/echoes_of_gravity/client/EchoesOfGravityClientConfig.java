package com.mmodding.echoes_of_gravity.client;

import com.mmodding.mmodding_lib.library.config.Config;
import com.mmodding.mmodding_lib.library.config.ConfigObject;
import com.mmodding.mmodding_lib.library.config.ConfigScreenOptions;

public class EchoesOfGravityClientConfig implements Config {

	@Override
	public String getConfigName() {
		return "echoes_of_gravity_client";
	}

	@Override
	public String getFileName() {
		return "echoes_of_gravity/chapter_one/client";
	}

	@Override
	public ConfigObject defaultConfig() {
		return new ConfigObject.Builder()
				.build();
	}

	@Override
	public ConfigScreenOptions getConfigOptions() {
		return null;
	}
}
