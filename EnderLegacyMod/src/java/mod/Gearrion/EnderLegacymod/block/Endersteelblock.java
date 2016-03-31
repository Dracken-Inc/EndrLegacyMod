package mod.Gearrion.EnderLegacymod.block;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Endersteelblock extends Block {
 
	protected Endersteelblock() {
		super(Material.iron);
        this.setBlockName("Endersteelblock");
        this.setBlockTextureName(Main.MODID + ":" + "Endersteelblock");
        this.setCreativeTab(Main.Tabtut);
        this.setHardness(80.0F);
        this.setResistance(1000.0F);
        this.setLightLevel(0.0F);
        this.setHarvestLevel("pickaxe", 4);
        this.setStepSound(soundTypeMetal);
     		}
	
	}