package mod.Gearrion.EnderLegacymod.item;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.Item;

public class ItemModBasic extends Item {
	
	protected ItemModBasic(String name) {
		super();
        this.setUnlocalizedName(name);
        this.setTextureName(Main.MODID + ":" + name);
        this.setCreativeTab(Main.Tabtut);
	}
}