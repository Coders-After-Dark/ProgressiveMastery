package com.codersafterdark.progressivemastery.common.tasks.tasktypes.mining;

import com.codersafterdark.progressivemastery.common.tasks.Task;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MiningTask extends Task {
    private static Map<Block, Map<ResourceLocation, Integer>> tasks = new HashMap<>();

    public MiningTask() {

    }

    public static void addTask(Block target, Map<ResourceLocation, Integer> rewards) {
        if (tasks != null) {
            tasks.put(target, rewards);
        }
    }

    public static void removeTask(Block target) {
        if (tasks != null) {
            tasks.remove(target);
        }
    }

    public static void removeTask(Block target, Map<ResourceLocation, Integer> rewards) {
        if (tasks != null) {
            tasks.remove(target, rewards);
        }
    }

    public static Map<Block, Map<ResourceLocation, Integer>> getTasks() {
        return tasks;
    }

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        if (tasks != null) {
            Set<Block> blockKeys = tasks.keySet();
            for (Block target : blockKeys) {
                if (target == event.getState().getBlock()) {
                    Map<ResourceLocation, Integer> rewardMap = tasks.get(target);
                    Set<ResourceLocation> rsSet = rewardMap.keySet() ;
                    for (ResourceLocation skill : rsSet) {
                        //Enter Skill Experience Code Here
                    }
                }
            }
        }
    }
}
