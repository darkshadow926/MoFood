package darkshadow.mof.item;

import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPot extends Item {

  public ItemPot(int id) {
    super(id);
  }

  @Override
  public boolean func_111207_a(ItemStack itemstack, EntityPlayer player,
      EntityLivingBase target) {

    if (!target.worldObj.isRemote) {
      target.motionY = 2;
      itemstack.setItemDamage(itemstack.getItemDamage() + 1);
    }

    return false;
  }
  
  @Override
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack itemstack, EntityPlayer player,  List info, boolean useExtraInfo) {
    info.add("This fun thing has been used " + itemstack.getItemDamage() + " times");
  }

}