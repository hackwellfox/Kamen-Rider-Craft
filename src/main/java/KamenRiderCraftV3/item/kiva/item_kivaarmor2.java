package KamenRiderCraftV3.item.kiva;



import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.item.agito.item_agitoarmor2;
import KamenRiderCraftV3.model.BipedLockseed;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

public class item_kivaarmor2 extends ItemArmor
{

	public static final String[] CoreName= new String[] {"","_garulu","_basshaa","_dogga","_dogabaki","_emperor","_dogabaki_emperor"};
	public static final String[] ixaCoreName= new String[] {"_save","_burst","_rising"};

	
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_kivaarmor2 (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{

		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getEquipmentInSlot(1)!= null){

				if (player.getEquipmentInSlot(1).getItem() == RiderItems.kivadriver){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"kiva"+CoreName[item_kivadriver.get_core(player.getEquipmentInSlot(1))] +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"kiva"+ CoreName[item_kivadriver.get_core(player.getEquipmentInSlot(1))] +"_1.png";
					}


				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.darkkivadriver){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"dark_kiva" +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"dark_kiva" +"_1.png";
					}


				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.newkivadriver){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"kiva" +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"kiva" +"_1.png";
					}
					
				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.ixa_belt){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"ixa"+ixaCoreName[item_kivadriver.get_core(player.getEquipmentInSlot(1))] +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"ixa"+ixaCoreName[item_kivadriver.get_core(player.getEquipmentInSlot(1))] +"_1.png";
					}
					return "KamenRiderCraftV3:textures/armor/blank.png";
				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.sagarc_belt){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"saga" +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"saga" +"_1.png";
					}
				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.arcdriver){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"arc" +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"arc" +"_1.png";
					}
				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.reydriver){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"rey" +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"rey" +"_1.png";
					}
					return "KamenRiderCraftV3:textures/armor/blank.png";


				}
				return "KamenRiderCraftV3:textures/armor/blank.png";


			}
		}
		else
		{
			return "KamenRiderCraftV3:textures/armor/blank.png";



		}
		return "KamenRiderCraftV3:textures/armor/blank.png";

	}





	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		BipedLockseed armorModel = new BipedLockseed();
		if(itemStack != null){
			if(itemStack.getItem() instanceof item_agitoarmor2){
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null){

					
					armorModel.bipedBody3.showModel = armorSlot == 3;
					armorModel.bipedRightArm2.showModel = armorSlot == 3;
					armorModel.bipedLeftLeg2.showModel = armorSlot == 3;
					armorModel.bipedBody2.showModel = armorSlot == 2;
					armorModel.bipedLeftArm2.showModel =armorSlot == 2;
					armorModel.bipedRightLeg2.showModel =armorSlot == 2;
					armorModel.bipedHead2.showModel= armorSlot == 4;
					armorModel.bipedHeadwear2.showModel= armorSlot == 4;

				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.heldItemRight = entityLiving.getHeldItem() != null ? 1 :0;
				armorModel.swingProgress = entityLiving.swingProgress-(entityLiving.swingProgress/6);
				
				return armorModel;
			}
		}

		return null;
	}


	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}


}
