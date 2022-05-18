package com.mmodding.echoes_of_gravity.blocks;

import com.mmodding.mmodding_lib.lib.blocks.CustomBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DragonEggBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class EnergyExtractor extends CustomBlock {

	public static final DirectionProperty FACING = Properties.FACING;
	public static final BooleanProperty WORKING = BooleanProperty.of("working");

	public EnergyExtractor(Settings settings, boolean hasItem, ItemGroup itemGroup) {
		super(settings, hasItem, itemGroup);
		this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH).with(WORKING, false));
	}

	@Nullable
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return this.getDefaultState().with(FACING, ctx.getPlayerLookDirection().getOpposite());
	}

	@Override
	public BlockState rotate(BlockState state, BlockRotation rotation) {
		return state.with(FACING, rotation.rotate(state.get(FACING)));
	}

	@Override
	public BlockState mirror(BlockState state, BlockMirror mirror) {
		return state.rotate(mirror.getRotation(state.get(FACING)));
	}

	@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		return this.getDefaultState()
				.with(FACING, state.get(FACING))
				.with(WORKING, world.getBlockState(pos.offset(state.get(FACING))).getBlock() instanceof DragonEggBlock);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING, WORKING);
	}
}
