package com.codersafterdark.progressivemastery.common.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

import javax.annotation.Nullable;

public class CapSkillExperienceData {
    @CapabilityInject(ISkillExperienceCap.class)
    public static Capability<ISkillExperienceCap> SKILL_EXPERIENCE;


}
