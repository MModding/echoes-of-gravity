package com.mmodding.echoes_of_gravity.client.entities.renderers;

import com.mmodding.echoes_of_gravity.EchoesOfGravity;
import com.mmodding.echoes_of_gravity.client.entities.models.MeteorSpectorModel;
import com.mmodding.echoes_of_gravity.client.init.EOGModelEntityLayers;
import com.mmodding.echoes_of_gravity.entities.MeteorSpectorEntity;
import com.mmodding.mmodding_lib.library.utils.TextureLocation;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class MeteorSpectorRenderer extends MobEntityRenderer<MeteorSpectorEntity, MeteorSpectorModel> {

	public MeteorSpectorRenderer(EntityRendererFactory.Context context) {
		super(context, new MeteorSpectorModel(context.getPart(EOGModelEntityLayers.METEOR_SPECTOR)), 0.3f);
	}

	@Override
	public Identifier getTexture(MeteorSpectorEntity entity) {
		return new TextureLocation(EchoesOfGravity.id(), "entity/meteor_spector");
	}
}
