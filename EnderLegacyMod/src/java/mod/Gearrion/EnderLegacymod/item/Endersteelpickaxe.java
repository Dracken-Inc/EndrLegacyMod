package mod.Gearrion.EnderLegacymod.item;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.ItemPickaxe;

public class Endersteelpickaxe extends ItemPickaxe {
	
	protected Endersteelpickaxe(String Endersteelpickaxe, ToolMaterial Material) {
		super(Material);
        this.setUnlocalizedName("Endersteelpickaxe");
        this.setTextureName(Main.MODID + ":" + "Endersteelpickaxe");
        this.setCreativeTab(Main.Tabtut);
}
}
