
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cccstudio.renewedthis.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.cccstudio.renewedthis.entity.AngelEntity;
import net.cccstudio.renewedthis.entity.AngelBreathEntity;
import net.cccstudio.renewedthis.RenewedThisMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class RenewedThisModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, RenewedThisMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<AngelEntity>> ANGEL = register("angel",
			EntityType.Builder.<AngelEntity>of(AngelEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngelBreathEntity>> ANGEL_BREATH = register("angel_breath",
			EntityType.Builder.<AngelBreathEntity>of(AngelBreathEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(1f, 1f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		AngelEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ANGEL.get(), AngelEntity.createAttributes().build());
	}
}
