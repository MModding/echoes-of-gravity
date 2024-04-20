package com.mmodding.echoes_of_gravity.client.init;

import com.mmodding.echoes_of_gravity.EchoesOfGravity;
import com.mmodding.echoes_of_gravity.client.entities.models.MeteorGolemModel;
import com.mmodding.echoes_of_gravity.client.entities.models.MeteorSpectorModel;
import com.mmodding.mmodding_lib.library.initializers.ClientElementsInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class EOGModelEntityLayers implements ClientElementsInitializer {

	public static final EntityModelLayer METEOR_GOLEM = new EntityModelLayer(EchoesOfGravity.createId("meteor_golem"), "main");

	public static final EntityModelLayer METEOR_SPECTOR = new EntityModelLayer(EchoesOfGravity.createId("meteor_spector"), "main");

	@Override
	public void registerClient() {
		EntityModelLayerRegistry.registerModelLayer(METEOR_GOLEM, MeteorGolemModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(METEOR_SPECTOR, MeteorSpectorModel::getTexturedModelData);
	}
}
