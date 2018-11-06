package com.codersafterdark.progressivemastery.common.tasks.tasktypes;

import codersafterdark.reskillable.api.skill.Skill;
import com.codersafterdark.progressivemastery.common.tasks.Task;
import net.minecraft.block.Block;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Map;

public class MiningTask extends Task {
    private Block block;
    private Map<Skill, Integer> rewards;

    public MiningTask(Block block, Map<Skill, Integer> rewards) {
        this.block = block;
        this.rewards = rewards;
    }

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        if (this.block == event.getState().getBlock()) {
            for (Skill skill : rewards.keySet()) {
                //Fill in with Skill Experience Code
            }
        }
    }
}
