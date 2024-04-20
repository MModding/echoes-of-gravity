package com.mmodding.echoes_of_gravity.client.entities.animations;

import net.minecraft.client.render.animation.Animation;
import net.minecraft.client.render.animation.AnimationKeyframe;
import net.minecraft.client.render.animation.Animator;
import net.minecraft.client.render.animation.PartAnimation;
import net.minecraft.client.render.entity.model.EntityModelPartNames;

// Generated With BlockBench 4.9.4
public class MeteorGolemAnimations {

	public static final Animation IDLE = Animation.Builder.withLength(2.5833f).looping()
		.addPartAnimation(EntityModelPartNames.LEFT_ARM, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.3333f, Animator.translate(0.0f, -0.25f, -0.5f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(2.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(EntityModelPartNames.RIGHT_ARM, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.3333f, Animator.translate(0.0f, -0.25f, -0.5f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(2.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE)
		))
		.addPartAnimation(EntityModelPartNames.HEAD, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.3333f, Animator.rotate(5.0f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(2.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.HEAD, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.3333f, Animator.translate(0.0f, 0.0f, -1.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(2.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BODY, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.3333f, Animator.rotate(2.5f, 0.0f, 0.0f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(2.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BODY, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.3333f, Animator.translate(0.0f, 0.0f, -0.25f), PartAnimation.Interpolators.SPLINE),
			new AnimationKeyframe(2.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.build();

	public static final Animation WALKING = Animation.Builder.withLength(1.0f).looping()
		.addPartAnimation(EntityModelPartNames.RIGHT_LEG, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.rotate(20.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(-20.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.RIGHT_LEG, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.translate(0.0f, 0.0f, 1.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, 0.0f, -1.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.LEFT_LEG, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.rotate(-20.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(20.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.LEFT_LEG, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.translate(0.0f, 0.0f, -1.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, 0.0f, 1.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.LEFT_ARM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.rotate(10.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(-10.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.LEFT_ARM, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.translate(0.0f, -1.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.RIGHT_ARM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.rotate(-10.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(10.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.RIGHT_ARM, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, -1.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.HEAD, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.rotate(-2.4976f, 0.109f, 2.4976f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(-2.4976f, -0.109f, -2.4976f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.HEAD, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, -0.25f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.translate(0.0f, 0.0f, -0.75f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, 0.0f, -0.25f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, 0.0f, -0.75f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.translate(0.0f, 0.0f, -0.25f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.translate(0.0f, -0.5f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, -0.5f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BODY, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(-2.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.rotate(2.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(-2.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(2.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.rotate(-2.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BODY, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.translate(0.0f, 0.0f, -1.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, 0.0f, -1.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.build();

	public static final Animation FALLING = Animation.Builder.withLength(0.75f).looping()
		.addPartAnimation(EntityModelPartNames.RIGHT_LEG, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(-30.0f, 0.0f, 5.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.rotate(-39.025f, 9.5766f, 21.5995f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(-30.0f, 0.0f, 5.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.RIGHT_LEG, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.translate(-1.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.LEFT_LEG, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(-20.0f, 0.0f, -5.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.rotate(-17.5f, 0.0f, -12.5f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(-20.0f, 0.0f, -5.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.LEFT_LEG, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.translate(1.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.LEFT_ARM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(-22.5f, 0.0f, -170.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.1667f, Animator.rotate(-6.8063f, 5.6842f, -156.0958f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.rotate(-22.5f, 0.0f, -170.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5833f, Animator.rotate(-31.5561f, 6.608f, -153.7593f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(-22.5f, 0.0f, -170.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.LEFT_ARM, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(4.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.translate(4.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(4.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.RIGHT_ARM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(-15.0f, 0.0f, 170.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.1667f, Animator.rotate(-29.7822f, -2.5759f, 160.3342f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.rotate(-15.0f, 0.0f, 170.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5833f, Animator.rotate(0.0f, 0.0f, 162.5f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(-15.0f, 0.0f, 170.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.RIGHT_ARM, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(-4.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.translate(-4.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(-4.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.HEAD, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.1667f, Animator.rotate(-12.3964f, 1.6189f, 7.3242f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5833f, Animator.rotate(5.1841f, -2.1539f, -9.7676f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.HEAD, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.translate(0.0f, 0.0f, 0.25f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(-15.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, -4.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BODY, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.rotate(-2.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BODY, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.translate(0.0f, 0.0f, 0.25f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.build();

	public static final Animation ATTACKING = Animation.Builder.withLength(1.0f)
		.addPartAnimation(EntityModelPartNames.RIGHT_LEG, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, 0.0f, 3.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.LEFT_LEG, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.translate(0.0f, 0.0f, 3.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.LEFT_ARM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.3333f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(77.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.rotate(-50.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(-182.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.LEFT_ARM, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.1667f, Animator.translate(0.0f, 0.0f, -5.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.3333f, Animator.translate(0.0f, -4.25f, -5.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, -5.25f, -5.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.translate(0.0f, -3.25f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, -1.17f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.RIGHT_ARM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.3333f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(80.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.rotate(-50.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.rotate(-182.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.RIGHT_ARM, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.1667f, Animator.translate(0.0f, 0.0f, -5.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.3333f, Animator.translate(0.0f, -4.25f, -5.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, -5.25f, -5.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.translate(0.0f, -3.25f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.75f, Animator.translate(0.0f, -1.17f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.HEAD, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.3333f, Animator.rotate(12.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(40.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.rotate(-7.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, -360.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.HEAD, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.125f, Animator.translate(0.0f, 0.0f, -5.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.3333f, Animator.translate(0.0f, -4.0f, -9.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, -8.0f, -10.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.translate(0.0f, -1.0f, 3.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BODY, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.125f, Animator.rotate(20.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.3333f, Animator.rotate(47.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.rotate(67.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.rotate(-10.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BODY, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.125f, Animator.translate(0.0f, 0.0f, -5.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.3333f, Animator.translate(0.0f, -4.0f, -7.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, -7.0f, -9.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.translate(0.0f, -1.0f, 2.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.build();

	public static final Animation DYING = Animation.Builder.withLength(2.0f)
		.addPartAnimation(EntityModelPartNames.RIGHT_LEG, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5833f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.rotate(-20.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.6667f, Animator.rotate(-19.7197f, -3.4049f, -9.408f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.RIGHT_LEG, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5833f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.translate(0.0f, 0.0f, 2.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.6667f, Animator.translate(-0.5f, 0.0f, 2.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.LEFT_ARM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.rotate(90.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.LEFT_ARM, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.3333f, Animator.translate(0.0f, -9.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.translate(0.0f, -18.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.4167f, Animator.translate(0.0f, -17.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.4583f, Animator.translate(0.0f, -18.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.RIGHT_ARM, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.rotate(90.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.RIGHT_ARM, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.25f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.3333f, Animator.translate(0.0f, -9.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.translate(0.0f, -18.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.4167f, Animator.translate(0.0f, -17.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.4583f, Animator.translate(0.0f, -18.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.HEAD, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.4167f, Animator.rotate(-12.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.4583f, Animator.rotate(-32.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5833f, Animator.rotate(-90.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.rotate(-90.0f, -12.5f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.6667f, Animator.rotate(-90.0f, -5.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.HEAD, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.4167f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.4583f, Animator.translate(0.0f, -5.0f, 4.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5f, Animator.translate(0.0f, -9.5f, 6.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5417f, Animator.translate(0.0f, -14.0f, 4.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5833f, Animator.translate(0.0f, -21.0f, 5.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.translate(0.0f, -20.0f, 5.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.6667f, Animator.translate(0.0f, -21.0f, 5.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BONE, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.6667f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.7917f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(1.9583f, Animator.translate(0.0f, -17.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BODY, new PartAnimation(PartAnimation.AnimationTargets.ROTATE,
			new AnimationKeyframe(0.0f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.rotate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.4583f, Animator.rotate(57.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5417f, Animator.rotate(90.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5833f, Animator.rotate(147.5f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.BODY, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.375f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.4583f, Animator.translate(0.0f, -3.0f, -7.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5417f, Animator.translate(0.0f, -10.0f, -14.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.5833f, Animator.translate(0.0f, -22.0f, -13.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.625f, Animator.translate(0.0f, -21.0f, -13.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.6667f, Animator.translate(0.0f, -22.0f, -13.0f), PartAnimation.Interpolators.LINEAR)
		))
		.addPartAnimation(EntityModelPartNames.EYES, new PartAnimation(PartAnimation.AnimationTargets.TRANSLATE,
			new AnimationKeyframe(0.0f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.0833f, Animator.translate(0.0f, 0.0f, 0.0f), PartAnimation.Interpolators.LINEAR),
			new AnimationKeyframe(0.125f, Animator.translate(0.0f, 0.0f, 1.0f), PartAnimation.Interpolators.LINEAR)
		))
		.build();
}
