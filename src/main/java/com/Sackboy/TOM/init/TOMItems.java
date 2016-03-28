package com.Sackboy.TOM.init;

import com.Sackboy.TOM.ModInfo;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TOMItems {

	public static Item raw_worm;

	public static void init() {
		raw_worm = new Item().setUnlocalizedName("raw_worm");
	}

	public static void register() {
		GameRegistry.registerItem(raw_worm, raw_worm.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() {
		registerRender(raw_worm);
	}

	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(ModInfo.ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}