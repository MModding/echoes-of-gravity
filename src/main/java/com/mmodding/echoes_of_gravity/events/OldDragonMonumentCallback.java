package com.mmodding.echoes_of_gravity.events;

import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;
import org.quiltmc.qsl.base.api.event.Event;

public interface OldDragonMonumentCallback {

	Event<OldDragonMonumentCallback> EVENT = Event.create(OldDragonMonumentCallback.class, (listeners) -> ((world, pos) -> {
		for (OldDragonMonumentCallback listener: listeners) {
			ActionResult result = listener.interact(world, pos);

			if (result != ActionResult.PASS) {
				return result;
			}
		}

		return ActionResult.PASS;
	}));

	ActionResult interact(WorldAccess world, BlockPos pos);
}
