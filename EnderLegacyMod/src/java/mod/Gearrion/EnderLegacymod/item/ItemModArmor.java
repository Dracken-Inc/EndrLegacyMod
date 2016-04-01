package mod.Gearrion.EnderLegacymod.item;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemModArmor extends ItemArmor {

  public String textureName;

	public ItemModArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
		super(material, 0, type);
		this.textureName = textureName;
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(Main.Tabtut);
		}	
			@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return Main.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}