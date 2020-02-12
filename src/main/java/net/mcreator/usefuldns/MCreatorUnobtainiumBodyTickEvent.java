package net.mcreator.usefuldns;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@Elementsusefuldns.ModElement.Tag
public class MCreatorUnobtainiumBodyTickEvent extends Elementsusefuldns.ModElement {
	public MCreatorUnobtainiumBodyTickEvent(Elementsusefuldns instance) {
		super(instance, 111);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorUnobtainiumBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 1200, (int) 2, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 1200, (int) 2, (false), (false)));
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).abilities.allowFlying = (true);
	}
}
