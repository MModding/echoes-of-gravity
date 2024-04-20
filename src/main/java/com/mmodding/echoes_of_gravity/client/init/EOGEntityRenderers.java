package com.mmodding.echoes_of_gravity.client.init;

import com.mmodding.echoes_of_gravity.client.entities.renderers.MeteorGolemRenderer;
import com.mmodding.echoes_of_gravity.client.entities.renderers.MeteorSpectorRenderer;
import com.mmodding.echoes_of_gravity.client.entities.renderers.OldDragonLightningRenderer;
import com.mmodding.echoes_of_gravity.init.EOGEntities;
import com.mmodding.mmodding_lib.library.initializers.ClientElementsInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class EOGEntityRenderers implements ClientElementsInitializer {

	@Override
	public void registerClient() {
		EntityRendererRegistry.register(EOGEntities.OLD_DRAGON_LIGHTNING, OldDragonLightningRenderer::new);
		EntityRendererRegistry.register(EOGEntities.METEOR_GOLEM, MeteorGolemRenderer::new);
		EntityRendererRegistry.register(EOGEntities.METEOR_SPECTOR, MeteorSpectorRenderer::new);
	}
}
