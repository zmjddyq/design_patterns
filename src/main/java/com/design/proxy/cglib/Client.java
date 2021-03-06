package com.design.proxy.cglib;

/**
 * @author zmj
 * @date 2020/6/30 15:23
 * @Description 动态代理 -- cglib
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 通过代理者来调用被代理对象方法
         */
        Agent agent = new Agent(new YangQianHua());
        YangQianHua yangQianHua = (YangQianHua) agent.agentWork();
        yangQianHua.sing();
    }
}
