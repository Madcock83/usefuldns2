package net.mcreator.usefuldns;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Elementsusefuldns.ModElement.Tag
public class MCreatorSteelhammer extends Elementsusefuldns.ModElement {
	@ObjectHolder("usefuldns:steelhammer")
	public static final Item block = null;

	public MCreatorSteelhammer(Elementsusefuldns instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MCreatorUsefuldns.tab).maxStackSize(1));
			setRegistryName("steelhammer");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemStack) {
			return new ItemStack(this);
		}

		@Override
		public int getItemEnchantability() {
			return 100;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 100;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 2F;
		}
	}
}
