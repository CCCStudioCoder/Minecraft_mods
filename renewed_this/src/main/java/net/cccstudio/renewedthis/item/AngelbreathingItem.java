
package net.cccstudio.renewedthis.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class AngelbreathingItem extends Item {
	public AngelbreathingItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(0).saturationModifier(15f).build()));
	}
}
