package mod.Gearrion.EnderLegacymod.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import mod.Gearrion.EnderLegacymod.Blocks.ModBlocks;
import mod.Gearrion.EnderLegacymod.Items.ModItems;
import mod.Gearrion.EnderLegacymod.Recipes.ModRecipe;
import mod.Gearrion.EnderLegacymod.world.WorldGenRegistry;
import mod.Gearrion.EnderLegacymod.world.biome.BiomeRegistry;
import mod.Gearrion.EnderLegacymod.world.dimension.dimensionRegistry;


public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.init();
        ModBlocks.init();
       
        
        

     	}
	

	public void init(FMLInitializationEvent e) {
        ModRecipe.init();
        
        
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		//@SuppressWarnings("unused")
		//WorldTypeTrueEnd WorldTypeTrueEnd = new WorldTypeTrueEnd(3, "TrueEnd");
	}
}