package KamenRiderCraftV3.item.kuuga;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

public class Item_titan_sword extends ItemSword
{
    private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;

	private Item Imcharge;
	
    public Item_titan_sword(ToolMaterial par2EnumToolMaterial, Item charge)
    {
    	
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.weaponDamage = 4.0F + par2EnumToolMaterial.getDamageVsEntity();
       
        Imcharge=charge; 
    }
    
    
  
    @Override
  	public ModelResourceLocation getModel(ItemStack item, EntityPlayer playerIn, int useRemaining){


  		ModelResourceLocation modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+item.getUnlocalizedName().substring(5),"inventory");
  		
  		
  		
  			if (playerIn.getEquipmentInSlot(1)!= null){

  				if (playerIn.getEquipmentInSlot(1).getItem() instanceof item_kuugadriver){
  					
  					if(item_kuugadriver.get_core(playerIn.getEquipmentInSlot(1))==8){modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+item.getUnlocalizedName().substring(5),"inventory");
  					modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+Imcharge.getUnlocalizedName().substring(5),"inventory");
  					
  					}
  					
  					
  				}
  			}
  		
  		
  					
  		
  	

  		return modelresourcelocation;
  	}
}