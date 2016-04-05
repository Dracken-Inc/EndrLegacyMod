package mod.Gearrion.EnderLegacymod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;


@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "EnderLegacyMod";
    public static final String MODNAME = "Ender Legacy Mod";
    public static final String VERSION = "1.0.1";
        
    @Instance
    public static Main instance = new Main();
        
     
    @SidedProxy(clientSide="mod.Gearrion.EnderLegacymod.ClientProxy", serverSide="mod.Gearrion.EnderLegacymod.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs Tabtut = new TabTut(CreativeTabs.getNextID(), "Tabtut");
    
    

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);
    	}  
    
    
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
	
}

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }
}