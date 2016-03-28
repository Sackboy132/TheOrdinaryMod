package com.Sackboy.TOM.proxy;

import com.Sackboy.TOM.init.TOMItems;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		TOMItems.registerRenders();
	}
}
