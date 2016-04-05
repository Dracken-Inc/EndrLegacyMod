package mod.Gearrion.EnderLegacymod.World.Biomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenEnd;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void mainRegsitry(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase BiomeTrueEnd;
	
	public static void initializeBiome(){
		
		BiomeTrueEnd = new BiomeGenTrueEnd(137).setBiomeName("TrueEnd").setTemperatureRainfall(1.2F, 0.9F);
		
	}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(BiomeTrueEnd, Type.CONIFEROUSOREST);
		BiomeManager.addSpawnBiome(BiomeTrueEnd);
		
	}

}