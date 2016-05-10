package mod.Gearrion.EnderLegacymod.world.dimension;

import mod.Gearrion.EnderLegacymod.world.biome.BiomeRegistry;
import mod.Gearrion.EnderLegacymod.world.chunk.ChunkProviderTrueEnd;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderTrueEnd extends WorldProvider{

	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeTrueEnd, 1.2F);
		this.dimensionId = dimensionRegistry.dimensionId;
	}
	
	
	public IChunkProvider createChunkGeneration(){
		return new ChunkProviderTrueEnd(this.worldObj, this.worldObj.getSeed(), true);
	}
	
	@Override
	public String getDimensionName() {
		
		return "TrueEnd";
	}	}

	