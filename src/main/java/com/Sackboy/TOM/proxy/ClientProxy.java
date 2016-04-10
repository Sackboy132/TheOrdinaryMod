package com.Sackboy.TOM.proxy;

import com.Sackboy.TOM.Mob.EntityJoiter;
import com.Sackboy.TOM.Model.ModelJoiter;
import com.Sackboy.TOM.Render.RenderJoiter;
import com.Sackboy.TOM.init.TOMItems;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		TOMItems.registerRenders();

		//RenderingRegistry.registerEntityRenderingHandler(EntityCrawler.class,
			//	new RenderCrawler(Minecraft.getMinecraft().getRenderManager(), new ModelCrawler(), 0f));
		RenderingRegistry.registerEntityRenderingHandler(EntityJoiter.class,
				new RenderJoiter(Minecraft.getMinecraft().getRenderManager(), new ModelJoiter(), 0f));
	}

}
