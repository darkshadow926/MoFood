package darkshadow.mof;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import darkshadow.mof.lib.Ref;
import darkshadow.mof.proxy.CommonProxy;

@Mod(modid = Ref.MOD_ID, name = Ref.MOD_NAME, version = Ref.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MoFood {

  // The instance of your mod that Forge uses.
  @Instance(Ref.MOD_ID)
  public static MoFood instance;

  // Says where the client and server 'proxy' code is loaded.
  @SidedProxy(clientSide = Ref.PROXY_LOC+".client.ClientProxy", serverSide = Ref.PROXY_LOC+".CommonProxy")
  public static CommonProxy proxy;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    // Stub Method
  }

  @EventHandler
  public void load(FMLInitializationEvent event) {
    // Stub Method
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
    // Stub Method
  }

}
