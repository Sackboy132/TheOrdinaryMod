package com.Sackboy.TOM.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TOMRecipes {

	public static void register() {
		
		/* Smelting */
		GameRegistry.addSmelting(TOMItems.raw_worm, new ItemStack(TOMItems.cooked_worm, 1), 0.1F);
		
		/* Recipes */
		GameRegistry.addRecipe(new ItemStack(TOMItems.cardboard_box, 1), new Object[] {"CCC",
																					   "C C",
																					   "CCC",
																					   'C', TOMItems.cardboard
		});
	
	}
}
