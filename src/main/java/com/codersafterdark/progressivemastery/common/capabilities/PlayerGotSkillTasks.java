package com.codersafterdark.progressivemastery.common.capabilities;

import net.minecraft.nbt.NBTTagCompound;

public class PlayerGotSkillTasks {

    private boolean playerGotTasks = false;

    public PlayerGotSkillTasks() {

    }

    public boolean isPlayerGotTasks() {
        return playerGotTasks;
    }

    public void setPlayerGotTasks(boolean playerGotTasks) {
        this.playerGotTasks = playerGotTasks;
    }

    public void copyFrom(PlayerGotSkillTasks source) {
        playerGotTasks = source.playerGotTasks;
    }

    public void writeNBT(NBTTagCompound compound) {
        compound.setBoolean("gotTasks", playerGotTasks);
    }

    public void readNBT(NBTTagCompound compound) {
        playerGotTasks = compound.getBoolean("gotTasks");
    }

}
