package com.simibubi.create.compat.recipeViewers.emi;

import com.simibubi.create.compat.recipeViewers.common.CommonRenderable;

import dev.emi.emi.api.render.EmiRenderable;

import com.mojang.blaze3d.vertex.PoseStack;

public record CreateEmiRenderable(CommonRenderable common) implements EmiRenderable {
	@Override
	public void render(PoseStack matrices, int x, int y, float delta) {
		common.render(matrices, x, y);
	}
}
