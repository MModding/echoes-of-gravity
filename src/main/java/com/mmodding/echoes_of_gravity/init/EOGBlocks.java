package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.EchoesOfGravity;
import com.mmodding.echoes_of_gravity.blocks.EnergyExtractor;
import com.mmodding.echoes_of_gravity.blocks.GravityPedestal;
import com.mmodding.echoes_of_gravity.blocks.ReinforcedGravityBlock;
import com.mmodding.mmodding_lib.library.blocks.*;
import com.mmodding.mmodding_lib.library.blocks.settings.DefaultBlockSettings;
import com.mmodding.mmodding_lib.library.initializers.ClientElementsInitializer;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import net.minecraft.block.Material;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.entity.effect.StatusEffects;
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

	public static final CustomPlantBlock DEAD_GRASS = new CustomPlantBlock(
		state -> state.isIn(EOGTags.DEAD_SOIL),
		DefaultBlockSettings.REPLACEABLE_PLANT_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomPlantBlock FALLEN_DEAD_GRASS = new CustomPlantBlock(
		state -> state.isIn(EOGTags.DEAD_SOIL),
		DefaultBlockSettings.REPLACEABLE_PLANT_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomFlowerBlock DEAD_FLOWER_0 = new CustomFlowerBlock(
		state -> state.isIn(EOGTags.DEAD_SOIL),
		StatusEffects.WITHER,
		10,
		DefaultBlockSettings.PLANT_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomFlowerBlock DEAD_FLOWER_1 = new CustomFlowerBlock(
		state -> state.isIn(EOGTags.DEAD_SOIL),
		StatusEffects.WITHER,
		10,
		DefaultBlockSettings.PLANT_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomFlowerBlock DEAD_FLOWER_2 = new CustomFlowerBlock(
		state -> state.isIn(EOGTags.DEAD_SOIL),
		StatusEffects.WITHER,
		10,
		DefaultBlockSettings.PLANT_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomFlowerBlock DEAD_FLOWER_3 = new CustomFlowerBlock(
		state -> state.isIn(EOGTags.DEAD_SOIL),
		StatusEffects.WITHER,
		10,
		DefaultBlockSettings.PLANT_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomFlowerBlock DEAD_FLOWER_4 = new CustomFlowerBlock(
		state -> state.isIn(EOGTags.DEAD_SOIL),
		StatusEffects.WITHER,
		10,
		DefaultBlockSettings.PLANT_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomFlowerBlock DEAD_FLOWER_5 = new CustomFlowerBlock(
		state -> state.isIn(EOGTags.DEAD_SOIL),
		StatusEffects.WITHER,
		10,
		DefaultBlockSettings.PLANT_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomFlowerBlock DEAD_FLOWER_6 = new CustomFlowerBlock(
		state -> state.isIn(EOGTags.DEAD_SOIL),
		StatusEffects.WITHER,
		10,
		DefaultBlockSettings.PLANT_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock DEAD_GRASS_BLOCK = new CustomBlock(
		DefaultBlockSettings.GRASS_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock DEAD_DIRT = new CustomBlock(
		DefaultBlockSettings.DIRT_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock DEAD_WOOD = new CustomBlock(
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomPillarBlock DEAD_LOG = new CustomPillarBlock(
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomHorizontalFacingBlock HOLED_DEAD_LOG = new CustomHorizontalFacingBlock(
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomHorizontalFacingBlock ERODED_DEAD_LOG = new CustomHorizontalFacingBlock(
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock STRIPPED_DEAD_WOOD = new CustomBlock(
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomPillarBlock STRIPPED_DEAD_LOG = new CustomPillarBlock(
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock DEAD_LEAVES = new CustomBlock(
		DefaultBlockSettings.LEAVES_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock DEAD_PLANKS = new CustomBlock(
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomStairsBlock DEAD_PLANK_STAIRS = new CustomStairsBlock(
		DEAD_PLANKS.getDefaultState(),
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomSlabBlock DEAD_PLANK_SLAB = new CustomSlabBlock(
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomFenceBlock DEAD_PLANK_FENCE = new CustomFenceBlock(
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomFenceGateBlock DEAD_PLANK_FENCE_GATE = new CustomFenceGateBlock(
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomPressurePlateBlock DEAD_PLANK_PRESSURE_PLATE = new CustomPressurePlateBlock(
		PressurePlateBlock.ActivationRule.EVERYTHING,
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomButtonBlock.Wooden DEAD_PLANK_BUTTON = new CustomButtonBlock.Wooden(
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomDoorBlock DEAD_WOOD_DOOR = new CustomDoorBlock(
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomTrapdoorBlock DEAD_WOOD_TRAPDOOR = new CustomTrapdoorBlock(
		DefaultBlockSettings.WOOD_SETTINGS,
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock METEOR_SALT_BLOCK = new CustomBlock(
		QuiltBlockSettings.of(Material.STONE).strength(0.5F,10).sounds(BlockSoundGroup.SOUL_SOIL),
		true,
		EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I
	);

	public static final CustomBlock FULGURITE = new CustomBlock(
		DefaultBlockSettings.STONE_SETTINGS,
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
		OLD_ARCHEOLOGIST_NOTES.register(EchoesOfGravity.createId("old_archeologist_notes"));
		GRAVITY_PEDESTAL.register(EchoesOfGravity.createId("gravity_pedestal"));
		ENERGY_EXTRACTOR.register(EchoesOfGravity.createId("energy_extractor"));
		REINFORCED_GRAVITY_BLOCK.register(EchoesOfGravity.createId("reinforced_gravity_block"));
		REINFORCED_GRAVITY_STAIRS.register(EchoesOfGravity.createId("reinforced_gravity_stairs"));
		DEAD_GRASS.register(EchoesOfGravity.createId("dead_grass"));
		FALLEN_DEAD_GRASS.register(EchoesOfGravity.createId("fallen_dead_grass"));
		DEAD_FLOWER_0.register(EchoesOfGravity.createId("dead_flower_0"));
		DEAD_FLOWER_1.register(EchoesOfGravity.createId("dead_flower_1"));
		DEAD_FLOWER_2.register(EchoesOfGravity.createId("dead_flower_2"));
		DEAD_FLOWER_3.register(EchoesOfGravity.createId("dead_flower_3"));
		DEAD_FLOWER_4.register(EchoesOfGravity.createId("dead_flower_4"));
		DEAD_FLOWER_5.register(EchoesOfGravity.createId("dead_flower_5"));
		DEAD_FLOWER_6.register(EchoesOfGravity.createId("dead_flower_6"));
		DEAD_GRASS_BLOCK.register(EchoesOfGravity.createId("dead_grass_block"));
		DEAD_DIRT.register(EchoesOfGravity.createId("dead_dirt"));
		DEAD_WOOD.register(EchoesOfGravity.createId("dead_wood"));
		DEAD_LOG.register(EchoesOfGravity.createId("dead_log"));
		HOLED_DEAD_LOG.register(EchoesOfGravity.createId("holed_dead_log"));
		ERODED_DEAD_LOG.register(EchoesOfGravity.createId("eroded_dead_log"));
		STRIPPED_DEAD_WOOD.register(EchoesOfGravity.createId("stripped_dead_wood"));
		STRIPPED_DEAD_LOG.register(EchoesOfGravity.createId("stripped_dead_log"));
		DEAD_LEAVES.register(EchoesOfGravity.createId("dead_leaves"));
		DEAD_PLANKS.register(EchoesOfGravity.createId("dead_planks"));
		DEAD_PLANK_STAIRS.register(EchoesOfGravity.createId("dead_plank_stairs"));
		DEAD_PLANK_SLAB.register(EchoesOfGravity.createId("dead_plank_slab"));
		DEAD_PLANK_FENCE.register(EchoesOfGravity.createId("dead_plank_fence"));
		DEAD_PLANK_FENCE_GATE.register(EchoesOfGravity.createId("dead_plank_fence_gate"));
		DEAD_PLANK_PRESSURE_PLATE.register(EchoesOfGravity.createId("dead_plank_pressure_plate"));
		DEAD_PLANK_BUTTON.register(EchoesOfGravity.createId("dead_plank_button"));
		DEAD_WOOD_DOOR.register(EchoesOfGravity.createId("dead_wood_door"));
		DEAD_WOOD_TRAPDOOR.register(EchoesOfGravity.createId("dead_wood_trapdoor"));
		METEOR_SALT_BLOCK.register(EchoesOfGravity.createId("meteor_salt_block"));
		FULGURITE.register(EchoesOfGravity.createId("fulgurite"));
		CELESTINE_ORE.register(EchoesOfGravity.createId("celestine_ore"));
		RAW_CELESTINE_BLOCK.register(EchoesOfGravity.createId("raw_celestine_block"));
		CELESTINE_BLOCK.register(EchoesOfGravity.createId("celestine_block"));
	}

	@Override
	public void registerClient() {
		OLD_ARCHEOLOGIST_NOTES.cutout();
		REINFORCED_GRAVITY_BLOCK.cutout();
		REINFORCED_GRAVITY_STAIRS.cutout();
		DEAD_GRASS.cutout();
		FALLEN_DEAD_GRASS.cutout();
		DEAD_FLOWER_0.cutout();
		DEAD_FLOWER_1.cutout();
		DEAD_FLOWER_2.cutout();
		DEAD_FLOWER_3.cutout();
		DEAD_FLOWER_4.cutout();
		DEAD_FLOWER_5.cutout();
		DEAD_FLOWER_6.cutout();
		DEAD_LEAVES.cutout();
		DEAD_WOOD_DOOR.cutout();
		DEAD_WOOD_TRAPDOOR.cutout();

		REINFORCED_GRAVITY_BLOCK.translucent();
		REINFORCED_GRAVITY_STAIRS.translucent();
	}
}
