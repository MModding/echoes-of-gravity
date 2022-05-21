package com.mmodding.echoes_of_gravity.blocks;

import com.mmodding.mmodding_lib.lib.blocks.CustomBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class ReinforcedGravityBlock extends CustomBlock {

	public static final BooleanProperty GRAVITY_ISOLATION = BooleanProperty.of("gravity_isolation");

	public ReinforcedGravityBlock(Settings settings, boolean hasItem, ItemGroup itemGroup) {
		super(settings, hasItem, itemGroup);
		this.setDefaultState(this.getDefaultState().with(GRAVITY_ISOLATION, false));
	}

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		if (!state.get(GRAVITY_ISOLATION)) return VoxelShapes.empty();
		return super.getCollisionShape(state, world, pos, context);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(GRAVITY_ISOLATION);
	}
}
