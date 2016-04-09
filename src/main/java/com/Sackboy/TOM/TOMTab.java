package com.Sackboy.TOM;

import com.Sackboy.TOM.init.TOMItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TOMTab extends CreativeTabs {

	public TOMTab(String label) {
		super (label);
	}

	@Override
	public Item getTabIconItem() {
		return TOMItems.cooked_worm;
	}
}
