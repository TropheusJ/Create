package com.simibubi.create.compat.recipeViewers.common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.resources.ResourceLocation;

public abstract class CommonPlugin {
	public final ResourceLocation id;
	public final List<RecipeCategory<?>> categories = new ArrayList<>();

	public CommonPlugin(ResourceLocation id) {
		this.id = id;
		registerCategories(categories::add);
	}

	abstract void registerCategories(RecipeCategoryRegistry registry);

	interface RecipeCategoryRegistry {
		void register(RecipeCategory<?> category);
	}
}
