package com.codersafterdark.progressivemastery.common.tasks.tasktypes.mining;

import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MiningTaskEntry {
    private static Map<ResourceLocation, Integer> rewards;
    private Block block;

    public MiningTaskEntry(Block block) {
        this.block = block;
        rewards = new HashMap<>();
        if (MiningTask.getTasks().containsKey(block)) {
            Map<ResourceLocation, Integer> mapEntry = MiningTask.getTasks().get(block);
            Set<ResourceLocation> skillSet = rewards.keySet();
            for (ResourceLocation skill : skillSet) {
                mapEntry.put(skill, rewards.get(skill));
            }
            MiningTask.addTask(block, mapEntry);
        } else {
            MiningTask.addTask(this.block, rewards);
        }
    }

    public static void parseReward(ResourceLocation skill, Integer exp) {
        getRewards().put(skill, exp);
    }

    private static Map<ResourceLocation, Integer> getRewards() {
        return rewards;
    }
}
