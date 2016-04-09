package com.Sackboy.TOM.init;

import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class TOMAchievements {

	// TODO: Add more Achievements throughout Development
	
	public static Achievement worms_for_two;

	public static void init() {
		worms_for_two = new Achievement("achievement.worms_for_two", "worms_for_two", 0, 0, new ItemStack(TOMItems.cooked_worm), null);
	}

	public static void register() {
		worms_for_two.initIndependentStat().registerStat();
		
		AchievementPage.registerAchievementPage(new AchievementPage("The Ordinary Mod", new Achievement[]{ worms_for_two }));
	}
	
}