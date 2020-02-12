package net.mcreator.usefuldns;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;

@Elementsusefuldns.ModElement.Tag
public class MCreatorMadstaff extends Elementsusefuldns.ModElement {
	@ObjectHolder("usefuldns:madstaff")
	public static final Item block = null;

	public MCreatorMadstaff(Elementsusefuldns instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
			}

			public float getEfficiency() {
				return 25f;
			}

			public float getAttackDamage() {
				return 28f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 64;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 3, -1.2F, new Item.Properties().group(MCreatorUsefuldns.tab)) {
			@Override
			public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
				ActionResult<ItemStack> retval = super.onItemRightClick(world, entity, hand);
				ItemStack itemstack = retval.getResult();
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					MCreatorMadstaffRightClickedInAir.executeProcedure($_dependencies);
				}
				return retval;
			}

			@Override
			public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onCreated(itemstack, world, entity);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("itemstack", itemstack);
					MCreatorMadstaffItemIsCraftedsmelted.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("madstaff"));
	}
}
