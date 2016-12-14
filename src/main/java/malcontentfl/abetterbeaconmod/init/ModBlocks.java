package malcontentfl.abetterbeaconmod.init;

import malcontentfl.abetterbeaconmod.ABetterBeaconMod;
import malcontentfl.abetterbeaconmod.Reference;
import malcontentfl.abetterbeaconmod.Utils;
import malcontentfl.abetterbeaconmod.blocks.BlockNetherCube;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
	public static Block netherCube;
	
	public static void init()
	{
		netherCube = new BlockNetherCube("nether_cube", "nether_cube");
	}
	
	public static void register()
	{
		registerBlock(netherCube);
	}
	
	public static void registerRenders()
	{
		registerRender(netherCube);
	}
	
	public static void registerBlock(Block block)
	{
		block.setCreativeTab(ABetterBeaconMod.mod);
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered block " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Register render for " + block.getUnlocalizedName().substring(5));
	}
}
