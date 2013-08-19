package darkshadow.mof;

import java.io.File;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import darkshadow.mof.config.ConfigHandler;
import darkshadow.mof.item.ModItem;
import darkshadow.mof.lib.ModInfo;
import darkshadow.mof.network.PacketHandler;
import darkshadow.mof.proxy.CommonProxy;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.VERSION)
@NetworkMod(channels = { ModInfo.CHANNEL }, packetHandler = PacketHandler.class, clientSideRequired = true, serverSideRequired = false)
public class MoFood {

  // The instance of your mod that Forge uses.
  @Instance(ModInfo.MOD_ID)
  public static MoFood instance;

  // Says where the client and server 'proxy' code is loaded.
  @SidedProxy(clientSide = ModInfo.PROXY_LOC + ".ClientProxy", serverSide = ModInfo.PROXY_LOC
      + ".CommonProxy")
  public static CommonProxy proxy;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    // Define sounds, textures, items, blocks, take IDs, read config,
    // things other mods may care about

    // Parse Config File
    File ConfigFile = new File(event.getModConfigurationDirectory(),
        ModInfo.CONFIG_FILE + ".cfg");
    ConfigHandler.init(ConfigFile);

    ModItem.init();

    proxy.initSounds();
    proxy.initRenderers();
  }

  @EventHandler
  public void load(FMLInitializationEvent event) {
    // Setup this mod, recipes, setup connections, handlers, prepare data

    ModItem.addNames();
    ModItem.addRecipes();
  }

  @EventHandler
  public void ModsLoaded(FMLPostInitializationEvent event) {
    // after all mods loaded, interact with other mods
  }

}
