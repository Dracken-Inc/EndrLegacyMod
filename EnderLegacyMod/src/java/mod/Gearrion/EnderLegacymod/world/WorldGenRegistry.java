package mod.Gearrion.EnderLegacymod.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenRegistry {
	
	public static void main(){
		initWorldGen();
	}
	
	public static void initWorldGen(){
		registerWorldGen(new WorldGenerator(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbabaility){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbabaility);
	}

}
