package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.EchoesOfGravity;
import com.mmodding.echoes_of_gravity.entities.MeteorGolemEntity;
import com.mmodding.echoes_of_gravity.entities.MeteorSpectorEntity;
import com.mmodding.echoes_of_gravity.entities.OldDragonLightningEntity;
import com.mmodding.mmodding_lib.library.entities.CustomEntityType;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.SpawnGroup;

public class EOGEntities implements ElementsInitializer {

	public static final CustomEntityType<OldDragonLightningEntity> OLD_DRAGON_LIGHTNING = CustomEntityType.create(
		SpawnGroup.MISC,
		OldDragonLightningEntity::new,
		builder -> builder
			.disableSaving()
			.setDimensions(EntityDimensions.fixed(0.0f, 0.0f))
			.maxChunkTrackingRange(8)
			.trackingTickInterval(Integer.MAX_VALUE)
	);

	public static final CustomEntityType<MeteorGolemEntity> METEOR_GOLEM = CustomEntityType.createMob(
		SpawnGroup.MONSTER,
		MeteorGolemEntity::new,
		builder -> builder
			.defaultAttributes(MeteorGolemEntity.createMeteorGolemAttributes())
			.setDimensions(EntityDimensions.fixed(1.5f, 1.9f))
			.maxChunkTrackingRange(8)
			.makeFireImmune()
	);

	public static final CustomEntityType<MeteorSpectorEntity> METEOR_SPECTOR = CustomEntityType.createMob(
		SpawnGroup.MONSTER,
		MeteorSpectorEntity::new,
		builder -> builder
			.defaultAttributes(MeteorSpectorEntity.createMeteorSpectorAttributes())
			.setDimensions(EntityDimensions.fixed(0.8f, 0.8f))
			.maxChunkTrackingRange(8)
			.makeFireImmune()
	);

	@Override
	public void register() {
		OLD_DRAGON_LIGHTNING.register(EchoesOfGravity.createId("old_dragon_lightning"));
		METEOR_GOLEM.register(EchoesOfGravity.createId("meteor_golem"));
		METEOR_SPECTOR.register(EchoesOfGravity.createId("meteor_spector"));
	}
}
