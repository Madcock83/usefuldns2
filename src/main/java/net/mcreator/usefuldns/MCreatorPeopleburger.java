package net.mcreator.usefuldns;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

@Elementsusefuldns.ModElement.Tag
public class MCreatorPeopleburger extends Elementsusefuldns.ModElement {
	@ObjectHolder("usefuldns:peopleburger")
	public static final Item block = null;

	public MCreatorPeopleburger(Elementsusefuldns instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MCreatorUsefuldns.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(15).saturation(0.300000011920929f).build()));
			setRegistryName("peopleburger");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				MCreatorPeopleburgerFoodEaten.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
