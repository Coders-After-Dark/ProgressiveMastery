package com.codersafterdark.progressivemastery.common;

import com.codersafterdark.progressivemastery.common.tasks.Task;
import com.codersafterdark.progressivemastery.common.tasks.tasktypes.TaskHandler;
import com.codersafterdark.progressivemastery.utils.configs.PMConfigs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        PMConfigs.init(event.getModConfigurationDirectory());
    }

    public void Init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {
        for (Task task : TaskHandler.getTasks()) {
            MinecraftForge.EVENT_BUS.register(task);
        }
    }

    public void serverStart(FMLServerStartingEvent event) {

    }
}
