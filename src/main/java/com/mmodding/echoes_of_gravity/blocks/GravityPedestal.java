package com.mmodding.echoes_of_gravity.blocks;

import com.mmodding.mmodding_lib.lib.blocks.CustomBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DragonEggBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

public class GravityPedestal extends CustomBlock {

	public static final BooleanProperty HAS_DRAGON_EGG;

	public GravityPedestal(Settings settings, boolean hasItem, ItemGroup itemGroup) {
		super(settings, hasItem, itemGroup);
		this.setDefaultState(this.getDefaultState().with(HAS_DRAGON_EGG, false));
	}

	@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		if (world.getBlockState(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ())).getBlock() instanceof DragonEggBlock) {
			return this.getDefaultState().with(HAS_DRAGON_EGG, true);
		}
		else {
			return this.getDefaultState().with(HAS_DRAGON_EGG, false);
		}
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(HAS_DRAGON_EGG);
	}

	static {
		HAS_DRAGON_EGG = BooleanProperty.of("has_dragon_egg");
	}
}
