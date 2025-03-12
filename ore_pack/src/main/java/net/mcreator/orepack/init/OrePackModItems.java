
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orepack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.orepack.item.TitaniumbrutItem;
import net.mcreator.orepack.item.PiochetitaniumItem;
import net.mcreator.orepack.item.PiochenickelItem;
import net.mcreator.orepack.item.PiochelapisItem;
import net.mcreator.orepack.item.PiochecuivreItem;
import net.mcreator.orepack.item.PiochebronzeItem;
import net.mcreator.orepack.item.PepitetitaniumItem;
import net.mcreator.orepack.item.PepitenickelItem;
import net.mcreator.orepack.item.PepitedemanganeseItem;
import net.mcreator.orepack.item.PepitebronzeItem;
import net.mcreator.orepack.item.PepiteArgentItem;
import net.mcreator.orepack.item.PelletitaniumItem;
import net.mcreator.orepack.item.PellenickelItem;
import net.mcreator.orepack.item.PellelapisItem;
import net.mcreator.orepack.item.PellecuivreItem;
import net.mcreator.orepack.item.PellebronzeItem;
import net.mcreator.orepack.item.NickelbrutItem;
import net.mcreator.orepack.item.ManganesenbrutItem;
import net.mcreator.orepack.item.HouxnickelItem;
import net.mcreator.orepack.item.HouxlapisItem;
import net.mcreator.orepack.item.HachetitaniumItem;
import net.mcreator.orepack.item.HachenickelItem;
import net.mcreator.orepack.item.HachelapisItem;
import net.mcreator.orepack.item.HachecuivreItem;
import net.mcreator.orepack.item.EpeetitaniumItem;
import net.mcreator.orepack.item.EpeenickelItem;
import net.mcreator.orepack.item.EpeelapisItem;
import net.mcreator.orepack.item.EpeecuivreItem;
import net.mcreator.orepack.item.EpeebronzeItem;
import net.mcreator.orepack.item.BronzebrutItem;
import net.mcreator.orepack.item.BoulereparationItem;
import net.mcreator.orepack.item.ArmuretitaniumItem;
import net.mcreator.orepack.item.ArgentbrutItem;
import net.mcreator.orepack.OrePackMod;

