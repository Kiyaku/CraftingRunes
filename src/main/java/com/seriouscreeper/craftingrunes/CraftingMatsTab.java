package com.seriouscreeper.craftingrunes;

import com.seriouscreeper.craftingrunes.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CraftingMatsTab extends CreativeTabs {

	public CraftingMatsTab() {
		super("tabCraftingRunes");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.commonMat;
	}

}
