package net.mcreator.usefuldns;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@Elementsusefuldns.ModElement.Tag
public class MCreatorUnobtainiumBootsTickEvent extends Elementsusefuldns.ModElement {
	public MCreatorUnobtainiumBootsTickEvent(Elementsusefuldns instance) {
		super(instance, 113);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorUnobtainiumBootsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.fallDistance = (float) (0);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 60, (int) 5));
	}
}
