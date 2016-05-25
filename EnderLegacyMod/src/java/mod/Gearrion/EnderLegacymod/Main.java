package mod.Gearrion.EnderLegacymod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import mod.Gearrion.EnderLegacymod.CusTabs.TabEnderLegacy;
import mod.Gearrion.EnderLegacymod.Proxy.CommonProxy;
import mod.Gearrion.EnderLegacymod.world.WorldGenRegistry;
import mod.Gearrion.EnderLegacymod.world.biome.BiomeRegistry;
import mod.Gearrion.EnderLegacymod.world.dimension.dimensionRegistry;
import net.minecraft.creativetab.CreativeTabs;


@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "EnderLegacyMod";
    public static final String MODNAME = "Ender Legacy Mod";
    public static final String VERSION = "1.0.7";
     
    @Instance
    public static Main instance = new Main();
        
     
    @SidedProxy(clientSide="mod.Gearrion.EnderLegacymod.Proxy.ClientProxy", serverSide="mod.Gearrion.EnderLegacymod.Proxy.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs TabEnderLegacy = new TabEnderLegacy(CreativeTabs.getNextID(), "EnderLegacy");
    
    

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);
    	 BiomeRegistry.main();
    	 dimensionRegistry.mainRegistry();
    	}  
        
    
	@EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
    	WorldGenRegistry.main();
    	}

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }
}