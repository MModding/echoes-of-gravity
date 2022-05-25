package com.mmodding.echoes_of_gravity.blocks;

import com.mmodding.echoes_of_gravity.events.OldDragonMonumentCallback;
import com.mmodding.mmodding_lib.library.blocks.CustomBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DragonEggBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class GravityPedestal extends CustomBlock {

	public static final BooleanProperty HAS_DRAGON_EGG = BooleanProperty.of("has_dragon_egg");

	public GravityPedestal(Settings settings, boolean hasItem, ItemGroup itemGroup) {
		super(settings, hasItem, itemGroup);
		this.setDefaultState(this.getDefaultState().with(HAS_DRAGON_EGG, false));
	}
//
//	@Override
//	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
//
//		RadiusUtils.forBlockPosInCubicRadius(pos, 10, (blockPos) -> BiomeUtils.changeBiomeForBlock(
//				world,
//				blockPos,
//				BiomeUtils.getBiome(world, Utils.newIdentifier("gravity_space")))
//		);
//
//		return ActionResult.SUCCESS;
//	}

	@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		return this.getDefaultState().with(HAS_DRAGON_EGG, world.getBlockState(pos.up()).getBlock() instanceof DragonEggBlock);
	}

	@Override
	public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
		OldDragonMonumentCallback.EVENT.invoker().interact(world, pos);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(HAS_DRAGON_EGG);
	}
}
