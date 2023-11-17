package com.simibubi.create.compat.recipeViewers.common;

import com.mojang.blaze3d.vertex.PoseStack;

import mezz.jei.api.gui.drawable.IDrawable;

import org.jetbrains.annotations.NotNull;

public record InvisibleBox(int width, int height) implements CommonRenderable {
	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public void render(PoseStack matrices, int x, int y) {
	}
}
