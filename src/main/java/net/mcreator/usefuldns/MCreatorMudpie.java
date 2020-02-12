package net.mcreator.usefuldns;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

@Elementsusefuldns.ModElement.Tag
public class MCreatorMudpie extends Elementsusefuldns.ModElement {
	@ObjectHolder("usefuldns:mudpie")
	public static final Item block = null;

	public MCreatorMudpie(Elementsusefuldns instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MCreatorUsefuldns.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(25).saturation(0.300000011920929f).setAlwaysEdible().meat().build()));
			setRegistryName("mudpie");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 7;
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
				MCreatorMudpieFoodEaten.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
