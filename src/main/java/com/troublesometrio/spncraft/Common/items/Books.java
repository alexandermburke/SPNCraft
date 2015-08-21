package com.troublesometrio.spncraft.Common.items;

import com.troublesometrio.spncraft.Client.gui.GuiBook;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class Books extends Item {
	
	public Books() {
		this.setMaxDamage(2);
	}
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
	//	Minecraft.getMinecraft().displayGuiScreen(new GuiBook());
		
		player.addChatMessage(new ChatComponentText("§5This book is unreadable, for now"));
		
		
		return super.onItemRightClick(item, world, player);
	}

}
