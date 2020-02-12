package net.mcreator.usefuldns;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@Elementsusefuldns.ModElement.Tag
public class MCreatorUnobtainiumLeggingsTickEvent extends Elementsusefuldns.ModElement {
	public MCreatorUnobtainiumLeggingsTickEvent(Elementsusefuldns instance) {
		super(instance, 112);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorUnobtainiumLeggingsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 1200, (int) 2, (false), (false)));
	}
}
