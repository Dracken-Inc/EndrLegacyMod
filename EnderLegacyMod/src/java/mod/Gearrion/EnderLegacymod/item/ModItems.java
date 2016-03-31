package mod.Gearrion.EnderLegacymod.item;

import cpw.mods.fml.common.registry.GameRegistry;
import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;


public final class ModItems {
    
	
	public static Item EnderBlade;
	public static Item Endersteelpickaxe;
	public static Item Endersteelignot;
	
	
	public static ToolMaterial MatEnderSteel = EnumHelper.addToolMaterial("MatEnderSteel", 4, 2500, 14.0F, 6.0F, 30);
	
	public static final void init() {
		//Weapons
		GameRegistry.registerItem(EnderBlade = new EnderBlade("EnderBlade", MatEnderSteel), "EnderBlade");
		GameRegistry.registerItem(Endersteelpickaxe = new Endersteelpickaxe("Endersteelpickaxe", MatEnderSteel), "endersteel pickaxe");
	
		//ITEMS
		Endersteelignot = new Item().setUnlocalizedName("Endersteelignot").setCreativeTab(Main.Tabtut).setTextureName(Main.MODID + ":" + "Endersteelignot");
        GameRegistry.registerItem(Endersteelignot, "Endersteelignot");
        
        //Armor
	}
}	
