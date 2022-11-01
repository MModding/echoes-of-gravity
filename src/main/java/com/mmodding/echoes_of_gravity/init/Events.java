package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.Utils;
import com.mmodding.echoes_of_gravity.blocks.ReinforcedGravityBlock;
import com.mmodding.echoes_of_gravity.entities.OldDragonLightningEntity;
import com.mmodding.echoes_of_gravity.events.OldDragonMonumentCallback;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import com.mmodding.mmodding_lib.library.utils.BiomeUtils;
import com.mmodding.mmodding_lib.library.utils.RadiusUtils;
import com.mmodding.mmodding_lib.library.utils.WorldUtils;
import net.minecraft.block.DragonEggBlock;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.quiltmc.qsl.networking.api.PacketByteBufs;
import org.quiltmc.qsl.networking.api.ServerPlayNetworking;

import java.util.Objects;

public class Events implements ElementsInitializer {

	private ActionResult createGravitySpace(WorldAccess world, BlockPos pos) {

		OldDragonLightningEntity oldDragonLightningEntity = new OldDragonLightningEntity(Entities.OLD_DRAGON_LIGHTNING, (World) world);

		BlockPos aPos = pos.north(10);
		BlockPos bPos = pos.west(10);
		BlockPos cPos = pos.south(10);
		BlockPos dPos = pos.east(10);

		BlockPos northPos = new BlockPos(aPos.getX(), world.getTopY(Heightmap.Type.WORLD_SURFACE_WG, aPos.getX(), aPos.getZ()), aPos.getZ());
		BlockPos westPos = new BlockPos(bPos.getX(), world.getTopY(Heightmap.Type.WORLD_SURFACE_WG, bPos.getX(), bPos.getZ()), bPos.getZ());
		BlockPos southPos = new BlockPos(cPos.getX(), world.getTopY(Heightmap.Type.WORLD_SURFACE_WG, cPos.getX(), cPos.getZ()), cPos.getZ());
		BlockPos eastPos = new BlockPos(dPos.getX(), world.getTopY(Heightmap.Type.WORLD_SURFACE_WG, dPos.getX(), dPos.getZ()), dPos.getZ());

		oldDragonLightningEntity.updatePosition(northPos.getX(), northPos.getY(), northPos.getZ());
		world.spawnEntity(oldDragonLightningEntity);
		// Wait 3s
		oldDragonLightningEntity.updatePosition(westPos.getX(), westPos.getY(), westPos.getZ());
		world.spawnEntity(oldDragonLightningEntity);
		// Wait 3s
		oldDragonLightningEntity.updatePosition(southPos.getX(), southPos.getY(), southPos.getZ());
		world.spawnEntity(oldDragonLightningEntity);
		// Wait 3s
		oldDragonLightningEntity.updatePosition(eastPos.getX(), eastPos.getY(), eastPos.getZ());
		world.spawnEntity(oldDragonLightningEntity);
		// Wait 3s

		WorldUtils.pushExplosion(world, pos.up(), 50.F);

		// Wait 2s

		RadiusUtils.forBlockPosInCubicRadius(pos, 10, (blockPos) -> {
			if (world.getBlockState(blockPos).getBlock() instanceof ReinforcedGravityBlock) {
				world.setBlockState(blockPos, Blocks.REINFORCED_GRAVITY_BLOCK.getDefaultState().with(
					ReinforcedGravityBlock.GRAVITY_ISOLATION,
					world.getBlockState(pos.up()).getBlock() instanceof DragonEggBlock
				), 2);
			}
		});

		RadiusUtils.forBlockPosInCubicRadius(
			pos, 10, (blockPos -> BiomeUtils.changeBiomeForBlock(world, blockPos, Biomes.getDeadGround(world)))
		);

		if (!world.isClient()) {
			ServerPlayNetworking.send(
				Objects.requireNonNull(world.getServer()).getPlayerManager().getPlayerList(),
				Utils.newIdentifier("biomeupdate"),
				PacketByteBufs.create().writeBlockPos(pos)
			);
		}

		return ActionResult.SUCCESS;
	}

	@Override
	public void register() {
		OldDragonMonumentCallback.EVENT.register(this::createGravitySpace);
	}
}
