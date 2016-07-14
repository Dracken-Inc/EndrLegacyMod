package mod.Gearrion.EnderLegacymod.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityVoidling extends EntityLiving {

	    public EntityVoidling(World par1)
	    {
	        super(par1);
	        this.setSize(0.6F, 2.9F);
	        this.stepHeight = 1.0F;
	    }

	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896D);
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);
	    }}
