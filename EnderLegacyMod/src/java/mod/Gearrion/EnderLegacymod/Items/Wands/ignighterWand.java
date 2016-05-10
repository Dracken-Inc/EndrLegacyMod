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
	
	public ignighterWand(Item.ToolMaterial m, String name){
		super();
		maxStackSize = 1;
		setMaxDamage(m.getMaxUses());
		this.setMaxStackSize(1);
		setCreativeTab(Main.TabEnderLegacy);
        this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":" + "EnderWand");
			
	}
    {
    
    }

	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
		if (!player.canPlayerEdit(x, y, z, par7, stack)) {
			return false;
		} else {
							if (world.isRemote) {
					return true;
				} else {
					if (world.getBlock(x, y + 1, z) == Blocks.air){world.setBlock(x, y + 1, z, ModBlocks.lightFire);
					stack.damageItem(20, player);
					return true;
				}
}}
		return false;}}
