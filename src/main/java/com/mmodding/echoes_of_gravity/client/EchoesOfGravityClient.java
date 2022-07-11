package com.mmodding.echoes_of_gravity.client;

import com.mmodding.echoes_of_gravity.client.renderers.OldDragonLightningRenderer;
import com.mmodding.echoes_of_gravity.init.Blocks;
import com.mmodding.echoes_of_gravity.init.Entities;
import com.mmodding.mmodding_lib.library.base.MModdingClientModInitializer;
import com.mmodding.mmodding_lib.library.initializers.ClientElementsInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import org.quiltmc.loader.api.ModContainer;

import java.util.ArrayList;
import java.util.List;

@Environment(EnvType.CLIENT)
public class EchoesOfGravityClient implements MModdingClientModInitializer {

	@Override
	public List<ClientElementsInitializer> getClientElementsInitializers() {
		List<ClientElementsInitializer> clientInitializers = new ArrayList<>();
		clientInitializers.add(new Blocks());
		clientInitializers.add(new ClientPacketReceivers());
		return clientInitializers;
	}

	@Override
	public void onInitializeClient(ModContainer modContainer) {
		MModdingClientModInitializer.super.onInitializeClient(modContainer);

		EntityRendererRegistry.register(Entities.OLD_DRAGON_LIGHTNING, OldDragonLightningRenderer::new);
	}
}
