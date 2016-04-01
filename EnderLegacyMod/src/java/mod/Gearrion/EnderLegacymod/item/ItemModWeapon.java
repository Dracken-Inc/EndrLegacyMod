package mod.Gearrion.EnderLegacymod.item;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.ItemSword;

public class ItemModWeapon extends ItemSword {
	
	protected ItemModWeapon(String name, ToolMaterial Material) {
		super(Material);
        this.setUnlocalizedName(name);
        this.setTextureName(Main.MODID + ":" + name);
        this.setCreativeTab(Main.Tabtut);
	}
}