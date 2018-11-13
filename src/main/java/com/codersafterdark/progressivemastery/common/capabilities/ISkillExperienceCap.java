package com.codersafterdark.progressivemastery.common.capabilities;

import codersafterdark.reskillable.api.skill.Skill;
import net.minecraft.nbt.NBTTagCompound;

public interface ISkillExperienceCap {
   void addExperienceForSkill(Skill skill, int xp);
}
