package darkshadow.mof.config;

import java.io.File;

import darkshadow.mof.lib.BlockInfo;
import darkshadow.mof.lib.ItemInfo;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {

  public static void init(File file) {
    Configuration config = new Configuration(file);

    config.load();
    
    // Items
    ItemInfo.POT_ID = config.getItem(ItemInfo.POT_KEY, ItemInfo.POT_DEF).getInt() - 256;

    // Blocks
    BlockInfo.STOVE_ID = config.getBlock(BlockInfo.STOVE_KEY, BlockInfo.STOVE_DEF).getInt();
    
    config.save();

  }
}