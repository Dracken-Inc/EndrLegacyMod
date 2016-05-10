package mod.Gearrion.EnderLegacymod.world.chunk;



//import static net.minecraft.event.terraingen.PopulateChunkEvent.populate.EventTypes.*;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.*;


import java.util.List;
import java.util.Random;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ChunkProviderTrueEnd implements IChunkProvider {

	private Random rand;
	
	private World worldObj;
	private final boolean mapFeaturesEnabled;
	private double[] noiseAray;
	private double[] stoneNoise = new double[256];
	private MapGenBase caveGenrator = new MapGenCaves();
	private MapGenStronghold strongholdGenerator = new MapGenStronghold();
	private MapGenVillage villagesGenerator = new MapGenVillage();
	private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
	private MapGenScatteredFeature ScatteredFeature = new MapGenScatteredFeature();
	private MapGenRavine ravineGenerator = new MapGenRavine ();

	private BiomeGenBase[] biomesforGeneration;
	
	{
		caveGenrator = TerrainGen.getModdedMapGen(caveGenrator, CAVE);
		strongholdGenerator =(MapGenStronghold) TerrainGen.getModdedMapGen(strongholdGenerator,STRONGHOLD );
		villagesGenerator =(MapGenVillage) TerrainGen.getModdedMapGen(villagesGenerator, VILLAGE);
		mineshaftGenerator = (MapGenMineshaft)TerrainGen.getModdedMapGen(mineshaftGenerator, MINESHAFT );
		ScatteredFeature =(MapGenScatteredFeature) TerrainGen.getModdedMapGen(ScatteredFeature, SCATTERED_FEATURE);
		ravineGenerator =(MapGenRavine) TerrainGen.getModdedMapGen(ravineGenerator, RAVINE);
	}
	
	
	public  ChunkProviderTrueEnd(World worldObj, long seed, boolean features) {
		this.worldObj= worldObj;
		this.mapFeaturesEnabled = features;
		this.rand = new Random(seed);
		
	}

	@Override
	public boolean chunkExists(int p_73149_1_, int p_73149_2_) {
		
		return false;
	}

	@Override
	public Chunk provideChunk(int p_73154_1_, int p_73154_2_) {
		
		return null;
	}

	@Override
	public Chunk loadChunk(int p_73158_1_, int p_73158_2_) {
		
		return null;
	}

	@Override
	public void populate(IChunkProvider p_73153_1_, int p_73153_2_, int p_73153_3_) {
		
		
	}

	@Override
	public boolean saveChunks(boolean p_73151_1_, IProgressUpdate p_73151_2_) {
		
		return false;
	}

	@Override
	public boolean unloadQueuedChunks() {
		
		return false;
	}

	@Override
	public boolean canSave() {
		
		return false;
	}

	@Override
	public String makeString() {
		
		return null;
	}

	@Override
	public List getPossibleCreatures(EnumCreatureType p_73155_1_, int p_73155_2_, int p_73155_3_, int p_73155_4_) {
		
		return null;
	}

	@Override
	public ChunkPosition func_147416_a(World p_147416_1_, String p_147416_2_, int p_147416_3_, int p_147416_4_,
			int p_147416_5_) {
		
		return null;
	}

	@Override
	public int getLoadedChunkCount() {
		
		return 0;
	}

	@Override
	public void recreateStructures(int p_82695_1_, int p_82695_2_) {
		
		
	}

	@Override
	public void saveExtraData() {
		
		
	}
}