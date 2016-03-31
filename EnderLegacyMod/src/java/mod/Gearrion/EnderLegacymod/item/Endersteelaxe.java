package mod.Gearrion.EnderLegacymod.item;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.ItemAxe;

public class Endersteelaxe extends ItemAxe {
	
	protected Endersteelaxe(String string, ToolMaterial MatEnderSteel) {
		super(MatEnderSteel);
        this.setUnlocalizedName("Endersteelaxe");
        this.setTextureName(Main.MODID + ":" + "Endersteelaxe");
        this.setCreativeTab(Main.Tabtut);
}
}
