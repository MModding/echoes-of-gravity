package com.mmodding.echoes_of_gravity.client.entities.models;

import com.mmodding.echoes_of_gravity.client.entities.animations.MeteorSpectorAnimations;
import com.mmodding.echoes_of_gravity.entities. MeteorSpectorEntity;
import com.mmodding.mmodding_lib.library.client.render.entity.animation.AnimationManager;
import com.mmodding.mmodding_lib.library.client.utils.AnimationUtils;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class MeteorSpectorModel extends SinglePartEntityModel<MeteorSpectorEntity> {

	public static final String UPPER_CRYSTALS = "upper_crystals";
	public static final String FIRST_UPPER_CRYSTAL = "first_upper_crystal";
	public static final String SECOND_UPPER_CRYSTAL = "second_upper_crystal";
	public static final String THIRD_UPPER_CRYSTAL = "third_upper_crystal";
	public static final String LAST_UPPER_CRYSTAL = "last_upper_crystal";
	public static final String METAL_PEALS = "metal_petals";
	public static final String FIRST_METAL_PETAL = "first_metal_petal";
	public static final String FIRST_PETAL_TOP = "first_petal_top";
	public static final String FIRST_PETAL_FALLING = "first_petal_falling";
	public static final String FIRST_PETAL_MIDDLE = "first_petal_middle";
	public static final String FIRST_PETAL_BOTTOM = "first_petal_bottom";
	public static final String SECOND_METAL_PETAL = "second_metal_petal";
	public static final String SECOND_PETAL_TOP = "second_petal_top";
	public static final String SECOND_PETAL_FALLING = "second_petal_falling";
	public static final String SECOND_PETAL_MIDDLE = "second_petal_middle";
	public static final String SECOND_PETAL_BOTTOM = "second_petal_bottom";
	public static final String THIRD_METAL_PETAL = "third_metal_petal";
	public static final String THIRD_PETAL_TOP = "third_petal_top";
	public static final String THIRD_PETAL_FALLING = "third_petal_falling";
	public static final String THIRD_PETAL_MIDDLE = "third_petal_middle";
	public static final String THIRD_PETAL_BOTTOM = "third_petal_bottom";
	public static final String LAST_METAL_PETAL = "last_metal_petal";
	public static final String LAST_PETAL_TOP = "last_petal_top";
	public static final String LAST_PETAL_FALLING = "last_petal_falling";
	public static final String LAST_PETAL_MIDDLE = "last_petal_middle";
	public static final String LAST_PETAL_BOTTOM = "last_petal_bottom";
	public static final String BUD = "bud";

	private final AnimationManager animationManager = new AnimationManager(
		this,
		MeteorSpectorAnimations.FLYING,
		MeteorSpectorAnimations.IDLE,
		null,
		MeteorSpectorAnimations.SPIN,
		MeteorSpectorAnimations.DYING
	);

	private final ModelPart root;
	private final ModelPart bone;
	private final ModelPart upperCrystals;
	private final ModelPart firstUpperCrystal;
	private final ModelPart secondUpperCrystal;
	private final ModelPart thirdUpperCrystal;
	private final ModelPart lastUpperCrystal;
	private final ModelPart metalPetals;
	private final ModelPart firstMetalPetal;
	private final ModelPart firstPetalTop;
	private final ModelPart firstPetalFalling;
	private final ModelPart firstPetalMiddle;
	private final ModelPart firstPetalBottom;
	private final ModelPart secondMetalPetal;
	private final ModelPart secondPetalTop;
	private final ModelPart secondPetalFalling;
	private final ModelPart secondPetalMiddle;
	private final ModelPart secondPetalBottom;
	private final ModelPart thirdMetalPetal;
	private final ModelPart thirdPetalTop;
	private final ModelPart thirdPetalFalling;
	private final ModelPart thirdPetalMiddle;
	private final ModelPart thirdPetalBottom;
	private final ModelPart lastMetalPetal;
	private final ModelPart lastPetalTop;
	private final ModelPart lastPetalFalling;
	private final ModelPart lastPetalMiddle;
	private final ModelPart lastPetalBottom;
	private final ModelPart bud;

	public MeteorSpectorModel(ModelPart root) {
		this.root = root;
		this.bone = this.root.getChild(EntityModelPartNames.BONE);
		this.upperCrystals = this.bone.getChild(MeteorSpectorModel.UPPER_CRYSTALS);
		this.firstUpperCrystal = this.upperCrystals.getChild(MeteorSpectorModel.FIRST_UPPER_CRYSTAL);
		this.secondUpperCrystal = this.upperCrystals.getChild(MeteorSpectorModel.SECOND_UPPER_CRYSTAL);
		this.thirdUpperCrystal = this.upperCrystals.getChild(MeteorSpectorModel.THIRD_UPPER_CRYSTAL);
		this.lastUpperCrystal = this.upperCrystals.getChild(MeteorSpectorModel.LAST_UPPER_CRYSTAL);
		this.metalPetals = this.bone.getChild(MeteorSpectorModel.METAL_PEALS);
		this.firstMetalPetal = this.metalPetals.getChild(MeteorSpectorModel.FIRST_METAL_PETAL);
		this.firstPetalTop = this.firstMetalPetal.getChild(MeteorSpectorModel.FIRST_PETAL_TOP);
		this.firstPetalFalling = this.firstMetalPetal.getChild(MeteorSpectorModel.FIRST_PETAL_FALLING);
		this.firstPetalMiddle = this.firstPetalFalling.getChild(MeteorSpectorModel.FIRST_PETAL_MIDDLE);
		this.firstPetalBottom = this.firstPetalFalling.getChild(MeteorSpectorModel.FIRST_PETAL_BOTTOM);
		this.secondMetalPetal = this.metalPetals.getChild(MeteorSpectorModel.SECOND_METAL_PETAL);
		this.secondPetalTop = this.secondMetalPetal.getChild(MeteorSpectorModel.SECOND_PETAL_TOP);
		this.secondPetalFalling = this.secondMetalPetal.getChild(MeteorSpectorModel.SECOND_PETAL_FALLING);
		this.secondPetalMiddle = this.secondPetalFalling.getChild(MeteorSpectorModel.SECOND_PETAL_MIDDLE);
		this.secondPetalBottom = this.secondPetalFalling.getChild(MeteorSpectorModel.SECOND_PETAL_BOTTOM);
		this.thirdMetalPetal = this.metalPetals.getChild(MeteorSpectorModel.THIRD_METAL_PETAL);
		this.thirdPetalTop = this.thirdMetalPetal.getChild(MeteorSpectorModel.THIRD_PETAL_TOP);
		this.thirdPetalFalling = this.thirdMetalPetal.getChild(MeteorSpectorModel.THIRD_PETAL_FALLING);
		this.thirdPetalMiddle = this.thirdPetalFalling.getChild(MeteorSpectorModel.THIRD_PETAL_MIDDLE);
		this.thirdPetalBottom = this.thirdPetalFalling.getChild(MeteorSpectorModel.THIRD_PETAL_BOTTOM);
		this.lastMetalPetal = this.metalPetals.getChild(MeteorSpectorModel.LAST_METAL_PETAL);
		this.lastPetalTop = this.lastMetalPetal.getChild(MeteorSpectorModel.LAST_PETAL_TOP);
		this.lastPetalFalling = this.lastMetalPetal.getChild(MeteorSpectorModel.LAST_PETAL_FALLING);
		this.lastPetalMiddle = this.lastPetalFalling.getChild(MeteorSpectorModel.LAST_PETAL_MIDDLE);
		this.lastPetalBottom = this.lastPetalFalling.getChild(MeteorSpectorModel.LAST_PETAL_BOTTOM);
		this.bud = this.bone.getChild(MeteorSpectorModel.BUD);
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();

		ModelPartData bone = modelPartData.addChild(EntityModelPartNames.BONE, ModelPartBuilder.create().uv(1, 1).cuboid(-6.0f, -19.0f, -5.0f, 12.0f, 11.0f, 11.0f, new Dilation(0.0f)), ModelTransform.pivot(0.0f, 24.0f, 0.0f));

		ModelPartData upperCrystals = bone.addChild(MeteorSpectorModel.UPPER_CRYSTALS, ModelPartBuilder.create(), ModelTransform.pivot(0.0f, -19.0f, 0.0f));

		upperCrystals.addChild(MeteorSpectorModel.FIRST_UPPER_CRYSTAL, ModelPartBuilder.create().uv(36, 29).mirrored().cuboid(-13.0f, 0.0f, -3.0f, 11.0f, 0.0f, 6.0f, new Dilation(0.0f)).mirrored(false), ModelTransform.of(0.0f, 0.0f, 0.0f, 0.3999f, 0.6956f, 0.583f));
		upperCrystals.addChild(MeteorSpectorModel.SECOND_UPPER_CRYSTAL, ModelPartBuilder.create().uv(36, 35).mirrored().cuboid(-13.0f, 0.0f, -3.0f, 11.0f, 0.0f, 6.0f, new Dilation(0.0f)).mirrored(false), ModelTransform.of(0.0f, 0.0f, 0.0f, -0.3999f, -0.6956f, 0.583f));
		upperCrystals.addChild(MeteorSpectorModel.THIRD_UPPER_CRYSTAL, ModelPartBuilder.create().uv(36, 23).cuboid(2.0f, 0.0f, -3.0f, 11.0f, 0.0f, 6.0f, new Dilation(0.0f)), ModelTransform.of(0.0f, 0.0f, 0.0f, -0.3999f, 0.6956f, -0.583f));
		upperCrystals.addChild(MeteorSpectorModel.LAST_UPPER_CRYSTAL, ModelPartBuilder.create().uv(36, 35).mirrored().cuboid(-13.0f, 0.0f, -3.0f, 11.0f, 0.0f, 6.0f, new Dilation(0.0f)).mirrored(false), ModelTransform.of(0.0f, 0.0f, 0.0f, 2.7417f, 0.6956f, 2.5586f));

		ModelPartData metalPetals = bone.addChild(MeteorSpectorModel.METAL_PEALS, ModelPartBuilder.create().uv(36, 0).cuboid(-2.0f, -2.0f, -2.0f, 4.0f, 2.0f, 4.0f, new Dilation(0.0f))
			.uv(44, 6).cuboid(-2.0f, -6.0f, 0.0f, 4.0f, 4.0f, 0.0f, new Dilation(0.0f)), ModelTransform.pivot(0.0f, -19.0f, 0.0f));
		metalPetals.addChild("topcrystal0_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0f, -4.0f, 0.0f, 4.0f, 4.0f, 0.0f, new Dilation(0.0f)), ModelTransform.of(0.0f, -2.0f, 0.0f, 0.0f, 1.5708f, 0.0f));

		ModelPartData firstMetalPetal = metalPetals.addChild(MeteorSpectorModel.FIRST_METAL_PETAL, ModelPartBuilder.create(), ModelTransform.pivot(0.0f, 0.0f, 0.0f));
		ModelPartData firstPetalTop = firstMetalPetal.addChild(MeteorSpectorModel.FIRST_PETAL_TOP, ModelPartBuilder.create().uv(0, 29).cuboid(2.0f, -1.0f, -3.0f, 11.0f, 0.0f, 6.0f, new Dilation(0.0f)), ModelTransform.of(0.0f, 0.0f, 0.0f, 0.0869f, 0.7816f, 0.1231f));
		ModelPartData firstPetalFalling = firstMetalPetal.addChild(MeteorSpectorModel.FIRST_PETAL_FALLING, ModelPartBuilder.create(), ModelTransform.pivot(9.25f, 0.0f, -9.25f));
		ModelPartData firstPetalMiddle = firstPetalFalling.addChild(MeteorSpectorModel.FIRST_PETAL_MIDDLE, ModelPartBuilder.create().uv(40, 37).cuboid(13.0f, -1.0f, -3.0f, 0.0f, 12.0f, 6.0f, new Dilation(0.0f)), ModelTransform.of(-9.25f, 0.0f, 9.25f, 0.0869f, 0.7816f, 0.1231f));
		ModelPartData firstPetalBottom = firstPetalFalling.addChild(MeteorSpectorModel.FIRST_PETAL_BOTTOM, ModelPartBuilder.create(), ModelTransform.pivot(-0.75f, 12.0f, 0.75f));
		firstPetalBottom.addChild("claw_r1", ModelPartBuilder.create().uv(0, 35).cuboid(-0.0209f, 0.0933f, -4.0f, 0.0f, 8.0f, 8.0f, new Dilation(0.0f)), ModelTransform.of(0.0f, 0.0f, 0.0f, 0.5208f, 0.6178f, 0.7805f));

		ModelPartData secondMetalPetal = metalPetals.addChild(MeteorSpectorModel.SECOND_METAL_PETAL, ModelPartBuilder.create(), ModelTransform.pivot(0.0f, 0.0f, 0.0f));
		ModelPartData secondPetalTop = secondMetalPetal.addChild(MeteorSpectorModel.SECOND_PETAL_TOP, ModelPartBuilder.create().uv(22, 23).cuboid(-13.0f, -1.0f, -3.0f, 11.0f, 0.0f, 6.0f, new Dilation(0.0f)), ModelTransform.of(0.0f, 0.0f, 0.0f, 0.0869f, -0.7816f, -0.1231f));
		ModelPartData secondPetalFalling = secondMetalPetal.addChild(MeteorSpectorModel.SECOND_PETAL_FALLING, ModelPartBuilder.create(), ModelTransform.of(-9.25f, 0.0f, -9.25f, -0.0436f, 0.0f, 0.0436f));
		ModelPartData secondPetalMiddle = secondPetalFalling.addChild(MeteorSpectorModel.SECOND_PETAL_MIDDLE, ModelPartBuilder.create().uv(0, 45).cuboid(-6.6603f, -0.4453f, -9.364f, 0.0f, 12.0f, 6.0f, new Dilation(0.0f)), ModelTransform.of(0.25f, 0.0f, 9.25f, 0.0869f, -0.7816f, -0.1231f));
		ModelPartData secondPetalBottom = secondPetalFalling.addChild(MeteorSpectorModel.SECOND_PETAL_BOTTOM, ModelPartBuilder.create(), ModelTransform.pivot(0.75f, 12.0f, 0.75f));
		secondPetalBottom.addChild("claw_r2", ModelPartBuilder.create().uv(16, 27).cuboid(0.0209f, 0.0933f, -4.0f, 0.0f, 8.0f, 8.0f, new Dilation(0.0f)), ModelTransform.of(0.0f, 0.0f, 0.0f, 0.5208f, -0.6178f, -0.7805f));

		ModelPartData thirdMetalPetal = metalPetals.addChild(MeteorSpectorModel.THIRD_METAL_PETAL, ModelPartBuilder.create(), ModelTransform.pivot(0.0f, 0.0f, 0.0f));
		ModelPartData thirdPetalTop = thirdMetalPetal.addChild(MeteorSpectorModel.THIRD_PETAL_TOP, ModelPartBuilder.create().uv(0, 23).cuboid(-13.0f, -1.0f, -3.0f, 11.0f, 0.0f, 6.0f, new Dilation(0.0f)), ModelTransform.of(0.0f, 0.0f, 0.0f, -3.0547f, 0.7816f, -3.0185f));
		ModelPartData thirdPetalFalling = thirdMetalPetal.addChild(MeteorSpectorModel.THIRD_PETAL_FALLING, ModelPartBuilder.create(), ModelTransform.pivot(9.0f, 1.0f, 9.0f));
		ModelPartData thirdPetalMiddle = thirdPetalFalling.addChild(MeteorSpectorModel.THIRD_PETAL_MIDDLE, ModelPartBuilder.create().uv(28, 37).cuboid(-13.0f, -1.0f, -3.0f, 0.0f, 12.0f, 6.0f, new Dilation(0.0f)), ModelTransform.of(-9.0f, -1.0f, -9.0f, -3.0547f, 0.7816f, -3.0185f));
		ModelPartData thirdPetalBottom = thirdPetalFalling.addChild(MeteorSpectorModel.THIRD_PETAL_BOTTOM, ModelPartBuilder.create(), ModelTransform.pivot(-0.5f, 11.0f, -0.5f));
		thirdPetalBottom.addChild("claw_r3", ModelPartBuilder.create().uv(0, 27).cuboid(0.0209f, 0.0933f, -4.0f, 0.0f, 8.0f, 8.0f, new Dilation(0.0f)), ModelTransform.of(0.0f, 0.0f, 0.0f, -2.6208f, 0.6178f, -2.3611f));

		ModelPartData lastMetalPetal = metalPetals.addChild(MeteorSpectorModel.LAST_METAL_PETAL, ModelPartBuilder.create(), ModelTransform.of(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f));
		ModelPartData lastPetalTop = lastMetalPetal.addChild(MeteorSpectorModel.LAST_PETAL_TOP, ModelPartBuilder.create().uv(22, 29).cuboid(-13.0f, -1.0f, -3.0f, 11.0f, 0.0f, 6.0f, new Dilation(0.0f)), ModelTransform.of(0.0f, 0.0f, 0.0f, -0.0869f, 0.7816f, -0.1231f));
		ModelPartData lastPetalFalling = lastMetalPetal.addChild(MeteorSpectorModel.LAST_PETAL_FALLING, ModelPartBuilder.create(), ModelTransform.pivot(-9.25f, 0.0f, 9.0f));
		ModelPartData lastPetalMiddle = lastPetalFalling.addChild(MeteorSpectorModel.LAST_PETAL_MIDDLE, ModelPartBuilder.create().uv(16, 37).cuboid(-13.0f, -1.0f, -3.0f, 0.0f, 12.0f, 6.0f, new Dilation(0.0f)), ModelTransform.of(9.25f, 0.0f, -9.0f, -0.0869f, 0.7816f, -0.1231f));
		ModelPartData lastPetalBottom = lastPetalFalling.addChild(MeteorSpectorModel.LAST_PETAL_BOTTOM, ModelPartBuilder.create(), ModelTransform.pivot(0.75f, 12.0f, -0.5f));
		lastPetalBottom.addChild("claw_r4", ModelPartBuilder.create().uv(32, 27).cuboid(0.0209f, 0.0933f, -4.0f, 0.0f, 8.0f, 8.0f, new Dilation(0.0f)), ModelTransform.of(0.0f, 0.0f, 0.0f, -0.5208f, 0.6178f, -0.7805f));

		ModelPartData bud = bone.addChild(MeteorSpectorModel.BUD, ModelPartBuilder.create().uv(36, 2).cuboid(0.0f, -3.0f, -2.0f, 0.0f, 6.0f, 4.0f, new Dilation(0.0f)), ModelTransform.pivot(0.0f, -4.0f, 0.0f));
		bud.addChild("rearcrystal0_r1", ModelPartBuilder.create().uv(0, 0).cuboid(0.0f, -3.0f, -2.0f, 0.0f, 6.0f, 4.0f, new Dilation(0.0f)), ModelTransform.of(0.0f, 0.0f, 0.0f, 0.0f, 1.5708f, 0.0f));

		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void setAngles(MeteorSpectorEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.animationManager.handle(entity.animationData, animationProgress, entity.age, entity::isOnGround, () -> AnimationUtils.isMoving(entity, limbDistance));
	}

	@Override
	public ModelPart getPart() {
		return this.root;
	}
}
