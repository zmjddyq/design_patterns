package com.design.proxy.staticproxy;

/**
 * @author zmj
 * @date 2020/6/30 15:23
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 通过代理者来调用被代理对象方法
         */
        Agent agent = new Agent(new YangQianHua());
        agent.sing();
    }
}
