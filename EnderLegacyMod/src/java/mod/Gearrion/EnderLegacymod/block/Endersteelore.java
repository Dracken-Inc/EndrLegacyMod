package mod.Gearrion.EnderLegacymod.block;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Endersteelore extends Block {
 
	protected Endersteelore() {
        super(Material.rock);
        this.setBlockName("Endersteelore");
        this.setBlockTextureName(Main.MODID + ":" + "Endersteelore");
        this.setCreativeTab(Main.Tabtut);
        this.setHardness(25.0F);
        this.setResistance(200.0F);
        this.setLightLevel(0.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeMetal);
     		}
	
	}


