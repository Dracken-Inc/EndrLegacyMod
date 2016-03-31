package mod.Gearrion.EnderLegacymod.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

    public final class ModTools {
    
    	public static Item Endersteelpickaxe;

	public static final void init() {
GameRegistry.registerItem(Endersteelpickaxe = new Endersteelpickaxe("Endersteelpickaxe", ModMats.MatEnderSteel), "endersteel pickaxe");
 }
}