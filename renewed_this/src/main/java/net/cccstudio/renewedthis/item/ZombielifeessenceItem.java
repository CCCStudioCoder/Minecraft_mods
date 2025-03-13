
package net.cccstudio.renewedthis.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ZombielifeessenceItem extends Item {
	public ZombielifeessenceItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
