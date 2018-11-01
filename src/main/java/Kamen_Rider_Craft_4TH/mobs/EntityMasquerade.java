package Kamen_Rider_Craft_4TH.mobs;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityMasquerade extends EntityZombie
{



	private String texture;
	public EntityMasquerade(World par1World)
	{
		super(par1World);
	        this.setSize(0.6F, 1.95F);
	    
	}
	/**
	 * Get this Entity's EnumCreatureAttribute
	 */
	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.UNDEAD;
	}

	protected void applyEntityAttributes()
	{
	     super.applyEntityAttributes();

	        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
	        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(45.0D);	        	        
	        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(3.0D);
	        
	}
	
	protected boolean shouldBurnInDay()
    {
        return false;
    }
    public void onDeath(DamageSource cause)
    {
if (!this.world.isRemote){
    		this.dropItem(RiderItems.gaiamemory, 2);
    		switch (this.rand.nextInt(25))
    		{
    		case 0:
    			this.dropItem(RiderItems.cyclone_memory, 1);
    			break;

    		case 1:
    			this.dropItem(RiderItems.luna_memory, 1);
    			break;

    		case 2:
    			this.dropItem(RiderItems.heat_memory, 1);
    			break;
    		case 3:
    			this.dropItem(RiderItems.joker_memory, 1); 
    			break;
    		case 4:
    			this.dropItem(RiderItems.metal_memory, 1);
    			break;
    		case 5:
    			this.dropItem(RiderItems.trigger_memory, 1);
    			break;
    		case 6:
    			this.dropItem(RiderItems.cyclone_memory, 1);
    			break;

    		case 7:
    			this.dropItem(RiderItems.joker_memory, 1);
    			break;
    		case 8:
    			this.dropItem(RiderItems.cyclone_memory, 1);
    			break;

    		case 9:
    			this.dropItem(RiderItems.joker_memory, 1);
    			break;
    		case 10:
    			this.dropItem(RiderItems.cyclone_memory, 1);
    			break;

    		case 11:
    			this.dropItem(RiderItems.joker_memory, 1);
    			break;
    			
    		}
        
        }
    }




}