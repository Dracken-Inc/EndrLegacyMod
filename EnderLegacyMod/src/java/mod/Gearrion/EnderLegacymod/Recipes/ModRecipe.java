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
		GameRegistry.addRecipe(
				   new ItemStack(ModBlocks.Endergemblock),"ddd","ddd","ddd",'d',ModItems.Endergem);
				
		   
    //Shapeless Recipe
		GameRegistry.addShapelessRecipe(
		   new ItemStack(ModItems.Endersteelignot, 9),
		   new ItemStack(ModBlocks.Endersteelblock));	
		GameRegistry.addShapelessRecipe(
				   new ItemStack(ModItems.Endergem, 9),
				   new ItemStack(ModBlocks.Endergemblock));	
				
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
		GameRegistry.addRecipe(new ItemStack(ModItems.enderinsignia, 1),"bbb","bib","bbb",'b',Item.itemRegistry.getObject("wool"),'i',Item.itemRegistry.getObject("ender_eye")); 
		GameRegistry.addRecipe(new ItemStack(ModItems.endgeneralsword, 1),"eee"," d "," o ",'e', ModItems.Endersteelignot,'o',Item.itemRegistry.getObject("blaze_rod"),'d',Item.itemRegistry.getObject("diamond")); 
		GameRegistry.addRecipe(new ItemStack(ModItems.EnderSparker, 1),"e  "," p ","   ",'e', ModItems.Endersteelignot,'p',Item.itemRegistry.getObject("ender_pearl"));
		GameRegistry.addRecipe(new ItemStack(ModItems.EnderSparker, 1),"  e"," p ","   ",'e', ModItems.Endersteelignot,'p',Item.itemRegistry.getObject("ender_pearl"));
		GameRegistry.addRecipe(new ItemStack(ModItems.demonblood, 1)," b "," g "," w ",'b', Item.itemRegistry.getObject("blaze_powder"),'g',Item.itemRegistry.getObject("gunpowder"),'w',Item.itemRegistry.getObject("potion"));
		GameRegistry.addRecipe(new ItemStack(ModItems.infernalingot, 1)," d "," g "," i ",'d',ModItems.demonblood,'g',Item.itemRegistry.getObject("gunpowder"),'i',Item.itemRegistry.getObject("iron_ingot"));
		GameRegistry.addRecipe(new ItemStack(ModItems.Demonsword, 1)," i "," i "," s ",'i',ModItems.infernalingot,'s',Item.itemRegistry.getObject("stick"));
		GameRegistry.addRecipe(new ItemStack(ModItems.Infernalblade, 1),"iii","idi","iii",'d',ModItems.Demonsword,'i',ModItems.infernalingot);
		GameRegistry.addRecipe(new ItemStack(ModItems.Riftblade, 1),"ocg","ocg","i",'o', Item.itemRegistry.getObject("obsidian"),'c', Item.itemRegistry.getObject("cobblestone"),'i',ModItems.Ironrod,'g',Item.itemRegistry.getObject("glowstone"));
		GameRegistry.addRecipe(new ItemStack(ModItems.Ironrod, 1)," i "," i "," i ",'i', Item.itemRegistry.getObject("iron_ingot"));
		GameRegistry.addRecipe(new ItemStack(ModItems.swordofjudgement, 1),"obo","obo","i",'o', Item.itemRegistry.getObject("obsidian"),'b', Item.itemRegistry.getObject("blaze_powder"),'i',ModItems.Ironrod);		
		GameRegistry.addRecipe(new ItemStack(ModItems.Herostone, 1),"dgd","gng","dgd",'d', Item.itemRegistry.getObject("diamond"),'g', Item.itemRegistry.getObject("gold_ingot"),'n',Item.itemRegistry.getObject("nether_star"));		
		GameRegistry.addRecipe(new ItemStack(ModItems.Herosword, 1),"jri"," n "," h ",'j', ModItems.swordofjudgement,'i', ModItems.Infernalblade,'r',ModItems.Riftblade,'n',ModItems.Herostone,'h',ModItems.Ironrod);		
		GameRegistry.addRecipe(new ItemStack(ModItems.dragonjawblade, 1),"oeo","oeo"," s ",'e', ModItems.Endersteelignot,'s', Item.itemRegistry.getObject("stick"),'o', Item.itemRegistry.getObject("obsidian"));		
		GameRegistry.addRecipe(new ItemStack(ModItems.Poseidonswrath, 1)," i "," l "," s ",'s', ModItems.Ironrod,'i', Item.itemRegistry.getObject("ice"),'l', Item.itemRegistry.getObject("gold_ingot"));		

		
		//Armor	
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelhelmet, 1),"eee","e e","   ",'e', ModItems.Endersteelignot);
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelchestplate, 1),"e e","eee","eee",'e', ModItems.Endersteelignot);
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelleggings, 1),"eee","e e","e e",'e', ModItems.Endersteelignot);
		GameRegistry.addRecipe(new ItemStack(ModItems.Endersteelboots, 1),"   ","e e","e e",'e', ModItems.Endersteelignot);
		GameRegistry.addRecipe(new ItemStack(ModItems.bonehelmet, 1),"eee","e e","   ",'e', Item.itemRegistry.getObject("bone"));
		GameRegistry.addRecipe(new ItemStack(ModItems.bonechestplate, 1),"e e","eee","eee",'e', Item.itemRegistry.getObject("bone"));
		GameRegistry.addRecipe(new ItemStack(ModItems.boneleggings, 1),"eee","e e","e e",'e',  Item.itemRegistry.getObject("bone"));
		GameRegistry.addRecipe(new ItemStack(ModItems.boneboots, 1),"   ","e e","e e",'e',  Item.itemRegistry.getObject("bone"));

	}
}