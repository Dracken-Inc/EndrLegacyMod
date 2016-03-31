package mod.Gearrion.EnderLegacymod.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class ModWeapons {
	public static Item EnderBlade;
	public static Item Endersteelsword;
	public static Item Huntressbow;
		
	public static final void init() {
	//Weapons
	GameRegistry.registerItem(EnderBlade = new EnderBlade("EnderBlade", ModMats.MatEnderSteel),"EnderBlade");
	GameRegistry.registerItem(Endersteelsword = new Endersteelsword("Endersteelsword", ModMats.MatEnderSteel),"Endersteelsword");
//Huntress Bow all Messed up	
	//GameRegistry.registerItem(Huntressbow = new Huntressbow("Huntressbow", ModMats.MatEnderSteel),"Huntressbow");
 }
}