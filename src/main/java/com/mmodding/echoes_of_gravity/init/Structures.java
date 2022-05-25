package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.Utils;
import com.mmodding.echoes_of_gravity.structures.OldDragonMonument;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import com.mmodding.mmodding_lib.library.structures.CustomStructure;

public class Structures implements ElementsInitializer {

	public static CustomStructure<?> OLD_DRAGON_MONUMENT = new OldDragonMonument();

	@Override
	public void register() {
		OLD_DRAGON_MONUMENT.register(Utils.newIdentifier("old_dragon_monument"));
	}
}
