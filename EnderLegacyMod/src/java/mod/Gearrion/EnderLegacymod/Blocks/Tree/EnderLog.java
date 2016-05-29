package mod.Gearrion.EnderLegacymod.Blocks.Tree;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class EnderLog extends BlockModLogBase
{
    public static final String[] field_150169_M = new String[] {"lightOak"};
    @SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000277";
        public EnderLog(String name, String blockTextureName){
    	this.setBlockName(name);
    	//Blocks.fire.setFireInfo(this, 5, 20);
    	this.blockMaterial.equals(Material.wood);
    	this.setBlockTextureName(blockTextureName);
		this.setCreativeTab(Main.TabEnderLegacy);
    }
        @Override
        public boolean isFireSource(World world, int x, int y, int z, ForgeDirection side) {
             return true;
        }
    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
        //p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_150167_a = new IIcon[field_150169_M.length];
        this.field_150166_b = new IIcon[field_150169_M.length];

        for (int i = 0; i < this.field_150167_a.length; ++i)
        {
            this.field_150167_a[i] = p_149651_1_.registerIcon("EnderLegacymod:" + this.getTextureName() + "_" + field_150169_M[i]);
           this.field_150166_b[i] = p_149651_1_.registerIcon("EnderLegacymod:" + this.getTextureName() + "_" + field_150169_M[i] + "_top");
        }
    }
}
