package mod.Gearrion.EnderLegacymod.Items.Wands;	

import mod.Gearrion.EnderLegacymod.Main;
import mod.Gearrion.EnderLegacymod.Blocks.ModBlocks;
import net.minecraft.entity.player.EntityPlayer;
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

    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10){
    	par3World.setBlock(par4, par5+1, par6, ModBlocks.lightFire);
    	return true;
	}

    }
