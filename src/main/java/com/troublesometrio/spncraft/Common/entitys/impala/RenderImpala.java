package com.troublesometrio.spncraft.Common.entitys.impala;

import com.troublesometrio.spncraft.main.SupernaturalCraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderImpala extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(SupernaturalCraft.MODID + ":" + "textures/entity/impala.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderImpala(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityImpalaMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityImpalaMob)entity);
	}

}
