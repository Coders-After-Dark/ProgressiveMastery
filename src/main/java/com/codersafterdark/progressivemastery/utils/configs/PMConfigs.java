package com.codersafterdark.progressivemastery.utils.configs;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class PMConfigs {
    public static File configDir;
    public static Configuration configuration;

    public static void init(File file) {
        generateFolder(file);
        configuration = new Configuration(new File(configDir.getPath(), "progressivemastery.cfg"));
        configuration.load();
        loadBaseConfigs();
    }

    public static void loadBaseConfigs() {
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

    public static void generateFolder(File file) {
        File dir = new File(file, "codersafterdark");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        configDir = dir;
    }
}