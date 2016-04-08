package com.Sackboy.TOM.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TOMRecipes {

	public static void register() {
		GameRegistry.addSmelting(TOMItems.raw_worm, new ItemStack(TOMItems.cooked_worm, 1), 0.1F);
	}
}
