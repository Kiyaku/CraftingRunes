package com.seriouscreeper.craftingrunes.items;

import com.seriouscreeper.craftingrunes.CraftingMats;
import com.seriouscreeper.craftingrunes.Reference;

import net.minecraft.item.Item;

public class ItemRareMat extends Item {
	public ItemRareMat() {
		setUnlocalizedName(Reference.CraftingMatsItems.RARE_MAT.getUnlocalizedName());
		setRegistryName(Reference.CraftingMatsItems.RARE_MAT.getRegistryName());
		setCreativeTab(CraftingMats.CREATIVE_TAB);
	}
}
