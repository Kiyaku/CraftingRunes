package com.seriouscreeper.craftingrunes;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	public static Configuration config;
	
	public static int CommonChance;
	public static int UncommonChance;
	public static int RareChance;
	public static int LegendaryChance;
	
	public static int MinCommonMats;
	public static int MinUncommonMats;
	public static int MinRareMats;
	public static int MinLegendaryMats;
	
	public static int MaxCommonMats;
	public static int MaxUncommonMats;
	public static int MaxRareMats;
	public static int MaxLegendaryMats;
	
	public static void init(File file) {
		config = new Configuration(file);
		syncConfig();
	}
	
	public static void syncConfig() {
		String category;
		
		category = "Chances";
		config.addCustomCategoryComment(category, "Chance Settings - Higher numbers = higher chance to drop the item");
		CommonChance = config.getInt("commonWeight", category, 60, 0, 100, "");
		UncommonChance = config.getInt("uncommonWeight", category, 30, 0, 100, "");
		RareChance = config.getInt("rareWeight", category, 10, 0, 100, "");
		LegendaryChance = config.getInt("legendaryWeight", category, 1, 0, 100, "");
		
		category = "Amounts";
		config.addCustomCategoryComment(category, "How many runes each rarity drops");
		MaxCommonMats = config.getInt("maxCommonAmount", category, 4, 0, 100, "");
		MaxUncommonMats = config.getInt("maxUncommonAmount", category, 2, 0, 100, "");
		MaxRareMats = config.getInt("maxRareAmount", category, 1, 0, 100, "");
		MaxLegendaryMats = config.getInt("maxLegendaryAmount", category, 1, 0, 100, "");
		
		MinCommonMats = config.getInt("minCommonAmount", category, 2, 0, 100, "");
		MinUncommonMats = config.getInt("minUncommonAmount", category, 1, 0, 100, "");
		MinRareMats = config.getInt("minRareAmount", category, 1, 0, 100, "");
		MinLegendaryMats = config.getInt("minLegendaryAmount", category, 1, 0, 100, "");
		
		config.save();
	}
}
