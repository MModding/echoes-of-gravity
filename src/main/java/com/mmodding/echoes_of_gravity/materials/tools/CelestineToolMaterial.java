package com.mmodding.echoes_of_gravity.materials.tools;

import com.mmodding.echoes_of_gravity.init.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CelestineToolMaterial implements ToolMaterial {

	public static CelestineToolMaterial INSTANCE = new CelestineToolMaterial();

	@Override
	public int getDurability() {
		return 500;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return 3.0F;
	}

	@Override
	public float getAttackDamage() {
		return 2.0F;
	}

	@Override
	public int getMiningLevel() {
		return 2;
	}

	@Override
	public int getEnchantability() {
		return 10;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.CELESTINE);
	}
}
