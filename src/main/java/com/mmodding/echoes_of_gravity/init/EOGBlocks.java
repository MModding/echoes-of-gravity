package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.EchoesOfGravity;
import com.mmodding.echoes_of_gravity.blocks.EnergyExtractor;
import com.mmodding.echoes_of_gravity.blocks.GravityPedestal;
import com.mmodding.echoes_of_gravity.blocks.ReinforcedGravityBlock;
import com.mmodding.mmodding_lib.library.blocks.CustomBlock;
import com.mmodding.mmodding_lib.library.blocks.CustomStairsBlock;
import com.mmodding.mmodding_lib.library.initializers.ClientElementsInitializer;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class EOGBlocks implements ElementsInitializer, ClientElementsInitializer {

	public static final CustomBlock GRAVITY_PEDESTAL = new GravityPedestal(
			QuiltBlockSettings.of(Material.STONE)
					.strength(-1, 3600000)
					.luminance(state -> state.get(GravityPedestal.HAS_DRAGON_EGG) ? 10 : 0),
			true,
			EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock ENERGY_EXTRACTOR = new EnergyExtractor(
			QuiltBlockSettings.of(Material.STONE)
					.strength(-1, 3600000)
					.luminance(state -> state.get(EnergyExtractor.WORKING) ? 10 : 0),
			true,
			EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock REINFORCED_GRAVITY_BLOCK = new ReinforcedGravityBlock(
			QuiltBlockSettings.of(Material.STONE)
					.strength(-1, 3600000)
					.luminance(5)
					.nonOpaque(),
			true,
			EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomStairsBlock REINFORCED_GRAVITY_STAIRS = new CustomStairsBlock(
			REINFORCED_GRAVITY_BLOCK.getDefaultState(),
			QuiltBlockSettings.of(Material.GLASS)
					.strength(-1, 3600000)
					.luminance(5)
					.nonOpaque(),
			true,
			EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock METEOR_SALT_BLOCK = new CustomBlock(
			QuiltBlockSettings.of(Material.STONE).strength(0.5F,10).sounds(BlockSoundGroup.SOUL_SOIL),
			true,
			EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock CELESTINE_ORE = new CustomBlock(
			QuiltBlockSettings.of(Material.STONE)
					.strength(1, 10)
					.sounds(BlockSoundGroup.SOUL_SOIL)
					.requiresTool(),
			true,
			EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	@Override
	public void register() {
		GRAVITY_PEDESTAL.register(EchoesOfGravity.createId("gravity_pedestal"));
		ENERGY_EXTRACTOR.register(EchoesOfGravity.createId("energy_extractor"));
		REINFORCED_GRAVITY_BLOCK.register(EchoesOfGravity.createId("reinforced_gravity_block"));
		REINFORCED_GRAVITY_STAIRS.register(EchoesOfGravity.createId("reinforced_gravity_stairs"));

		METEOR_SALT_BLOCK.register(EchoesOfGravity.createId("meteor_salt_block"));
		CELESTINE_ORE.register(EchoesOfGravity.createId("celestine_ore"));
	}

	@Override
	public void registerClient() {
		REINFORCED_GRAVITY_BLOCK.cutout();
		REINFORCED_GRAVITY_STAIRS.cutout();

		REINFORCED_GRAVITY_BLOCK.translucent();
		REINFORCED_GRAVITY_STAIRS.translucent();
	}
}
