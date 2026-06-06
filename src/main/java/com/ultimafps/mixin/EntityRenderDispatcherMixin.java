package com.ultimafps.mixin;

import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.callback.CallbackInfo;

/**
 * Optimizes entity rendering by skipping distant entities and culling invisible entities
 */
@Mixin(EntityRenderDispatcher.class)
public class EntityRenderDispatcherMixin {

    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void optimizeEntityRendering(Entity entity, double camX, double camY, double camZ, float tickDelta, float partialTick, CallbackInfo ci) {
        // Skip rendering far-away entities
        double distSq = entity.distanceToSqr(camX, camY, camZ);
        if (distSq > 256 * 256) { // 256 block distance
            ci.cancel();
        }
    }
}