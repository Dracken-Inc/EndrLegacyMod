package mod.Gearrion.EnderLegacymod.item;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.ItemPickaxe;

public class ItemModTool extends ItemPickaxe {
	
	protected ItemModTool(String name, ToolMaterial Material) {
		super(Material);
        this.setUnlocalizedName(name);
        this.setTextureName(Main.MODID + ":" + name);
        this.setCreativeTab(Main.Tabtut);
	}
}