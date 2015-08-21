package com.troublesometrio.spncraft.Client.sound;

import com.troublesometrio.spncraft.main.SupernaturalCraft;

import net.minecraft.entity.Entity;

public class SPNSoundHandler {
	
		public static void playSound(String name, Entity entity, float volume, float pitch)
		{
			entity.worldObj.playSoundAtEntity(entity, (SupernaturalCraft.MODID + name), (float)volume, (float) pitch);
		}
		
		public static void hoot(Entity entity, float volume, float pitch)
		{
			playSound("hoot", entity, volume, pitch);
		}
	}
	
