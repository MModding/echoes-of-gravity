package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.Utils;
import com.mmodding.mmodding_lib.lib.blocks.CustomBlock;
import com.mmodding.mmodding_lib.lib.initializers.ElementsInitializer;
import net.minecraft.block.Material;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class Blocks implements ElementsInitializer {

	public static final CustomBlock DRAGON_PEDESTAL_BLOCK = new CustomBlock(QuiltBlockSettings.of(Material.STONE), true);

	@Override
	public void register() {
		DRAGON_PEDESTAL_BLOCK.register(Utils.newIdentifier("dragon_pedestal_block"));
	}

}
