package com.codersafterdark.progressivemastery.utils.configs;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class PMConfigUtils {
    public static int loadPropInt(Configuration config, String propName, String desc, int default_) {
        Property prop = config.get(Configuration.CATEGORY_GENERAL, propName, default_);
        prop.setComment(desc);
        return prop.getInt(default_);
    }

    public static double loadPropDouble(Configuration config, String propName, String desc, double default_) {
        Property prop = config.get(Configuration.CATEGORY_GENERAL, propName, default_);
        prop.setComment(desc);
        return prop.getDouble(default_);
    }

    public static boolean loadPropBool(Configuration config, String propName, String desc, boolean default_) {
        Property prop = config.get(Configuration.CATEGORY_GENERAL, propName, default_);
        prop.setComment(desc);
        return prop.getBoolean(default_);
    }

}
