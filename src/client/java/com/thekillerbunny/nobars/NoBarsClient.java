package com.thekillerbunny.nobars;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;

public class NoBarsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer("no-bars").ifPresent(modContainer -> {
		    ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("no-bars:removestatusbars"),  modContainer, ResourcePackActivationType.NORMAL);
        });
    }
}