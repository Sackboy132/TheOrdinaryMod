package com.Sackboy.TOM.init;

import com.Sackboy.TOM.ModInfo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TOMBlocks {

	// TODO: Add more blocks

	public static void init() {
		
	}

	public static void register() {
		
	}

	public static void registerRenders() {
		
	}

	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(ModInfo.ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}