package  mod.Gearrion.EnderLegacymod.Items.Basic;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.Item;

public class ItemModBasic extends Item {
	
	public ItemModBasic(String name) {
		super();
        this.setUnlocalizedName(name);
        this.setTextureName(Main.MODID + ":" + name);
        this.setCreativeTab(Main.TabEnderLegacy);
	}
}