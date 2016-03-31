package mod.Gearrion.EnderLegacymod.block;



import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Enderstonebrick extends Block {

    protected Enderstonebrick() {
        super(Material.rock);
        this.setBlockName("Enderstonebrick");
        this.setBlockTextureName(Main.MODID + ":" + "Enderstonebrick");
        this.setCreativeTab(Main.Tabtut);
        this.setHardness(20.0F);
        this.setResistance(800.0F);
        this.setLightLevel(0.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(soundTypeStone);
 }
}
