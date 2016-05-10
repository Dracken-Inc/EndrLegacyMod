package mod.Gearrion.EnderLegacymod.world.biome;

import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenTrueEnd extends BiomeGenBase{

		
		public BiomeGenTrueEnd(int id){
		super(id);
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityEnderman.class, 5, 2, 10));
		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.bigMushroomsPerChunk = 0;
		this.topBlock = Blocks.end_stone;
		this.fillerBlock = Blocks.end_stone;
		this.waterColorMultiplier = 0x990000;
	}
	
}
