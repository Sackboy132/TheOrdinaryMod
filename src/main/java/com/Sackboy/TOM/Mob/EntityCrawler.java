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

public class EntityCrawler extends EntityMob {

	public EntityCrawler(World worldIn) {
		super(worldIn);
		this.setSize(0.75f, 1.2f);
		this.tasks.addTask(0, new EntityAIWander(this, 0.50d));
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true, dead, null));

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
		return Items.rotten_flesh;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.worldObj.isDaytime() && !this.worldObj.isRemote) {
			float f = this.getBrightness(1.0F);
			BlockPos blockpos = new BlockPos(this.posX, (double) Math.round(this.posY), this.posZ);

			if (f > 0.5F && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F && this.worldObj.canSeeSky(blockpos)) {
				boolean flag = true;
				if (flag) {
					this.setFire(8);
				}
			}
		}
	}
}
