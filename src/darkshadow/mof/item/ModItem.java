package darkshadow.mof.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import darkshadow.mof.lib.ItemInfo;
import darkshadow.mof.lib.ModInfo;

public class ModItem {

  public static Item pot = (new ItemPot(ItemInfo.POT_ID))
      .setCreativeTab(CreativeTabs.tabTools)
      .setMaxStackSize(1)
      .setUnlocalizedName(ItemInfo.POT_UNLOCALIZED_NAME)
      .func_111206_d(ModInfo.MOD_ID_LC+":"+ItemInfo.POT_ICON);
  
  public static void init() {
    // Call to initalize public static items above
  }
  
  public static void addNames() {
    LanguageRegistry.addName(pot, ItemInfo.POT_NAME); 
  }

  public static void addRecipes() {
    ItemStack ironStack = new ItemStack(Item.ingotIron);
    
    GameRegistry.addRecipe(new ItemStack(pot), "  x", "xxx", "xxx", 'x', ironStack);
  }

}