package mod.Gearrion.EnderLegacymod.item;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.item.ItemBow;

public class Huntressbow extends ItemBow {
	
	protected Huntressbow(String Huntressbow, ToolMaterial Material) {
		super();
        this.setUnlocalizedName("Huntressbow");
        this.setTextureName(Main.MODID + ":" + "Huntressbow");
        this.setCreativeTab(Main.Tabtut);
        }
}
