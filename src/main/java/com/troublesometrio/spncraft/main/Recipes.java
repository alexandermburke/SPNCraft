package com.troublesometrio.spncraft.main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.troublesometrio.spncraft.Common.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{

    /**
     * Adds the recipes.
     * Called in the preInit
     */
	public static void addRecipes() 
	{
        /**
         * A basic recipe. This requires 2 values: Output, an itemstack output, and an Object Array, of what the
         * recipe is.
         * Pretend the array as an crafting grid, where spaces are empty places.
         * All other chars can be any item assigned.
         */
	
		
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.Amulet), new Object[]
		{
			"   ",
			"YXY",
			" Y ",
			'X', Items.lead, 'Y', Items.gold_nugget
		});
		
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.AngelBlade), new Object[]
				{
					"  X",
					" X ",
					"Y  ",
					'X', SupernaturalCraft.Silver, 'Y', Items.stick
				});
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.Engine), new Object[]
				{
					"XXX",
					"XYX",
					"XXX",
					'X', Items.iron_ingot, 'Y', Blocks.piston
				});
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.LTablet), new Object[]
				{
					"   ",
					" XY",
					"   ",
					'X', SupernaturalCraft.WordofGod, 'Y', SupernaturalCraft.LeviathanBlood
				});
		
		
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.ATablet), new Object[]
				{
					"   ",
					" XY",
					"   ",
					'X', SupernaturalCraft.WordofGod, 'Y', SupernaturalCraft.AngelBlood
				});
		
		//GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.BookOfShadows), new Object[]
				//{
					//"",
					//"",
					//"",
					//'P', Items.paper, 'W', SupernaturalCraft.WordofGod, 'L', Items.leather
				//});
		
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.BookOfSpells), new Object[]
				{
					"   ",
					"PB ",
					"GM ",
					'M', Items.magma_cream, 'G', Items.speckled_melon, 'P', Items.blaze_powder, 'B', Items.book 
				});
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.Colt), new Object[]
				{
					"S  ",
					" G ",
					"W G",
					
					'S', SupernaturalCraft.Silver, 'G', Items.gold_ingot, 'W', Blocks.log, 'P', Items.gunpowder 
				});
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.ColtAmmo), new Object[]
				{
					"SS ",
					"GG ",
					"GG ",
					'S', SupernaturalCraft.Silver, 'G', Items.gold_ingot,
				});
		
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.DeathsRing), new Object[]
				{
					"III",
					"INI",
					"III",
					'I', Items.iron_ingot, 'N', Items.quartz 
				});
		
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.DemonKnife), new Object[]
				{
					"  S",
					" S ",
					"I",
					'I', Items.stick, 'S', SupernaturalCraft.Salt
				});
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.DevilsTrap), new Object[]
				{
					"RSR",
					"SRS",
					"RSR",
					'S', Items.redstone, 'R', Blocks.stone
				});
		
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.DTablet), new Object[]
				{
					"   ",
					" SR",
					"   ",
					'S', SupernaturalCraft.WordofGod, 'R', SupernaturalCraft.DemonBlood
				});
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.EMFMeter), new Object[]
				{
					"   ",
					"RG ",
					"OOO",
					'O', Blocks.obsidian, 'G', Items.gold_ingot, 'R', Blocks.redstone_torch 
				});
		
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.PestilencesRing), new Object[]
				{
					"III",
					"IEI",
					"III",
					'I', Items.iron_ingot, 'E', Items.emerald 
				});
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.Goblet), new Object[]
				{
					"G G",
					" G ",
					" G ",
					'G', Items.gold_ingot
				});
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.HexBag), new Object[]
				{
					" L ",
					"WSW",
					"WWW",
					'L', Items.lead, 'W', Blocks.wool, 'S', SupernaturalCraft.Salt
				});
		
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.HornOfTruth), new Object[]
				{
					"  S",
					"LW ",
					"L  ",
					'L', Blocks.planks, 'W', SupernaturalCraft.Silver, 'S', Items.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.FaminesRing), new Object[]
				{
					"III",
					"IBI",
					"III",
					'I', Items.iron_ingot, 'B', Items.flint
				});
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.PurgatoryBlade), new Object[]
				{
					" O ",
					" O ",
					" B ",
					'B', Items.bone, 'O', Blocks.obsidian
				});
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.PurgatoryBlade), new Object[]
				{
					" O ",
					" O ",
					" B ",
					'B', Items.bone, 'O', Blocks.obsidian
				});
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.RoadSalt), new Object[]
				{
					"   ",
					" S ",
					"   ",
					'S', SupernaturalCraft.Salt
				});
		
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.WarsRing), new Object[]
				{
					"III",
					"INI",
					"III",
					'I', Items.gold_ingot,  'N', Items.gold_nugget
				});
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.WoodenStake), new Object[]
				{
					"  L",
					" S ",
					"S  ",
					'S', Items.stick, 'L', SupernaturalCraft.LambsBlood
				});
		
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.JohnsJournal), new Object[]
				{
					"   ",
					"ML ",
					"MM ",
					'M', Items.map, 'L', Items.leather
				});
		
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.SaltBlock), new Object[]
				{
					"III",
					"III",
					"III",
					'I', SupernaturalCraft.Salt
				});
		GameRegistry.addRecipe(new ItemStack(SupernaturalCraft.SilverBlock), new Object[]
				{
					"III",
					"III",
					"III",
					'I', SupernaturalCraft.Silver
				});
		 GameRegistry.addSmelting(SupernaturalCraft.SilverOre, new ItemStack(SupernaturalCraft.Silver), 0.1F);
		 GameRegistry.addSmelting(SupernaturalCraft.SaltOre, new ItemStack(SupernaturalCraft.Salt), 0.1F);

	}
}