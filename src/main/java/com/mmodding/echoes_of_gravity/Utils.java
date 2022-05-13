package com.mmodding.echoes_of_gravity;

import net.minecraft.util.Identifier;

public class Utils {

	public static final String modIdentifier = "echoes_of_gravity";

	public static Identifier newIdentifier(String path) {
		return new Identifier(Utils.modIdentifier, path);
	}

}
