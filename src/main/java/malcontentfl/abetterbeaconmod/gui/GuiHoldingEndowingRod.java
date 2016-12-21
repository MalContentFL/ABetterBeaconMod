package malcontentfl.abetterbeaconmod.gui;

import malcontentfl.abetterbeaconmod.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public class GuiHoldingEndowingRod extends Gui
{
	public GuiHoldingEndowingRod(Minecraft mc)
	{
		ScaledResolution scaled = new ScaledResolution(mc);
		int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		drawCenteredString(mc.fontRendererObj, "Network Energy: " + "", width / 128 + 45, (height - 15), Integer.parseInt("FFAA00", 16));
	}
}
