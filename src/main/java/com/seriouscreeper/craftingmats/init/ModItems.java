package com.seriouscreeper.craftingmats.init;

import com.seriouscreeper.craftingmats.items.ItemCommonMat;
import com.seriouscreeper.craftingmats.items.ItemLegendaryMat;
import com.seriouscreeper.craftingmats.items.ItemMatBag;
import com.seriouscreeper.craftingmats.items.ItemRareMat;
import com.seriouscreeper.craftingmats.items.ItemUncommonMat;
import com.seriouscreeper.craftingrunes.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static Item commonMat;
	public static Item uncommonMat;
	public static Item rareMat;
	public static Item legendaryMat;
	public static Item matBag;
	
	public static void init() {
		commonMat = new ItemCommonMat();
		uncommonMat = new ItemUncommonMat();
		rareMat = new ItemRareMat();
		legendaryMat = new ItemLegendaryMat();
		matBag = new ItemMatBag();
	}
	
	public static void register() {
		GameRegistry.register(commonMat);
		GameRegistry.register(uncommonMat);
		GameRegistry.register(rareMat);
		GameRegistry.register(legendaryMat);
		GameRegistry.register(matBag);
	}
	
	public static void registerRenders() {
		registerRender(commonMat);
		registerRender(uncommonMat);
		registerRender(rareMat);
		registerRender(legendaryMat);
		registerRender(matBag);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
