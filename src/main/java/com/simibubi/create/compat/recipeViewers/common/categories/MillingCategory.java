package com.simibubi.create.compat.recipeViewers.common.categories;

import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.Create;
import com.simibubi.create.compat.recipeViewers.common.RecipeCategory;
import com.simibubi.create.content.kinetics.millstone.MillingRecipe;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class MillingCategory extends RecipeCategory<MillingRecipe> {
	public static final ResourceLocation ID = Create.asResource("milling");

	public MillingCategory() {
		super(ID, Component.literal("FIXME"), 20, 20, AllRecipeTypes.MILLING.getType(), MillingRecipe.class, icon);
	}
}
