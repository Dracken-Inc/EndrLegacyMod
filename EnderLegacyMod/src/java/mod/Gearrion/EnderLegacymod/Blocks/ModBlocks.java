package mod.Gearrion.EnderLegacymod.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mod.Gearrion.EnderLegacymod.Blocks.Tree.EnderLog;
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
  public static Block EnderLog;
  public static Block End_Leaves;
  public static Block End_Effect_Leaves;
  public static Block Enderplanks;
  public static Block mythrilore;
  public static Block Jadeore;
  
  
  public static final void init() {
    //Blocks       (Name, Material ,  hardness,  resistant,  light level,  tool,  tool strength,  sound type )
		
	    GameRegistry.registerBlock(Endersteelore = new BlockModBlock("Endersteelore", Material.iron, 25.0F, 100.0F, 0.0F, "pickaxe", 3, Block.soundTypeStone),"Endersteelore");
		GameRegistry.registerBlock(Enderstonebricks = new BlockModBlock("Enderstonebricks", Material.rock, 20.0F, 200.0F, 0.0F, "pickaxe", 2, Block.soundTypeStone), "Enderstonebricks");
    //GameRegistry.registerBlock(Firegemore = new BlockModBlock(), "firegemore");
		GameRegistry.registerBlock(Endergemblock = new BlockModBlock("Endergemblock", Material.iron, 25.0F, 100.0F, 0.6F, "pickaxe", 3, Block.soundTypeMetal), "Endergemblock");
		GameRegistry.registerBlock(Endersteelblock = new BlockModBlock("Endersteelblock", Material.iron, 55.0F, 300.0F, 0.0F, "pickaxe", 4, Block.soundTypeMetal), "Endersteelblock"); 
		GameRegistry.registerBlock(TrueEndPortal = new TrueEndPortal("TrueEndPortal"), "TrueEndPortal"); 
		GameRegistry.registerBlock(EnderLog = new EnderLog("EnderLog", "EnderLog"), "EnderLog"); 
		GameRegistry.registerBlock(End_Leaves = new mod.Gearrion.EnderLegacymod.Blocks.Tree.BlockModEndLeaves("End Leaves","End_Leaves" ), "End_Leaves");
		//GameRegistry.registerBlock(End_Effect_Leaves = new mod.Gearrion.EnderLegacymod.Blocks.Tree.BlockModEffectLeaves("End Effect Leaves","End_Effect_Leaves" ), "End_Effect_Leaves");
		GameRegistry.registerBlock(lightFire = new teFIRE("lightFire"), "lightFire"); 
		GameRegistry.registerBlock(Enderplanks = new BlockModBlock("Enderplanks", Material.wood, 15.0F, 30.0F, 0.0F, "axe", 2, Block.soundTypeWood), "Enderplanks");
	    GameRegistry.registerBlock(mythrilore = new BlockModBlock("mythrilore", Material.iron, 15.0F, 50.0F, 0.0F, "pickaxe", 2, Block.soundTypeStone),"mythrilore");
	    GameRegistry.registerBlock(Jadeore = new BlockModBlock("Jadeore", Material.iron, 14.0F, 45.0F, 0.5F, "pickaxe", 2, Block.soundTypeStone),"Jadeore");

  
  
  
  
  
  }


}
