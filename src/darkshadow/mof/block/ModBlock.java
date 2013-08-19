package darkshadow.mof.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import darkshadow.mof.lib.BlockInfo;
import darkshadow.mof.lib.ModInfo;

public class ModBlock {
  
  public static Block stove = (new BlockStove(BlockInfo.STOVE_ID, Material.iron))
      .setCreativeTab(CreativeTabs.tabTools)
      .setUnlocalizedName(BlockInfo.STOVE_UNLOCALIZED_NAME)
      .setHardness(2F)
      .setStepSound(Block.soundMetalFootstep)
      .func_111022_d(ModInfo.TEXTURE_LOC+":"+BlockInfo.STOVE_ICON);
    
  public static void init() {
    // Call to initalize public static items above
    GameRegistry.registerBlock(stove, BlockInfo.STOVE_NAME);
  }
  
  public static void addNames() {
    LanguageRegistry.addName(stove, BlockInfo.STOVE_NAME); 
  }

  public static void addRecipes() {
    ItemStack ironStack = new ItemStack(Item.ingotIron);
    
    GameRegistry.addRecipe(new ItemStack(stove), " xx", "xxx", "xxx", 'x', ironStack);
  }

}
