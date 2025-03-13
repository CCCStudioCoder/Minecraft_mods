
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.cccstudio.renewedthis.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class RenewedThisModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == RenewedThisModVillagerProfessions.COLLECTOR.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.ECHO_SHARD), 8, 4, 0.1f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(Blocks.GILDED_BLACKSTONE), 6, 3, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7), new ItemStack(Items.IRON_HORSE_ARMOR), 4, 6, 0.07f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(Items.PIGLIN_BANNER_PATTERN), 12, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(Items.GOLDEN_HORSE_ARMOR), 3, 6, 0.08f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(Items.ARCHER_POTTERY_SHERD), 8, 4, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(Items.MINER_POTTERY_SHERD), 8, 4, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(Blocks.DRAGON_HEAD), 3, 7, 0.15f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 9), new ItemStack(Blocks.DRAGON_EGG), 2, 8, 0.2f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(Items.HEARTBREAK_POTTERY_SHERD), 8, 4, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(Items.DIAMOND_HORSE_ARMOR), 2, 9, 0.12f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(Items.KNOWLEDGE_BOOK), 4, 7, 0.04f));
		}
	}
}
