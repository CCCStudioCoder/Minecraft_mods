
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cccstudio.renewedthis.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.cccstudio.renewedthis.RenewedThisMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class RenewedThisModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RenewedThisMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(RenewedThisModItems.SPAWNERBREAKER.get());
			tabData.accept(RenewedThisModItems.LIFEESSENCERECLAIMER.get());
			tabData.accept(RenewedThisModItems.INFINITYPICKAXE.get());
			tabData.accept(RenewedThisModItems.BEDROCKPICKAXE.get());
			tabData.accept(RenewedThisModItems.BEDROCKHOE.get());
			tabData.accept(RenewedThisModItems.BEDROCKAXE.get());
			tabData.accept(RenewedThisModItems.BEDROCKSHOVEL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(RenewedThisModItems.ZOMBIELIFEESSENCE.get());
			tabData.accept(RenewedThisModItems.SKELETONLIFEESSENCE.get());
			tabData.accept(RenewedThisModItems.ENDERMANLIFEESSENCE.get());
			tabData.accept(RenewedThisModItems.CREEPERLIFEESSENCE.get());
			tabData.accept(RenewedThisModItems.SPIDERLIFEESSENCE.get());
			tabData.accept(RenewedThisModItems.PUREBEDROCKPRODUCT.get());
			tabData.accept(RenewedThisModItems.PUREBEDROCKNUGGET.get());
			tabData.accept(RenewedThisModItems.BEDROCKINGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(RenewedThisModItems.BEDROCKSWORD.get());
			tabData.accept(RenewedThisModItems.BEDROCKARMOR_HELMET.get());
			tabData.accept(RenewedThisModItems.BEDROCKARMOR_CHESTPLATE.get());
			tabData.accept(RenewedThisModItems.BEDROCKARMOR_LEGGINGS.get());
			tabData.accept(RenewedThisModItems.BEDROCKARMOR_BOOTS.get());
			tabData.accept(RenewedThisModItems.ANGELBREATHING.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(RenewedThisModBlocks.INFINITYCHEST.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(RenewedThisModItems.ANGEL_SPAWN_EGG.get());
		}
	}
}
