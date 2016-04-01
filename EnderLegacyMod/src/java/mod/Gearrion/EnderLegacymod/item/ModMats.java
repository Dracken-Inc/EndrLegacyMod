package mod.Gearrion.EnderLegacymod.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public final class ModMats {
	public static ToolMaterial MatEnderSteelItem = EnumHelper.addToolMaterial("MatEnderSteelItem", 4, 2500, 14.0F, 6.0F, 30);
	public static ArmorMaterial MatEnderSteelArmor = EnumHelper.addArmorMaterial("MatEnderSteelArmor", 16, new int[] {3, 8, 6, 3}, 30);
	public static void init() {
		
	}
	
}
