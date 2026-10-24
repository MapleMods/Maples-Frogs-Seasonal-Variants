package io.github.maplemods.maplesfrogsseasonalvariants;

import net.fabricmc.api.ClientModInitializer;

public class FabricModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		CommonMod.init();
	}
}
