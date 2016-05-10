package mod.Gearrion.EnderLegacymod.Items.Wands;	

import mod.Gearrion.EnderLegacymod.Main;
import mod.Gearrion.EnderLegacymod.Blocks.ModBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ignighterWand extends Item
{
	
	public ignighterWand(String name){
		super();
		this.setMaxStackSize(1);
		setCreativeTab(Main.TabEnderLegacy);
        this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":" + "EnderWand");
			
	}
    {
    
    }

	 public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz)
	    {
	        if (world.getBlock(x, y + 1, z) == Blocks.air)
	        {
	              world.setBlock(x, y + 1, z, ModBlocks.lightFire);
	                            
	              return true;
	        }
	        return false;
	    }
}
