package com.simibubi.create.compat.recipeViewers.common;

import com.mojang.blaze3d.vertex.PoseStack;

public interface CommonRenderable {
	void render(PoseStack matrices, int x, int y);

	int getWidth();
	int getHeight();
}
