
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.orepack.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OrePackModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

				new ItemStack(OrePackModItems.PEPITEBRONZE.get()), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 17),

					new ItemStack(OrePackModItems.ARMURETITANIUM_CHESTPLATE.get()), 10, 7, 0.1f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(OrePackModItems.ARMURETITANIUM_HELMET.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 9),

					new ItemStack(OrePackModItems.ARMURETITANIUM_BOOTS.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 14),

					new ItemStack(OrePackModItems.ARMURETITANIUM_LEGGINGS.get()), 10, 6, 0.08f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(OrePackModItems.PEPITETITANIUM.get(), 2),

					new ItemStack(Items.EMERALD, 3), 20, 2, 0.02f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7),

					new ItemStack(OrePackModItems.EPEETITANIUM.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(OrePackModItems.EPEECUIVRE.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4),

					new ItemStack(OrePackModItems.EPEENICKEL.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.MASON) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(OrePackModBlocks.ESCALIERMANGANESE.get()),

					new ItemStack(Items.EMERALD, 4), 16, 7, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(OrePackModBlocks.ESCALIERNICKEL.get()),

					new ItemStack(Items.EMERALD, 7), 12, 4, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(OrePackModBlocks.ESCALIERARGENT.get()),

					new ItemStack(Items.EMERALD, 9), 8, 6, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(OrePackModBlocks.ESCALIERBRONZE.get()),

					new ItemStack(Items.EMERALD, 8), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(OrePackModBlocks.ESCALIERTITANIUM.get()),

					new ItemStack(Items.EMERALD, 10), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(OrePackModItems.PEPITE_ARGENT.get()), 10, 5, 0.05f));
		}
	}
}
