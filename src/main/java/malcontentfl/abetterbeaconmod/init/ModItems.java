package malcontentfl.abetterbeaconmod.init;

import malcontentfl.abetterbeaconmod.ABetterBeaconMod;
import malcontentfl.abetterbeaconmod.Reference;
import malcontentfl.abetterbeaconmod.Utils;
import malcontentfl.abetterbeaconmod.items.ItemDiamondLense;
import malcontentfl.abetterbeaconmod.items.ItemEmeraldLense;
import malcontentfl.abetterbeaconmod.items.ItemEndowingRod;
import malcontentfl.abetterbeaconmod.items.ItemGoldLense;
import malcontentfl.abetterbeaconmod.items.ItemIronLense;
import malcontentfl.abetterbeaconmod.items.ItemSolidifiedEnergy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static Item ironLense;
	public static Item goldLense;
	public static Item diamondLense;
	public static Item emeraldLense;
	public static Item endowingRod;
	public static Item solidifiedEnergy;
	
	public static void init()
	{
		ironLense = new ItemIronLense("iron_lense", "iron_lense");
		goldLense = new ItemGoldLense("gold_lense", "gold_lense");
		diamondLense = new ItemDiamondLense("diamond_lense", "diamond_lense");
		emeraldLense = new ItemEmeraldLense("emerald_lense", "emerald_lense");
		endowingRod = new ItemEndowingRod("endowing_rod", "endowing_rod");
		solidifiedEnergy = new ItemSolidifiedEnergy("solidified_energy", "solidified_energy");
	}
	
	public static void register()
	{
		registerItem(ironLense);
		registerItem(goldLense);
		registerItem(diamondLense);
		registerItem(emeraldLense);
		registerItem(endowingRod);
		registerItem(solidifiedEnergy);
	}
	
	public static void registerRenders()
	{
		registerRender(ironLense);
		registerRender(goldLense);
		registerRender(diamondLense);
		registerRender(emeraldLense);
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
