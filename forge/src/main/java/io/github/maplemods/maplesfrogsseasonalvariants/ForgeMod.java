package io.github.maplemods.maplesfrogsseasonalvariants;

import io.github.maplemods.maplesfrogsseasonalvariants.data.Constants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ForgeMod {

    public ForgeMod(FMLJavaModLoadingContext modLoadingContext) {
        CommonMod.init();
    }
}