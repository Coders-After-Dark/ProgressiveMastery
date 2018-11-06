package com.codersafterdark.progressivemastery.common.tasks;

import com.codersafterdark.progressivemastery.common.tasks.Task;
import com.codersafterdark.progressivemastery.common.tasks.tasktypes.mining.MiningTask;
import net.minecraftforge.common.MinecraftForge;

import java.util.ArrayList;
import java.util.List;

public class TaskHandler {
    public static void setupTasks() {
        MinecraftForge.EVENT_BUS.register(new MiningTask());
    }
}
