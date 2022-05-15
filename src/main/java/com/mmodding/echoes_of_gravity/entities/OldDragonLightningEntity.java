package com.mmodding.echoes_of_gravity.entities;

import com.google.common.collect.Sets;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class OldDragonLightningEntity extends Entity {

	private int ambientTick;
	public long seed;
	private int remainingActions;
	private boolean cosmetic;
	@Nullable
	private ServerPlayerEntity channeler;
	private final Set<Entity> struckEntities = Sets.newHashSet();
	private int blocksSetOnFire;

	public OldDragonLightningEntity(EntityType<? extends OldDragonLightningEntity> entityType, World world) {
		super(entityType, world);
		this.ignoreCameraFrustum = true;
		this.ambientTick = 2;
		this.seed = this.random.nextLong();
		this.remainingActions = this.random.nextInt(3) + 1;
	}

	public void setCosmetic(boolean cosmetic) {
		this.cosmetic = cosmetic;
	}

	public SoundCategory getSoundCategory() {
		return SoundCategory.WEATHER;
	}

	@Nullable
	public ServerPlayerEntity getChanneler() {
		return this.channeler;
	}

	public void setChanneler(@Nullable ServerPlayerEntity channeler) {
		this.channeler = channeler;
	}

	public void tick() {
		super.tick();
		if (this.ambientTick == 2) {
			if (this.world.isClient()) {
				this.world.playSound(this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_LIGHTNING_BOLT_THUNDER, SoundCategory.WEATHER, 10000.0F, 0.8F + this.random.nextFloat() * 0.2F, false);
				this.world.playSound(this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT, SoundCategory.WEATHER, 2.0F, 0.5F + this.random.nextFloat() * 0.2F, false);
			} else {
				Difficulty difficulty = this.world.getDifficulty();
				if (difficulty == Difficulty.NORMAL || difficulty == Difficulty.HARD) {
					this.spawnFire(4);
				}

				cleanOxidization(this.world, this.getAffectedBlockPos());
			}
		}

		--this.ambientTick;
		Iterator var2;
		List list;
		if (this.ambientTick < 0) {
			if (this.remainingActions == 0) {
				this.discard();
			} else if (this.ambientTick < -this.random.nextInt(10)) {
				--this.remainingActions;
				this.ambientTick = 1;
				this.seed = this.random.nextLong();
				this.spawnFire(0);
			}
		}

		if (this.ambientTick >= 0) {
			if (!(this.world instanceof ServerWorld)) {
				this.world.setLightningTicksLeft(2);
			} else if (!this.cosmetic) {
				list = this.world.getOtherEntities(this, new Box(this.getX() - 3.0, this.getY() - 3.0, this.getZ() - 3.0, this.getX() + 3.0, this.getY() + 6.0 + 3.0, this.getZ() + 3.0), Entity::isAlive);

				this.struckEntities.addAll(list);
				if (this.channeler != null) {
					Criteria.CHANNELED_LIGHTNING.trigger(this.channeler, list);
				}
			}
		}

	}

	private BlockPos getAffectedBlockPos() {
		Vec3d vec3d = this.getPos();
		return new BlockPos(vec3d.x, vec3d.y - 1.0E-6, vec3d.z);
	}

	private void spawnFire(int spreadAttempts) {
		if (!this.cosmetic && !this.world.isClient && this.world.getGameRules().getBoolean(GameRules.DO_FIRE_TICK)) {
			BlockPos blockPos = this.getBlockPos();
			BlockState blockState = AbstractFireBlock.getState(this.world, blockPos);
			if (this.world.getBlockState(blockPos).isAir() && blockState.canPlaceAt(this.world, blockPos)) {
				this.world.setBlockState(blockPos, blockState);
				++this.blocksSetOnFire;
			}

			for (int i = 0; i < spreadAttempts; ++i) {
				BlockPos blockPos2 = blockPos.add(this.random.nextInt(3) - 1, this.random.nextInt(3) - 1, this.random.nextInt(3) - 1);
				blockState = AbstractFireBlock.getState(this.world, blockPos2);
				if (this.world.getBlockState(blockPos2).isAir() && blockState.canPlaceAt(this.world, blockPos2)) {
					this.world.setBlockState(blockPos2, blockState);
					++this.blocksSetOnFire;
				}
			}

		}
	}

	private static void cleanOxidization(World world, BlockPos pos) {
		BlockState blockState = world.getBlockState(pos);
		BlockPos blockPos;
		BlockState blockState2;
		if (blockState.isOf(Blocks.LIGHTNING_ROD)) {
			blockPos = pos.offset(blockState.get(LightningRodBlock.FACING).getOpposite());
			blockState2 = world.getBlockState(blockPos);
		} else {
			blockPos = pos;
			blockState2 = blockState;
		}

		if (blockState2.getBlock() instanceof Oxidizable) {
			world.setBlockState(blockPos, Oxidizable.getUnaffectedOxidationState(world.getBlockState(blockPos)));
			BlockPos.Mutable mutable = pos.mutableCopy();
			int i = world.random.nextInt(3) + 3;

			for (int j = 0; j < i; ++j) {
				int k = world.random.nextInt(8) + 1;
				cleanOxidizationAround(world, blockPos, mutable, k);
			}

		}
	}

	private static void cleanOxidizationAround(World world, BlockPos pos, BlockPos.Mutable mutablePos, int count) {
		mutablePos.set(pos);

		for (int i = 0; i < count; ++i) {
			Optional<BlockPos> optional = cleanOxidizationAround(world, mutablePos);
			if (optional.isEmpty()) {
				break;
			}
			mutablePos.set(optional.get());
		}

	}

	private static Optional<BlockPos> cleanOxidizationAround(World world, BlockPos pos) {
		Iterator var2 = BlockPos.iterateRandomly(world.random, 10, pos, 1).iterator();

		BlockPos blockPos;
		BlockState blockState;
		do {
			if (!var2.hasNext()) {
				return Optional.empty();
			}

			blockPos = (BlockPos) var2.next();
			blockState = world.getBlockState(blockPos);
		} while (!(blockState.getBlock() instanceof Oxidizable));

		BlockPos finalBlockPos = blockPos;
		Oxidizable.getDecreasedOxidationState(blockState).ifPresent((state) -> {
			world.setBlockState(finalBlockPos, state);
		});
		world.syncWorldEvent(3002, blockPos, -1);
		return Optional.of(blockPos);
	}

	public boolean shouldRender(double distance) {
		double d = 64.0 * getRenderDistanceMultiplier();
		return distance < d * d;
	}

	protected void initDataTracker() {
	}

	protected void readCustomDataFromNbt(NbtCompound nbt) {
	}

	protected void writeCustomDataToNbt(NbtCompound nbt) {
	}

	public Packet<?> createSpawnPacket() {
		return new EntitySpawnS2CPacket(this);
	}

	public int getBlocksSetOnFire() {
		return this.blocksSetOnFire;
	}

	public Stream<Entity> getStruckEntities() {
		return this.struckEntities.stream().filter(Entity::isAlive);
	}
}
