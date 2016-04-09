package com.Sackboy.TOM.init;

import com.Sackboy.TOM.ModInfo;
import com.Sackboy.TOM.TOM;
import com.Sackboy.TOM.item.ItemCardboardBox;
import com.Sackboy.TOM.item.ItemPotion;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TOMItems {

	public static Item raw_worm;
	public static Item cooked_worm;
	public static Item cardboard;
	public static Item cardboard_box;
	
	public static final ItemArmor.ArmorMaterial cardboardArmorMaterial = EnumHelper.addArmorMaterial("cardboardboxArmorMaterial", ModInfo.ID + ":cardboardbox", 1000, new int[]{20, 30, 25, 15}, 30, null);
	
	public static void init() {
		raw_worm = new ItemFood(2, 0.5f, false).setUnlocalizedName("raw_worm").setCreativeTab(TOM.tabTOM); // Will be poisonous in the future.
		cooked_worm = new ItemFood(4, 1.0f, false).setUnlocalizedName("cooked_worm").setCreativeTab(TOM.tabTOM);
		cardboard = new Item().setUnlocalizedName("cardboard").setCreativeTab(TOM.tabTOM);
		cardboard_box = new ItemCardboardBox(cardboardArmorMaterial, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("cardboard_box").setCreativeTab(TOM.tabTOM);
	}

	public static void register() {
		GameRegistry.registerItem(raw_worm, raw_worm.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_worm, cooked_worm.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cardboard, cardboard.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cardboard_box, cardboard_box.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() {
		registerRender(raw_worm);
		registerRender(cooked_worm);
		registerRender(cardboard);
		registerRender(cardboard_box);
	}

	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(ModInfo.ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}