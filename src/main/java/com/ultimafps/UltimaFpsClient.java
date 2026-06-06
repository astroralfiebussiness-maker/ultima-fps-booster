package com.ultimafps;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class UltimaFpsClient implements ClientModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger(UltimaFpsBootstrap.MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Ultima FPS Booster Client initialized - Optimization systems active");
    }
}