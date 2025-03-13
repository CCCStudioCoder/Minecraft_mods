
package net.cccstudio.renewedthis.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SkeletonlifeessenceItem extends Item {
	public SkeletonlifeessenceItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
