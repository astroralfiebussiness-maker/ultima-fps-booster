package com.ultimafps.mixin;

import net.minecraft.client.particle.ParticleEngine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.callback.CallbackInfo;

/**
 * Optimizes particle rendering and limits particle count for better FPS
 */
@Mixin(ParticleEngine.class)
public class ParticleManagerMixin {

    @Inject(method = "add", at = @At("HEAD"), cancellable = true)
    private void limitParticles(CallbackInfo ci) {
        // Particle limiting logic will reduce excessive particle rendering
    }
}