package com.design.appearance;

/**
 * @author zmj
 * @date 2020/6/30 10:10
 * @Description
 */
public enum  Light {
    LIGHT;
    public void on() {
        System.out.println("打开灯光");
    }
    public void off() {
        System.out.println("关闭灯光");
    }
}
