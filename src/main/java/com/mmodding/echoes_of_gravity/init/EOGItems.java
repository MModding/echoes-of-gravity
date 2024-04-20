package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.EchoesOfGravity;
import com.mmodding.echoes_of_gravity.items.SaltStick;
import com.mmodding.echoes_of_gravity.materials.armors.CelestineArmorMaterial;
import com.mmodding.echoes_of_gravity.materials.tools.CelestineToolMaterial;
import com.mmodding.mmodding_lib.library.glint.DefaultGlintPacks;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import com.mmodding.mmodding_lib.library.items.*;
import com.mmodding.mmodding_lib.library.items.settings.AdvancedItemSettings;
import net.minecraft.entity.EquipmentSlot;

public class EOGItems implements ElementsInitializer {

	public static final CustomItem METEOR_SALT = new CustomItem(new AdvancedItemSettings().group(EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I));

	public static final CustomItem SALT_STICK = new SaltStick(new AdvancedItemSettings().group(EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I));

	public static final CustomItem CELESTINE = new CustomItem(new AdvancedItemSettings().group(EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I));

	public static final CustomSwordItem CELESTINE_SWORD = new CustomSwordItem(
			CelestineToolMaterial.INSTANCE,
			3,
			-2.4F,
			new AdvancedItemSettings().glintPack(DefaultGlintPacks.LIGHT_BLUE).group(EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomPickaxeItem CELESTINE_PICKAXE = new CustomPickaxeItem(
			CelestineToolMaterial.INSTANCE,
			1,
			-2.8F,
			new AdvancedItemSettings().glintPack(DefaultGlintPacks.LIGHT_BLUE).group(EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomAxeItem CELESTINE_AXE = new CustomAxeItem(
			CelestineToolMaterial.INSTANCE,
			7,
			-3.2F,
			new AdvancedItemSettings().glintPack(DefaultGlintPacks.LIGHT_BLUE).group(EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomShovelItem CELESTINE_SHOVEL = new CustomShovelItem(
			CelestineToolMaterial.INSTANCE,
			1.5F,
			-3.0F,
			new AdvancedItemSettings().glintPack(DefaultGlintPacks.LIGHT_BLUE).group(EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomHoeItem CELESTINE_HOE = new CustomHoeItem(
			CelestineToolMaterial.INSTANCE,
			0,
			-3.0F,
			new AdvancedItemSettings().glintPack(DefaultGlintPacks.LIGHT_BLUE).group(EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomArmorItem CELESTINE_HELMET = new CustomArmorItem(
			CelestineArmorMaterial.INSTANCE,
			EquipmentSlot.HEAD,
			new AdvancedItemSettings().glintPack(DefaultGlintPacks.LIGHT_BLUE).group(EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomArmorItem CELESTINE_CHESTPLATE = new CustomArmorItem(
			CelestineArmorMaterial.INSTANCE,
			EquipmentSlot.CHEST,
			new AdvancedItemSettings().glintPack(DefaultGlintPacks.LIGHT_BLUE).group(EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomArmorItem CELESTINE_LEGGINGS = new CustomArmorItem(
			CelestineArmorMaterial.INSTANCE,
			EquipmentSlot.LEGS,
			new AdvancedItemSettings().glintPack(DefaultGlintPacks.LIGHT_BLUE).group(EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomArmorItem CELESTINE_BOOTS = new CustomArmorItem(
			CelestineArmorMaterial.INSTANCE,
			EquipmentSlot.FEET,
			new AdvancedItemSettings().glintPack(DefaultGlintPacks.LIGHT_BLUE).group(EOGTabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	@Override
	public void register() {
		METEOR_SALT.register(EchoesOfGravity.createId("meteor_salt"));
		SALT_STICK.register(EchoesOfGravity.createId("salt_stick"));
		CELESTINE.register(EchoesOfGravity.createId("celestine"));

		CELESTINE_SWORD.register(EchoesOfGravity.createId("celestine_sword"));
		CELESTINE_PICKAXE.register(EchoesOfGravity.createId("celestine_pickaxe"));
		CELESTINE_AXE.register(EchoesOfGravity.createId("celestine_axe"));
		CELESTINE_SHOVEL.register(EchoesOfGravity.createId("celestine_shovel"));
		CELESTINE_HOE.register(EchoesOfGravity.createId("celestine_hoe"));

		CELESTINE_HELMET.register(EchoesOfGravity.createId("celestine_helmet"));
		CELESTINE_CHESTPLATE.register(EchoesOfGravity.createId("celestine_chestplate"));
		CELESTINE_LEGGINGS.register(EchoesOfGravity.createId("celestine_leggings"));
		CELESTINE_BOOTS.register(EchoesOfGravity.createId("celestine_boots"));
	}
}
