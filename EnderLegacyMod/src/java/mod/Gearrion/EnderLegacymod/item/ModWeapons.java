package mod.Gearrion.EnderLegacymod.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class ModWeapons {
	public static Item EnderBlade;
		
	public static final void init() {
	//Weapons
	GameRegistry.registerItem(EnderBlade = new EnderBlade("EnderBlade", ModMats.MatEnderSteel), "EnderBlade");
}
}