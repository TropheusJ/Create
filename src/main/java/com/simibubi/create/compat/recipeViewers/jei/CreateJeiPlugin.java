package com.simibubi.create.compat.recipeViewers.jei;

import com.simibubi.create.Create;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class CreateJeiPlugin implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return Create.asResource("jei_plugin");
	}
}
