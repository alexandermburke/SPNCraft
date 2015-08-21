package com.troublesometrio.spncraft.Common.registry;

import com.troublesometrio.spncraft.Common.items.Books;
import com.troublesometrio.spncraft.main.Reference;
import com.troublesometrio.spncraft.main.SupernaturalCraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class RegisterItem {
	public static void init(){
		register();
		registerRecipes();
		addSmelting();
	}
	
	public static Item book = new Books();
	
	
	public static void register()
	{
		
		
		
		/* Books */
		
		
		registerTheItem(book, "Bible");
		registerTheItem(book, "BookOfTheDamned");
		registerTheItem(book, "BookOfShadows");
		registerTheItem(book, "JohnsJournal");

		
		
		/* Example
		 * 
	
		Armor:
		
		registerArmor(Armor4A, "gem3_helmet");
		registerArmor(Armor4B, "gem3_jacket");
		registerArmor(Armor4C, "gem3_pants");
		registerArmor(Armor4D, "gem3_boots");
		
		Item:
		
		registerTheItem(ingot, "ingots");

		Block:
			
		registerBlock(ExampleOre, "ExampleOre");
	*
	*/
		
		
	
	}
	
	public static void registerRecipes()
	{
		
		// 	GameRegistry.addRecipe(new ItemStack(ModItems.a, 1), new Object[] {"CXC", "CXC", "CXC", 'X', ModItems.ingot});
		
	}
	
	private static void addSmelting()
	{
		
		//	GameRegistry.addSmelting(ModItems.BlockA, new ItemStack(ModItems.ingot, 1), 5.0F);

	}
	

	private static void registerArmor(Item item, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName(SupernaturalCraft.MODID + ":" + "textures/armor" + unlocalizedName);
		item.setCreativeTab(CreativeTabs.tabAllSearch);
		
		GameRegistry.registerItem(item, unlocalizedName);
	}
	
	private static void registerTheItem(Item item, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName(SupernaturalCraft.MODID + ":" + unlocalizedName);
		item.setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		
		GameRegistry.registerItem(item, unlocalizedName);
	}
	
	private static void registerBlock(Block block, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		block.setBlockName(unlocalizedName);
		block.setBlockTextureName(SupernaturalCraft.MODID + ":" + unlocalizedName);
		block.setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		
		GameRegistry.registerBlock(block, unlocalizedName);
	}

}
