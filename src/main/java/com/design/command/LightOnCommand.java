package com.design.command;


/**
 * @author zmj
 * @date 2020/7/1 9:14
 * @Description 开灯命令
 */
public class LightOnCommand implements Command {

    private LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
