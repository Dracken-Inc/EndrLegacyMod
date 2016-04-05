package mod.Gearrion.EnderLegacymod.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityProjectile extends EntityThrowable
{
    public static final float explosionPower = 0.75F;
    public static final int ProjRadius = 4;
 
    public EntityProjectile(World world)
    {
        super(world);
    }
 
    public EntityProjectile(World world, EntityLivingBase entity)
    {
        super(world, entity);
    }
 
    private void explode()
    {
        int bx = (int)posX;
        int by = (int)posY;
        int bz = (int)posZ;
        worldObj.createExplosion(this, posX, posY, posZ, 0.75F, true);
 
    //    for (int x = bx - empRadius; x <= empRadius; x++)
        {
     //       for (int y = by - empRadius; y <= by + empRadius; y++)
            {
     //           for (int z = bz - empRadius; z <= bz + empRadius; z++)
                {
    //                Block block = worldObj.getBlock(x, y, z);
    //                if (block == Blocks.redstone_wire || block instanceof BlockRedstoneDiode)
                    {
   //                     block.dropBlockAsItem(worldObj, x, y, z, worldObj.getBlockMetadata(x, y, z), 0);
  //                      worldObj.setBlockToAir(x, y, z);
                    }
   //                 if (block == Blocks.redstone_block)
                    {
   //                     worldObj.setBlock(x, y, z, Blocks.stone);
                    }
                }
            }
        }
        setDead();
    }
    @Override
    public void onUpdate()
    {
        super.onUpdate();
        if (ticksExisted > 20)
        {
            explode();
        }
 
        for (int i = 0; i < 10; i++)
        {
            double x = (double)(rand.nextInt(10) - 5) / 8.0D;
            double y = (double)(rand.nextInt(10) - 5) / 8.0D;
            double z = (double)(rand.nextInt(10) - 5) / 8.0D;
            worldObj.spawnParticle("fireworksSpark", posX, posY, posZ, x, y, z);
        }
    }
 
    @Override
    protected float getGravityVelocity()
    {
        return 0.005F;
    }
 
    public void onImpact1(MovingObjectPosition movingObjectPosition)
    {
        explode();
    }

	@Override
	protected void onImpact(MovingObjectPosition p_70184_1_) {
		// TODO Auto-generated method stub
		
	}
}