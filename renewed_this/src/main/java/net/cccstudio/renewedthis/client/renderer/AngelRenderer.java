
package net.cccstudio.renewedthis.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.cccstudio.renewedthis.entity.AngelEntity;
import net.cccstudio.renewedthis.client.model.Modelangel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AngelRenderer extends MobRenderer<AngelEntity, Modelangel<AngelEntity>> {
	public AngelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangel<AngelEntity>(context.bakeLayer(Modelangel.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<AngelEntity, Modelangel<AngelEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("renewed_this:textures/entities/angel.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AngelEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modelangel(Minecraft.getInstance().getEntityModels().bakeLayer(Modelangel.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AngelEntity entity) {
		return ResourceLocation.parse("renewed_this:textures/entities/angel.png");
	}
}
