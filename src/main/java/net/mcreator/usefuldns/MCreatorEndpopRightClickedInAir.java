package net.mcreator.usefuldns;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

@Elementsusefuldns.ModElement.Tag
public class MCreatorEndpopRightClickedInAir extends Elementsusefuldns.ModElement {
	public MCreatorEndpopRightClickedInAir(Elementsusefuldns instance) {
		super(instance, 107);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorEndpopRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorEndpopRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (entity instanceof PlayerEntity && !world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Welcome to the desert of the real!"), (false));
		}
	}
}
