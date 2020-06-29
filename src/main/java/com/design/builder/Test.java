package com.design.builder;

/**
 * @author zmj
 * @date 2020/6/28 15:43
 * @Description 建造者模式测试
 */
public class Test {
    public static void main(String[] args) {
        Product build = Director.build(new ConcreteBuilder());
        System.out.println(build);
    }
}
