package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.Utils;
import com.mmodding.echoes_of_gravity.mixin.StructureFeatureAccessor;
import com.mmodding.echoes_of_gravity.structures.OldDragonMonument;
import com.mmodding.mmodding_lib.lib.initializers.ElementsInitializer;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.StructureFeature;

public class Structures implements ElementsInitializer {

	public static StructureFeature<?> OLD_DRAGON_MONUMENT = new OldDragonMonument();

	@Override
	public void register() {
		StructureFeatureAccessor.callRegister(Utils.modIdentifier + ":old_dragon_monument", OLD_DRAGON_MONUMENT, GenerationStep.Feature.SURFACE_STRUCTURES);
	}
}
