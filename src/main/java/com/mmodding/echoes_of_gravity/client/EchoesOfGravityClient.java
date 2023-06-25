package com.mmodding.echoes_of_gravity.client;

import com.mmodding.echoes_of_gravity.client.entities.renderers.OldDragonLightningRenderer;
import com.mmodding.echoes_of_gravity.client.init.ClientPacketReceivers;
import com.mmodding.echoes_of_gravity.client.init.SkyRenderers;
import com.mmodding.echoes_of_gravity.init.EOGBlocks;
import com.mmodding.echoes_of_gravity.init.EOGEntities;
import com.mmodding.mmodding_lib.library.base.MModdingClientModInitializer;
import com.mmodding.mmodding_lib.library.config.Config;
import com.mmodding.mmodding_lib.library.initializers.ClientElementsInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import org.jetbrains.annotations.Nullable;
import org.quiltmc.loader.api.ModContainer;

import java.util.ArrayList;
import java.util.List;

@Environment(EnvType.CLIENT)
public class EchoesOfGravityClient implements MModdingClientModInitializer {

	@Override
	public List<ClientElementsInitializer> getClientElementsInitializers() {
		List<ClientElementsInitializer> clientInitializers = new ArrayList<>();
		clientInitializers.add(new EOGBlocks());
		clientInitializers.add(new ClientPacketReceivers());
		clientInitializers.add(new SkyRenderers());
		return clientInitializers;
	}

	@Nullable
	@Override
	public Config getClientConfig() {
		return null;
	}

	@Override
	public void onInitializeClient(ModContainer modContainer) {
		MModdingClientModInitializer.super.onInitializeClient(modContainer);

		EntityRendererRegistry.register(EOGEntities.OLD_DRAGON_LIGHTNING, OldDragonLightningRenderer::new);
	}
}
