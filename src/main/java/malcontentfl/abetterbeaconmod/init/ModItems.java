package malcontentfl.abetterbeaconmod.init;

import malcontentfl.abetterbeaconmod.ABetterBeaconMod;
import malcontentfl.abetterbeaconmod.Reference;
import malcontentfl.abetterbeaconmod.Utils;
import malcontentfl.abetterbeaconmod.items.ItemDiamondLens;
import malcontentfl.abetterbeaconmod.items.ItemEmeraldLens;
import malcontentfl.abetterbeaconmod.items.ItemEndowingRod;
import malcontentfl.abetterbeaconmod.items.ItemGoldLens;
import malcontentfl.abetterbeaconmod.items.ItemIronLens;
import malcontentfl.abetterbeaconmod.items.ItemSolidifiedEnergy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static Item ironLens;
	public static Item goldLens;
	public static Item diamondLens;
	public static Item emeraldLens;
	public static Item endowingRod;
	public static Item solidifiedEnergy;
	
	public static void init()
	{
		ironLens = new ItemIronLens("iron_lens", "iron_lens");
		goldLens = new ItemGoldLens("gold_lens", "gold_lens");
		diamondLens = new ItemDiamondLens("diamond_lens", "diamond_lens");
		emeraldLens = new ItemEmeraldLens("emerald_lens", "emerald_lens");
		endowingRod = new ItemEndowingRod("endowing_rod", "endowing_rod");
		solidifiedEnergy = new ItemSolidifiedEnergy("solidified_energy", "solidified_energy");
	}
	
	public static void register()
	{
		registerItem(ironLens);
		registerItem(goldLens);
		registerItem(diamondLens);
		registerItem(emeraldLens);
		registerItem(endowingRod);
		registerItem(solidifiedEnergy);
	}
	
	public static void registerRenders()
	{
		registerRender(ironLens);
		registerRender(goldLens);
		registerRender(diamondLens);
		registerRender(emeraldLens);
		registerRender(endowingRod);
		registerRender(solidifiedEnergy);
	}
	
	public static void registerItem(Item item)
	{
		item.setCreativeTab(ABetterBeaconMod.mod);
		GameRegistry.register(item);
		Utils.getLogger().info("Registered item " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
	}
}
