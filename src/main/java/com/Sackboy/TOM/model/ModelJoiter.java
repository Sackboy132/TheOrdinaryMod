package com.Sackboy.TOM.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelJoiter extends ModelBase {

	ModelRenderer head;
	ModelRenderer beak;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer neck;

	public ModelJoiter() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4F, -8F, -4F, 8, 8, 8);
		head.setRotationPoint(0F, -6F, 0F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		beak = new ModelRenderer(this, 43, 1);
		beak.addBox(0F, 0F, 0F, 2, 2, 2);
		beak.setRotationPoint(-0.8666667F, -8.666667F, -5.4F);
		beak.setTextureSize(64, 32);
		beak.mirror = true;
		setRotation(beak, 0.8179294F, 0F, 0F);
		body = new ModelRenderer(this, 16, 16);
		body.addBox(-4F, 0F, -2F, 8, 12, 4);
		body.setRotationPoint(0F, 0F, 0F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rightarm = new ModelRenderer(this, 40, 16);
		rightarm.addBox(-3F, -2F, -2F, 1, 12, 4);
		rightarm.setRotationPoint(-2F, 2F, 0F);
		rightarm.setTextureSize(64, 32);
		rightarm.mirror = true;
		setRotation(rightarm, 0.4332341F, 0F, 0F);
		leftarm = new ModelRenderer(this, 40, 16);
		leftarm.addBox(-1F, -2F, -2F, 1, 12, 4);
		leftarm.setRotationPoint(5F, 2F, 0F);
		leftarm.setTextureSize(64, 32);
		leftarm.mirror = true;
		setRotation(leftarm, 0.4833219F, 0F, 0F);
		rightleg = new ModelRenderer(this, 0, 16);
		rightleg.addBox(-2F, 0F, -2F, 2, 12, 2);
		rightleg.setRotationPoint(-1F, 12F, 2F);
		rightleg.setTextureSize(64, 32);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0F);
		leftleg = new ModelRenderer(this, 0, 16);
		leftleg.addBox(-2F, 0F, -2F, 2, 12, 2);
		leftleg.setRotationPoint(3F, 12F, 2F);
		leftleg.setTextureSize(64, 32);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, 0F);
		neck = new ModelRenderer(this, 34, 0);
		neck.addBox(0F, 0F, 0F, 2, 8, 2);
		neck.setRotationPoint(-1F, -7F, -1F);
		neck.setTextureSize(64, 32);
		neck.mirror = true;
		setRotation(neck, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		head.render(f5);
		beak.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
		neck.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
        float f6 = (180F / (float)Math.PI);

        /* Arms */
        this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662f) * 1.4f * f1;
        this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.4f * f1;
        
        /* Legs */
        this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662f) * 1.4f * f1;
        this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.4f * f1;
	}

}
