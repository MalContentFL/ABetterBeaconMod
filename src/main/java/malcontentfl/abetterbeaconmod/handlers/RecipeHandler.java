package malcontentfl.abetterbeaconmod.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import malcontentfl.abetterbeaconmod.Utils;
import malcontentfl.abetterbeaconmod.init.ModBlocks;
import malcontentfl.abetterbeaconmod.init.ModItems;

public class RecipeHandler
{
	public static void registerCraftingRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(ModItems.ironLens), new Object[] {" I ", "IGI", " I ", 'I', Items.IRON_INGOT, 'G', Blocks.GLASS_PANE});
		GameRegistry.addRecipe(new ItemStack(ModItems.goldLens), new Object[] {" I ", "IGI", " I ", 'I', Items.GOLD_INGOT, 'G', Blocks.GLASS_PANE});
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondLens), new Object[] {" I ", "IGI", " I ", 'I', Items.DIAMOND, 'G', Blocks.GLASS_PANE});
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldLens), new Object[] {" I ", "IGI", " I ", 'I', Items.EMERALD, 'G', Blocks.GLASS_PANE});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.netherCube), new Object[] {"SSS", "SSS", "SSS", 'S', Items.NETHER_STAR});
		GameRegistry.addRecipe(new ItemStack(ModItems.endowingRod), new Object[] {"  S", " B ", "B  ", 'S', Items.BLAZE_ROD, 'B', ModItems.solidifiedEnergy});
		
		Utils.getLogger().info("Registered Crafting Recipes!");
	}
	
	public static void registerFurnaceRecipes()
	{
		Utils.getLogger().info("Registered Furnace Recipes!");
	}
}
