package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.EchoesOfGravity;
import com.mmodding.echoes_of_gravity.blocks.EnergyExtractor;
import com.mmodding.echoes_of_gravity.blocks.GravityPedestal;
import com.mmodding.echoes_of_gravity.blocks.ReinforcedGravityBlock;
import com.mmodding.mmodding_lib.library.blocks.*;
import com.mmodding.mmodding_lib.library.initializers.ClientElementsInitializer;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class EOGBlocks implements ElementsInitializer, ClientElementsInitializer {

	public static final CustomBlock MAGENITE = new CustomBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomStairsBlock MAGENITE_STAIRS = new CustomStairsBlock(
		MAGENITE.getDefaultState(),
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomSlabBlock MAGENITE_SLAB = new CustomSlabBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomWallBlock MAGENITE_WALL = new CustomWallBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock MAGENITE_BRICKS = new CustomBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomStairsBlock MAGENITE_BRICK_STAIRS = new CustomStairsBlock(
		MAGENITE_BRICKS.getDefaultState(),
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomSlabBlock MAGENITE_BRICK_SLAB = new CustomSlabBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomWallBlock MAGENITE_BRICK_WALL = new CustomWallBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock POLISHED_MAGENITE = new CustomBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomStairsBlock POLISHED_MAGENITE_STAIRS = new CustomStairsBlock(
		POLISHED_MAGENITE.getDefaultState(),
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomSlabBlock POLISHED_MAGENITE_SLAB = new CustomSlabBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomWallBlock POLISHED_MAGENITE_WALL = new CustomWallBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock MAGENITE_CORNICE = new CustomBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock CHISELED_MAGENITE = new CustomBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock CHISELED_MAGENITE_PLINTH = new CustomBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock MOSS_COVERED_MAGENITE = new CustomBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock MOSSY_MAGENITE = new CustomBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomStairsBlock MOSSY_MAGENITE_STAIRS = new CustomStairsBlock(
		MOSSY_MAGENITE.getDefaultState(),
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomSlabBlock MOSSY_MAGENITE_SLAB = new CustomSlabBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomWallBlock MOSSY_MAGENITE_WALL = new CustomWallBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock MOSSY_MAGENITE_BRICKS = new CustomBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomStairsBlock MOSSY_MAGENITE_BRICK_STAIRS = new CustomStairsBlock(
		MOSSY_MAGENITE_BRICKS.getDefaultState(),
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomSlabBlock MOSSY_MAGENITE_BRICK_SLAB = new CustomSlabBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomWallBlock MOSSY_MAGENITE_BRICK_WALL = new CustomWallBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock MOSSY_POLISHED_MAGENITE = new CustomBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomStairsBlock MOSSY_POLISHED_MAGENITE_STAIRS = new CustomStairsBlock(
		MOSSY_POLISHED_MAGENITE.getDefaultState(),
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomSlabBlock MOSSY_POLISHED_MAGENITE_SLAB = new CustomSlabBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomWallBlock MOSSY_POLISHED_MAGENITE_WALL = new CustomWallBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock MOSSY_MAGENITE_CORNICE = new CustomBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock MOSSY_CHISELED_MAGENITE = new CustomBlock(
		DefaultBlockSettings.STONE_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

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

	public static final CustomBlock RAW_CELESTINE_BLOCK = new CustomBlock(
		DefaultBlockSettings.METAL_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock CELESTINE_BLOCK = new CustomBlock(
		DefaultBlockSettings.METAL_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomHorizontalFacingBlock OLD_ARCHEOLOGIST_NOTES = new CustomHorizontalFacingBlock(
		QuiltBlockSettings.of(Material.STONE)
			.strength(1, 10)
			.sounds(BlockSoundGroup.WOOL)
			.nonOpaque(),
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	@Override
	public void register() {
		MAGENITE.register(EchoesOfGravity.createId("magenite"));
		MAGENITE_STAIRS.register(EchoesOfGravity.createId("magenite_stairs"));
		MAGENITE_SLAB.register(EchoesOfGravity.createId("magenite_slab"));
		MAGENITE_WALL.register(EchoesOfGravity.createId("magenite_wall"));
		MAGENITE_BRICKS.register(EchoesOfGravity.createId("magenite_bricks"));
		MAGENITE_BRICK_STAIRS.register(EchoesOfGravity.createId("magenite_brick_stairs"));
		MAGENITE_BRICK_SLAB.register(EchoesOfGravity.createId("magenite_brick_slab"));
		MAGENITE_BRICK_WALL.register(EchoesOfGravity.createId("magenite_brick_wall"));
		POLISHED_MAGENITE.register(EchoesOfGravity.createId("polished_magenite"));
		POLISHED_MAGENITE_STAIRS.register(EchoesOfGravity.createId("polished_magenite_stairs"));
		POLISHED_MAGENITE_SLAB.register(EchoesOfGravity.createId("polished_magenite_slab"));
		POLISHED_MAGENITE_WALL.register(EchoesOfGravity.createId("polished_magenite_wall"));
		MAGENITE_CORNICE.register(EchoesOfGravity.createId("magenite_cornice"));
		CHISELED_MAGENITE.register(EchoesOfGravity.createId("chiseled_magenite"));
		CHISELED_MAGENITE_PLINTH.register(EchoesOfGravity.createId("chiseled_magenite_plinth"));
		MOSS_COVERED_MAGENITE.register(EchoesOfGravity.createId("moss_covered_magenite"));
		MOSSY_MAGENITE.register(EchoesOfGravity.createId("mossy_magenite"));
		MOSSY_MAGENITE_STAIRS.register(EchoesOfGravity.createId("mossy_magenite_stairs"));
		MOSSY_MAGENITE_SLAB.register(EchoesOfGravity.createId("mossy_magenite_slab"));
		MOSSY_MAGENITE_WALL.register(EchoesOfGravity.createId("mossy_magenite_wall"));
		MOSSY_MAGENITE_BRICKS.register(EchoesOfGravity.createId("mossy_magenite_bricks"));
		MOSSY_MAGENITE_BRICK_STAIRS.register(EchoesOfGravity.createId("mossy_magenite_brick_stairs"));
		MOSSY_MAGENITE_BRICK_SLAB.register(EchoesOfGravity.createId("mossy_magenite_brick_slab"));
		MOSSY_MAGENITE_BRICK_WALL.register(EchoesOfGravity.createId("mossy_magenite_brick_wall"));
		MOSSY_POLISHED_MAGENITE.register(EchoesOfGravity.createId("mossy_polished_magenite"));
		MOSSY_POLISHED_MAGENITE_STAIRS.register(EchoesOfGravity.createId("mossy_polished_magenite_stairs"));
		MOSSY_POLISHED_MAGENITE_SLAB.register(EchoesOfGravity.createId("mossy_polished_magenite_slab"));
		MOSSY_POLISHED_MAGENITE_WALL.register(EchoesOfGravity.createId("mossy_polished_magenite_wall"));
		MOSSY_MAGENITE_CORNICE.register(EchoesOfGravity.createId("mossy_magenite_cornice"));
		MOSSY_CHISELED_MAGENITE.register(EchoesOfGravity.createId("mossy_chiseled_magenite"));
		GRAVITY_PEDESTAL.register(EchoesOfGravity.createId("gravity_pedestal"));
		ENERGY_EXTRACTOR.register(EchoesOfGravity.createId("energy_extractor"));
		REINFORCED_GRAVITY_BLOCK.register(EchoesOfGravity.createId("reinforced_gravity_block"));
		REINFORCED_GRAVITY_STAIRS.register(EchoesOfGravity.createId("reinforced_gravity_stairs"));
		METEOR_SALT_BLOCK.register(EchoesOfGravity.createId("meteor_salt_block"));
		CELESTINE_ORE.register(EchoesOfGravity.createId("celestine_ore"));
		RAW_CELESTINE_BLOCK.register(EchoesOfGravity.createId("raw_celestine_block"));
		CELESTINE_BLOCK.register(EchoesOfGravity.createId("celestine_block"));
		OLD_ARCHEOLOGIST_NOTES.register(EchoesOfGravity.createId("old_archeologist_notes"));
	}

	@Override
	public void registerClient() {
		REINFORCED_GRAVITY_BLOCK.cutout();
		REINFORCED_GRAVITY_STAIRS.cutout();
		OLD_ARCHEOLOGIST_NOTES.cutout();

		REINFORCED_GRAVITY_BLOCK.translucent();
		REINFORCED_GRAVITY_STAIRS.translucent();
	}
}
