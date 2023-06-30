package com.mmodding.echoes_of_gravity.init;

import com.mmodding.echoes_of_gravity.EchoesOfGravity;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.tag.api.QuiltTagKey;
import org.quiltmc.qsl.tag.api.TagType;

public class EOGTags {

	public static final TagKey<Block> DEAD_SOIL = QuiltTagKey.of(Registry.BLOCK_KEY, EchoesOfGravity.createId("dead_soil"), TagType.NORMAL);
}
