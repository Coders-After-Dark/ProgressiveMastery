package com.codersafterdark.progressivemastery;

import com.codersafterdark.progressivemastery.common.CommonProxy;
import com.codersafterdark.progressivemastery.common.tasks.Task;
import com.codersafterdark.progressivemastery.common.tasks.TaskHandler;
import com.codersafterdark.progressivemastery.utils.configs.PMConfigs;
import com.codersafterdark.progressivemastery.utils.statics.PMModStatics;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = PMModStatics.MOD_ID, name = PMModStatics.MOD_NAME, version = PMModStatics.VERSION, dependencies = PMModStatics.DEPENDENCIES, acceptedMinecraftVersions = PMModStatics.MCVER)
public class ProgressiveMastery {

    @SidedProxy(serverSide = PMModStatics.COMMONPROXY, clientSide = PMModStatics.CLIENTPROXY)
    public static CommonProxy proxy;
    private static Logger logger;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.Init(event);
        if (PMConfigs.configuration.hasChanged()) {
            PMConfigs.configuration.save();
        }
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        TaskHandler.setupTasks();
    }

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStart(event);
    }
}
