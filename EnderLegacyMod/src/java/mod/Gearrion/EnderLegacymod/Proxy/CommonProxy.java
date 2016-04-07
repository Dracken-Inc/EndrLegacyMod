package mod.Gearrion.EnderLegacymod.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import mod.Gearrion.EnderLegacymod.Blocks.ModBlocks;
import mod.Gearrion.EnderLegacymod.Items.ModItems;
import mod.Gearrion.EnderLegacymod.Recipes.ModRecipe;


public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.init();
        ModBlocks.init();
	}
	
	public void init(FMLInitializationEvent e) {
        ModRecipe.init();
	}
	
	public void postInit(FMLPostInitializationEvent e) {

	}
}