package mod.Gearrion.EnderLegacymod.world.dimension;

import mod.Gearrion.EnderLegacymod.world.WorldProviderTrueEnd;
import net.minecraftforge.common.DimensionManager;

public class dimensionRegistry {
	
	public static void mainRegistry(){
		registerDimension();
	}
	
	public static final int dimensionId = 8;
	
	public static void registerDimension(){
		DimensionManager.registerProviderType(dimensionId, WorldProviderTrueEnd.class, false);
		DimensionManager.registerDimension(dimensionId, dimensionId);
		
	}

}
