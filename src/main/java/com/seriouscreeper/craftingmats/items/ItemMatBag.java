package com.seriouscreeper.craftingmats.items;

import java.util.List;

import com.seriouscreeper.craftingmats.init.ModItems;
import com.seriouscreeper.craftingrunes.ConfigHandler;
import com.seriouscreeper.craftingrunes.CraftingMats;
import com.seriouscreeper.craftingrunes.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemMatBag extends Item {	
	public ItemMatBag() {
		setUnlocalizedName(Reference.CraftingMatsItems.MAT_BAG.getUnlocalizedName());
		setRegistryName(Reference.CraftingMatsItems.MAT_BAG.getRegistryName());
		setCreativeTab(CraftingMats.CREATIVE_TAB);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {

		ItemStack stack = null;
		
		int[] matChances = new int[] {ConfigHandler.CommonChance, ConfigHandler.UncommonChance, ConfigHandler.RareChance, ConfigHandler.LegendaryChance};
		int totalWeight = ConfigHandler.CommonChance + ConfigHandler.UncommonChance + ConfigHandler.RareChance + ConfigHandler.LegendaryChance;
		int chance = itemRand.nextInt(totalWeight);
		int index = 0;

		for(int i = 0; i < matChances.length; i++) {
			chance -= matChances[i];
			
			if(chance < 0) {
				index = i;
				break;
			}
		}
		
		System.out.println("Next Item Index: " + index);
			
		switch(index) {
		case 0:
			stack = new ItemStack(ModItems.commonMat, itemRand.nextInt(ConfigHandler.MaxCommonMats) + ConfigHandler.MinCommonMats);
			break;
			
		case 1:
			stack = new ItemStack(ModItems.uncommonMat, itemRand.nextInt(ConfigHandler.MaxUncommonMats) + ConfigHandler.MinUncommonMats);
			break;
			
		case 2:
			stack = new ItemStack(ModItems.rareMat, itemRand.nextInt(ConfigHandler.MaxRareMats) + ConfigHandler.MinRareMats);
			break;
			
		case 3:
			stack = new ItemStack(ModItems.legendaryMat, itemRand.nextInt(ConfigHandler.MaxLegendaryMats) + ConfigHandler.MinLegendaryMats);
			break;
		}
		
		if(stack != null) {
			if(!playerIn.inventory.addItemStackToInventory(stack)) {
				if (!worldIn.isRemote)
					worldIn.spawnEntityInWorld(new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, stack));
			}
			
			playerIn.inventory.decrStackSize(playerIn.inventory.currentItem, 1);
			worldIn.playSound(playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.NEUTRAL, 1.0f, itemRand.nextFloat() + 1.0f, false);
		}

		return new ActionResult<ItemStack>(EnumActionResult.PASS, itemStackIn);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		boolean shiftDown = GuiScreen.isShiftKeyDown();
		
		if(shiftDown) {
			String info = "";
			info += "Legendary - Weight: " + ConfigHandler.LegendaryChance + " | Amount: " + ConfigHandler.MinLegendaryMats + " - " + ConfigHandler.MaxLegendaryMats + "\n";
			info += "Rare - Weight: " + ConfigHandler.RareChance + " | Amount: " + ConfigHandler.MinRareMats + " - " + ConfigHandler.MaxRareMats + "\n";
			info += "Uncommon - Weight: " + ConfigHandler.UncommonChance + " | Amount: " + ConfigHandler.MinUncommonMats + " - " + ConfigHandler.MaxUncommonMats + "\n";
			info += "Common - Weight: " + ConfigHandler.CommonChance + " | Amount: " + ConfigHandler.MinCommonMats + " - " + ConfigHandler.MaxCommonMats;
			tooltip.add(info);
		} else {
			tooltip.add(TextFormatting.GRAY + "Hold Shift for more info.");
		}
		
		super.addInformation(stack, playerIn, tooltip, advanced);
	}
}
