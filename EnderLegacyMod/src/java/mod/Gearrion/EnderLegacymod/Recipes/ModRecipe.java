package mod.Gearrion.EnderLegacymod.Recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import mod.Gearrion.EnderLegacymod.Blocks.ModBlocks;
import mod.Gearrion.EnderLegacymod.Items.ModItems;
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
		GameRegistry.addRecipe(new ItemStack(ModItems.seeingeye, 1),"eee"," i "," o ",'e', ModItems.Endersteelignot,'o',Item.itemRegistry.getObject("stick"),'i',Item.itemRegistry.getObject("ender_eye")); 
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelsword, 1)," e "," e "," o ",'e', ModItems.Endersteelignot,'o', Item.itemRegistry.getObject("stick"));
		GameRegistry.addRecipe(new ItemStack(ModItems.Enderrelicsword, 1),"ge ","ge "," b ",'e', ModItems.Endersteelignot,'g', Item.itemRegistry.getObject("gold_ingot"),'b', Item.itemRegistry.getObject("blaze_rod")); 
		GameRegistry.addRecipe(new ItemStack(ModItems.DivineBlade, 1)," d "," n "," b ",'n', Item.itemRegistry.getObject("nether_star"),'d', Item.itemRegistry.getObject("diamond"),'b', Item.itemRegistry.getObject("blaze_rod")); 
		GameRegistry.addRecipe(new ItemStack(ModItems.frostdragonsword, 1),"ifi","ifi"," s ",'i', Item.itemRegistry.getObject("ice"),'f', Item.itemRegistry.getObject("iron_ingot"),'s', Item.itemRegistry.getObject("stick")); 
		GameRegistry.addRecipe(new ItemStack(ModItems.Bonesword, 1)," b "," b "," r ",'b', Item.itemRegistry.getObject("bone"),'r', Item.itemRegistry.getObject("blaze_rod")); 
		GameRegistry.addRecipe(new ItemStack(ModItems.xclaibur, 1),"geg","geg"," b ",'e', ModItems.Endersteelignot,'g', Item.itemRegistry.getObject("gold_ingot"),'b', Item.itemRegistry.getObject("blaze_rod")); 
		
		//Armor	
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelhelmet, 1),"eee","e e","   ",'e', ModItems.Endersteelignot);
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelchestplate, 1),"e e","eee","eee",'e', ModItems.Endersteelignot);
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelleggings, 1),"eee","e e","e e",'e', ModItems.Endersteelignot);
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelboots, 1),"   ","e e","e e",'e', ModItems.Endersteelignot);
		}
}