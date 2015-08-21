package com.troublesometrio.spncraft.Client.proxy;


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelWolf;

import com.troublesometrio.spncraft.Client.models.impala.ModelImpala;
import com.troublesometrio.spncraft.Common.entitys.impala.EntityImpalaMob;
import com.troublesometrio.spncraft.Common.entitys.impala.RenderImpala;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityAngel;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityBobby;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityCastiel;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityCrowley;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityDean;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityDeanDemon;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityDemon;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityDjinn;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityHellHound;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityLeviathan;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntitySam;
import com.troublesometrio.spncraft.Common.entitys.mobs.EntityWIW;
import com.troublesometrio.spncraft.Common.entitys.mobs.RenderAngel;
import com.troublesometrio.spncraft.Common.entitys.mobs.RenderBobby;
import com.troublesometrio.spncraft.Common.entitys.mobs.RenderCastiel;
import com.troublesometrio.spncraft.Common.entitys.mobs.RenderCrowley;
import com.troublesometrio.spncraft.Common.entitys.mobs.RenderDean;
import com.troublesometrio.spncraft.Common.entitys.mobs.RenderDeanDemon;
import com.troublesometrio.spncraft.Common.entitys.mobs.RenderDemon;
import com.troublesometrio.spncraft.Common.entitys.mobs.RenderDjinn;
import com.troublesometrio.spncraft.Common.entitys.mobs.RenderHellHound;
import com.troublesometrio.spncraft.Common.entitys.mobs.RenderLeviathan;
import com.troublesometrio.spncraft.Common.entitys.mobs.RenderSam;
import com.troublesometrio.spncraft.Common.entitys.mobs.RenderWIW;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

@Override
public void registerRenderers() {
RenderingRegistry.registerEntityRenderingHandler(EntityAngel.class, new RenderAngel(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityDemon.class, new RenderDemon(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityBobby.class, new RenderBobby(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityCastiel.class, new RenderCastiel(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityCrowley.class, new RenderCrowley(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityDean.class, new RenderDean(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityDjinn.class, new RenderDjinn(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityLeviathan.class, new RenderLeviathan(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityHellHound.class, new RenderHellHound(new ModelWolf(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntitySam.class, new RenderSam(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityWIW.class, new RenderWIW());
RenderingRegistry.registerEntityRenderingHandler(EntityDeanDemon.class, new RenderDeanDemon(new ModelBiped(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityImpalaMob.class, new RenderImpala(new ModelImpala(), 0));
}
}