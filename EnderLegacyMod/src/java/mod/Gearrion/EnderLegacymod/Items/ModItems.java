package mod.Gearrion.EnderLegacymod.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import mod.Gearrion.EnderLegacymod.Items.Armor.ItemModArmor;
import mod.Gearrion.EnderLegacymod.Items.Basic.EnderSparker;
import mod.Gearrion.EnderLegacymod.Items.Basic.ItemModBasic;
import mod.Gearrion.EnderLegacymod.Items.Tools.ItemModTool;
import mod.Gearrion.EnderLegacymod.Items.Wands.ItemProjectile;
import mod.Gearrion.EnderLegacymod.Items.Weapons.ItemModWeapon;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;


public final class ModItems {
	
  public static Item EnderBlade;
  public static Item Endersteelignot;
  public static Item Endersteelhelmet;
  public static Item Endersteelchestplate;
  public static Item Endersteelleggings;
  public static Item Endersteelboots;
  public static Item Endersteelpickaxe;
  public static Item Endersteelaxe;
  public static Item Endersteelsword;
  public static Item Huntressbow;
  public static Item spireofdarkness;
  public static Item Firewand;
  public static Item Enderwand;
  public static Item VoidCutter;
  public static Item EnderSparker;
  public static Item DivineBlade;
  public static Item Enderrelicsword;    
  public static Item endgeneralsword;      
  public static Item PaladosHammer;
  public static Item seeingeye;   
  public static Item Nathanielskatana; 
  public static Item enderinsignia;
  
  //MATS			Name("Name"	=(Harvestlvl,Durability,Minning Speed,Damage,enchantability)									
		public static ToolMaterial MatEnderSteelItem = EnumHelper.addToolMaterial("MatEnderSteelItem", 4, 2500, 14.0F, 6.0F, 30);
		public static ToolMaterial MatEnderBladeItem = EnumHelper.addToolMaterial("MatEnderBladeItem", 4, 3000, 18.0F, 8.0F, 40);
		public static ArmorMaterial MatEnderSteelArmor = EnumHelper.addArmorMaterial("MatEnderSteelArmor", 16, new int[] {3, 8, 6, 3}, 30);	
		public static ToolMaterial MatEnderwand = EnumHelper.addToolMaterial("MatEnderwand", 1, 50, 1.0F, 1.0F, 0);	
		public static ToolMaterial MatSpecialweapons = EnumHelper.addToolMaterial("MatSpecialweapons", 4, 2500, 16.0F, 7.0F, 35);		
 
		public static final void init() {
		
	    //ITEMS
		GameRegistry.registerItem(Firewand = new ItemModBasic("Firewand"),"Firewand");
		GameRegistry.registerItem(spireofdarkness = new ItemModBasic("spireofdarkness"),"spireofdarkness");
		GameRegistry.registerItem(Endersteelignot = new ItemModBasic("Endersteelignot"),"Endersteelignot");
	    GameRegistry.registerItem(EnderSparker = new EnderSparker(MatEnderwand, "EnderSparker"),"EnderSparker");
	    GameRegistry.registerItem(enderinsignia = new ItemModBasic("enderinsignia"),"enderinsignia");
	    GameRegistry.registerItem(Enderwand = new ItemProjectile("Enderwand"),"Enderwand");
	    
	    //Wands
		
		//Armor
        GameRegistry.registerItem(Endersteelhelmet = new ItemModArmor("Endersteelhelmet", MatEnderSteelArmor, "Endersteelhelmet", 0), "Endersteelhelmet"); //0 for helmet
    	GameRegistry.registerItem(Endersteelchestplate = new ItemModArmor("Endersteelchestplate", MatEnderSteelArmor, "Endersteelchestplate", 1), "EndersteelChestplate"); // 1 for chestplate
    	GameRegistry.registerItem(Endersteelleggings = new ItemModArmor("Endersteelleggings", MatEnderSteelArmor, "Endersteelleggings", 2), "EndersteelLeggings"); // 2 for leggings
    	GameRegistry.registerItem(Endersteelboots = new ItemModArmor("Endersteelboots", MatEnderSteelArmor, "Endersteelboots", 3), "EndersteelBoots"); // 3 for boots
	
    	
    	//Weapons                 ( "Class Name"                ( "Internal Name"    Material         "Texture")   "give item name")
    	GameRegistry.registerItem(EnderBlade = new ItemModWeapon("EnderBlade", MatEnderBladeItem, "EnderBlade25"),"EnderBlade");
    	GameRegistry.registerItem(Endersteelsword = new ItemModWeapon("Endersteelsword", MatEnderSteelItem, "Endersteelsword"),"Endersteelsword");
//      GameRegistry.registerItem(Huntressbow = new ItemModWeapon("Huntressbow", MatEnderSteel),"Huntressbow", "Huntressbow");
    	GameRegistry.registerItem(VoidCutter = new ItemModWeapon("VoidCutter", MatSpecialweapons, "Voidcutterfinal"),"VoidCutter");
    	GameRegistry.registerItem(DivineBlade = new ItemModWeapon("DivineBlade", MatSpecialweapons, "DivineBlade"),"DivineBlade");
    	GameRegistry.registerItem(Enderrelicsword = new ItemModWeapon("Enderrelicsword", MatSpecialweapons, "Enderrelicsword"),"Enderrelicsword");
    	GameRegistry.registerItem(endgeneralsword = new ItemModWeapon("endgeneralsword", MatSpecialweapons, "endgeneralsword"),"endgeneralsword");
    	GameRegistry.registerItem(PaladosHammer = new ItemModWeapon("Palados'Hammer", MatSpecialweapons, "Palados'Hammer"),"Palados'Hammer");
    	GameRegistry.registerItem(seeingeye = new ItemModWeapon("Seeingeye", MatSpecialweapons, "Seeingeye"),"Seeingeye");
    	GameRegistry.registerItem(Nathanielskatana = new ItemModWeapon("Nathanielskatana", MatSpecialweapons, "Nathanielskatana"),"Nathanielskatana");
    	
    	//Tools	
    	GameRegistry.registerItem(Endersteelpickaxe = new ItemModTool ("Endersteelpickaxe", MatEnderSteelItem), "endersteelpickaxe");
        GameRegistry.registerItem(Endersteelaxe = new ItemModTool("Endersteelaxe", MatEnderSteelItem), "Endersteelaxe");
   }
}
