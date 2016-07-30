package com.seriouscreeper.craftingrunes.items;

import com.seriouscreeper.craftingrunes.CraftingMats;
import com.seriouscreeper.craftingrunes.Reference;

import net.minecraft.item.Item;

public class ItemUncommonMat extends Item {
	public ItemUncommonMat() {
		setUnlocalizedName(Reference.CraftingMatsItems.UNCOMMON_MAT.getUnlocalizedName());
		setRegistryName(Reference.CraftingMatsItems.UNCOMMON_MAT.getRegistryName());
		setCreativeTab(CraftingMats.CREATIVE_TAB);
	}
}
