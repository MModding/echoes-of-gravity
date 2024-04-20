package com.mmodding.echoes_of_gravity.client.entities.animations;

import com.mmodding.echoes_of_gravity.client.entities.models.MeteorSpectorModel;
import net.minecraft.client.render.animation.Animation;
import net.minecraft.client.render.animation.AnimationKeyframe;
import net.minecraft.client.render.animation.Animator;
import net.minecraft.client.render.animation.PartAnimation;
import net.minecraft.client.render.entity.model.EntityModelPartNames;

public class MeteorSpectorAnimations {

	public static final Animation IDLE = Animation.Builder.withLength(1.5f).looping()
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.3333f, Animator.rotate(-1.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.7083f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.125f, Animator.rotate(1.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.translate(0.0f, 0.5f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(MeteorSpectorModel.METAL_PEALS, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.7083f, Animator.rotate(0.0f, -2.5f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.FIRST_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(-2.4976f, -0.109f, -2.4976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.FIRST_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(-4.9905f, -0.2178f, -4.9953f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.LAST_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(2.4976f, -0.109f, 2.4976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.LAST_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(4.9882f, -0.3266f, 4.9882f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.SECOND_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.SECOND_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(-4.9953f, 0.2178f, 4.9905f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.THIRD_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(0.0f, 0.0f, -2.5f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.THIRD_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(4.9976f, 0.109f, -4.9976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.BUD, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.3333f, Animator.rotate(-5.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.7083f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.125f, Animator.rotate(5.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.BUD, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.7083f, Animator.translate(0.0f, 0.5f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.FIRST_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(-4.9882f, -0.3266f, -4.9882f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.SECOND_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(-7.4976f, 0.109f, 4.9976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.LAST_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(4.9882f, -0.3266f, 4.9882f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.THIRD_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(4.9976f, 0.109f, -4.9976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.build();

	public static final Animation FLYING = Animation.Builder.withLength(1.5f).looping()
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(2.5f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.3333f, Animator.rotate(1.5f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.7083f, Animator.rotate(2.5f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.125f, Animator.rotate(3.5f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(2.5f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.translate(0.0f, 0.5f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(MeteorSpectorModel.METAL_PEALS, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.7083f, Animator.rotate(0.0f, -2.5f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.FIRST_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(-2.4976f, -0.109f, -2.4976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.FIRST_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(-4.9905f, -0.2178f, -4.9953f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.LAST_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(2.4976f, -0.109f, 2.4976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.LAST_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(4.9882f, -0.3266f, 4.9882f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.SECOND_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.SECOND_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(-4.9953f, 0.2178f, 4.9905f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.THIRD_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(0.0f, 0.0f, -2.5f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.THIRD_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(4.9976f, 0.109f, -4.9976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.BUD, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.3333f, Animator.rotate(-5.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.7083f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.125f, Animator.rotate(5.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.BUD, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.7083f, Animator.translate(0.0f, 0.5f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.FIRST_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(-4.9882f, -0.3266f, -4.9882f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.SECOND_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(-7.4976f, 0.109f, 4.9976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.LAST_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(4.9882f, -0.3266f, 4.9882f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.THIRD_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(4.9976f, 0.109f, -4.9976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.build();

	public static final Animation SPIN = Animation.Builder.withLength(1.0833f)
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.625f, Animator.rotate(0.0f, -350.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, -360.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.translate(0.0f, 0.25f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.METAL_PEALS, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, -360.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.FIRST_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.5f, Animator.rotate(-2.4976f, -0.109f, -2.4976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.FIRST_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.rotate(-4.9905f, -0.2178f, -4.9953f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.FIRST_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(-4.9882f, -0.3266f, -4.9882f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.LAST_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.5f, Animator.rotate(2.4976f, -0.109f, 2.4976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.LAST_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(4.9882f, -0.3266f, 4.9882f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.SECOND_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.SECOND_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(-4.9953f, 0.2178f, 4.9905f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.THIRD_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.5f, Animator.rotate(0.0f, 0.0f, -2.5f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.THIRD_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(4.9976f, 0.109f, -4.9976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.BUD, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, -1.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.SECOND_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(-7.4976f, 0.109f, 4.9976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.LAST_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(4.9882f, -0.3266f, 4.9882f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.THIRD_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(4.9976f, 0.109f, -4.9976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.UPPER_CRYSTALS, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.rotate(0.0f, 700.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0833f, Animator.rotate(0.0f, 720.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.build();

	public static final Animation ATTACK = Animation.Builder.withLength(1.0f)
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.125f, Animator.rotate(-90.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.2083f, Animator.rotate(-90.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.2917f, Animator.rotate(-90.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(-90.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.125f, Animator.translate(0.0f, 11.0f, -13.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.2083f, Animator.translate(0.0f, 11.0f, -13.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.translate(0.0f, 11.25f, -10.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.2917f, Animator.translate(0.0f, 11.0f, -13.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, 11.25f, -12.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(MeteorSpectorModel.METAL_PEALS, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(0.0f, 360.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.9167f, Animator.rotate(0.0f, 365.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, 360.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.FIRST_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.5f, Animator.rotate(-2.4976f, -0.109f, -2.4976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.875f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.FIRST_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(-4.9905f, -0.2178f, -4.9953f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.875f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.FIRST_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(-4.9882f, -0.3266f, -4.9882f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.LAST_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.5f, Animator.rotate(2.4976f, -0.109f, 2.4976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.875f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.LAST_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(4.9882f, -0.3266f, 4.9882f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.875f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.SECOND_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.875f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.SECOND_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(-4.9953f, 0.2178f, 4.9905f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.875f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.THIRD_METAL_PETAL, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.5f, Animator.rotate(0.0f, 0.0f, -2.5f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.875f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.THIRD_PETAL_FALLING, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(4.9976f, 0.109f, -4.9976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.875f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.BUD, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.2083f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(0.0f, 360.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(MeteorSpectorModel.BUD, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.2083f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.translate(0.0f, 1.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.2917f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(MeteorSpectorModel.SECOND_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(-7.4976f, 0.109f, 4.9976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.LAST_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(4.9882f, -0.3266f, 4.9882f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.THIRD_PETAL_BOTTOM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(4.9976f, 0.109f, -4.9976f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.UPPER_CRYSTALS, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7083f, Animator.rotate(0.0f, -360.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.9167f, Animator.rotate(0.0f, -365.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, -360.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.build();

	public static final Animation DYING = Animation.Builder.withLength(1.0f)
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.125f, Animator.rotate(0.0f, 0.0f, 2.5f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.rotate(0.0f, 0.0f, 12.5f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.125f, Animator.translate(0.0f, -1.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.25f, Animator.translate(0.0f, -4.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(0.375f, Animator.translate(0.0f, -22.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(MeteorSpectorModel.METAL_PEALS, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.0417f, Animator.rotate(0.0f, -2.5f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(MeteorSpectorModel.BUD, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.0417f, Animator.rotate(0.0f, 0.0f, 45.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.125f, Animator.rotate(2.3721f, 1.0568f, 132.4461f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(MeteorSpectorModel.BUD, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.0833f, Animator.translate(0.0f, -1.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.125f, Animator.translate(0.0f, -2.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.1667f, Animator.translate(-1.0f, -2.67f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.2083f, Animator.translate(0.2f, -3.34f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.translate(1.15f, -4.0f, 1.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.2917f, Animator.translate(0.77f, -4.67f, -0.33f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.3333f, Animator.translate(-0.61f, -5.33f, -0.17f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.translate(0.0f, -6.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(MeteorSpectorModel.UPPER_CRYSTALS, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.0417f, Animator.rotate(0.0f, 2.5f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.build();
}
