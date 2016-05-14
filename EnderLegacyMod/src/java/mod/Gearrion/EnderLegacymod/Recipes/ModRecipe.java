package mod.Gearrion.EnderLegacymod.Recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import mod.Gearrion.EnderLegacymod.Blocks.ModBlocks;
import mod.Gearrion.EnderLegacymod.Items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
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
		
	//Tools
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelpickaxe, 1),"eee"," o "," o ",'e', ModItems.Endersteelignot,'o', Item.itemRegistry.getObject("stick"));
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelaxe, 1),"ee ",	"eo "," o ",'e', ModItems.Endersteelignot,'o', Item.itemRegistry.getObject("stick"));
		
	//Weapons
		//GameRegistry.addRecipe(new ItemStack(ModItems.EnderBlade, 1),"eee",	" i "," o ",'e', ModItems.Endersteelignot,'o', Item.itemRegistry.getObject("stick"),'i', Items.ender_eye);
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelsword, 1)," e "," e "," o ",'e', ModItems.Endersteelignot,'o', Item.itemRegistry.getObject("stick"));
  
	//Armor	
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelhelmet, 1),"eee","e e","   ",'e', ModItems.Endersteelignot);
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelchestplate, 1),"e e","eee","eee",'e', ModItems.Endersteelignot);
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelleggings, 1),"eee","e e","e e",'e', ModItems.Endersteelignot);
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelboots, 1),"   ","e e","e e",'e', ModItems.Endersteelignot);
		}
}