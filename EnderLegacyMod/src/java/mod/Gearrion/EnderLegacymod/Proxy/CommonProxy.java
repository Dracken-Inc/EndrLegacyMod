package mod.Gearrion.EnderLegacymod.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import mod.Gearrion.EnderLegacymod.Blocks.ModBlocks;
import mod.Gearrion.EnderLegacymod.Items.ModItems;
import mod.Gearrion.EnderLegacymod.Recipes.ModRecipe;
import mod.Gearrion.EnderLegacymod.Util.OreRegistry_TE;
import mod.Gearrion.EnderLegacymod.world.WorldGenRegistry;
import mod.Gearrion.EnderLegacymod.world.biome.BiomeRegistry;
import mod.Gearrion.EnderLegacymod.world.dimension.dimensionRegistry;
import net.minecraft.init.Blocks;


public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.init();
        ModBlocks.init();
                   	}
	

	public void init(FMLInitializationEvent e) {
   	 BiomeRegistry.init();
   	 dimensionRegistry.init();
   	         
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		OreRegistry_TE.init();
		ModRecipe.init();
        Blocks.fire.setFireInfo(ModBlocks.EnderLog,10, 10);
        Blocks.fire.setFireInfo(ModBlocks.End_Leaves,30, 60);
        WorldGenRegistry.init();
       	}
}