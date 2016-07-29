package com.seriouscreeper.craftingmats.proxy;

import com.seriouscreeper.craftingmats.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
	}

}
