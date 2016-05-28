package mod.Gearrion.EnderLegacymod.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

 

  public static Block Endersteelore;
  public static Block Enderstonebricks;
//public static Block Firegemore;
  public static Block Endergemblock;
  public static Block Endersteelblock;
  public static teFIRE lightFire;
  public static TrueEndPortal TrueEndPortal;
	 

  public static final void init() {
    //Blocks       (Name, Material ,  hardness,  resistant,  light level,  tool,  tool strength,  sound type )
		
	    GameRegistry.registerBlock(Endersteelore = new BlockModBlock("Endersteelore", Material.iron, 25.0F, 100.0F, 0.0F, "pickaxe", 3, Block.soundTypeMetal),"Endersteelore");
		GameRegistry.registerBlock(Enderstonebricks = new BlockModBlock("Enderstonebricks", Material.rock, 20.0F, 200.0F, 0.0F, "pickaxe", 2, Block.soundTypeStone), "Enderstonebricks");
    //GameRegistry.registerBlock(Firegemore = new BlockModBlock(), "firegemore");
		GameRegistry.registerBlock(Endergemblock = new BlockModBlock("Endergemblock", Material.iron, 25.0F, 100.0F, 0.6F, "pickaxe", 3, Block.soundTypeMetal), "Endergemblock");
		GameRegistry.registerBlock(Endersteelblock = new BlockModBlock("Endersteelblock", Material.iron, 55.0F, 300.0F, 0.0F, "pickaxe", 4, Block.soundTypeStone), "Endersteelblock"); 
		GameRegistry.registerBlock(TrueEndPortal = new TrueEndPortal("TrueEndPortal"), "TrueEndPortal"); 
		GameRegistry.registerBlock(Endlog = new teFIRE("lightFire"), "lightFire"); 
		GameRegistry.registerBlock(lightFire = new teFIRE("lightFire"), "lightFire"); 
		GameRegistry.registerBlock(lightFire = new teFIRE("lightFire"), "lightFire"); 

  }


}
