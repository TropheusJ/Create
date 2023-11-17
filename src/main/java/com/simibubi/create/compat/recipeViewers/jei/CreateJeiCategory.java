package com.simibubi.create.compat.recipeViewers.jei;

import java.util.Objects;

import javax.annotation.ParametersAreNonnullByDefault;

import com.simibubi.create.compat.recipeViewers.common.InvisibleBox;
import com.simibubi.create.compat.recipeViewers.common.RecipeCategory;

import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class CreateJeiCategory<T extends Recipe<?>> implements IRecipeCategory<T> {
	protected final RecipeCategory<T> commonCategory;
	protected final IDrawable background;
	protected final IDrawable icon;
	protected final RecipeType<T> recipeType;

	public CreateJeiCategory(RecipeCategory<T> commonCategory) {
		this.commonCategory = commonCategory;
		this.background = new CreateJeiRenderable(new InvisibleBox(commonCategory.width, commonCategory.height));
		this.icon = new CreateJeiRenderable(commonCategory.icon);
		ResourceLocation typeId = ForgeRegistries.RECIPE_TYPES.getKey(commonCategory.recipeType);
		this.recipeType = new RecipeType<>(Objects.requireNonNull(typeId), commonCategory.recipeClass);
	}

	@Override
	public RecipeType<T> getRecipeType() {
		return recipeType;
	}

	@Override
	public Component getTitle() {
		return commonCategory.name;
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public IDrawable getIcon() {
		return icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, T recipe, IFocusGroup focuses) {

	}
}
