package com.mmodding.echoes_of_gravity.items;

import com.mmodding.echoes_of_gravity.init.Blocks;
import com.mmodding.mmodding_lib.library.items.CustomItem;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SaltStick extends CustomItem {

	public SaltStick(Settings settings) {
		super(settings);
	}

	@Override
	public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
		return state.isOf(Blocks.CELESTINE_ORE) || super.postMine(stack, world, state, pos, miner);
	}

	@Override
	public boolean isSuitableFor(BlockState state) {
		return state.isOf(Blocks.CELESTINE_ORE);
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
		return state.isOf(Blocks.CELESTINE_ORE) ? 2.0F : super.getMiningSpeedMultiplier(stack, state);
	}
}
