package com.seriouscreeper.craftingrunes.items;

import com.seriouscreeper.craftingrunes.CraftingMats;
import com.seriouscreeper.craftingrunes.Reference;

import net.minecraft.item.Item;

public class ItemLegendaryMat extends Item {
	public ItemLegendaryMat() {
		setUnlocalizedName(Reference.CraftingMatsItems.LEGENDARY_MAT.getUnlocalizedName());
		setRegistryName(Reference.CraftingMatsItems.LEGENDARY_MAT.getRegistryName());
		setCreativeTab(CraftingMats.CREATIVE_TAB);
	}
}
