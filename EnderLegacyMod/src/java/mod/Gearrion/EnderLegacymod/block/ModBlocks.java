package mod.Gearrion.EnderLegacymod.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public final class ModBlocks {

    public static Block Endersteelore;
    public static Block Enderstonebricks;
    ///public static Block Firegemore;
    public static Block Endergemblock;
    public static Block Endersteelblock;
	 

public static final void init() {
       //Blocks
   GameRegistry.registerBlock(Endersteelore = new Endersteelore(), "Endersteelore");
   GameRegistry.registerBlock(Enderstonebricks = new Enderstonebrick(), "enderstonebricks");
   //GameRegistry.registerBlock(Firegemore = new Firegemore(), "firegemore");
   GameRegistry.registerBlock(Endergemblock = new Endergemblock(), "endergemblock");
   GameRegistry.registerBlock(Endersteelblock = new Endersteelblock(), "Endersteelblock"); 
  }
}

