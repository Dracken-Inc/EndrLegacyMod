package mod.Gearrion.EnderLegacymod.block;



import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Endergemblock extends Block {

    protected Endergemblock() {
        super(Material.rock);
        this.setBlockName("Endergemblock");
        this.setBlockTextureName(Main.MODID + ":" + "Endergemblock");
        this.setCreativeTab(Main.Tabtut);
        this.setHardness(55.0F);
        this.setResistance(100.0F);
        this.setLightLevel(0.6F);
        this.setHarvestLevel("pickaxe", 4);
        this.setStepSound(soundTypeStone);
    }
}
