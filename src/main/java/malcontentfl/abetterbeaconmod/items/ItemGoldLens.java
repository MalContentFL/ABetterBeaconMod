package malcontentfl.abetterbeaconmod.items;

import malcontentfl.abetterbeaconmod.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemGoldLens extends Item
{
	
	public ItemGoldLens(String unlocalizedName, String registryName)
	{
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
}