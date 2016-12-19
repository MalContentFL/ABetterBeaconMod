package malcontentfl.abetterbeaconmod;

import malcontentfl.abetterbeaconmod.creativeTabs.TabABBM;
import malcontentfl.abetterbeaconmod.handlers.RecipeHandler;
import malcontentfl.abetterbeaconmod.handlers.RenderGuiHandler;
import malcontentfl.abetterbeaconmod.init.ModBlocks;
import malcontentfl.abetterbeaconmod.init.ModItems;
import malcontentfl.abetterbeaconmod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ABetterBeaconMod
{
	public static final CreativeTabs mod = new TabABBM("A Better Beacon Mod");
	
	malcontentfl.abetterbeaconmod.handlers.EventHandler eventHandler = new malcontentfl.abetterbeaconmod.handlers.EventHandler();
	
	@Mod.Instance(Reference.MODID)
	public static ABetterBeaconMod instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
		ModItems.register();
		ModBlocks.register();
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		eventHandler.registerEvents();
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerFurnaceRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());
	}

}
