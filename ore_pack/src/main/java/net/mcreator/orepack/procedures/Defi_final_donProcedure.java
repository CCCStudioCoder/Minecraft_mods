package net.mcreator.orepack.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.orepack.network.OrePackModVariables;
import net.mcreator.orepack.init.OrePackModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Defi_final_donProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == OrePackModBlocks.TITANIUM.get()) {
			{
				double _setval = (entity.getCapability(OrePackModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OrePackModVariables.PlayerVariables())).Titanium_trouves + 1;
				entity.getCapability(OrePackModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Titanium_trouves = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(OrePackModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OrePackModVariables.PlayerVariables())).Titanium_trouves == 20) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ore_pack:mineuragueri"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
	}
}
