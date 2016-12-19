package malcontentfl.abetterbeaconmod.items;

import malcontentfl.abetterbeaconmod.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemEndowingRod extends Item
{
	
	public ItemEndowingRod(String unlocalizedName, String registryName)
	{
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
		this.setMaxStackSize(1);
	}
}