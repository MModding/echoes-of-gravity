package com.mmodding.echoes_of_gravity.entities;

import com.mmodding.mmodding_lib.library.client.render.entity.animation.AnimationData;
import com.mmodding.mmodding_lib.library.client.render.entity.animation.HandledDeathAnimation;
import com.mmodding.mmodding_lib.library.entities.goals.FlyingAroundFarGoal;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.control.FlightMoveControl;
import net.minecraft.entity.ai.goal.TargetGoal;
import net.minecraft.entity.ai.pathing.BirdNavigation;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MeteorSpectorEntity extends HostileEntity implements HandledDeathAnimation {

	public final AnimationData animationData = new AnimationData();

	public MeteorSpectorEntity(EntityType<? extends MeteorSpectorEntity> entityType, World world) {
		super(entityType, world);
		this.moveControl = new FlightMoveControl(this, 10, true);
	}

	public static DefaultAttributeContainer.Builder createMeteorSpectorAttributes() {
		return MobEntity.createMobAttributes()
			.add(EntityAttributes.GENERIC_MAX_HEALTH, 25.0f)
			.add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.5f)
			.add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 3.0f)
			.add(EntityAttributes.GENERIC_FOLLOW_RANGE, 3)
			.add(EntityAttributes.GENERIC_FLYING_SPEED, 0.2f);
	}

	@Override
	protected EntityNavigation createNavigation(World world) {
		BirdNavigation navigation = new BirdNavigation(this, world);
		navigation.setCanPathThroughDoors(false);
		navigation.setCanSwim(true);
		navigation.setCanEnterOpenDoors(true);
		return navigation;
	}

	@Override
	protected void initGoals() {
		this.goalSelector.add(0, new FlyingAroundFarGoal(this, 1.0));
		this.targetSelector.add(0, new TargetGoal<>(this, PlayerEntity.class, true));
	}

	@Override
	public void tick() {
		this.animationData.handle(this);
		super.tick();
	}

	@Override
	public boolean handleFallDamage(float fallDistance, float damageMultiplier, DamageSource damageSource) {
		return false;
	}

	@Override
	protected void fall(double heightDifference, boolean onGround, BlockState landedState, BlockPos landedPosition) {
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
