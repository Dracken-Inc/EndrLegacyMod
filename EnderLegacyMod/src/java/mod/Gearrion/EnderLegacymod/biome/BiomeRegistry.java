package mod.Gearrion.EnderLegacymod.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void main(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeTrueEnd;
	
	public static void initializeBiome(){
		
		biomeTrueEnd = new BiomeGenTrueEnd(137).setBiomeName("TrueEnd").setTemperatureRainfall(1.2F, 0.9F);
		
	}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(biomeTrueEnd, Type.END);
		BiomeManager.addSpawnBiome(biomeTrueEnd);
		
	}

}
