package com.Sackboy.TOM;

import com.Sackboy.TOM.init.TOMAchievements;
import com.Sackboy.TOM.init.TOMItems;
<<<<<<< HEAD
import com.Sackboy.TOM.init.TOMMobs;
=======
import com.Sackboy.TOM.init.TOMRecipes;
>>>>>>> origin/master
import com.Sackboy.TOM.proxy.CommonProxy;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
public class TOM {

	@Instance
	public static TOM INSTANCE;
	
	@SidedProxy(clientSide = ModInfo.CLIENTPROXY, serverSide = ModInfo.SERVERPROXY)
	public static CommonProxy proxy;
	
	public static final TOMTab tabTOM = new TOMTab("tabTOM");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		/* Items */
		TOMItems.init();
		TOMItems.register();
		
<<<<<<< HEAD
		TOMMobs.register();
=======
		/* Recipes */
		TOMRecipes.register();
		
		/* Achievements */
		TOMAchievements.init();
		TOMAchievements.register();
>>>>>>> origin/master
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerRenders();
		FMLCommonHandler.instance().bus().register(new TOMEventHandler());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
