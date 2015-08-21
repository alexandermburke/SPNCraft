package com.troublesometrio.spncraft.Common.items;

import com.troublesometrio.spncraft.Common.entitys.mobs.EntityAngel;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityCastiel;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityCrowley;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityDeanDemon;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityDemon;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class AngelBlade extends ItemSword
{
	public AngelBlade(ToolMaterial material) 
	{
		super(material);
	
	}
	
	public static int damage1 = 100;
	public static int damage2 = 3;

	
	
	public int getDamageVsEntity(Entity par1Entity)
	{
					if (par1Entity instanceof EntityAngel || par1Entity instanceof EntityCastiel || par1Entity instanceof EntityDemon)
					{
					 return damage1;
					}
					else
					{
					 return damage2;
					}
	}
}