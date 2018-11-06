package com.codersafterdark.progressivemastery.common.tasks.tasktypes;

import com.codersafterdark.progressivemastery.common.tasks.Task;

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
}
