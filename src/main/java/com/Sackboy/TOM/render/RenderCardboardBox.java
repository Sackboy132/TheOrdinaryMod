package com.Sackboy.TOM.render;

import com.Sackboy.TOM.ModInfo;
import com.Sackboy.TOM.model.ModelCrawler;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderCardboardBox extends RenderLiving {

	public RenderCardboardBox(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}	

	private static final ResourceLocation CardboardBoxTexture = new ResourceLocation(
			ModInfo.ID + ":textures/mobs/cardboardbox/cardboardbox.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return CardboardBoxTexture;
	}
}