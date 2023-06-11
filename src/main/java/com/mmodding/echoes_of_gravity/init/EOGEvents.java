package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.EchoesOfGravity;
import com.mmodding.echoes_of_gravity.blocks.ReinforcedGravityBlock;
import com.mmodding.echoes_of_gravity.entities.OldDragonLightningEntity;
import com.mmodding.echoes_of_gravity.events.OldDragonMonumentCallback;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import com.mmodding.mmodding_lib.library.utils.BiomeUtils;
import com.mmodding.mmodding_lib.library.utils.RadiusUtils;
import com.mmodding.mmodding_lib.library.utils.WorldUtils;
import net.minecraft.block.DragonEggBlock;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Holder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import org.quiltmc.qsl.lifecycle.api.event.ServerLifecycleEvents;
import org.quiltmc.qsl.networking.api.PacketByteBufs;
import org.quiltmc.qsl.networking.api.ServerPlayNetworking;

import java.util.Objects;

public class EOGEvents implements ElementsInitializer {

	private void startingServerLifecycle(MinecraftServer world) {
		Holder<Biome> holder0 = world.getRegistryManager().get(Registry.BIOME_KEY).getOrCreateHolderOrThrow(EOGBiomes.DEAD_GROUND_KEY);
		Holder<Biome> holder1 = world.getRegistryManager().get(Registry.BIOME_KEY).getOrCreateHolderOrThrow(EOGBiomes.GRAVITY_SPACE_KEY);
	}

	private ActionResult createGravitySpace(WorldAccess world, BlockPos pos) {

		Runnable run = () -> {
			RadiusUtils.forBlockPosInCubicRadius(pos, 10, (blockPos) -> {
				if (world.getBlockState(blockPos).getBlock() instanceof ReinforcedGravityBlock) {
					world.setBlockState(blockPos, EOGBlocks.REINFORCED_GRAVITY_BLOCK.getDefaultState().with(
						ReinforcedGravityBlock.GRAVITY_ISOLATION,
						world.getBlockState(pos.up()).getBlock() instanceof DragonEggBlock
					), 2);
				}
			});

			RadiusUtils.forBlockPosInCubicRadius(
				pos, 10, (blockPos -> BiomeUtils.changeBiomeForBlock(world, blockPos, BiomeKeys.DARK_FOREST))
			);

			RadiusUtils.forBlockPosInCubicRadius(
				pos.up(35), 25, (blockPos -> BiomeUtils.changeBiomeForBlock(world, blockPos, BiomeKeys.DARK_FOREST))
			);
		};

		if (!world.isClient()) {
			OldDragonLightningEntity oldDragonLightningEntity0 = new OldDragonLightningEntity(EOGEntities.OLD_DRAGON_LIGHTNING, (World) world);
			OldDragonLightningEntity oldDragonLightningEntity1 = new OldDragonLightningEntity(EOGEntities.OLD_DRAGON_LIGHTNING, (World) world);
			OldDragonLightningEntity oldDragonLightningEntity2 = new OldDragonLightningEntity(EOGEntities.OLD_DRAGON_LIGHTNING, (World) world);
			OldDragonLightningEntity oldDragonLightningEntity3 = new OldDragonLightningEntity(EOGEntities.OLD_DRAGON_LIGHTNING, (World) world);

			BlockPos aPos = pos.north(10);
			BlockPos bPos = pos.west(10);
			BlockPos cPos = pos.south(10);
			BlockPos dPos = pos.east(10);

			BlockPos northPos = new BlockPos(aPos.getX(), world.getTopY(Heightmap.Type.WORLD_SURFACE_WG, aPos.getX(), aPos.getZ()), aPos.getZ());
			BlockPos westPos = new BlockPos(bPos.getX(), world.getTopY(Heightmap.Type.WORLD_SURFACE_WG, bPos.getX(), bPos.getZ()), bPos.getZ());
			BlockPos southPos = new BlockPos(cPos.getX(), world.getTopY(Heightmap.Type.WORLD_SURFACE_WG, cPos.getX(), cPos.getZ()), cPos.getZ());
			BlockPos eastPos = new BlockPos(dPos.getX(), world.getTopY(Heightmap.Type.WORLD_SURFACE_WG, dPos.getX(), dPos.getZ()), dPos.getZ());

			ServerWorld serverWorld = (ServerWorld) world;

			oldDragonLightningEntity0.updatePosition(northPos.getX(), northPos.getY(), northPos.getZ());
			world.spawnEntity(oldDragonLightningEntity0);

			WorldUtils.doTaskAfter(serverWorld, 3*20, () -> {
				oldDragonLightningEntity1.updatePosition(westPos.getX(), westPos.getY(), westPos.getZ());
				world.spawnEntity(oldDragonLightningEntity1);

				WorldUtils.doTaskAfter(serverWorld, 3*20, () -> {
					oldDragonLightningEntity2.updatePosition(southPos.getX(), southPos.getY(), southPos.getZ());
					world.spawnEntity(oldDragonLightningEntity2);

					WorldUtils.doTaskAfter(serverWorld, 3*20, () -> {
						oldDragonLightningEntity3.updatePosition(eastPos.getX(), eastPos.getY(), eastPos.getZ());
						world.spawnEntity(oldDragonLightningEntity3);

						WorldUtils.doTaskAfter(serverWorld, 3*20, () -> {
							WorldUtils.pushExplosion(world, pos.up(), 50.F);

							WorldUtils.doTaskAfter(serverWorld, 2*20, run);

							ServerPlayNetworking.send(
								Objects.requireNonNull(world.getServer()).getPlayerManager().getPlayerList(),
								EchoesOfGravity.createId("biomeupdate"),
								PacketByteBufs.create().writeBlockPos(pos)
							);
						});
					});
				});
			});
		}
		else {
			run.run();
		}

		return ActionResult.SUCCESS;
	}

	@Override
	public void register() {
		ServerLifecycleEvents.STARTING.register(this::startingServerLifecycle);
		OldDragonMonumentCallback.EVENT.register(this::createGravitySpace);
	}
}
