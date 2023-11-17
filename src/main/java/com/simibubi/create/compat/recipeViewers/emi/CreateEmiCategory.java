package com.simibubi.create.compat.recipeViewers.emi;

import com.simibubi.create.compat.recipeViewers.common.RecipeCategory;

import dev.emi.emi.api.recipe.EmiRecipeCategory;
import net.minecraft.network.chat.Component;

public class CreateEmiCategory extends EmiRecipeCategory {
	protected final RecipeCategory<?> common;

	public CreateEmiCategory(RecipeCategory<?> common) {
		super(common.id, new CreateEmiRenderable(common.icon));
		this.common = common;
	}

	@Override
	public Component getName() {
		return common.name;
	}
}
