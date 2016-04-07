package mod.Gearrion.EnderLegacymod.World.Biomes;

import mod.Gearrion.EnderLegacymod.Blocks.ModBlocks;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenTrueEnd extends BiomeGenBase{
	
	@SuppressWarnings("unchecked")
	public BiomeGenTrueEnd(int id){
		super(id);
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityEnderman.class, 1, 10, 5));
		
		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.bigMushroomsPerChunk = 0;
		
		
		this.topBlock = Blocks.end_stone;
		this.fillerBlock = ModBlocks.Enderstonebricks;
		
	}
	
}