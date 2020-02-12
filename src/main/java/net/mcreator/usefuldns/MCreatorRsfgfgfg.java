package net.mcreator.usefuldns;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

@Elementsusefuldns.ModElement.Tag
public class MCreatorRsfgfgfg extends Elementsusefuldns.ModElement {
	public MCreatorRsfgfgfg(Elementsusefuldns instance) {
		super(instance, 158);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorRsfgfgfg!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorRsfgfgfg!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorRsfgfgfg!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorRsfgfgfg!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorRsfgfgfg!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((entity.isSneaking())) {
			if (!world.isRemote && world.getServer() != null) {
				world.getServer()
						.getCommandManager()
						.handleCommand(
								new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), world.getServer(), null).withFeedbackDisabled(), "weather thunder");
			}
		} else {
			if (!world.isRemote && world.getServer() != null) {
				world.getServer()
						.getCommandManager()
						.handleCommand(
								new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), world.getServer(), null).withFeedbackDisabled(), "weather clear");
			}
		}
	}
}
