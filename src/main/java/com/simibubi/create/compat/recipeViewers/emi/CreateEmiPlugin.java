package com.simibubi.create.compat.recipeViewers.emi;

import com.simibubi.create.compat.recipeViewers.common.CreateCommonPlugin;

import dev.emi.emi.api.EmiEntrypoint;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;

@EmiEntrypoint
public class CreateEmiPlugin implements EmiPlugin {
	private final CreateCommonPlugin commonPlugin = new CreateCommonPlugin();

	@Override
	public void register(EmiRegistry registry) {
		commonPlugin.registerCategories(category -> registry.addCategory(new CreateEmiCategory(category)));
		registry.addRecipe();
	}
}
