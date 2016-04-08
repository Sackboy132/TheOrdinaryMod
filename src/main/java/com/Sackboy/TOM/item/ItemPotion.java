package com.Sackboy.TOM.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import scala.reflect.api.Positions;

public class ItemPotion extends ItemFood {

	private PotionEffect[] effects;
	
	public ItemPotion(int amount, float saturation, boolean isWolfFood, PotionEffect... effects) {
	    super(amount, saturation, isWolfFood);
	    this.effects = effects;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		super.onFoodEaten(stack, worldIn, player);
		
	    for (int i = 0; i < effects.length; i ++) {
	        if (!worldIn.isRemote && effects[i] != null)
	            player.addPotionEffect(new PotionEffect(this.effects[i]));
	    }
	}
}
