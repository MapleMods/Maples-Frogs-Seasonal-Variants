package io.github.maplemods.maplesfrogsseasonalvariants;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesfrogsseasonalvariants.data.Constants;
import net.minecraft.world.entity.EntityTypes;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerCategory(Constants.MOD_ID, "spring", "season", 3, 1, 5, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "summer", "season", 6, 1, 8, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "autumn", "season", 9, 1, 11, 30);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "winter", "season", 12, 1, 2, 28);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "autumn", "flannel_frog", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "autumn", "flannel_frog", "*", "flannel_frog");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "autumn", "flannel_frog", "*baby", "flannel_frog");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "autumn", "pumpkin_frog", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "autumn", "pumpkin_frog", "*", "pumpkin_frog");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "autumn", "pumpkin_frog", "*baby", "pumpkin_frog");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "spring", "cherry_blossom_frog", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "spring", "cherry_blossom_frog", "*", "cherry_blossom_frog");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "spring", "cherry_blossom_frog", "*baby", "cherry_blossom_frog");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "spring", "flower_frog", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "spring", "flower_frog", "*", "flower_frog");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "spring", "flower_frog", "*baby", "flower_frog");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "summer", "midsommar_frog", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "summer", "midsommar_frog", "*", "midsommar_frog");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "summer", "midsommar_frog", "*baby", "midsommar_frog");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "summer", "watermelon_frog", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "summer", "watermelon_frog", "*", "watermelon_frog");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "summer", "watermelon_frog", "*baby", "watermelon_frog");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "winter", "frozen_frog", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "winter", "frozen_frog", "*", "frozen_frog");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "winter", "frozen_frog", "*baby", "frozen_frog");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.FROG, "winter", "snow_covered_frog", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "winter", "snow_covered_frog", "*", "snow_covered_frog");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.FROG, "winter", "snow_covered_frog", "*baby", "snow_covered_frog");
    }
}
