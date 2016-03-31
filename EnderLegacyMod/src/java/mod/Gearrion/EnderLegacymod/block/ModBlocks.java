package mod.Gearrion.EnderLegacymod.block;

import cpw.mods.fml.common.registry.GameRegistry;
import mod.Gearrion.EnderLegacymod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ModBlocks {

    public static Block Endersteelore;
    public static Block Enderstonebricks;
    public static Block Firegemore;
    public static Block Endergemblock;
	 

public static final void init() {
       //Blocks
   GameRegistry.registerBlock(Endersteelore = new Endersteelore(), "Endersteelore");
   GameRegistry.registerBlock(Enderstonebricks = new Enderstonebrick(), "enderstonebricks");
   GameRegistry.registerBlock(Firegemore = new Firegemore(), "firegemore");
   GameRegistry.registerBlock(Endergemblock = new Endergemblock(), "endergemblock");
    
        //Smelting
   OreDictionary.registerOre("oreEnderSteel", ModBlocks.Endersteelore);
   GameRegistry.addSmelting(ModBlocks.Endersteelore, new ItemStack (ModItems.Endersteelignot), 100);
    }
}

