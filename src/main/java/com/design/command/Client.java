package com.design.command;

/**
 * @author zmj
 * @date 2020/7/1 9:39
 * @Description 命令模式测试
 */
public class Client {
    public static void main(String[] args) {
        // 命令接受者 - 灯
        LightReceiver lightReceiver = new LightReceiver();

        // 创建调用者 - 遥控器
        Invoker invoker = new Invoker();
        // 传入开关命令
        invoker.setCommand(0,new LightOnCommand(lightReceiver),new LightOffCommand(lightReceiver));

        System.out.println("====================灯开关命令测试===================");
        // 开灯
        invoker.InvokerOn(0);
        // 关灯
        invoker.InvokerOff(0);
        // 撤销
        invoker.InvokerUndo();
    }
}
