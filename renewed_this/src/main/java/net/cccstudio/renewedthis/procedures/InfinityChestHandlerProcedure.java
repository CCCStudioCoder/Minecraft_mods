package net.cccstudio.renewedthis.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.cccstudio.renewedthis.init.RenewedThisModItems;

import java.util.function.Supplier;
import java.util.Map;

public class InfinityChestHandlerProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double Item_value = 0;
		double Floating_item_value = 0;
		double i = 0;
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList()
					.broadcastSystemMessage(Component.literal(
							("start diffusing :" + ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getCount()))),
							false);
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getCount() > 0) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == RenewedThisModItems.BEDROCKINGOT
					.get()) {
				Item_value = 30;
			} else {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_INGOT) {
					Item_value = 25;
				} else {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND) {
						Item_value = 20;
					} else {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
							Item_value = 17;
						} else {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.GOLD_INGOT) {
								Item_value = 14;
							} else {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
									Item_value = 12;
								} else {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
											.getItem() == Items.COPPER_INGOT) {
										Item_value = 8;
									} else {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
												.getItem() == Items.COAL) {
											Item_value = 7;
										}
									}
								}
							}
						}
					}
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getCount() == 0)) {
				Item_value = Item_value + Mth.nextInt(RandomSource.create(), -5, 5);
				i = 0;
				for (int index0 = 0; index0 < 3; index0++) {
					if (!(i == 3)) {
						i = i + 1;
						Floating_item_value = Item_value * (Mth.nextInt(RandomSource.create(), 60, 100) / 100);
						Item_value = Item_value - Floating_item_value;
					}
					if (Item_value > 30 && Item_value < 100) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(Blocks.COMMAND_BLOCK).copy();
							_setstack.setCount(1);
							((Slot) _slots.get((int) i)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					} else {
						if (Item_value > 27 && Item_value < 31) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = new ItemStack(RenewedThisModItems.BEDROCKINGOT.get()).copy();
								_setstack.setCount(1);
								((Slot) _slots.get((int) i)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else {
							if (Item_value > 24 && Item_value < 28) {
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack _setstack = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE).copy();
									_setstack.setCount(1);
									((Slot) _slots.get((int) i)).set(_setstack);
									_player.containerMenu.broadcastChanges();
								}
							} else {
								if (Item_value > 23 && Item_value < 25) {
									if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
										ItemStack _setstack = new ItemStack(Blocks.BARRIER).copy();
										_setstack.setCount(1);
										((Slot) _slots.get((int) i)).set(_setstack);
										_player.containerMenu.broadcastChanges();
									}
								} else {
									if (Item_value > 22 && Item_value < 24) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack _setstack = new ItemStack(Items.NETHERITE_INGOT).copy();
											_setstack.setCount(1);
											((Slot) _slots.get((int) i)).set(_setstack);
											_player.containerMenu.broadcastChanges();
										}
									} else {
										if (Item_value > 21 && Item_value < 23) {
											if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
												ItemStack _setstack = new ItemStack(Items.DISC_FRAGMENT_5).copy();
												_setstack.setCount(1);
												((Slot) _slots.get((int) i)).set(_setstack);
												_player.containerMenu.broadcastChanges();
											}
										} else {
											if (Item_value > 20 && Item_value < 22) {
												if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
													ItemStack _setstack = new ItemStack(Items.MUSIC_DISC_OTHERSIDE).copy();
													_setstack.setCount(1);
													((Slot) _slots.get((int) i)).set(_setstack);
													_player.containerMenu.broadcastChanges();
												}
											} else {
												if (Item_value > 19 && Item_value < 21) {
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														ItemStack _setstack = new ItemStack(Items.MUSIC_DISC_PIGSTEP).copy();
														_setstack.setCount(1);
														((Slot) _slots.get((int) i)).set(_setstack);
														_player.containerMenu.broadcastChanges();
													}
												} else {
													if (Item_value > 18 && Item_value < 20) {
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															ItemStack _setstack = new ItemStack(Items.MUSIC_DISC_RELIC).copy();
															_setstack.setCount(1);
															((Slot) _slots.get((int) i)).set(_setstack);
															_player.containerMenu.broadcastChanges();
														}
													} else {
														if (Item_value > 17 && Item_value < 19) {
															if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																ItemStack _setstack = new ItemStack(Items.ENCHANTED_BOOK).copy();
																_setstack.setCount(1);
																((Slot) _slots.get((int) i)).set(_setstack);
																_player.containerMenu.broadcastChanges();
															}
															(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) i)).getItem() : ItemStack.EMPTY)
																	.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.EFFICIENCY), 5);
														} else {
															if (Item_value > 16 && Item_value < 18) {
																if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																	ItemStack _setstack = new ItemStack(Items.ENCHANTED_BOOK).copy();
																	_setstack.setCount(1);
																	((Slot) _slots.get((int) i)).set(_setstack);
																	_player.containerMenu.broadcastChanges();
																}
																(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																		? ((Slot) _slt.get((int) i)).getItem()
																		: ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SHARPNESS), 5);
															} else {
																if (Item_value > 15 && Item_value < 17) {
																	if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																		ItemStack _setstack = new ItemStack(Items.ENCHANTED_BOOK).copy();
																		_setstack.setCount(1);
																		((Slot) _slots.get((int) i)).set(_setstack);
																		_player.containerMenu.broadcastChanges();
																	}
																	(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get((int) i)).getItem()
																			: ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.THORNS), Mth.nextInt(RandomSource.create(), 1, 3));
																} else {
																	if (Item_value > 14 && Item_value < 16) {
																		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																			ItemStack _setstack = new ItemStack(Items.ENCHANTED_BOOK).copy();
																			_setstack.setCount(1);
																			((Slot) _slots.get((int) i)).set(_setstack);
																			_player.containerMenu.broadcastChanges();
																		}
																		(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																				? ((Slot) _slt.get((int) i)).getItem()
																				: ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MENDING), 1);
																	} else {
																		if (Item_value > 13 && Item_value < 15) {
																			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																				ItemStack _setstack = new ItemStack(Items.HEART_OF_THE_SEA).copy();
																				_setstack.setCount(1);
																				((Slot) _slots.get((int) i)).set(_setstack);
																				_player.containerMenu.broadcastChanges();
																			}
																		} else {
																			if (Item_value > 12 && Item_value < 14) {
																				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																					ItemStack _setstack = new ItemStack(Items.ENCHANTED_BOOK).copy();
																					_setstack.setCount(1);
																					((Slot) _slots.get((int) i)).set(_setstack);
																					_player.containerMenu.broadcastChanges();
																				}
																				(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																						? ((Slot) _slt.get((int) i)).getItem()
																						: ItemStack.EMPTY).enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.BINDING_CURSE), 1);
																			} else {
																				if (Item_value > 11 && Item_value < 13) {
																					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																						ItemStack _setstack = new ItemStack(Items.ENCHANTED_BOOK).copy();
																						_setstack.setCount(1);
																						((Slot) _slots.get((int) i)).set(_setstack);
																						_player.containerMenu.broadcastChanges();
																					}
																					(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																							? ((Slot) _slt.get((int) i)).getItem()
																							: ItemStack.EMPTY)
																							.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FROST_WALKER), Mth.nextInt(RandomSource.create(), 1, 2));
																				} else {
																					if (Item_value > 10 && Item_value < 12) {
																						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																							ItemStack _setstack = new ItemStack(Items.ECHO_SHARD).copy();
																							_setstack.setCount(1);
																							((Slot) _slots.get((int) i)).set(_setstack);
																							_player.containerMenu.broadcastChanges();
																						}
																					} else {
																						if (Item_value > 9 && Item_value < 11) {
																							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																								ItemStack _setstack = new ItemStack(Blocks.SPONGE).copy();
																								_setstack.setCount(1);
																								((Slot) _slots.get((int) i)).set(_setstack);
																								_player.containerMenu.broadcastChanges();
																							}
																						} else {
																							if (Item_value > 7 && Item_value < 10) {
																								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																									ItemStack _setstack = new ItemStack(Blocks.CALCITE).copy();
																									_setstack.setCount(1);
																									((Slot) _slots.get((int) i)).set(_setstack);
																									_player.containerMenu.broadcastChanges();
																								}
																							} else {
																								if (Item_value > 6 && Item_value < 8) {
																									if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																										ItemStack _setstack = new ItemStack(Blocks.DEEPSLATE).copy();
																										_setstack.setCount(1);
																										((Slot) _slots.get((int) i)).set(_setstack);
																										_player.containerMenu.broadcastChanges();
																									}
																								} else {
																									if (Item_value > 5 && Item_value < 7) {
																										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																											ItemStack _setstack = new ItemStack(Blocks.COBBLED_DEEPSLATE).copy();
																											_setstack.setCount(1);
																											((Slot) _slots.get((int) i)).set(_setstack);
																											_player.containerMenu.broadcastChanges();
																										}
																									} else {
																										if (Item_value > 3 && Item_value < 6) {
																											if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																												ItemStack _setstack = new ItemStack(Blocks.TUFF).copy();
																												_setstack.setCount(1);
																												((Slot) _slots.get((int) i)).set(_setstack);
																												_player.containerMenu.broadcastChanges();
																											}
																										} else {
																											if (Item_value > 0 && Item_value < 4) {
																												if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																													ItemStack _setstack = new ItemStack(Blocks.NETHERRACK).copy();
																													_setstack.setCount(1);
																													((Slot) _slots.get((int) i)).set(_setstack);
																													_player.containerMenu.broadcastChanges();
																												}
																											} else {
																												if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																													ItemStack _setstack = new ItemStack(Blocks.DIRT).copy();
																													_setstack.setCount(1);
																													((Slot) _slots.get((int) i)).set(_setstack);
																													_player.containerMenu.broadcastChanges();
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
		}
	}
}
