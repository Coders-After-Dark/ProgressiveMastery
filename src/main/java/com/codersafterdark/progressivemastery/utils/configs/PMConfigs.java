package com.codersafterdark.progressivemastery.utils.configs;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class PMConfigs {
    public static File configDir;
    public static Configuration configuration;

    public static int miningXP;

    public static void init(File file) {
        generateFolder(file);
        configuration = new Configuration(new File(configDir.getPath(), "progressivemastery.cfg"));
        configuration.load();
        loadBaseConfigs();
    }

    public static void loadBaseConfigs() {
        miningXP = PMConfigUtils.loadPropInt(configuration, "minimumExperienceMining", "The lowest amount of experienced gotten from mining a block", 1);

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