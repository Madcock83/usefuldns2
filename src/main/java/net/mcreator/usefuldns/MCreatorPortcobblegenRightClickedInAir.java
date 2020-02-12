package net.mcreator.usefuldns;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

@Elementsusefuldns.ModElement.Tag
public class MCreatorPortcobblegenRightClickedInAir extends Elementsusefuldns.ModElement {
	public MCreatorPortcobblegenRightClickedInAir(Elementsusefuldns instance) {
		super(instance, 95);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPortcobblegenRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), new ItemStack(Blocks.COBBLESTONE, (int) (16)));
	}
}
