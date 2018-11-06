package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_BloodStalk;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityMachineBuilder;
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class Entityguardian extends Entity_base_henchmen
{
	public Entityguardian(World par1World)
	{
		super(par1World);
	}
	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){
			this.dropItem(RiderItems.full_bottle, 2);
			if (this.getAttackTarget()instanceof EntityPlayer){
				 EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 Entity_base_henchmen entitymob  = new Entity_needle_smash(world);
				 EntityBossBase entityboss  = new Entity_BloodStalk(world);
			switch (this.rand.nextInt(25))
			{
			case 0:
				playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"Cobra! Mistmatch! Co-Cobra... Cobra... Fire!"));
				entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss);
				break;
			case 1:
				entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entitymob);
				break;
			case 2:
				entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entitymob);
				break;
			case 3:
				entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entitymob);
				break;
			case 4:
				entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entitymob);
				break;
			case 5:
				entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entitymob);
				break;
			case 6:
				entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entitymob);
				break;
			}
		}
			switch (this.rand.nextInt(20))
			{
			case 0:
				this.dropItem(RiderItems.rabbit_full_bottle, 1);
				break;
			case 1:
				this.dropItem(RiderItems.tank_full_bottle, 1);
				break;
			case 2:
				this.dropItem(RiderItems.gorilla_full_bottle, 1);
				break;
			case 3:
				this.dropItem(RiderItems.diamond_full_bottle, 1); 
				break;
			case 4:
				this.dropItem(RiderItems.nebula_gas_sample, 1);
				break;
			}
		}
	}
}