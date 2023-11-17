package com.simibubi.create.compat.recipeViewers.jei;

import com.simibubi.create.compat.recipeViewers.common.CommonRenderable;

import mezz.jei.api.gui.drawable.IDrawable;

import org.jetbrains.annotations.NotNull;

import com.mojang.blaze3d.vertex.PoseStack;

public record CreateJeiRenderable(CommonRenderable common) implements IDrawable {
	@Override
	public int getWidth() {
		return common.getWidth();
	}

	@Override
	public int getHeight() {
		return common.getHeight();
	}

	@Override
	public void draw(@NotNull PoseStack matrices, int x, int y) {
		common.render(matrices, x, y);
	}
}
