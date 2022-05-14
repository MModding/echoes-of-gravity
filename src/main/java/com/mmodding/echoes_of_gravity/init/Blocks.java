package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.Utils;
import com.mmodding.echoes_of_gravity.blocks.GravityPedestal;
import com.mmodding.mmodding_lib.lib.blocks.CustomBlock;
import com.mmodding.mmodding_lib.lib.initializers.ElementsInitializer;
import net.minecraft.block.Material;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class Blocks implements ElementsInitializer {

	public static final CustomBlock GRAVITY_PEDESTAL = new GravityPedestal(
			QuiltBlockSettings.of(Material.STONE).hardness(-1), true, Tabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock ENERGY_EXTRACTOR = new CustomBlock(
			QuiltBlockSettings.of(Material.METAL).hardness(-1), true, Tabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	@Override
	public void register() {
		GRAVITY_PEDESTAL.register(Utils.newIdentifier("gravity_pedestal"));
		ENERGY_EXTRACTOR.register(Utils.newIdentifier("energy_extractor"));
	}

}
