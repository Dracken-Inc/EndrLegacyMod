package mod.Gearrion.EnderLegacymod.item;

import mod.Gearrion.EnderLegacymod.Main;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemProjectile extends Item
{
   

	public ItemProjectile(String name,Float damage1, Float damage2 )
    {
        setCreativeTab(Main.Tabtut);
        setMaxStackSize(1);
        setMaxDamage(0);
    }
 
    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(ModItems.Endersteelignot))
        {
            player.swingItem();
            world.playSoundAtEntity(player, Main.MODID + "name",0.5F , 1.0F);
            if (!world.isRemote)
            {
                world.spawnEntityInWorld(new EntityProjectile(world, player));
            }
        }
        return itemStack;
    }
}