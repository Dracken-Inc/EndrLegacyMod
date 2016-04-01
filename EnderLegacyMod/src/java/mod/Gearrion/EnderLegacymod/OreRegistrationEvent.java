package mod.Gearrion.EnderLegacymod;

import mod.Gearrion.EnderLegacymod.block.ModBlocks;
import mod.Gearrion.EnderLegacymod.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class OreRegistrationEvent {

	public static void init() {
		OreDictionary.registerOre("oreEnderSteel", new ItemStack(ModBlocks.Endersteelore, 1, 0));
		OreDictionary.registerOre("ingotEnderSteel", new ItemStack(ModItems.Endersteelignot, 1, 0));
	}

}
 