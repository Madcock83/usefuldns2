package net.mcreator.usefuldns;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

@Elementsusefuldns.ModElement.Tag
public class MCreatorMadstaffItemIsCraftedsmelted extends Elementsusefuldns.ModElement {
	public MCreatorMadstaffItemIsCraftedsmelted(Elementsusefuldns instance) {
		super(instance, 98);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure MCreatorMadstaffItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		itemstack.addEnchantment(Enchantments.SHARPNESS, (int) 30);
		itemstack.addEnchantment(Enchantments.SMITE, (int) 30);
		itemstack.addEnchantment(Enchantments.LOOTING, (int) 10);
		itemstack.addEnchantment(Enchantments.UNBREAKING, (int) 5);
		itemstack.addEnchantment(Enchantments.KNOCKBACK, (int) 5);
	}
}
