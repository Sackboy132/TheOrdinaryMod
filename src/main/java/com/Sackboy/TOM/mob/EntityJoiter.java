package com.Sackboy.TOM.Mob;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityJoiter extends EntityMob {

	public EntityJoiter(World worldIn) {
		super(worldIn);
		this.setSize(0.75f, 1.2f);
		this.tasks.addTask(0, new EntityAIWander(this, 0.50d));
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0f);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25d);

	}

	@Override
	protected Item getDropItem() {
		return Items.acacia_boat;
	}
}
