package com.Sackboy.TOM;

import com.Sackboy.TOM.init.TOMItems;
import com.Sackboy.TOM.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
public class TOM {

	@SidedProxy(clientSide = ModInfo.CLIENTPROXY, serverSide = ModInfo.SERVERPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		/* Items */
		TOMItems.init();
		TOMItems.register();
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerRenders();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
