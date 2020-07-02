package com.design.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zmj
 * @date 2020/6/30 15:20
 * @Description 动态代理模式 -- 经纪人(代理人) 不用实现接口
 */
public class Agent implements MethodInterceptor {
    private Object singer;

    public Agent(Object singer) {
        this.singer = singer;
    }

    /**
     * 动态代理人工作(返回代理对象)
     */
    public Object agentWork() {
        // 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(singer.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    /**
     * 重写intercept 方法，会调用目标对象的方法
     *
     * @param o
     * @param method
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("经纪人敲定业务");
        System.out.println("经纪人签合同");
        System.out.println("经纪人收定金");
        System.out.println("经纪人准备演唱会");
        Object invoke = method.invoke(singer, args);
        System.out.println("经纪人演唱会收尾工作");
        System.out.println("经纪人收尾款");
        return invoke;
    }
}
