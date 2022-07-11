package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.Utils;
import com.mmodding.echoes_of_gravity.blocks.ReinforcedGravityBlock;
import com.mmodding.echoes_of_gravity.events.OldDragonMonumentCallback;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import com.mmodding.mmodding_lib.library.utils.BiomeUtils;
import com.mmodding.mmodding_lib.library.utils.RadiusUtils;
import net.minecraft.block.DragonEggBlock;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.ChunkPos;
import org.quiltmc.qsl.networking.api.PacketByteBufs;
import org.quiltmc.qsl.networking.api.PlayerLookup;
import org.quiltmc.qsl.networking.api.ServerPlayNetworking;

import java.awt.*;
import java.util.Objects;

public class Events implements ElementsInitializer {

	@Override
	public void register() {
		OldDragonMonumentCallback.EVENT.register((world, pos) -> {
			RadiusUtils.forBlockPosInCubicRadius(pos, 10, (blockPos) -> {
				if (world.getBlockState(blockPos).getBlock() instanceof ReinforcedGravityBlock) {
					world.setBlockState(blockPos, Blocks.REINFORCED_GRAVITY_BLOCK.getDefaultState().with(
							ReinforcedGravityBlock.GRAVITY_ISOLATION,
							world.getBlockState(pos.up()).getBlock() instanceof DragonEggBlock
					), 2);
				}
			});

			RadiusUtils.forBlockPosInCubicRadius(pos, 10, (blockPos -> BiomeUtils.changeBiomeForBlock(
					world,
					blockPos,
					BiomeUtils.getBiome(world, Utils.newIdentifier("gravity_space"))
			)));

			if (!world.isClient()) {
				ServerPlayNetworking.send(
						Objects.requireNonNull(world.getServer()).getPlayerManager().getPlayerList(),
						Utils.newIdentifier("biomeupdate"),
						PacketByteBufs.create().writeBlockPos(pos)
				);
			}

			return ActionResult.SUCCESS;
		});
	}
}
