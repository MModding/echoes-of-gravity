package com.mmodding.echoes_of_gravity.client.init;

import com.mmodding.mmodding_lib.library.initializers.ClientElementsInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.DimensionRenderingRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;

public class SkyRenderers implements ClientElementsInitializer {

	public static final DimensionRenderingRegistry.SkyRenderer gravitySpaceRenderer = SkyRenderers::renderGravitySpaceSky;

	@Override
	public void registerClient() {
		// DimensionRenderingRegistry.registerSkyRenderer(null, gravitySpaceRenderer);
	}

	public static void renderGravitySpaceSky(WorldRenderContext context) {}
}
