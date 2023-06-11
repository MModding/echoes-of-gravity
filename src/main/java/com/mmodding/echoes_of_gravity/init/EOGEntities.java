package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.EchoesOfGravity;
import com.mmodding.echoes_of_gravity.entities.OldDragonLightningEntity;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import com.mmodding.mmodding_lib.library.utils.RegistrationUtils;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

public class EOGEntities implements ElementsInitializer {

	public static final EntityType<OldDragonLightningEntity> OLD_DRAGON_LIGHTNING = FabricEntityTypeBuilder
			.create(SpawnGroup.MISC, OldDragonLightningEntity::new).disableSaving().dimensions(EntityDimensions.fixed(0.0F, 0.0F))
			.trackRangeBlocks(16).trackedUpdateRate(Integer.MAX_VALUE).build();

	@Override
	public void register() {
		RegistrationUtils.registerEntityType(EchoesOfGravity.createId("old_dragon_lightning"), OLD_DRAGON_LIGHTNING);
	}
}
