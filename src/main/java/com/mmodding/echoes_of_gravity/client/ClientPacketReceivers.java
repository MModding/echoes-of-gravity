package com.mmodding.echoes_of_gravity.client;

import com.mmodding.echoes_of_gravity.EchoesOfGravity;
import com.mmodding.echoes_of_gravity.events.OldDragonMonumentCallback;
import com.mmodding.mmodding_lib.library.initializers.ClientElementsInitializer;
import org.quiltmc.qsl.networking.api.client.ClientPlayNetworking;

public class ClientPacketReceivers implements ClientElementsInitializer {

	@Override
	public void registerClient() {
		ClientPlayNetworking.registerGlobalReceiver(EchoesOfGravity.createId("biomeupdate"), (client, handler, buf, responseSender) -> {
			OldDragonMonumentCallback.EVENT.invoker().interact(client.world, buf.readBlockPos());
			handler.getWorld().reloadColor();
			client.execute(() -> client.gameRenderer.reload(client.getResourceManager()));
		});
	}
}
