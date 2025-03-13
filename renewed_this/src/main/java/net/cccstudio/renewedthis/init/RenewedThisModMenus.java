
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.cccstudio.renewedthis.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.cccstudio.renewedthis.world.inventory.InfinitychestGUIMenu;
import net.cccstudio.renewedthis.RenewedThisMod;

public class RenewedThisModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, RenewedThisMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<InfinitychestGUIMenu>> INFINITYCHEST_GUI = REGISTRY.register("infinitychest_gui", () -> IMenuTypeExtension.create(InfinitychestGUIMenu::new));
}
