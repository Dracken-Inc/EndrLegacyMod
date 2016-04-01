package mod.Gearrion.EnderLegacymod.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

  public static Block Endersteelore;
  public static Block Enderstonebricks;
//public static Block Firegemore;
  public static Block Endergemblock;
  public static Block Endersteelblock;
	 

  public static final void init() {
    //Blocks
		GameRegistry.registerBlock(Endersteelore = new BlockModBlock("Endersteelore", Material.iron, 25.0F, 100.0F, 0.0F, "pickaxe", 3, Block.soundTypeMetal),"Endersteelore");
		GameRegistry.registerBlock(Enderstonebricks = new BlockModBlock("Enderstonebricks", Material.rock, 20.0F, 200.0F, 0.0F, "pickaxe", 2, Block.soundTypeStone), "Enderstonebricks");
    //GameRegistry.registerBlock(Firegemore = new BlockModBlock(), "firegemore");
		GameRegistry.registerBlock(Endergemblock = new BlockModBlock("Endergemblock", Material.iron, 25.0F, 100.0F, 0.6F, "pickaxe", 3, Block.soundTypeMetal), "Endergemblock");
		GameRegistry.registerBlock(Endersteelblock = new BlockModBlock("Endersteelblock", Material.iron, 55.0F, 300.0F, 0.0F, "pickaxe", 4, Block.soundTypeStone), "Endersteelblock"); 
  }
}