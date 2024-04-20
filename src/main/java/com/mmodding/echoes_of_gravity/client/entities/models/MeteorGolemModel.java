package com.mmodding.echoes_of_gravity.client.entities.models;

import com.mmodding.echoes_of_gravity.client.entities.animations.MeteorGolemAnimations;
import com.mmodding.echoes_of_gravity.entities.MeteorGolemEntity;
import com.mmodding.mmodding_lib.library.client.render.entity.animation.AnimationManager;
import com.mmodding.mmodding_lib.library.client.utils.AnimationUtils;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;

@SuppressWarnings("FieldCanBeLocal")
public class MeteorGolemModel extends SinglePartEntityModel<MeteorGolemEntity> {

	private final AnimationManager animationManager = new AnimationManager(
		this,
		MeteorGolemAnimations.WALKING,
		MeteorGolemAnimations.IDLE,
		MeteorGolemAnimations.FALLING,
		null,
		MeteorGolemAnimations.DYING
	);

	private final ModelPart root;
	private final ModelPart bone;
	private final ModelPart head;
	private final ModelPart eyes;
	private final ModelPart leftArm;
	private final ModelPart rightArm;
	private final ModelPart body;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;

	public MeteorGolemModel(ModelPart root) {
		this.root = root;
		this.bone = this.root.getChild(EntityModelPartNames.BONE);
		this.head = this.bone.getChild(EntityModelPartNames.HEAD);
		this.eyes = this.head.getChild(EntityModelPartNames.EYES);
		this.leftArm = this.bone.getChild(EntityModelPartNames.LEFT_ARM);
		this.rightArm = this.bone.getChild(EntityModelPartNames.RIGHT_ARM);
		this.body = this.bone.getChild(EntityModelPartNames.BODY);
		this.leftLeg = this.bone.getChild(EntityModelPartNames.LEFT_LEG);
		this.rightLeg = this.bone.getChild(EntityModelPartNames.RIGHT_LEG);
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData bone = modelPartData.addChild(EntityModelPartNames.BONE, ModelPartBuilder.create(), ModelTransform.pivot(0.0f, 24.0f, 0.0f));
		ModelPartData head = bone.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(42, 16).cuboid(-3.0F, -5.0F, -3.0F, 6.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));
		ModelPartData eyes = head.addChild(EntityModelPartNames.EYES, ModelPartBuilder.create().uv(48, 27).cuboid(-3.0F, -27.0F, -3.01F, 6.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		ModelPartData leftArm = bone.addChild(EntityModelPartNames.LEFT_ARM, ModelPartBuilder.create().uv(0, 22).cuboid(-1.0F, -4.0F, -3.0F, 6.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -21.0F, 0.0F));
		ModelPartData rightArm = bone.addChild(EntityModelPartNames.RIGHT_ARM, ModelPartBuilder.create().uv(24, 22).cuboid(-5.0F, -4.0F, -3.0F, 6.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.0F, -21.0F, 0.0F));
		ModelPartData body = bone.addChild(EntityModelPartNames.BODY, ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, 0.0F, -4.0F, 12.0F, 14.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));
		ModelPartData leftLeg = bone.addChild(EntityModelPartNames.LEFT_LEG, ModelPartBuilder.create().uv(40, 0).cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 10.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -10.0F, 0.0F));
		ModelPartData rightLeg = bone.addChild(EntityModelPartNames.RIGHT_LEG, ModelPartBuilder.create().uv(42, 38).cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 10.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -10.0F, 0.0F));

		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void setAngles(MeteorGolemEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.animationManager.handle(entity.animationData, animationProgress, entity.age, entity::isOnGround, () -> AnimationUtils.isMoving(entity, limbDistance));
	}

	@Override
	public ModelPart getPart() {
		return this.root;
	}
}
