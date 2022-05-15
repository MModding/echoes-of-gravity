package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.Utils;
import com.mmodding.echoes_of_gravity.entities.OldDragonLightningEntity;
import com.mmodding.mmodding_lib.lib.entities.CustomEntityType;
import com.mmodding.mmodding_lib.lib.initializers.ElementsInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.SpawnGroup;

public class Entities implements ElementsInitializer {

	public static final CustomEntityType<OldDragonLightningEntity> OLD_DRAGON_LIGHTNING = (CustomEntityType<OldDragonLightningEntity>) FabricEntityTypeBuilder
			.create(SpawnGroup.MISC, OldDragonLightningEntity::new).disableSaving().dimensions(EntityDimensions.fixed(0.0F, 0.0F))
			.trackRangeBlocks(16).trackedUpdateRate(Integer.MAX_VALUE).build();

	@Override
	public void register() {
		OLD_DRAGON_LIGHTNING.register(Utils.newIdentifier("old_dragon_lightning"));
	}
}
