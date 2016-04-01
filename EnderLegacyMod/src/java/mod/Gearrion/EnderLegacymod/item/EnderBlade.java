package mod.Gearrion.EnderLegacymod.item;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.ItemSword;

public class EnderBlade extends ItemSword {
	
	protected EnderBlade(String EnderBlade, ToolMaterial Material) {
		super(Material);
        this.setUnlocalizedName("EnderBlade");
        this.setTextureName(Main.MODID + ":" + "EnderBlade");
        this.setCreativeTab(Main.Tabtut);
}
}
