
package net.mcreator.orepack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BronzebrutItem extends Item {
	public BronzebrutItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
