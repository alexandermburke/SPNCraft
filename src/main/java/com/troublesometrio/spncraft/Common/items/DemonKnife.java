package com.troublesometrio.spncraft.Common.items;

import com.troublesometrio.spncraft.Common.entitys.mobs.EntityCrowley;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityDeanDemon;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityDemon;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class DemonKnife extends ItemSword
{
	public DemonKnife(ToolMaterial material) 
	{
		super(material);
	}

	public static int damage1 = 100;
	public static int damage2 = 3;

	
	
	public int getDamageVsEntity(Entity par1Entity)
	{
					if (par1Entity instanceof EntityDemon || par1Entity instanceof EntityCrowley || par1Entity instanceof EntityDeanDemon)
					{
					 return damage1;
					}
					else
					{
					 return damage2;
					}
	}
}