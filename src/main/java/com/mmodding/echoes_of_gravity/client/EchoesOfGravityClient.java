package com.mmodding.echoes_of_gravity.client;

import com.mmodding.echoes_of_gravity.client.init.EOGClientPacketReceivers;
import com.mmodding.echoes_of_gravity.client.init.EOGEntityRenderers;
import com.mmodding.echoes_of_gravity.client.init.EOGModelEntityLayers;
import com.mmodding.echoes_of_gravity.client.init.EOGSkyRenderers;
import com.mmodding.echoes_of_gravity.init.EOGBlocks;
import com.mmodding.mmodding_lib.library.base.AdvancedModContainer;
import com.mmodding.mmodding_lib.library.base.MModdingClientModInitializer;
import com.mmodding.mmodding_lib.library.config.Config;
import com.mmodding.mmodding_lib.library.initializers.ClientElementsInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

@Environment(EnvType.CLIENT)
public class EchoesOfGravityClient implements MModdingClientModInitializer {

	@Nullable
	@Override
	public Config getClientConfig() {
		return null;
	}

	@Override
	public List<ClientElementsInitializer> getClientElementsInitializers() {
		List<ClientElementsInitializer> clientInitializers = new ArrayList<>();
		clientInitializers.add(new EOGBlocks());
		clientInitializers.add(new EOGClientPacketReceivers());
		clientInitializers.add(new EOGModelEntityLayers());
		clientInitializers.add(new EOGEntityRenderers());
		clientInitializers.add(new EOGSkyRenderers());
		return clientInitializers;
	}

	@Override
	public void onInitializeClient(AdvancedModContainer mod) {}
}
