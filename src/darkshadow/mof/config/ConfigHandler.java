package darkshadow.mof.config;

import java.io.File;
import darkshadow.mof.lib.ItemInfo;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {

  public static void init(File file) {
    Configuration config = new Configuration(file);

    config.load();

    ItemInfo.POT_ID = config.getItem(ItemInfo.POT_KEY, ItemInfo.POT_DEF).getInt() - 256;

    config.save();

  }
}