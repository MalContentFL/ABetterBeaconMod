package malcontentfl.abetterbeaconmod.init;

import malcontentfl.abetterbeaconmod.Reference;
import malcontentfl.abetterbeaconmod.Utils;
import malcontentfl.abetterbeaconmod.items.ItemIronLense;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static Item ironLense;
	
	public static void init()
	{
		ironLense = new ItemIronLense("iron_lense", "iron_lense");
	}
	
	public static void register()
	{
		registerItem(ironLense);
	}
	
	public static void registerRenders()
	{
		registerRender(ironLense);
	}
	
	public static void registerItem(Item item)
	{
		GameRegistry.register(item);
		Utils.getLogger().info("Registered item " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
	}
}
