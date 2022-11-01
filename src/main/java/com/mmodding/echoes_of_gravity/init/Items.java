package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.Utils;
import com.mmodding.echoes_of_gravity.items.SaltStick;
import com.mmodding.echoes_of_gravity.materials.armors.CelestineArmorMaterial;
import com.mmodding.echoes_of_gravity.materials.tools.CelestineToolMaterial;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import com.mmodding.mmodding_lib.library.items.*;
import net.minecraft.entity.EquipmentSlot;

public class Items implements ElementsInitializer {

	public static final CustomItem METEOR_SALT = new CustomItem(new CustomItemSettings().group(Tabs.ECHOES_OF_GRAVITY_CHAPTER_I));

	public static final CustomItem SALT_STICK = new SaltStick(new CustomItemSettings().group(Tabs.ECHOES_OF_GRAVITY_CHAPTER_I));

	public static final CustomItem CELESTINE = new CustomItem(new CustomItemSettings().group(Tabs.ECHOES_OF_GRAVITY_CHAPTER_I));

	public static final CustomSwordItem CELESTINE_SWORD = new CustomSwordItem(
			CelestineToolMaterial.INSTANCE,
			3,
			-2.4F,
			new CustomItemSettings().group(Tabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomPickaxeItem CELESTINE_PICKAXE = new CustomPickaxeItem(
			CelestineToolMaterial.INSTANCE,
			1,
			-2.8F,
			new CustomItemSettings().group(Tabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomAxeItem CELESTINE_AXE = new CustomAxeItem(
			CelestineToolMaterial.INSTANCE,
			7,
			-3.2F,
			new CustomItemSettings().group(Tabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomShovelItem CELESTINE_SHOVEL = new CustomShovelItem(
			CelestineToolMaterial.INSTANCE,
			1.5F,
			-3.0F,
			new CustomItemSettings().group(Tabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomHoeItem CELESTINE_HOE = new CustomHoeItem(
			CelestineToolMaterial.INSTANCE,
			0,
			-3.0F,
			new CustomItemSettings().group(Tabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomArmorItem CELESTINE_HELMET = new CustomArmorItem(
			CelestineArmorMaterial.INSTANCE,
			EquipmentSlot.HEAD,
			new CustomItemSettings().group(Tabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomArmorItem CELESTINE_CHESTPLATE = new CustomArmorItem(
			CelestineArmorMaterial.INSTANCE,
			EquipmentSlot.CHEST,
			new CustomItemSettings().group(Tabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomArmorItem CELESTINE_LEGGINGS = new CustomArmorItem(
			CelestineArmorMaterial.INSTANCE,
			EquipmentSlot.LEGS,
			new CustomItemSettings().group(Tabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	public static final CustomArmorItem CELESTINE_BOOTS = new CustomArmorItem(
			CelestineArmorMaterial.INSTANCE,
			EquipmentSlot.FEET,
			new CustomItemSettings().group(Tabs.ECHOES_OF_GRAVITY_CHAPTER_I)
	);

	@Override
	public void register() {
		METEOR_SALT.register(Utils.newIdentifier("meteor_salt"));
		SALT_STICK.register(Utils.newIdentifier("salt_stick"));
		CELESTINE.register(Utils.newIdentifier("celestine"));

		CELESTINE_SWORD.register(Utils.newIdentifier("celestine_sword"));
		CELESTINE_PICKAXE.register(Utils.newIdentifier("celestine_pickaxe"));
		CELESTINE_AXE.register(Utils.newIdentifier("celestine_axe"));
		CELESTINE_SHOVEL.register(Utils.newIdentifier("celestine_shovel"));
		CELESTINE_HOE.register(Utils.newIdentifier("celestine_hoe"));

		CELESTINE_HELMET.register(Utils.newIdentifier("celestine_helmet"));
		CELESTINE_CHESTPLATE.register(Utils.newIdentifier("celestine_chestplate"));
		CELESTINE_LEGGINGS.register(Utils.newIdentifier("celestine_leggings"));
		CELESTINE_BOOTS.register(Utils.newIdentifier("celestine_boots"));
	}
}
