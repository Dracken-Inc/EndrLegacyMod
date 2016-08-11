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
  public static Item frostdragonsword;
  public static Item xclaibur;
  public static Item tomerspear;
  public static Item Bonesword;
  public static Item Nightpike;
  public static Item Demonsword;
  public static Item Infernalblade;
  public static Item demonblood;
  public static Item Demoningot;
  public static Item Riftblade;
  public static Item Ironrod;
  public static Item swordofjudgement;
  public static Item Herosword;
  public static Item Herostone;
  public static Item Enderkingsymbol;
  public static Item bonehelmet;
  public static Item bonechestplate;
  public static Item boneleggings;
  public static Item boneboots;
  public static Item dragonjawblade;
  public static Item dragonsymbol;
  public static Item Poseidonswrath;
  public static Item Endergem;
  public static Item dfab;
  public static Item Sharpenedcutlass;
  public static Item Royalenderguardspear;
  public static Item Blazingkatana;
  public static Item Thundersythe;
  public static Item Divinearmylongsword;
  public static Item Enderforgershammer;
  public static Item EnderTrident;
  public static Item SkySlasher;
  public static Item Highendergeneralhelm;
  public static Item Highendergeneralchestplate;
  public static Item Enderkingchestplate;
  public static Item Endercrown;
  public static Item Enderkingcape; 
  public static Item Enderkingleggings;
  public static Item Divinehelm;
  public static Item Divinechestplate;
  public static Item Divineleggings;
  public static Item Divineboots;
  public static Item Royalguardhelm;
  public static Item Royalguardchestplate;
  public static Item Royalguardhood;
  public static Item Headroyalguardchestplate;
  public static Item Moltenendersteel;
  public static Item mithrilingot;
  public static Item jadeingot;
  public static Item dawnsbetrayal;
  public static Item swordoflostsouls;
  public static Item Jadeblade;
  public static Item mithrilsword;
  public static Item humansrelicsword;
  public static Item nightsembrace;
  
  //MATS			Name("Name"	=(Harvestlvl,Durability,Mining Speed,Damage,enchantability)									
		public static ToolMaterial MatEnderSteelItem = EnumHelper.addToolMaterial("MatEnderSteelItem", 6, 2500, 40.0F, 6.0F, 45); // axe thinks it's a pickaxe
		public static ToolMaterial MatEnderBladeItem = EnumHelper.addToolMaterial("MatEnderBladeItem", 6, 0, 40.0F, 21.0F, 50);
		public static ToolMaterial MatVoidcutterItem = EnumHelper.addToolMaterial("MatVoidcutterItem", 6, 0, 30.0F, 19.0F, 50);
		public static ToolMaterial MatEnderwand = EnumHelper.addToolMaterial("MatEnderwand", 1, 50, 1.0F, 1.0F, 0);	
		public static ToolMaterial MatSpecialweapons = EnumHelper.addToolMaterial("MatSpecialweapons", 4, 2500, 16.0F, 10.0F, 35);		
		public static ToolMaterial Matbasic = EnumHelper.addToolMaterial("Matbasic", 4, 1000, 14.0F, 4.0F, 25);
		public static ToolMaterial MatDivineblade = EnumHelper.addToolMaterial("MatDivineblade", 4, 3000, 14.0F, 17.0F, 35);
		public static ToolMaterial Matpalados = EnumHelper.addToolMaterial("Matpalados", 4, 0, 1.0F, 15.0F, 53);
		public static ToolMaterial MatDemonbasic = EnumHelper.addToolMaterial("MatDemonbasic", 4, 1000, 5.0F, 5.0F, 37);
		public static ToolMaterial MatDemonadvanced = EnumHelper.addToolMaterial("MatDemonadvanced", 4, 1000, 5.0F, 7.0F, 49);
		public static ToolMaterial Matrift = EnumHelper.addToolMaterial("Matrift", 4, 3000, 5.0F, 18.0F, 60);
		public static ToolMaterial Mathero = EnumHelper.addToolMaterial("Mathero", 4, 6000, 12.0F, 20.0F, 60);
		public static ToolMaterial MatSpecialweaponsadvanced = EnumHelper.addToolMaterial("MatSpecialweaponsadvanced", 4, 2500, 16.0F, 14.0F, 40);		
		public static ToolMaterial matdfab = EnumHelper.addToolMaterial("matdfab", 4, 2500, 16.0F, 2.0F, 40);		
		public static ToolMaterial Matendt = EnumHelper.addToolMaterial("Matendt", 4, 0, 1.0F, 16.0F, 53);
		public static ToolMaterial Thunder = EnumHelper.addToolMaterial("Thunder", 4, 100000, 1.0F, 17.0F, 60);
		public static ArmorMaterial MatBoneArmor = EnumHelper.addArmorMaterial("MatBoneArmor", 7, new int[] {2, 6, 4, 2}, 18);	
		public static ArmorMaterial MatEnderKingArmor = EnumHelper.addArmorMaterial("MatEnderKingArmor", 1000000, new int[] {7, 12, 6, 4}, 25);	
		public static ArmorMaterial MatHighEnderGeneralArmor = EnumHelper.addArmorMaterial("MatHighEnderGeneralArmor", 15000, new int[] {6, 11, 0, 0}, 58);	
		public static ArmorMaterial MatEnderSteelArmor = EnumHelper.addArmorMaterial("MatEnderSteelArmor", 10000, new int[] {4, 9, 4, 3}, 8);	
		public static ArmorMaterial MatDivineArmor = EnumHelper.addArmorMaterial("MatDivineArmor", 10000, new int[] {4, 10, 4, 3}, 5);	
		public static ArmorMaterial MatRoyalenderguardarmor = EnumHelper.addArmorMaterial("MatRoyalenderguardarmor", 15000, new int[] {5, 10, 0, 0}, 58);	

		
		
		public static final void init() {
		
	    //ITEMS
		GameRegistry.registerItem(Firewand = new ItemModBasic("Firewand"),"Firewand");
		GameRegistry.registerItem(spireofdarkness = new ItemModBasic("spireofdarkness"),"spireofdarkness");
		GameRegistry.registerItem(Endersteelignot = new ItemModBasic("Endersteelignot"),"Endersteelignot");
	    GameRegistry.registerItem(EnderSparker = new EnderSparker(MatEnderwand, "EnderSparker"),"EnderSparker");
	    GameRegistry.registerItem(enderinsignia = new ItemModBasic("enderinsignia"),"enderinsignia");
	    GameRegistry.registerItem(Enderwand = new ItemProjectile("Enderwand"),"Enderwand");
	    GameRegistry.registerItem(demonblood = new ItemModBasic("Demonblood"),"demonblood");
	    GameRegistry.registerItem(Ironrod = new ItemModBasic("reinforcedirongrip"),"Ironrod");
	    GameRegistry.registerItem(Herostone = new ItemModBasic("herostone"),"Herostone");
	    GameRegistry.registerItem(Enderkingsymbol = new ItemModBasic("Enderkingsymbol"),"Enderkingsymbol");
	    GameRegistry.registerItem(dragonsymbol = new ItemModBasic("dragonsymbol"),"dragonsymbol");
	    GameRegistry.registerItem(Endergem = new ItemModBasic("Endergem"),"Endergem");
		GameRegistry.registerItem(Demoningot = new ItemModBasic("Demoningot"),"Demoningot");
		GameRegistry.registerItem(Moltenendersteel = new ItemModBasic("Moltenendersteel"),"Moltenendersteel");
		GameRegistry.registerItem(mithrilingot = new ItemModBasic("mithrilingot"),"mithrilingot");
		GameRegistry.registerItem(jadeingot = new ItemModBasic("jadeingot"),"jadeingot");

	    
		
		
		//Wands
		
		//Armor
        GameRegistry.registerItem(Endersteelhelmet = new ItemModArmor("Endersteelhelmet", MatEnderSteelArmor, "Endersteelhelmet", 0), "Endersteelhelmet"); //0 for helmet
    	GameRegistry.registerItem(Endersteelchestplate = new ItemModArmor("Endersteelchestplate", MatEnderSteelArmor, "Endersteelchestplate", 1), "EndersteelChestplate"); // 1 for chestplate
    	GameRegistry.registerItem(Endersteelleggings = new ItemModArmor("Endersteelleggings", MatEnderSteelArmor, "Endersteelleggings", 2), "EndersteelLeggings"); // 2 for leggings
    	GameRegistry.registerItem(Endersteelboots = new ItemModArmor("Endersteelboots", MatEnderSteelArmor, "Endersteelboots", 3), "EndersteelBoots"); // 3 for boots
    	GameRegistry.registerItem(bonehelmet = new ItemModArmor("bonehelmet", MatBoneArmor, "bonehelmet", 0), "bonehelmet"); //0 for helmet
    	GameRegistry.registerItem(bonechestplate = new ItemModArmor("bonechestplate", MatBoneArmor, "bonechestplate", 1), "boneChestplate"); // 1 for chestplate
    	GameRegistry.registerItem(boneleggings = new ItemModArmor("boneleggings", MatBoneArmor, "boneleggings", 2), "boneLeggings"); // 2 for leggings
    	GameRegistry.registerItem(boneboots = new ItemModArmor("boneboots", MatBoneArmor, "boneboots", 3), "boneBoots"); // 3 for boots
    	GameRegistry.registerItem(Highendergeneralhelm = new ItemModArmor("Highendergeneralhelmet", MatHighEnderGeneralArmor, "Highendergeneralhelmet", 0), "Highendergeneralhelmet"); //0 for helmet
     	GameRegistry.registerItem(Highendergeneralchestplate = new ItemModArmor("Highendergeneralchestplate", MatHighEnderGeneralArmor, "Highendergeneralchestplate", 1), "Highendergeneralchestplate"); // 1 for chestplate
     	GameRegistry.registerItem(Enderkingchestplate = new ItemModArmor("Enderkingchestplate", MatEnderKingArmor, "Enderkingchestplate", 1), "Enderkingchestplate"); //1 for chestplate
     	GameRegistry.registerItem(Endercrown = new ItemModArmor("Endercrown", MatEnderKingArmor, "Endercrown", 0), "Endercrown"); //0 for helmet
     	GameRegistry.registerItem(Enderkingcape = new ItemModArmor("Enderkingcape", MatEnderKingArmor, "Enderkingcape", 3), "Enderkingcape"); // 3 for boots
    	GameRegistry.registerItem(Enderkingleggings = new ItemModArmor("Enderkingleggings", MatEnderKingArmor, "Enderkingleggings", 2), "Enderkingleggings"); // 2 for leggings
     	GameRegistry.registerItem(Divinehelm = new ItemModArmor("Divinehelm", MatDivineArmor, "Divinehelm", 0), "Divinehelm"); //0 for helmet
      	GameRegistry.registerItem(Divinechestplate = new ItemModArmor("Divinechestplate", MatDivineArmor, "Divinechestplate", 1), "Divinechestplate"); // 1 for chestplate
      	GameRegistry.registerItem(Divineleggings = new ItemModArmor("Divineleggings", MatDivineArmor, "Divineleggings", 2), "Divineleggings"); // 2 for leggings
      	GameRegistry.registerItem(Divineboots = new ItemModArmor("Divineboots", MatDivineArmor, "Divineboots", 3), "Divineboots"); // 3 for boots
    	GameRegistry.registerItem(Royalguardhelm = new ItemModArmor("Royalguardhelm", MatRoyalenderguardarmor, "Royalguardhelm", 0), "Royalguardhelm"); //0 for helmet
      	GameRegistry.registerItem(Royalguardchestplate = new ItemModArmor("Royalguardchestplate", MatRoyalenderguardarmor, "Royalguardchestplate", 1), "Royalguardchestplate"); // 1 for chestplate
    	GameRegistry.registerItem(Royalguardhood = new ItemModArmor("Royalguardhood", MatRoyalenderguardarmor, "Royalguardhood", 0), "Royalguardhood"); //0 for helmet
     	GameRegistry.registerItem(Headroyalguardchestplate = new ItemModArmor("Headroyalguardchestplate", MatHighEnderGeneralArmor, "Highendergeneralchestplate", 1), "Headroyalguardhood"); // 1 for chestplate

    	
    	//Weapons                 ( "Class Name"                ( "Internal Name"    Material         "Texture")   "give item name")
    	GameRegistry.registerItem(EnderBlade = new ItemModWeapon("EnderBlade", MatEnderBladeItem, "EnderbladeELITE"),"EnderBlade"); //Enderboy1025
    	GameRegistry.registerItem(Endersteelsword = new ItemModWeapon("Endersteelsword", MatEnderSteelItem, "Endersteelsword"),"Endersteelsword");
//      GameRegistry.registerItem(Huntressbow = new ItemModWeapon("Huntressbow", MatEnderSteel),"Huntressbow", "Huntressbow");
    	GameRegistry.registerItem(VoidCutter = new ItemModWeapon("VoidCutter", MatVoidcutterItem, "Voidcutterfinal"),"VoidCutter");
    	GameRegistry.registerItem(DivineBlade = new ItemModWeapon("DivineBlade", MatDivineblade, "DivineBlade"),"DivineBlade");
    	GameRegistry.registerItem(Enderrelicsword = new ItemModWeapon("Enderrelicsword", MatSpecialweapons, "Enderrelicsword"),"Enderrelicsword");
    	GameRegistry.registerItem(endgeneralsword = new ItemModWeapon("endgeneralsword", MatSpecialweapons, "endgeneralsword"),"endgeneralsword");
    	GameRegistry.registerItem(PaladosHammer = new ItemModWeapon("Palados'Hammer", Matpalados, "Palados'Hammer"),"Palados'Hammer");
    	GameRegistry.registerItem(seeingeye = new ItemModWeapon("Seeingeye", MatSpecialweapons, "Seeingeye"),"Seeingeye");
    	GameRegistry.registerItem(Nathanielskatana = new ItemModWeapon("Nathanielskatana", MatSpecialweaponsadvanced, "Nathanielskatana"),"Nathanielskatana");
    	GameRegistry.registerItem(frostdragonsword = new ItemModWeapon("frostdragonsword", MatSpecialweapons, "Frostdragon"),"frostdragonsword");
    	GameRegistry.registerItem(xclaibur = new ItemModWeapon("xclaibur", MatSpecialweaponsadvanced, "TrueXcalibur"),"xclaibur");
    	GameRegistry.registerItem(tomerspear = new ItemModWeapon("tomerspear", MatSpecialweaponsadvanced, "Tomer"),"tomerspear"); //make bigger
    	GameRegistry.registerItem(Bonesword = new ItemModWeapon("Bonesword", Matbasic, "Bonesword"),"Bonesword");
    	GameRegistry.registerItem(Nightpike= new ItemModWeapon("Nightpike", MatSpecialweaponsadvanced, "midnightpike"),"Nightpike"); //make bigger
    	GameRegistry.registerItem(Demonsword= new ItemModWeapon("Demonsword", MatDemonbasic, "demonsword"),"Demonsword");
    	GameRegistry.registerItem(Infernalblade= new ItemModWeapon("Infernalblade", MatDemonadvanced, "Infernalblade"),"Infernalblade");
    	GameRegistry.registerItem(Riftblade= new ItemModWeapon("Riftblade", Matrift, "Riftblade"),"Riftblade");
    	GameRegistry.registerItem(swordofjudgement= new ItemModWeapon("swordofjudgement", MatSpecialweaponsadvanced, "Swordofjudgement"),"swordofjudgement");
    	GameRegistry.registerItem(Herosword= new ItemModWeapon("Herosword", Mathero, "Trueherosword"),"Herosword");
    	GameRegistry.registerItem(dragonjawblade= new ItemModWeapon("dragonjawblade", MatSpecialweaponsadvanced, "dragonjawblade"),"dragonjawblade");
    	GameRegistry.registerItem(Poseidonswrath= new ItemModWeapon("Poseidonswrath", MatSpecialweapons, "Poseidonswrath"),"Poseidonswrath");
    	GameRegistry.registerItem(dfab= new ItemModWeapon("dfab", matdfab, "dfab"),"dfab");
    	GameRegistry.registerItem(EnderTrident= new ItemModWeapon("EnderTrident", Matendt, "EnderTrident"),"EnderTrident"); //make bigger
    	GameRegistry.registerItem(SkySlasher= new ItemModWeapon("SkySlasher", MatSpecialweaponsadvanced, "SkySlasher"),"SkySlasher");
    	GameRegistry.registerItem(Sharpenedcutlass= new ItemModWeapon("Sharpenedcutlass", Matbasic, "Sharpenedcutlass"),"Sharpenedcutlass");
    	GameRegistry.registerItem(Royalenderguardspear= new ItemModWeapon("Royalenderguardspear", MatSpecialweaponsadvanced, "Royalenderguardspear"),"Royalenderguardspear"); //make bigger
    	GameRegistry.registerItem(Blazingkatana= new ItemModWeapon("Blazingkatana", MatSpecialweapons, "Blazing katana"),"Blazingkatana");
    	GameRegistry.registerItem(Thundersythe= new ItemModWeapon("Thundersythe", Thunder, "Thundersythe"),"Thundersythe"); //make bigger
    	GameRegistry.registerItem(Enderforgershammer= new ItemModWeapon("Enderforgershammer", MatSpecialweapons, "Enderforgershammer"),"Enderforgershammer"); //maybe a forge mechanic for players to smelt the ore then pound it into an ingot
    	GameRegistry.registerItem(Divinearmylongsword= new ItemModWeapon("Divinearmylongsword", MatSpecialweapons, "Divinearmylongsword"),"Divinearmylongsword");
    	GameRegistry.registerItem(swordoflostsouls= new ItemModWeapon("swordoflostsouls", MatSpecialweapons, "swordoflostsouls"),"swordoflostsouls");
    	GameRegistry.registerItem(dawnsbetrayal= new ItemModWeapon("dawnsbetrayal", MatSpecialweaponsadvanced, "dawnsbetrayal"),"dawnsbetrayal");
    	GameRegistry.registerItem(Jadeblade= new ItemModWeapon("Jadeblade", MatSpecialweapons, "Jadeblade"),"Jadeblade");
    	GameRegistry.registerItem(mithrilsword= new ItemModWeapon("mithrilsword", MatSpecialweaponsadvanced, "mithrilsword"),"mithrilsword");
    	GameRegistry.registerItem(nightsembrace= new ItemModWeapon("nightsembrace", MatSpecialweaponsadvanced, "nightsembrace"),"nightsembrace");
    	GameRegistry.registerItem(humansrelicsword = new ItemModWeapon("humansrelicsword", MatSpecialweapons, "humansrelicsword"),"humansrelicsword");

    	
    	
    	
    	
    	
    	//Tools	
    	GameRegistry.registerItem(Endersteelpickaxe = new ItemModTool ("Endersteelpickaxe", MatEnderSteelItem), "endersteelpickaxe");
        GameRegistry.registerItem(Endersteelaxe = new ItemModTool("Endersteelaxe", MatEnderSteelItem), "Endersteelaxe");
   }
}
