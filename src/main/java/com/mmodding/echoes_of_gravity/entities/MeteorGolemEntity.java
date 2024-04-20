package com.mmodding.echoes_of_gravity.entities;

import com.mmodding.mmodding_lib.library.client.render.entity.animation.AnimationData;
import com.mmodding.mmodding_lib.library.client.render.entity.animation.HandledDeathAnimation;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.TargetGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class MeteorGolemEntity extends HostileEntity implements HandledDeathAnimation {

	public final AnimationData animationData = new AnimationData();

	public MeteorGolemEntity(EntityType<? extends MeteorGolemEntity> entityType, World world) {
		super(entityType, world);
	}

	public static DefaultAttributeContainer.Builder createMeteorGolemAttributes() {
		return MobEntity.createMobAttributes()
			.add(EntityAttributes.GENERIC_MAX_HEALTH, 25.0f)
			.add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.5f)
			.add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 3.0f)
			.add(EntityAttributes.GENERIC_FOLLOW_RANGE, 3)
			.add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2f);
	}

	@Override
	protected void initGoals() {
		this.goalSelector.add(0, new WanderAroundFarGoal(this, 1.0));
		this.targetSelector.add(0, new TargetGoal<>(this, PlayerEntity.class, true));
	}

	@Override
	public void tick() {
		this.animationData.handle(this);
		super.tick();
	}

	@Override
	public AnimationData getAnimationData() {
		return this.animationData;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public boolean applyRedOverlayOnDeath() {
		return false;
	}

	@Override
	public int getDeathTime() {
		return 40;
	}
}
