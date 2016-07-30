package com.seriouscreeper.craftingrunes.proxy;

import com.seriouscreeper.craftingrunes.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
	}

}
