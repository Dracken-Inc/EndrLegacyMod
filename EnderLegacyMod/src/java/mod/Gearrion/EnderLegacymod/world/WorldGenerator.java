package mod.Gearrion.EnderLegacymod.world;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import mod.Gearrion.EnderLegacymod.Blocks.ModBlocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;


public class WorldGenerator implements IWorldGenerator{
	
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		switch(world.provider.dimensionId){
		case -1: 	generateNether    (world, rand, chunkX * 16, chunkZ * 16);break;
		case 0:	    generateOverWorld  (world, rand, chunkX * 16, chunkZ * 16);break;
		case 1:	    generateTheEnd    (world, rand, chunkX * 16, chunkZ * 16);break;
		case 8:	    generateTrueEnd (world, rand, chunkX * 16, chunkZ * 16);break;
		}
	}
		
	private void generateTrueEnd(World world, Random rand, int chunkX, int chunkZ) {
		for (int i = 0; i < 100; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);
						
			(new WorldGenMinable(ModBlocks.Endersteelore, 3)).generate(world, rand, randPosX, randPosY, randPosZ);

			
		}
	}
	
	@SuppressWarnings("unused")
	private void generateTheEnd(World world, Random rand, int chunkX, int chunkZ) {
		for (int i = 0; i < 100; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);

			}
			
	
	}
	
	@SuppressWarnings("unused")
	private void generateNether(World world, Random rand, int chunkX, int chunkZ){
		for (int i = 0; i < 100; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);
				
		}
	}
   
	@SuppressWarnings("unused")
	private void generateOverWorld(World world, Random rand, int chunkX, int chunkZ) {
		for (int i = 0; i < 100; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);
	}
  }


}
