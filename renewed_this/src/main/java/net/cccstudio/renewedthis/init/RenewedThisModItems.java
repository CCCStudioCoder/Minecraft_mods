
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cccstudio.renewedthis.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.cccstudio.renewedthis.item.ZombielifeessenceItem;
import net.cccstudio.renewedthis.item.SpiderlifeessenceItem;
import net.cccstudio.renewedthis.item.SpawnerbreakerItem;
import net.cccstudio.renewedthis.item.SkeletonlifeessenceItem;
import net.cccstudio.renewedthis.item.PurebedrockproductItem;
import net.cccstudio.renewedthis.item.PurebedrocknuggetItem;
import net.cccstudio.renewedthis.item.LifeessencereclaimerItem;
import net.cccstudio.renewedthis.item.InfinitypickaxeItem;
import net.cccstudio.renewedthis.item.EndermanlifeessenceItem;
import net.cccstudio.renewedthis.item.CreeperlifeessenceItem;
import net.cccstudio.renewedthis.item.BedrockswordItem;
import net.cccstudio.renewedthis.item.BedrockshovelItem;
import net.cccstudio.renewedthis.item.BedrockpickaxeItem;
import net.cccstudio.renewedthis.item.BedrockingotItem;
import net.cccstudio.renewedthis.item.BedrockhoeItem;
import net.cccstudio.renewedthis.item.BedrockaxeItem;
import net.cccstudio.renewedthis.item.BedrockarmorItem;
import net.cccstudio.renewedthis.item.AngelbreathingItem;
import net.cccstudio.renewedthis.RenewedThisMod;

public class RenewedThisModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RenewedThisMod.MODID);
	public static final DeferredItem<Item> SPAWNERBREAKER = REGISTRY.register("spawnerbreaker", SpawnerbreakerItem::new);
	public static final DeferredItem<Item> ZOMBIELIFEESSENCE = REGISTRY.register("zombielifeessence", ZombielifeessenceItem::new);
	public static final DeferredItem<Item> LIFEESSENCERECLAIMER = REGISTRY.register("lifeessencereclaimer", LifeessencereclaimerItem::new);
	public static final DeferredItem<Item> SKELETONLIFEESSENCE = REGISTRY.register("skeletonlifeessence", SkeletonlifeessenceItem::new);
	public static final DeferredItem<Item> ENDERMANLIFEESSENCE = REGISTRY.register("endermanlifeessence", EndermanlifeessenceItem::new);
	public static final DeferredItem<Item> CREEPERLIFEESSENCE = REGISTRY.register("creeperlifeessence", CreeperlifeessenceItem::new);
	public static final DeferredItem<Item> SPIDERLIFEESSENCE = REGISTRY.register("spiderlifeessence", SpiderlifeessenceItem::new);
	public static final DeferredItem<Item> INFINITYPICKAXE = REGISTRY.register("infinitypickaxe", InfinitypickaxeItem::new);
	public static final DeferredItem<Item> PUREBEDROCKPRODUCT = REGISTRY.register("purebedrockproduct", PurebedrockproductItem::new);
	public static final DeferredItem<Item> PUREBEDROCKNUGGET = REGISTRY.register("purebedrocknugget", PurebedrocknuggetItem::new);
	public static final DeferredItem<Item> BEDROCKINGOT = REGISTRY.register("bedrockingot", BedrockingotItem::new);
	public static final DeferredItem<Item> BEDROCKSWORD = REGISTRY.register("bedrocksword", BedrockswordItem::new);
	public static final DeferredItem<Item> BEDROCKPICKAXE = REGISTRY.register("bedrockpickaxe", BedrockpickaxeItem::new);
	public static final DeferredItem<Item> BEDROCKHOE = REGISTRY.register("bedrockhoe", BedrockhoeItem::new);
	public static final DeferredItem<Item> BEDROCKAXE = REGISTRY.register("bedrockaxe", BedrockaxeItem::new);
	public static final DeferredItem<Item> BEDROCKSHOVEL = REGISTRY.register("bedrockshovel", BedrockshovelItem::new);
	public static final DeferredItem<Item> BEDROCKARMOR_HELMET = REGISTRY.register("bedrockarmor_helmet", BedrockarmorItem.Helmet::new);
	public static final DeferredItem<Item> BEDROCKARMOR_CHESTPLATE = REGISTRY.register("bedrockarmor_chestplate", BedrockarmorItem.Chestplate::new);
	public static final DeferredItem<Item> BEDROCKARMOR_LEGGINGS = REGISTRY.register("bedrockarmor_leggings", BedrockarmorItem.Leggings::new);
	public static final DeferredItem<Item> BEDROCKARMOR_BOOTS = REGISTRY.register("bedrockarmor_boots", BedrockarmorItem.Boots::new);
	public static final DeferredItem<Item> INFINITYCHEST = block(RenewedThisModBlocks.INFINITYCHEST);
	public static final DeferredItem<Item> ANGEL_SPAWN_EGG = REGISTRY.register("angel_spawn_egg", () -> new DeferredSpawnEggItem(RenewedThisModEntities.ANGEL, -6750055, -103, new Item.Properties()));
	public static final DeferredItem<Item> ANGELBREATHING = REGISTRY.register("angelbreathing", AngelbreathingItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
