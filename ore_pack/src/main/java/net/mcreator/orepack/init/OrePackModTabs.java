
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orepack.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.orepack.OrePackMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OrePackModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OrePackMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(OrePackModItems.PEPITEDEMANGANESE.get());
			tabData.accept(OrePackModItems.MANGANESENBRUT.get());
			tabData.accept(OrePackModItems.NICKELBRUT.get());
			tabData.accept(OrePackModItems.PEPITENICKEL.get());
			tabData.accept(OrePackModItems.TITANIUMBRUT.get());
			tabData.accept(OrePackModItems.PEPITETITANIUM.get());
			tabData.accept(OrePackModItems.BRONZEBRUT.get());
			tabData.accept(OrePackModItems.PEPITEBRONZE.get());
			tabData.accept(OrePackModItems.ARGENTBRUT.get());
			tabData.accept(OrePackModItems.PEPITE_ARGENT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(OrePackModBlocks.MANGANESE.get().asItem());
			tabData.accept(OrePackModBlocks.BLOCMANGANESE.get().asItem());
			tabData.accept(OrePackModBlocks.NICKEL.get().asItem());
			tabData.accept(OrePackModBlocks.BLOCNICKEL.get().asItem());
			tabData.accept(OrePackModBlocks.TITANIUM.get().asItem());
			tabData.accept(OrePackModBlocks.BRONZE.get().asItem());
			tabData.accept(OrePackModBlocks.BLOCBRONZE.get().asItem());
			tabData.accept(OrePackModBlocks.ARGENT.get().asItem());
			tabData.accept(OrePackModBlocks.BLOCTITANIUM.get().asItem());
			tabData.accept(OrePackModBlocks.BLOCARGENT.get().asItem());
			tabData.accept(OrePackModBlocks.ESCALIERMANGANESE.get().asItem());
			tabData.accept(OrePackModBlocks.ESCALIERNICKEL.get().asItem());
			tabData.accept(OrePackModBlocks.ESCALIERBRONZE.get().asItem());
			tabData.accept(OrePackModBlocks.ESCALIERARGENT.get().asItem());
			tabData.accept(OrePackModBlocks.ESCALIERTITANIUM.get().asItem());
			tabData.accept(OrePackModBlocks.DALLEMANGANESE.get().asItem());
			tabData.accept(OrePackModBlocks.DALLEBRONZE.get().asItem());
			tabData.accept(OrePackModBlocks.DALLEARGENT.get().asItem());
			tabData.accept(OrePackModBlocks.DALLETITANIUM.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(OrePackModItems.BOULEREPARATION.get());
			tabData.accept(OrePackModItems.PIOCHELAPIS.get());
			tabData.accept(OrePackModItems.HACHELAPIS.get());
			tabData.accept(OrePackModItems.HOUXLAPIS.get());
			tabData.accept(OrePackModItems.PELLELAPIS.get());
			tabData.accept(OrePackModItems.PIOCHENICKEL.get());
			tabData.accept(OrePackModItems.HACHENICKEL.get());
			tabData.accept(OrePackModItems.HOUXNICKEL.get());
			tabData.accept(OrePackModItems.PELLENICKEL.get());
			tabData.accept(OrePackModItems.PIOCHECUIVRE.get());
			tabData.accept(OrePackModItems.HACHECUIVRE.get());
			tabData.accept(OrePackModItems.PELLECUIVRE.get());
			tabData.accept(OrePackModItems.PIOCHEBRONZE.get());
			tabData.accept(OrePackModItems.PELLEBRONZE.get());
			tabData.accept(OrePackModItems.PIOCHETITANIUM.get());
			tabData.accept(OrePackModItems.HACHETITANIUM.get());
			tabData.accept(OrePackModItems.PELLETITANIUM.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(OrePackModItems.ARMURETITANIUM_HELMET.get());
			tabData.accept(OrePackModItems.ARMURETITANIUM_CHESTPLATE.get());
			tabData.accept(OrePackModItems.ARMURETITANIUM_LEGGINGS.get());
			tabData.accept(OrePackModItems.ARMURETITANIUM_BOOTS.get());
			tabData.accept(OrePackModItems.EPEELAPIS.get());
			tabData.accept(OrePackModItems.EPEENICKEL.get());
			tabData.accept(OrePackModItems.EPEECUIVRE.get());
			tabData.accept(OrePackModItems.EPEEBRONZE.get());
			tabData.accept(OrePackModItems.EPEETITANIUM.get());
		}
	}
}
