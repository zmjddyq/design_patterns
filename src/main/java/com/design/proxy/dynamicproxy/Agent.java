package com.design.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author zmj
 * @date 2020/6/30 15:20
 * @Description 动态代理模式 -- 经纪人(代理人) 不用实现接口
 */
public class Agent {
    private Object singer;

    public Agent(Object singer) {
        this.singer = singer;
    }

    /**
     * 动态代理人工作
     */
    public Object agentWork() {
        return Proxy.newProxyInstance(singer.getClass().getClassLoader(), singer.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("经纪人敲定业务");
            System.out.println("经纪人签合同");
            System.out.println("经纪人收定金");
            System.out.println("经纪人准备演唱会");
            Object invoke = method.invoke(singer, args);
            System.out.println("经纪人演唱会收尾工作");
            System.out.println("经纪人收尾款");
            return invoke;
        });
    }
}
