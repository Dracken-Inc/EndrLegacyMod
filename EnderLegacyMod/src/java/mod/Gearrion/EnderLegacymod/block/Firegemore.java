package mod.Gearrion.EnderLegacymod.block;



import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Firegemore extends Block {

    protected Firegemore() {
        super(Material.glass);
        this.setBlockName("Firegemore");
        this.setBlockTextureName(Main.MODID + ":" + "Firegemore");
        this.setCreativeTab(Main.Tabtut);
        this.setHardness(50.0F);
        this.setResistance(1000.0F);
        this.setLightLevel(0.4F);
        this.setHarvestLevel("pickaxe", 4);
        this.setStepSound(soundTypeGlass);
    }
}