public class OrePackModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OrePackMod.MODID);
	public static final RegistryObject<Item> PEPITEDEMANGANESE = REGISTRY.register("pepitedemanganese", () -> new PepitedemanganeseItem());
	public static final RegistryObject<Item> MANGANESE = block(OrePackModBlocks.MANGANESE);
	public static final RegistryObject<Item> MANGANESENBRUT = REGISTRY.register("manganesenbrut", () -> new ManganesenbrutItem());
	public static final RegistryObject<Item> BLOCMANGANESE = block(OrePackModBlocks.BLOCMANGANESE);
	public static final RegistryObject<Item> NICKELBRUT = REGISTRY.register("nickelbrut", () -> new NickelbrutItem());
	public static final RegistryObject<Item> NICKEL = block(OrePackModBlocks.NICKEL);
	public static final RegistryObject<Item> PEPITENICKEL = REGISTRY.register("pepitenickel", () -> new PepitenickelItem());
	public static final RegistryObject<Item> BLOCNICKEL = block(OrePackModBlocks.BLOCNICKEL);
	public static final RegistryObject<Item> BOULEREPARATION = REGISTRY.register("boulereparation", () -> new BoulereparationItem());
	public static final RegistryObject<Item> TITANIUM = block(OrePackModBlocks.TITANIUM);
	public static final RegistryObject<Item> TITANIUMBRUT = REGISTRY.register("titaniumbrut", () -> new TitaniumbrutItem());
	public static final RegistryObject<Item> PEPITETITANIUM = REGISTRY.register("pepitetitanium", () -> new PepitetitaniumItem());
	public static final RegistryObject<Item> ARMURETITANIUM_HELMET = REGISTRY.register("armuretitanium_helmet", () -> new ArmuretitaniumItem.Helmet());
	public static final RegistryObject<Item> ARMURETITANIUM_CHESTPLATE = REGISTRY.register("armuretitanium_chestplate", () -> new ArmuretitaniumItem.Chestplate());
	public static final RegistryObject<Item> ARMURETITANIUM_LEGGINGS = REGISTRY.register("armuretitanium_leggings", () -> new ArmuretitaniumItem.Leggings());
	public static final RegistryObject<Item> ARMURETITANIUM_BOOTS = REGISTRY.register("armuretitanium_boots", () -> new ArmuretitaniumItem.Boots());
	public static final RegistryObject<Item> BRONZEBRUT = REGISTRY.register("bronzebrut", () -> new BronzebrutItem());
	public static final RegistryObject<Item> BRONZE = block(OrePackModBlocks.BRONZE);
	public static final RegistryObject<Item> BLOCBRONZE = block(OrePackModBlocks.BLOCBRONZE);
	public static final RegistryObject<Item> PEPITEBRONZE = REGISTRY.register("pepitebronze", () -> new PepitebronzeItem());
	public static final RegistryObject<Item> ARGENTBRUT = REGISTRY.register("argentbrut", () -> new ArgentbrutItem());
	public static final RegistryObject<Item> ARGENT = block(OrePackModBlocks.ARGENT);
	public static final RegistryObject<Item> PEPITE_ARGENT = REGISTRY.register("pepite_argent", () -> new PepiteArgentItem());
	public static final RegistryObject<Item> BLOCTITANIUM = block(OrePackModBlocks.BLOCTITANIUM);
	public static final RegistryObject<Item> BLOCARGENT = block(OrePackModBlocks.BLOCARGENT);
	public static final RegistryObject<Item> ESCALIERMANGANESE = block(OrePackModBlocks.ESCALIERMANGANESE);
	public static final RegistryObject<Item> ESCALIERNICKEL = block(OrePackModBlocks.ESCALIERNICKEL);
	public static final RegistryObject<Item> ESCALIERBRONZE = block(OrePackModBlocks.ESCALIERBRONZE);
	public static final RegistryObject<Item> ESCALIERARGENT = block(OrePackModBlocks.ESCALIERARGENT);
	public static final RegistryObject<Item> ESCALIERTITANIUM = block(OrePackModBlocks.ESCALIERTITANIUM);
	public static final RegistryObject<Item> DALLEMANGANESE = block(OrePackModBlocks.DALLEMANGANESE);
	public static final RegistryObject<Item> DALLENICKEL = block(OrePackModBlocks.DALLENICKEL);
	public static final RegistryObject<Item> DALLEBRONZE = block(OrePackModBlocks.DALLEBRONZE);
	public static final RegistryObject<Item> DALLEARGENT = block(OrePackModBlocks.DALLEARGENT);
	public static final RegistryObject<Item> DALLETITANIUM = block(OrePackModBlocks.DALLETITANIUM);
	public static final RegistryObject<Item> PIOCHELAPIS = REGISTRY.register("piochelapis", () -> new PiochelapisItem());
	public static final RegistryObject<Item> EPEELAPIS = REGISTRY.register("epeelapis", () -> new EpeelapisItem());
	public static final RegistryObject<Item> HACHELAPIS = REGISTRY.register("hachelapis", () -> new HachelapisItem());
	public static final RegistryObject<Item> HOUXLAPIS = REGISTRY.register("houxlapis", () -> new HouxlapisItem());
	public static final RegistryObject<Item> PELLELAPIS = REGISTRY.register("pellelapis", () -> new PellelapisItem());
	public static final RegistryObject<Item> EPEENICKEL = REGISTRY.register("epeenickel", () -> new EpeenickelItem());
	public static final RegistryObject<Item> PIOCHENICKEL = REGISTRY.register("piochenickel", () -> new PiochenickelItem());
	public static final RegistryObject<Item> HACHENICKEL = REGISTRY.register("hachenickel", () -> new HachenickelItem());
	public static final RegistryObject<Item> HOUXNICKEL = REGISTRY.register("houxnickel", () -> new HouxnickelItem());
	public static final RegistryObject<Item> PELLENICKEL = REGISTRY.register("pellenickel", () -> new PellenickelItem());
	public static final RegistryObject<Item> EPEECUIVRE = REGISTRY.register("epeecuivre", () -> new EpeecuivreItem());
	public static final RegistryObject<Item> PIOCHECUIVRE = REGISTRY.register("piochecuivre", () -> new PiochecuivreItem());
	public static final RegistryObject<Item> HACHECUIVRE = REGISTRY.register("hachecuivre", () -> new HachecuivreItem());
	public static final RegistryObject<Item> PELLECUIVRE = REGISTRY.register("pellecuivre", () -> new PellecuivreItem());
	public static final RegistryObject<Item> EPEEBRONZE = REGISTRY.register("epeebronze", () -> new EpeebronzeItem());
	public static final RegistryObject<Item> PIOCHEBRONZE = REGISTRY.register("piochebronze", () -> new PiochebronzeItem());
	public static final RegistryObject<Item> PELLEBRONZE = REGISTRY.register("pellebronze", () -> new PellebronzeItem());
	public static final RegistryObject<Item> EPEETITANIUM = REGISTRY.register("epeetitanium", () -> new EpeetitaniumItem());
	public static final RegistryObject<Item> PIOCHETITANIUM = REGISTRY.register("piochetitanium", () -> new PiochetitaniumItem());
	public static final RegistryObject<Item> HACHETITANIUM = REGISTRY.register("hachetitanium", () -> new HachetitaniumItem());
	public static final RegistryObject<Item> PELLETITANIUM = REGISTRY.register("pelletitanium", () -> new PelletitaniumItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
