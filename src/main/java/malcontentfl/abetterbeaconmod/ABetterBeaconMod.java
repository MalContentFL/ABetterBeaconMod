package malcontentfl.abetterbeaconmod;

import malcontentfl.abetterbeaconmod.init.ModItems;
import malcontentfl.abetterbeaconmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ABetterBeaconMod
{
	@Mod.Instance(Reference.MODID)
	public static ABetterBeaconMod instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit()
	{
		ModItems.init();
		ModItems.register();
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

}
