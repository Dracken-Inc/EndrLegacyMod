package mod.Gearrion.EnderLegacymod.Items.Wands;

import mod.Gearrion.EnderLegacymod.Main;
import mod.Gearrion.EnderLegacymod.Items.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemProjectile extends Item
{
   

	public ItemProjectile(String name)
    {
        setCreativeTab(Main.TabEnderLegacy);
        this.setUnlocalizedName(name);
        this.setTextureName(Main.MODID + ":" + "EnderWand");
        setMaxStackSize(1);
        setMaxDamage(0);
        
    }
 
    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
       {
        if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(ModItems.Endersteelignot))
        {
            player.swingItem();
            world.playSoundAtEntity(player, Main.MODID + "name",1.0F , 1.0F);
            if (!world.isRemote)
            {
                world.spawnEntityInWorld(new EntityProjectile(world, player));
            }
        }
        return itemStack;
    }
}