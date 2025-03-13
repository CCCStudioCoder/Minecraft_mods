
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cccstudio.renewedthis.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.cccstudio.renewedthis.block.InifnitychestBlock;
import net.cccstudio.renewedthis.RenewedThisMod;

public class RenewedThisModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RenewedThisMod.MODID);
	public static final DeferredBlock<Block> INFINITYCHEST = REGISTRY.register("infinitychest", InifnitychestBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
