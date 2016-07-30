package com.seriouscreeper.craftingrunes;

public class Reference {
	public static final String MOD_ID = "sccraftingrunes";
	public static final String NAME = "SeriousCreeper's Crafting Runes";
	public static final String VERSION = "1.1";
	public static final String ACCEPTED_VERSIONS = "[1.9.4,1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.seriouscreeper.craftingrunes.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.seriouscreeper.craftingrunes.proxy.ServerProxy";
	
	public static enum CraftingMatsItems {
		COMMON_MAT("common_mat", "ItemCommonMat"),
		UNCOMMON_MAT("uncommon_mat", "ItemUncommonMat"),
		RARE_MAT("rare_mat", "ItemRareMat"),
		LEGENDARY_MAT("legendary_mat", "ItemLegendaryMat"),
		MAT_BAG("mat_bag", "ItemMatBag");
		
		private String unlocalizedName;
		private String registryName;
		
		CraftingMatsItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}
