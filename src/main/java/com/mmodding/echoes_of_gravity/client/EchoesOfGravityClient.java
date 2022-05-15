package com.mmodding.echoes_of_gravity.client;

import com.mmodding.echoes_of_gravity.client.renderers.OldDragonLightningRenderer;
import com.mmodding.echoes_of_gravity.init.Entities;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class EchoesOfGravityClient implements ClientModInitializer {

	@Override
	public void onInitializeClient(ModContainer modContainer) {
		EntityRendererRegistry.register(Entities.OLD_DRAGON_LIGHTNING, OldDragonLightningRenderer::new);
	}
}
