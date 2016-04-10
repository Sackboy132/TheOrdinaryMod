package com.Sackboy.TOM.render;

import com.Sackboy.TOM.ModInfo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderCrawler extends RenderLiving {

	public RenderCrawler(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}	

	private static final ResourceLocation CrawlerTexture = new ResourceLocation(
			ModInfo.ID + ":textures/mobs/crawler/crawler.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return CrawlerTexture;
	}
}