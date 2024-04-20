package com.mmodding.echoes_of_gravity.client.entities.renderers;

import com.mmodding.echoes_of_gravity.EchoesOfGravity;
import com.mmodding.echoes_of_gravity.client.entities.models.MeteorGolemModel;
import com.mmodding.echoes_of_gravity.client.init.EOGModelEntityLayers;
import com.mmodding.echoes_of_gravity.entities.MeteorGolemEntity;
import com.mmodding.mmodding_lib.library.utils.TextureLocation;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class MeteorGolemRenderer extends MobEntityRenderer<MeteorGolemEntity, MeteorGolemModel> {

	public MeteorGolemRenderer(EntityRendererFactory.Context context) {
		super(context, new MeteorGolemModel(context.getPart(EOGModelEntityLayers.METEOR_GOLEM)), 0.3f);
	}

	@Override
	public Identifier getTexture(MeteorGolemEntity entity) {
		return new TextureLocation(EchoesOfGravity.id(), "entity/meteor_golem");
	}
}
