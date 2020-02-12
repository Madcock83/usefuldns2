package net.mcreator.usefuldns;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.item.ItemStack;

@Elementsusefuldns.ModElement.Tag
public class MCreatorFirancesort extends Elementsusefuldns.ModElement {
	public MCreatorFirancesort(Elementsusefuldns instance) {
		super(instance, 147);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorFirancesort!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorFirancesort!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorFirancesort!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorFirancesort!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		for (int index0 = 0; index0 < (int) (9); index0++) {
			if ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem()) && ((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity) {
						ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) == 0))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof LockableLootTileEntity))
						((LockableLootTileEntity) inv).setInventorySlotContents((int) (0), (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof LockableLootTileEntity)
						((LockableLootTileEntity) inv).removeStackFromSlot((int) (1));
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem()) && ((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity) {
						ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof LockableLootTileEntity))
						((LockableLootTileEntity) inv).setInventorySlotContents((int) (1), (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof LockableLootTileEntity)
						((LockableLootTileEntity) inv).removeStackFromSlot((int) (2));
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3))).getItem() == (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3))).getItem()) && ((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity) {
						ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) == 0))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof LockableLootTileEntity))
						((LockableLootTileEntity) inv).setInventorySlotContents((int) (2), (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3))));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof LockableLootTileEntity)
						((LockableLootTileEntity) inv).removeStackFromSlot((int) (3));
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4))).getItem() == (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4))).getItem()) && ((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity) {
						ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (3))) == 0))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof LockableLootTileEntity))
						((LockableLootTileEntity) inv).setInventorySlotContents((int) (3), (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4))));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof LockableLootTileEntity)
						((LockableLootTileEntity) inv).removeStackFromSlot((int) (4));
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5))).getItem() == (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5))).getItem()) && ((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity) {
						ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (4))) == 0))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof LockableLootTileEntity))
						((LockableLootTileEntity) inv).setInventorySlotContents((int) (4), (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5))));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof LockableLootTileEntity)
						((LockableLootTileEntity) inv).removeStackFromSlot((int) (5));
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6))).getItem() == (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6))).getItem()) && ((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity) {
						ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (5))) == 0))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof LockableLootTileEntity))
						((LockableLootTileEntity) inv).setInventorySlotContents((int) (5), (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6))));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof LockableLootTileEntity)
						((LockableLootTileEntity) inv).removeStackFromSlot((int) (6));
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7))).getItem() == (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7))).getItem()) && ((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity) {
						ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (6))) == 0))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof LockableLootTileEntity))
						((LockableLootTileEntity) inv).setInventorySlotContents((int) (6), (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7))));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof LockableLootTileEntity)
						((LockableLootTileEntity) inv).removeStackFromSlot((int) (7));
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8))).getItem() == (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8))).getItem()) && ((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity) {
						ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (7))) == 0))) {
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv != null && (inv instanceof LockableLootTileEntity))
						((LockableLootTileEntity) inv).setInventorySlotContents((int) (7), (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8))));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof LockableLootTileEntity)
						((LockableLootTileEntity) inv).removeStackFromSlot((int) (8));
				}
			}
		}
	}
}
