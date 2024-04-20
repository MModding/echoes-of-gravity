package com.mmodding.echoes_of_gravity.client;

import com.mmodding.mmodding_lib.library.config.Config;
import com.mmodding.mmodding_lib.library.config.ConfigObject;
import com.mmodding.mmodding_lib.library.config.ConfigOptions;

public class EchoesOfGravityClientConfig implements Config {

	@Override
	public String getQualifier() {
		return "echoes_of_gravity_chapter_one_client";
	}

	@Override
	public String getFilePath() {
		return "echoes_of_gravity/chapter_one/client";
	}

	@Override
	public ConfigObject defaultConfig() {
		return new ConfigObject.Builder().build();
	}

	@Override
	public ConfigOptions getConfigOptions() {
		return null;
	}
}
