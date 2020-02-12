package net.mcreator.usefuldns;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

@Elementsusefuldns.ModElement.Tag
public class MCreatorTest extends Elementsusefuldns.ModElement {
	public MCreatorTest(Elementsusefuldns instance) {
		super(instance, 146);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(MCreatorCompressedcoal.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
