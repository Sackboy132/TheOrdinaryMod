package com.Sackboy.TOM;

import com.Sackboy.TOM.init.TOMAchievements;
import com.Sackboy.TOM.init.TOMItems;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class TOMEventHandler {
	
	@SubscribeEvent
	public void smeltRawWorm(PlayerEvent.ItemSmeltedEvent event) {
		if (event.smelting.getItem().equals(TOMItems.cooked_worm)) {
			event.player.addStat(TOMAchievements.worms_for_two, 1);
		}
	}
	
}
