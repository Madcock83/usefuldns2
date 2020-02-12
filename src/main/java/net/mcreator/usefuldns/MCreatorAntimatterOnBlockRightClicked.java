package net.mcreator.usefuldns;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

@Elementsusefuldns.ModElement.Tag
public class MCreatorAntimatterOnBlockRightClicked extends Elementsusefuldns.ModElement {
	public MCreatorAntimatterOnBlockRightClicked(Elementsusefuldns instance) {
		super(instance, 118);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorAntimatterOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorAntimatterOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorAntimatterOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorAntimatterOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorAntimatterOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == new ItemStack(
				MCreatorMadbuck.block, (int) (1)).getItem()) && ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR
				.getDefaultState().getBlock()))) {
			if (entity instanceof PlayerEntity && !world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("There is nothing under the Anti-Matter Producer."), (true));
			}
		} else {
			if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == new ItemStack(
					MCreatorMadbuck.block, (int) (1)).getItem()) && ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == MCreatorUnobfurnace.block
					.getDefaultState().getBlock()))) {
				if (entity instanceof PlayerEntity && !world.isRemote) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Nope, get your own Furnace. This is not allowed"), (true));
				}
			} else {
				if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == new ItemStack(
						MCreatorMadbuck.block, (int) (1)).getItem()) && ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
						.getBlock() == MCreatorMadcrafter.block.getDefaultState().getBlock()))) {
					if (entity instanceof PlayerEntity && !world.isRemote) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Craft your own crafter!!! This is not allowed"), (true));
					}
				} else {
					if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == new ItemStack(
							MCreatorMadbuck.block, (int) (1)).getItem()) && ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
							.getBlock() == MCreatorAntimatter.block.getDefaultState().getBlock()))) {
						if (entity instanceof PlayerEntity && !world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Anti-Matter inceptions is not allowed!"), (true));
						}
					} else {
						if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == new ItemStack(
								MCreatorMadbuck.block, (int) (1)).getItem()) && ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))) {
							if (entity instanceof PlayerEntity && !world.isRemote) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Something is blocking the reproduction"), (true));
							}
						} else {
							if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == new ItemStack(
									MCreatorMadbuck.block, (int) (1)).getItem()) && ((world.getBlockState(new BlockPos((int) x, (int) (y + 1),
									(int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock()))) {
								world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
										(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))), 3);
								if (entity instanceof PlayerEntity)
									((PlayerEntity) entity).inventory.clearMatchingItems(
											p -> new ItemStack(MCreatorMadbuck.block, (int) (1)).getItem() == p.getItem(), (int) 1);
							}
						}
					}
				}
			}
		}
	}
}
