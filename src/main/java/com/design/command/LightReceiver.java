package com.design.command;

/**
 * @author zmj
 * @date 2020/7/1 9:15
 * @Description 命令接受者
 */
public class LightReceiver {

    public void on() {
        System.out.println("开灯~~~");
    }

    public void off() {
        System.out.println("关灯~~~");
    }

}
