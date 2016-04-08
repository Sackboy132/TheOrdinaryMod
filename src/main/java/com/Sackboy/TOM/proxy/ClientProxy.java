package com.Sackboy.TOM.proxy;

import com.Sackboy.TOM.Mob.EntityCrawler;
import com.Sackboy.TOM.Model.ModelCrawler;
import com.Sackboy.TOM.Render.RenderCrawler;
import com.Sackboy.TOM.init.TOMItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		TOMItems.registerRenders();
	
		RenderingRegistry.registerEntityRenderingHandler(EntityCrawler.class, new RenderCrawler(Minecraft.getMinecraft().getRenderManager(), new ModelCrawler(), 0f));	 
	}

	
}
