package net.mcreator.usefuldns;

import net.minecraft.world.World;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@Elementsusefuldns.ModElement.Tag
public class MCreatorMadstaffRightClickedInAir extends Elementsusefuldns.ModElement {
	public MCreatorMadstaffRightClickedInAir(Elementsusefuldns instance) {
		super(instance, 99);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorMadstaffRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorMadstaffRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(Items.ARROW, (int) (1))) : false)) {
			if (!world.isRemote && entity instanceof LivingEntity) {
				ArrowEntity entityToSpawn = new ArrowEntity(world, (LivingEntity) entity);
				entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, ((float) 75) * 2.0F, 0);
				entityToSpawn.setDamage(((float) 500) * 2.0F);
				entityToSpawn.setKnockbackStrength((int) 5);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
