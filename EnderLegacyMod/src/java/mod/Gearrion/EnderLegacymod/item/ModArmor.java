package mod.Gearrion.EnderLegacymod.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class ModArmor {
	public static Item  Endersteelhelmet;
	public static Item  Endersteelchestplate;
	public static Item  Endersteelleggings;
	public static Item  Endersteelboots;
	
public static final void init() {
	GameRegistry.registerItem(Endersteelhelmet = new ItemModArmor("Endersteelhelmet", ModMats.MatEnderSteelArmor, "Endersteelhelmet", 0), "Endersteelhelmet"); //0 for helmet
	GameRegistry.registerItem(Endersteelchestplate = new ItemModArmor("Endersteelchestplate", ModMats.MatEnderSteelArmor, "Endersteelchestplate", 1), "EndersteelChestplate"); // 1 for chestplate
	GameRegistry.registerItem(Endersteelleggings = new ItemModArmor("Endersteelleggings", ModMats.MatEnderSteelArmor, "Endersteelleggings", 2), "EndersteelLeggings"); // 2 for leggings
	GameRegistry.registerItem(Endersteelboots = new ItemModArmor("Endersteelboots", ModMats.MatEnderSteelArmor, "Endersteelboots", 3), "EndersteelBoots"); // 3 for boots
 }
}