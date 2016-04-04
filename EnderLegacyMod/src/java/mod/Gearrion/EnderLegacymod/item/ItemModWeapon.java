package mod.Gearrion.EnderLegacymod.item;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.ItemSword;

public class ItemModWeapon extends ItemSword {
	
	protected ItemModWeapon(String name, ToolMaterial Material, String Texture) {
		super(Material);
        this.setUnlocalizedName(name);
        this.setTextureName(Main.MODID + ":" + Texture);
        this.setCreativeTab(Main.Tabtut);
	}
}