package net.cccstudio.echantmentfantasy.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@EventBusSubscriber
public class LifeThiefEffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, double amount) {
		execute(null, world, damagesource, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, double amount) {
		if (damagesource == null)
			return;
		if (((damagesource.getEntity()) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("echantment_fantasy:life_thief")))) >= 1) {
			if ((damagesource.getEntity()) instanceof LivingEntity _entity)
				_entity.setHealth(
						Math.round(((damagesource.getEntity()) instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + amount / (5 - ((damagesource.getEntity()) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("echantment_fantasy:life_thief")))))));
		}
	}
}
