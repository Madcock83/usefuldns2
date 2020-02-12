package net.mcreator.usefuldns;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

@Elementsusefuldns.ModElement.Tag
public class MCreatorPeopleburgerFoodEaten extends Elementsusefuldns.ModElement {
	public MCreatorPeopleburgerFoodEaten(Elementsusefuldns instance) {
		super(instance, 97);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPeopleburgerFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
		entity.setCustomName(new StringTextComponent("cannibal"));
	}
}
