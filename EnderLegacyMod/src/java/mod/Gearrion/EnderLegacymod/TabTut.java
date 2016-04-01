  package mod.Gearrion.EnderLegacymod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TabTut extends CreativeTabs {

	public TabTut(int id, String name) {
		super(id, name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Items.ender_eye;
	}

}