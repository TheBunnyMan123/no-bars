package com.thekillerbunny.nobars.mixin.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class ExampleClientMixin {
	@Shadow
	private int scaledHeight;
	@Final
	@Shadow
	private MinecraftClient client;

    @Inject(method = "renderExperienceBar", at=@At("HEAD"), cancellable = true)
	private void noExpBar(DrawContext context, int x, CallbackInfo ci){
		ci.cancel();
	}
}