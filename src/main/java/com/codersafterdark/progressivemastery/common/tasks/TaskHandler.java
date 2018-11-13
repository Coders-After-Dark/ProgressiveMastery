package com.codersafterdark.progressivemastery.common.tasks;

import com.codersafterdark.progressivemastery.utils.configs.PMConfigs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.world.BlockEvent;

public class TaskHandler {
    private int miningXP = 0;
    private int attackXP = 0;

    public void miningHandler(BlockEvent.BreakEvent event) {
        if (event.isCanceled()) {
            return;
        }

        int expCurrent = miningXP;
        int expValue = event.getExpToDrop();

        if (expValue < PMConfigs.miningXP) {
            expValue = PMConfigs.miningXP;
        }

        miningXP = expCurrent + expValue;
    }

    public void dmgDealtHandler(LivingAttackEvent event) {
        if (event.isCanceled() || !(event.getSource().getTrueSource() instanceof EntityPlayer)) {
            return;
        }

        int expCurrent = attackXP;
        int expValue = (int) event.getAmount();
        attackXP = expCurrent + expValue;
    }

}
