
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.cccstudio.renewedthis.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.cccstudio.renewedthis.client.gui.InfinitychestGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RenewedThisModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RenewedThisModMenus.INFINITYCHEST_GUI.get(), InfinitychestGUIScreen::new);
	}
}
