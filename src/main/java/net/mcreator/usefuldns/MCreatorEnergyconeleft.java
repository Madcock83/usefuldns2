package net.mcreator.usefuldns;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Elementsusefuldns.ModElement.Tag
public class MCreatorEnergyconeleft extends Elementsusefuldns.ModElement {
	@ObjectHolder("usefuldns:energyconeleft")
	public static final Item block = null;

	public MCreatorEnergyconeleft(Elementsusefuldns instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MCreatorUsefuldns.tab).maxStackSize(64));
			setRegistryName("energyconeleft");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
