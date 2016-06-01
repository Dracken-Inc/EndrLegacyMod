package mod.Gearrion.EnderLegacymod.world.dimension;

import mod.Gearrion.EnderLegacymod.world.WorldProviderTrueEnd;
import net.minecraftforge.common.DimensionManager;

public class dimensionRegistry {
			
	public static final int dimensionId = 8;
	
	public static void init(){
		DimensionManager.registerProviderType(dimensionId, WorldProviderTrueEnd.class, false);
		DimensionManager.registerDimension(dimensionId, dimensionId);
		
	}

}
