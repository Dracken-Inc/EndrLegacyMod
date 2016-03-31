package mod.Gearrion.EnderLegacymod.item;

import cpw.mods.fml.common.registry.GameRegistry;
import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.Item;


public final class ModItems {
    
	public static Item Endersteelignot;
		
	public static final void init() {
		
		//ITEMS
		Endersteelignot = new Item().setUnlocalizedName("Endersteelignot").setCreativeTab(Main.Tabtut).setTextureName(Main.MODID + ":" + "Endersteelignot");
        GameRegistry.registerItem(Endersteelignot, "Endersteelignot");
	}
}	
