package com.troublesometrio.spncraft.Common.items;

import com.troublesometrio.spncraft.main.SupernaturalCraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SaltItem extends Item{
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz) {
	//	world.setBlock(x, y, z, SupernaturalCraft.SaltLine);
		
		return true;
	}
public SaltItem() {
	
}

}
