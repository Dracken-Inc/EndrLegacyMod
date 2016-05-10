package mod.Gearrion.EnderLegacymod.world.biome;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;


public class BiomeGenTrueEnd extends BiomeGenBase{

		
		@SuppressWarnings("unchecked")
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
		@Override
		public void genTerrainBlocks(World world, Random random, Block[] blocks, byte[] metadataArray, int genX, int genZ, double stoneNoise) {
			genCustomTerrain(world, random, blocks, metadataArray, genX, genZ, stoneNoise);
		}
	
		public void genCustomTerrain(World world, Random random, Block[] blocks, byte[] metadataArray, int genX, int genZ, double fillerThicknessChance) {
			Block topBlock = this.topBlock;
			byte metadata = (byte) (this.field_150604_aj & 255);
			Block fillerBlock = this.fillerBlock;
			int fillerHeight = -1;
			int fillerThickness = (int) (fillerThicknessChance / 3.0D + 3.0D + random.nextDouble() * 0.25D);
			int x = genX & 15;
			int z = genZ & 15;
			int multiplier = blocks.length / 256;

			for (int y = 255; y >= 0; --y) {
				int index = (z * 16 + x) * multiplier + y;

				if (y <= random.nextInt(5)) {
					blocks[index] = Blocks.bedrock;
				} else {
					Block existingBlock = blocks[index];

					if (existingBlock != null && existingBlock.getMaterial() != Material.air) {
						if (existingBlock == Blocks.stone) {
							blocks[index] = Blocks.end_stone;

							if (fillerHeight == -1) {
								if (fillerThickness <= 0) {
									topBlock = null;
									metadata = 0;
									fillerBlock = Blocks.end_stone;
								} else if (y >= 59 && y <= 64) {
									topBlock = this.topBlock;
									metadata = (byte) (this.field_150604_aj & 255);
									fillerBlock = this.fillerBlock;
								}

								if (y < 63 && (topBlock == null || topBlock.getMaterial() == Material.air)) {
									if (this.getFloatTemperature(genX, y, genZ) < 0.15F) {
										topBlock = Blocks.ice;
										metadata = 0;
									} else {
										topBlock = Blocks.water;
										metadata = 0;
									}
								}

								fillerHeight = fillerThickness;

								if (y >= 62) {
									blocks[index] = topBlock;
									metadataArray[index] = metadata;
								} else if (y < 56 - fillerThickness) {
									topBlock = null;
									fillerBlock = Blocks.end_stone;
									blocks[index] = Blocks.gravel;
								} else {
									blocks[index] = fillerBlock;
								}
							} else if (fillerHeight > 0) {
								--fillerHeight;
								blocks[index] = fillerBlock;

								if (fillerHeight == 0 && fillerBlock == Blocks.sand) {
									fillerHeight = random.nextInt(4) + Math.max(0, y - 63);
									fillerBlock = Blocks.sandstone;
								}
							}
						}
					} else {
						fillerHeight = -1;
					}
				}
			}
		}
	}