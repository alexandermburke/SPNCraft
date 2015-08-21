package com.troublesometrio.spncraft.Common.entitys.mobs;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.troublesometrio.spncraft.main.SupernaturalCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLeviathan extends RenderBiped
{
	private static final ResourceLocation textureLocation = new ResourceLocation(SupernaturalCraft.MODID + ":" + "textures/entity/Leviathan.png");    /** Iron Golem's Model. */
    private static final ResourceLocation witherLeviathanTextures = new ResourceLocation("textures/entity/Leviathan/Leviathan.png");
    private static final String __OBFID = "CL_00001023";

    public RenderLeviathan(ModelBiped modelBiped, float f)
    {
        super(new ModelBiped(), 0.5F);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLeviathan par1EntityLeviathan, float par2)
    {
        if (par1EntityLeviathan.getLeviathanType() == 1)
        {
            GL11.glScalef(1.2F, 1.2F, 1.2F);
        }
    }

    protected void func_82422_c()
    {
        GL11.glTranslatef(0.09375F, 0.1875F, 0.0F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityLeviathan par1EntityLeviathan)
    {
        return par1EntityLeviathan.getLeviathanType() == 1 ? witherLeviathanTextures : textureLocation;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityLiving par1EntityLiving)
    {
        return this.getEntityTexture((EntityLeviathan)par1EntityLiving);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.preRenderCallback((EntityLeviathan)par1EntityLivingBase, par2);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityLeviathan)par1Entity);
    }
}