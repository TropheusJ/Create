package com.simibubi.create.compat.recipeViewers.common;

import com.simibubi.create.Create;

public class CreateCommonPlugin extends CommonPlugin {
	public CreateCommonPlugin() {
		super(Create.asResource("recipe_viewer_plugin"));
	}

	@Override
	void registerCategories(RecipeCategoryRegistry registry) {
		registry.register();
	}
}
