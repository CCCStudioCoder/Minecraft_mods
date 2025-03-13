
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cccstudio.renewedthis.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.cccstudio.renewedthis.client.renderer.AngelRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RenewedThisModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RenewedThisModEntities.ANGEL.get(), AngelRenderer::new);
		event.registerEntityRenderer(RenewedThisModEntities.ANGEL_BREATH.get(), ThrownItemRenderer::new);
	}
}
