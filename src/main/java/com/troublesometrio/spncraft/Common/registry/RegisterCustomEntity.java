package com.troublesometrio.spncraft.Common.registry;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.troublesometrio.spncraft.Common.entitys.impala.EntityImpalaMob;
import com.troublesometrio.spncraft.main.SupernaturalCraft;

import cpw.mods.fml.common.registry.EntityRegistry;

public class RegisterCustomEntity {

	public static void Entitys(){
		registerEntity();
	}
public static void registerEntity(){
		
		createEntity(EntityImpalaMob.class, "Impala", 0x000000, 0x808080);
	//	EntityRegistry.addSpawn(EntityImpalaMob.class, 20, 20, 20, EnumCreatureType.ambient, BiomeGenBase.extremeHills);
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, SupernaturalCraft.Modinstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.desert);
		
		createEgg(randomId, solidColor, spotColor);
		
	}
	
	@SuppressWarnings("unchecked")
	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}

	
	
	
	
	
	
	
	
}
