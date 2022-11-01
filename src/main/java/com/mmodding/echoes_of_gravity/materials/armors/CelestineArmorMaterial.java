package com.mmodding.echoes_of_gravity.materials.armors;

import com.mmodding.echoes_of_gravity.init.Items;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CelestineArmorMaterial implements ArmorMaterial {

	public static CelestineArmorMaterial INSTANCE = new CelestineArmorMaterial();

	@Override
	public int getDurability(EquipmentSlot slot) {
		return new int[]{13, 15, 16, 11}[slot.getEntitySlotId()] * 15;
	}

	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return new int[]{1, 4, 5, 2}[slot.getEntitySlotId()];
	}

	@Override
	public int getEnchantability() {
		return 10;
	}

	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.CELESTINE);
	}

	@Override
	public String getName() {
		return "celestine";
	}

	@Override
	public float getToughness() {
		return 0.0F;
	}

	@Override
	public float getKnockbackResistance() {
		return 0.1F;
	}
}
