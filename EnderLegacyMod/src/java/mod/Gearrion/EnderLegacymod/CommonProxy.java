package mod.Gearrion.EnderLegacymod;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import mod.Gearrion.EnderLegacymod.block.ModBlocks;
import mod.Gearrion.EnderLegacymod.item.ModArmor;
import mod.Gearrion.EnderLegacymod.item.ModItems;
import mod.Gearrion.EnderLegacymod.item.ModMats;
import mod.Gearrion.EnderLegacymod.item.ModTools;
import mod.Gearrion.EnderLegacymod.item.ModWeapons;
import mod.Gearrion.EnderLegacymod.recipes.ModRecipe;


public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
      ModItems.init();
      ModBlocks.init();
      ModWeapons.init();
      ModMats.init();
      ModArmor.init();
      ModTools.init();
      ModRecipe.init();
	}

	public void init(FMLInitializationEvent e) {

	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}