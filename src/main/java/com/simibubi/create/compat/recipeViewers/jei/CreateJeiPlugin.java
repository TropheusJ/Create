package com.simibubi.create.compat.recipeViewers.jei;

import javax.annotation.ParametersAreNonnullByDefault;

import com.simibubi.create.compat.recipeViewers.common.CreateCommonPlugin;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class CreateJeiPlugin implements IModPlugin {
	private final CreateCommonPlugin commonPlugin = new CreateCommonPlugin();

	@Override
	public ResourceLocation getPluginUid() {
		return commonPlugin.id;
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		commonPlugin.categories.forEach(category -> registration.addRecipeCategories(new CreateJeiCategory<>(category)));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {

	}
}
