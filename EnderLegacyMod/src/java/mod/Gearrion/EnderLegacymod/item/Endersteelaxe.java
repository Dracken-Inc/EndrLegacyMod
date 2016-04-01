package mod.Gearrion.EnderLegacymod.item;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.ItemAxe;

public class Endersteelaxe extends ItemAxe {
	
	protected Endersteelaxe(String Endersteelaxe, ToolMaterial Material) {
		super(Material);
        this.setUnlocalizedName("Endersteelaxe");
        this.setTextureName(Main.MODID + ":" + "Endersteelaxe");
        this.setCreativeTab(Main.Tabtut);
}
}
