package com.codersafterdark.progressivemastery.common;

import codersafterdark.reskillable.api.ReskillableRegistries;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class SkillStorage {
    private static Map<ResourceLocation, Integer> SKILL_EXPERIENCE;

    public SkillStorage() {
        SKILL_EXPERIENCE = new HashMap<>();
        initSkillMap();
    }

    private void initSkillMap() {
        for (ResourceLocation skill : ReskillableRegistries.SKILLS.getKeys()) {
            SKILL_EXPERIENCE.put(skill, 0);
        }
    }

    private Map<ResourceLocation, Integer> getSkillMap() {
        return SKILL_EXPERIENCE;
    }


}
