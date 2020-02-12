package net.mcreator.usefuldns;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.Block;

@Elementsusefuldns.ModElement.Tag
public class MCreatorSteelhammerItemInUseTick extends Elementsusefuldns.ModElement {
	public MCreatorSteelhammerItemInUseTick(Elementsusefuldns instance) {
		super(instance, 129);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorSteelhammerItemInUseTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorSteelhammerItemInUseTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorSteelhammerItemInUseTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorSteelhammerItemInUseTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorSteelhammerItemInUseTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((((int) entity.rotationYaw) > 315) && (((int) entity.rotationYaw) < 360)) || ((((int) entity.rotationYaw) > 0) && (((int) entity.rotationYaw) < 45)))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) x,
					(int) y, (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world, new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) x, (int) (y + 1), (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world, new BlockPos((int) x, (int) (y + 1),
						(int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) x, (int) (y - 1), (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), world, new BlockPos((int) x, (int) (y - 1),
						(int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) > -1) && ((world.getBlockState(
					new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1),
					(int) (y - 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), world, new BlockPos((int) (x - 1),
						(int) (y - 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))) > -1) && ((world.getBlockState(
					new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1),
					(int) (y - 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), world, new BlockPos((int) (x - 1),
						(int) (y - 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) > -1) && ((world.getBlockState(
					new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1),
					(int) (y - 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), world, new BlockPos((int) (x + 1),
						(int) (y - 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) > -1) && ((world.getBlockState(
					new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1),
					(int) (y + 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), world, new BlockPos((int) (x + 1),
						(int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) (x + 1), (int) y, (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), world, new BlockPos((int) (x + 1), (int) y,
						(int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) (x - 1), (int) y, (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), world, new BlockPos((int) (x - 1), (int) y,
						(int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
			}
		}
		if (((((int) entity.rotationYaw) > 135) && (((int) entity.rotationYaw) < 225))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) x,
					(int) y, (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world, new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) x, (int) (y + 1), (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world, new BlockPos((int) x, (int) (y + 1),
						(int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) x, (int) (y - 1), (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), world, new BlockPos((int) x, (int) (y - 1),
						(int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) > -1) && ((world.getBlockState(
					new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1),
					(int) (y - 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), world, new BlockPos((int) (x - 1),
						(int) (y - 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))) > -1) && ((world.getBlockState(
					new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1),
					(int) (y - 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), world, new BlockPos((int) (x - 1),
						(int) (y - 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) > -1) && ((world.getBlockState(
					new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1),
					(int) (y - 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), world, new BlockPos((int) (x + 1),
						(int) (y - 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) > -1) && ((world.getBlockState(
					new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1),
					(int) (y + 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), world, new BlockPos((int) (x + 1),
						(int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) (x + 1), (int) y, (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), world, new BlockPos((int) (x + 1), (int) y,
						(int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) (x - 1), (int) y, (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), world, new BlockPos((int) (x - 1), (int) y,
						(int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
			}
		}
		if (((((int) entity.rotationYaw) > 225) && (((int) entity.rotationYaw) < 315))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) x,
					(int) y, (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world, new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) x, (int) (y + 1), (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world, new BlockPos((int) x, (int) (y + 1),
						(int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) x, (int) (y - 1), (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), world, new BlockPos((int) x, (int) (y - 1),
						(int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) > -1) && ((world.getBlockState(
					new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) x,
					(int) (y - 1), (int) (z - 1))))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), world, new BlockPos((int) x,
						(int) (y - 1), (int) (z - 1)));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) > -1) && ((world.getBlockState(
					new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) x,
					(int) (y + 1), (int) (z - 1))))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), world, new BlockPos((int) x,
						(int) (y + 1), (int) (z - 1)));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) > -1) && ((world.getBlockState(
					new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) x,
					(int) (y - 1), (int) (z + 1))))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), world, new BlockPos((int) x,
						(int) (y - 1), (int) (z + 1)));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) > -1) && ((world.getBlockState(
					new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) x,
					(int) (y + 1), (int) (z + 1))))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), world, new BlockPos((int) x,
						(int) (y + 1), (int) (z + 1)));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) x, (int) y, (int) (z + 1))))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), world, new BlockPos((int) x, (int) y,
						(int) (z + 1)));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) x, (int) y, (int) (z - 1))))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), world, new BlockPos((int) x, (int) y,
						(int) (z - 1)));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
			}
		}
		if (((((int) entity.rotationYaw) > 45) && (((int) entity.rotationYaw) < 135))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) x,
					(int) y, (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world, new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) x, (int) (y + 1), (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world, new BlockPos((int) x, (int) (y + 1),
						(int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) x, (int) (y - 1), (int) z)))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), world, new BlockPos((int) x, (int) (y - 1),
						(int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) > -1) && ((world.getBlockState(
					new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) x,
					(int) (y - 1), (int) (z - 1))))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), world, new BlockPos((int) x,
						(int) (y - 1), (int) (z - 1)));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) > -1) && ((world.getBlockState(
					new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) x,
					(int) (y + 1), (int) (z - 1))))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), world, new BlockPos((int) x,
						(int) (y + 1), (int) (z - 1)));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) > -1) && ((world.getBlockState(
					new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) x,
					(int) (y - 1), (int) (z + 1))))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), world, new BlockPos((int) x,
						(int) (y - 1), (int) (z + 1)));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) > -1) && ((world.getBlockState(
					new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) x,
					(int) (y + 1), (int) (z + 1))))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), world, new BlockPos((int) x,
						(int) (y + 1), (int) (z + 1)));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) x, (int) y, (int) (z + 1))))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), world, new BlockPos((int) x, (int) y,
						(int) (z + 1)));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) x, (int) y, (int) (z - 1))))) > -1) && ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) < 4))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), world, new BlockPos((int) x, (int) y,
						(int) (z - 1)));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
			}
		}
	}
}
