package malcontentfl.abetterbeaconmod.proxy;

import malcontentfl.abetterbeaconmod.init.ModItems;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		ModItems.registerRenders();
	}
}
