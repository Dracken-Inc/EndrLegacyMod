package mod.Gearrion.EnderLegacymod.entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import mod.Gearrion.EnderLegacymod.Main;
import mod.Gearrion.EnderLegacymod.world.biome.BiomeRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;

public class EntityRegistryTE {

	public static void init() {
		createEntity(EntityVoidling.class, "Voidling", 0x001EFF, 0xEc4545);
	}

	public static void createEntity(Class<EntityVoidling> entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, Main.MODID, 64, 1, true);
	    EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.monster, BiomeRegistry.biomeTrueEndPlains);
		createEgg(randomId,solidColor,spotColor);
	}
		
	@SuppressWarnings("unchecked")
	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}
}

