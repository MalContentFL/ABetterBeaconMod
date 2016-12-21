package malcontentfl.abetterbeaconmod.handlers;

import malcontentfl.abetterbeaconmod.gui.GuiHoldingEndowingRod;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderGuiHandler
{
	@SubscribeEvent
	public void onRenderGui(RenderGameOverlayEvent.Post event)
	{
		if (event.getType() != ElementType.EXPERIENCE) return;
		new GuiHoldingEndowingRod(Minecraft.getMinecraft());
	}
	
	@SubscribeEvent
	public void onHoldEndowingRod(RenderGameOverlayEvent.Post event)
	{
		if ()/* player is holding endowing rod*/
		new GuiHoldingEndowingRod(Minecraft.getMinecraft());
	}
}
