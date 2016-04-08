package com.Sackboy.TOM.Render;

import com.Sackboy.TOM.ModInfo;
import com.Sackboy.TOM.Model.ModelCrawler;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderCrawler extends RenderLiving {

	public RenderCrawler(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		// TODO Auto-generated constructor stub
	}	

	private static final ResourceLocation CrawlerTexture = new ResourceLocation(
			ModInfo.ID + ":textures/mobs/crawler/crawler.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return CrawlerTexture;
	}
}