package mod.Gearrion.EnderLegacymod.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import mod.Gearrion.EnderLegacymod.block.ModBlocks;
import mod.Gearrion.EnderLegacymod.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ModRecipe {

	public static void init() {
        //Smelting
   OreDictionary.registerOre("oreEnderSteel", ModBlocks.Endersteelore);
   GameRegistry.addSmelting(ModBlocks.Endersteelore, new ItemStack (ModItems.Endersteelignot), 100);
   
   //Shapped Recipe
   GameRegistry.addRecipe(
		   new ItemStack(ModBlocks.Endersteelblock),"ddd","ddd","ddd",'d',ModItems.Endersteelignot);
   
   //Shapeless Recipe
   GameRegistry.addShapelessRecipe(
		   new ItemStack(ModItems.Endersteelignot, 9),
		   new ItemStack(ModBlocks.Endersteelblock));	
		
	}

}
