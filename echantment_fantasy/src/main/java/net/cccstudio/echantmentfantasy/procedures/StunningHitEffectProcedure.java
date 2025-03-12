package net.cccstudio.echantmentfantasy.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.cccstudio.echantmentfantasy.network.EchantmentFantasyModVariables;
import net.cccstudio.echantmentfantasy.EchantmentFantasyMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class StunningHitEffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity) {
		execute(null, world, damagesource, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		if (((damagesource.getEntity()) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("echantment_fantasy:stunning_hit")))) > 0) {
			{
				EchantmentFantasyModVariables.PlayerVariables _vars = entity.getData(EchantmentFantasyModVariables.PLAYER_VARIABLES);
				_vars.default_attack_stunning = entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity3.getAttribute(Attributes.ATTACK_DAMAGE).getValue() : 0;
				_vars.syncPlayerVariables(entity);
			}
			{
				EchantmentFantasyModVariables.PlayerVariables _vars = entity.getData(EchantmentFantasyModVariables.PLAYER_VARIABLES);
				_vars.default_speed_stunning = entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity4.getAttribute(Attributes.MOVEMENT_SPEED).getValue() : 0;
				_vars.syncPlayerVariables(entity);
			}
			if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity5.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(0);
			if (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
				_livingEntity6.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0);
			EchantmentFantasyMod.queueServerWork((int) (4 * ((damagesource.getEntity()) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("echantment_fantasy:stunning_hit"))))), () -> {
						if (entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
							_livingEntity10.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(entity.getData(EchantmentFantasyModVariables.PLAYER_VARIABLES).default_attack_stunning);
						if (entity instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
							_livingEntity11.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(entity.getData(EchantmentFantasyModVariables.PLAYER_VARIABLES).default_speed_stunning);
					});
		}
	}
}
