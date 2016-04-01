package mod.Gearrion.EnderLegacymod.block;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

  public class BlockModBlock extends Block {

	protected BlockModBlock(String unlocalizedName, Material material, float hardness, float resistants, float lightlevel, String tool, int toolstr, SoundType soundtype ) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(Main.Tabtut);
		this.setHardness(hardness);
		this.setResistance(resistants);
		this.setLightLevel(lightlevel);
		this.setHarvestLevel("tool", toolstr);
		this.setStepSound(soundtype);
		
	}
}