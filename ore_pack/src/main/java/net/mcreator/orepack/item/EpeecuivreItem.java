
package net.mcreator.orepack.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.orepack.procedures.ComboranprogdonProcedure;
import net.mcreator.orepack.init.OrePackModItems;

public class EpeecuivreItem extends SwordItem {
	public EpeecuivreItem() {
		super(new Tier() {
			public int getUses() {
				return 175;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrePackModItems.BOULEREPARATION.get()));
			}
		}, 3, -3f, new Item.Properties());
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ComboranprogdonProcedure.execute(entity);
	}
}
