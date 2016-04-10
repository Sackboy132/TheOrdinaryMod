package com.Sackboy.TOM.init;

import com.Sackboy.TOM.TOM;
import com.Sackboy.TOM.mob.EntityCardboardBox;
import com.Sackboy.TOM.mob.EntityCrawler;
import com.Sackboy.TOM.mob.EntityJoiter;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class TOMMobs {

	// TODO: Finish up on mob AI and sizes
	
	public static void register() {
		createEntity(EntityCrawler.class, "Crawler", 0x175D5A, 0x9E1C1C);
		createEntity(EntityJoiter.class, "Joiter", 0x406533, 0xF38727);
		createEntity(EntityCardboardBox.class, "Cardboard Box", 0x406533, 0xF38727);
	}

	public static void createEntity(Class entity, String name, int solid, int spot) {
		int rand = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entity, name, rand);
		EntityRegistry.registerModEntity(entity, name, rand, TOM.INSTANCE, 64, 1, false, solid, spot);
		EntityRegistry.addSpawn(entity, 10, 1, 2, EnumCreatureType.MONSTER, BiomeGenBase.getBiome(4));
	}
}