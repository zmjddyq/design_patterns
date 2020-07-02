package com.design.command;

/**
 * @author zmj
 * @date 2020/7/1 9:18
 * @Description 关灯命令
 */
public class LightOffCommand implements Command {
    private LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}