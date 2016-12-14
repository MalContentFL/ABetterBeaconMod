package malcontentfl.abetterbeaconmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utils
{
	private static Logger Logger;
	
	public static Logger getLogger()
	{
		if(Logger == null)
		{
			Logger = LogManager.getFormatterLogger(Reference.MODID);
		}
		return Logger;
	}
}
