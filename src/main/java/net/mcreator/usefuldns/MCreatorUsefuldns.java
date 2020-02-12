package net.mcreator.usefuldns;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@Elementsusefuldns.ModElement.Tag
public class MCreatorUsefuldns extends Elementsusefuldns.ModElement {
	public MCreatorUsefuldns(Elementsusefuldns instance) {
		super(instance, 100);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabusefuldns") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MCreatorSwissArmy.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
