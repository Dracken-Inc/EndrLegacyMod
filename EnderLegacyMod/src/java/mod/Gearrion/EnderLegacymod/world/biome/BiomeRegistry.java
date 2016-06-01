package mod.Gearrion.EnderLegacymod.world.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void init(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeTrueEnd;
	public static BiomeGenBase biomeTrueEndPlains;
	
	public static void initializeBiome(){
		
		biomeTrueEnd = new BiomeGenTrueEnd(137).setBiomeName("TrueEnd").setTemperatureRainfall(1.2F, 0.9F);
		biomeTrueEndPlains = new biomeTrueEndPlains(138).setBiomeName("TrueEndPlains").setTemperatureRainfall(1.2F, 0.9F);
	}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(biomeTrueEnd, Type.END);
		BiomeDictionary.registerBiomeType(biomeTrueEndPlains, Type.END);
		BiomeManager.addSpawnBiome(biomeTrueEnd);
		BiomeManager.addSpawnBiome(biomeTrueEndPlains);
		
		
	}

}
