package com.Sackboy.TOM.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCardboardBox extends ItemArmor {

	public ItemCardboardBox(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
		super(material, renderIndex, equipmentSlot);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		super.onArmorTick(world, player, itemStack);

		if (player.isSneaking()) {
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 100000, 1));
		}
	}
}
