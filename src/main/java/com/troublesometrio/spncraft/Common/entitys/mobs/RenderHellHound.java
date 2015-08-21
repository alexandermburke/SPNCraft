package com.troublesometrio.spncraft.Common.entitys.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.troublesometrio.spncraft.main.SupernaturalCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderHellHound extends RenderLiving
{
	private static final ResourceLocation textureLocation = new ResourceLocation(SupernaturalCraft.MODID + ":" + "textures/entity/HellHound.png");
    private static final String __OBFID = "CL_00001036";

    public RenderHellHound(ModelBase par1ModelBase, float par3)
    {
        super(par1ModelBase, par3);
        this.setRenderPassModel(mainModel);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityHellHound par1EntityHellHound, float par2)
    {
        return par1EntityHellHound.getTailRotation();
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityHellHound par1EntityHellHound, int par2, float par3)
    {
        if (par2 == 0 && par1EntityHellHound.getHellHoundShaking())
        {
            float f1 = par1EntityHellHound.getBrightness(par3) * par1EntityHellHound.getShadingWhileShaking(par3);
            this.bindTexture(textureLocation);
            GL11.glColor3f(f1, f1, f1);
            return 1;
        }
        else if (par2 == 1 && par1EntityHellHound.isTamed())
        {
            this.bindTexture(textureLocation);
            int j = par1EntityHellHound.getCollarColor();
            GL11.glColor3f(EntitySheep.fleeceColorTable[j][0], EntitySheep.fleeceColorTable[j][1], EntitySheep.fleeceColorTable[j][2]);
            return 1;
        }
        else
        {
            return -1;
        }
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityHellHound par1EntityHellHound)
    {
        return par1EntityHellHound.isTamed() ? textureLocation : (par1EntityHellHound.isAngry() ? textureLocation : textureLocation);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLivingBase par1EntityLivingBase, int par2, float par3)
    {
        return this.shouldRenderPass((EntityHellHound)par1EntityLivingBase, par2, par3);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityLivingBase par1EntityLivingBase, float par2)
    {
        return this.handleRotationFloat((EntityHellHound)par1EntityLivingBase, par2);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityHellHound)par1Entity);
    }
}