package mod.Gearrion.EnderLegacymod.item;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.ItemSword;

public class Endersteelsword extends ItemSword {
	
	protected Endersteelsword(String Endersteelsword, ToolMaterial Material) {
		super(Material);
        this.setUnlocalizedName("Endersteelsword");
        this.setTextureName(Main.MODID + ":" + "Endersteelsword");
        this.setCreativeTab(Main.Tabtut);
}
}
