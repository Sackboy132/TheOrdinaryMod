package com.Sackboy.TOM;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TOMTab extends CreativeTabs {

	public TOMTab(String label) {
		super (label);
	}

	@Override
	public Item getTabIconItem() {
		return Items.tipped_arrow;
	}
}
