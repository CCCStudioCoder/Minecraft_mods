package net.cccstudio.echantmentfantasy.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@EventBusSubscriber
public class WealthEffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource) {
		execute(null, world, damagesource);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource) {
		if (damagesource == null)
			return;
		BlockState pos_block = Blocks.AIR.defaultBlockState();
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double choosed_block = 0;
		if (((damagesource.getEntity()) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("echantment_fantasy:wealth")))) == 1) {
			sx = Mth.nextInt(RandomSource.create(), -3, 3);
			sy = Mth.nextInt(RandomSource.create(), -3, 3);
			sz = Mth.nextInt(RandomSource.create(), -3, 3);
			pos_block = (world.getBlockState(BlockPos.containing((damagesource.getEntity()).getX() + sx, (damagesource.getEntity()).getY() + sy, (damagesource.getEntity()).getZ() + sz)));
			if (pos_block.getBlock() == Blocks.SNOW_BLOCK || pos_block.getBlock() == Blocks.GRAVEL || pos_block.getBlock() == Blocks.GRANITE || pos_block.getBlock() == Blocks.ANDESITE || pos_block.getBlock() == Blocks.DIRT
					|| pos_block.getBlock() == Blocks.GRASS_BLOCK || pos_block.getBlock() == Blocks.DEEPSLATE || pos_block.getBlock() == Blocks.STONE) {
				choosed_block = Mth.nextInt(RandomSource.create(), 1, 15);
				if (choosed_block < 6) {
					{
						BlockPos _bp = BlockPos.containing((damagesource.getEntity()).getX() + sx, (damagesource.getEntity()).getY() + sy, (damagesource.getEntity()).getZ() + sz);
						BlockState _bs = Blocks.COAL_ORE.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Property<?> _propertyOld : _bso.getProperties()) {
							Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
							if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
								try {
									_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				} else {
					if (choosed_block < 10 && choosed_block >= 6) {
						{
							BlockPos _bp = BlockPos.containing((damagesource.getEntity()).getX() + sx, (damagesource.getEntity()).getY() + sy, (damagesource.getEntity()).getZ() + sz);
							BlockState _bs = Blocks.REDSTONE_ORE.defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Property<?> _propertyOld : _bso.getProperties()) {
								Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
								if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
									try {
										_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else {
						if (choosed_block < 12 && choosed_block >= 10) {
							{
								BlockPos _bp = BlockPos.containing((damagesource.getEntity()).getX() + sx, (damagesource.getEntity()).getY() + sy, (damagesource.getEntity()).getZ() + sz);
								BlockState _bs = Blocks.IRON_ORE.defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Property<?> _propertyOld : _bso.getProperties()) {
									Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
									if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
										try {
											_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						} else {
							if (choosed_block == 12) {
								{
									BlockPos _bp = BlockPos.containing((damagesource.getEntity()).getX() + sx, (damagesource.getEntity()).getY() + sy, (damagesource.getEntity()).getZ() + sz);
									BlockState _bs = Blocks.LAPIS_ORE.defaultBlockState();
									BlockState _bso = world.getBlockState(_bp);
									for (Property<?> _propertyOld : _bso.getProperties()) {
										Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
										if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
											try {
												_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
							} else {
								if (choosed_block == 13) {
									{
										BlockPos _bp = BlockPos.containing((damagesource.getEntity()).getX() + sx, (damagesource.getEntity()).getY() + sy, (damagesource.getEntity()).getZ() + sz);
										BlockState _bs = Blocks.GOLD_ORE.defaultBlockState();
										BlockState _bso = world.getBlockState(_bp);
										for (Property<?> _propertyOld : _bso.getProperties()) {
											Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
											if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
												try {
													_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
												} catch (Exception e) {
												}
										}
										world.setBlock(_bp, _bs, 3);
									}
								} else {
									if (choosed_block == 14) {
										{
											BlockPos _bp = BlockPos.containing((damagesource.getEntity()).getX() + sx, (damagesource.getEntity()).getY() + sy, (damagesource.getEntity()).getZ() + sz);
											BlockState _bs = Blocks.EMERALD_ORE.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Property<?> _propertyOld : _bso.getProperties()) {
												Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
												if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
													try {
														_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									} else {
										if (choosed_block == 15) {
											if (sz % 2 == 0) {
												{
													BlockPos _bp = BlockPos.containing((damagesource.getEntity()).getX() + sx, (damagesource.getEntity()).getY() + sy, (damagesource.getEntity()).getZ() + sz);
													BlockState _bs = Blocks.DIAMOND_ORE.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Property<?> _propertyOld : _bso.getProperties()) {
														Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
														if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
															try {
																_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
