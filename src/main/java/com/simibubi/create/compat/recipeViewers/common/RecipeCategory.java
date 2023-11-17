package com.simibubi.create.compat.recipeViewers.common;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;

public class RecipeCategory<T extends Recipe<?>> {


	public RecipeCategory(Info<T> info) {

	}

	record Info<T extends Recipe<?>>(ResourceLocation id, Component name, int width, int height,
				RecipeType<T> recipeType, Class<? extends T> recipeClass, CommonRenderable icon) {
	}
}
