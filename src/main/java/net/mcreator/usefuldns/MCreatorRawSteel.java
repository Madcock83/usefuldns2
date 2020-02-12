package net.mcreator.usefuldns;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Elementsusefuldns.ModElement.Tag
public class MCreatorRawSteel extends Elementsusefuldns.ModElement {
	@ObjectHolder("usefuldns:rawsteel")
	public static final Item block = null;

	public MCreatorRawSteel(Elementsusefuldns instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MCreatorUsefuldns.tab).maxStackSize(64));
			setRegistryName("rawsteel");
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
