package com.seriouscreeper.craftingmats.items;

import com.seriouscreeper.craftingrunes.CraftingMats;
import com.seriouscreeper.craftingrunes.Reference;

import net.minecraft.item.Item;

public class ItemCommonMat extends Item {
	public ItemCommonMat() {
		setUnlocalizedName(Reference.CraftingMatsItems.COMMON_MAT.getUnlocalizedName());
		setRegistryName(Reference.CraftingMatsItems.COMMON_MAT.getRegistryName());
		setCreativeTab(CraftingMats.CREATIVE_TAB);
	}
}
