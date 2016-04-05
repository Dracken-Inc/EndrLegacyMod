package mod.Gearrion.EnderLegacymod.Items.Tools;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.ItemPickaxe;

public class ItemModTool extends ItemPickaxe {
	
	public ItemModTool(String name, ToolMaterial Material) {
		super(Material);
        this.setUnlocalizedName(name);
        this.setTextureName(Main.MODID + ":" + name);
        this.setCreativeTab(Main.TabEnderLegacy);
	}
}