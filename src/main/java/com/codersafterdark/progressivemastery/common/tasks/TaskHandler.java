package com.codersafterdark.progressivemastery.common.tasks;

import com.codersafterdark.progressivemastery.common.tasks.Task;
import net.minecraftforge.common.MinecraftForge;

import java.util.ArrayList;
import java.util.List;

public class TaskHandler {
    private static List<Task> tasks = new ArrayList<>();

    public static void addTask(Task task) {
        tasks.add(task);
    }

    public static void removeTask(Task task) {
        tasks.remove(task);
    }

//    private static void clear() {
//        tasks.clear();
//    }


    public static List<Task> getTasks() {
        return tasks;
    }

    public static void setupTasks() {
        for (Task task : TaskHandler.getTasks()) {
            MinecraftForge.EVENT_BUS.register(task);
        }
    }
}
