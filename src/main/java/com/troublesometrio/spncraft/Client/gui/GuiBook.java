package com.troublesometrio.spncraft.Client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiBook extends GuiScreen {
	
	public static final String owner = "Charlie Bradbury";
	
	int guiwidth = 400;
	int guiheight = 500;
		
	public GuiBook() {
	
	
	
	}
	@Override
	public void initGui() {
		
		int guiX = (height - guiheight);
		int guiY = (width - guiwidth);
		GuiButton DevButton;
		
		


		fontRendererObj.drawString("The Book of the damned English Translation Edition by: " + owner, guiX + 40, guiY + 5, 0xFFFFFF );
		
		buttonList.add(DevButton = new GuiButton(0, guiX + 10, guiY + 30, 20, 10, "Spells"));
		
		
		
		super.initGui();
		
	
	
	}
}