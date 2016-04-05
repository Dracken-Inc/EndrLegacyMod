package mod.Gearrion.EnderLegacymod.World.Biomes;

import mod.Gearrion.EnderLegacymod.Block.ModBlocks;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenTrueEnd extends BiomeGenBase{
	
	@SuppressWarnings("unchecked")
	public BiomeGenTrueEnd(int id){
		super(id);
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class, 5, 2, 10));
		
		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 2;
		this.theBiomeDecorator.bigMushroomsPerChunk = 2;
		
		
		this.topBlock = Blocks.end_stone;
		this.fillerBlock = ModBlocks.Enderstonebricks;
		
	}
	
}