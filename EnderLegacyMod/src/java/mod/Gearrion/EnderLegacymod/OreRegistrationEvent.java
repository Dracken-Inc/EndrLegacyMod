package mod.Gearrion.EnderLegacymod;

import mod.Gearrion.EnderLegacymod.block.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class OreRegistrationEvent {

	public static void init() {
		OreDictionary.registerOre("Endersteelore", new ItemStack(ModBlocks.Endersteelore, 1, 0));
	}

}