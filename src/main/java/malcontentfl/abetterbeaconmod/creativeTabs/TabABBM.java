package malcontentfl.abetterbeaconmod.creativeTabs;

import malcontentfl.abetterbeaconmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabABBM extends CreativeTabs
{
	public TabABBM(String label)
	{
		super("mod");
	}

	@Override
	public Item getTabIconItem()
	{
		return ModItems.ironLens;
	}
}
