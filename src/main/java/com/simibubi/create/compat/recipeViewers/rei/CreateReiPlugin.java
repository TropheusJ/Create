package com.simibubi.create.compat.recipeViewers.rei;

import com.simibubi.create.compat.recipeViewers.common.CreateCommonPlugin;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.forge.REIPluginClient;

@REIPluginClient
public class CreateReiPlugin implements REIClientPlugin {
	private final CreateCommonPlugin commonPlugin = new CreateCommonPlugin();
}
