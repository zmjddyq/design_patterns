package com.design.adapter.interfaceadapter;

/**
 * @author zmj
 * @date 2020/6/28 17:23
 * @Description 接口适配器模式
 */
public class Test {
    public static void main(String[] args) {
        Adapter adapter = new Adapter() {
            @Override
            public void function1() {
                System.out.println("使用功能1");
            }

            @Override
            public void function3() {
                System.out.println("使用功能2");
            }

            @Override
            public void function5() {
                System.out.println("使用功能3");
            }
        };
        adapter.function1();
        adapter.function3();
        adapter.function5();
    }
}
