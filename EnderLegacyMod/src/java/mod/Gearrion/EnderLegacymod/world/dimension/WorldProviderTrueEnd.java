package mod.Gearrion.EnderLegacymod.world.dimension;

import mod.Gearrion.EnderLegacymod.world.biome.BiomeRegistry;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderTrueEnd extends WorldProvider{

	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeTrueEnd, 1.2F);
		this.dimensionId = dimensionRegistry.dimensionId;
	}
	
	public IChunkProvider createChunkGeneration(){
		return null;
	}
	
	@Override
	public String getDimensionName() {
		
		return "TrueEnd";
	}

}
