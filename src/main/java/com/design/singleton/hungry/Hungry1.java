package com.design.singleton.hungry;

import org.junit.Test;

import java.util.jar.JarEntry;

/**
 * @author zmj
 * @date 2020/6/27 20:45
 * @Description 单例模式饿汉式 静态属性
 */
public class Hungry1 {
    public static final Hungry1 HUNGRY_1 = new Hungry1();
    private Hungry1() {
    }
}
class Test1 {
    public static void main(String[] args) {
        Hungry1 hungry1 = Hungry1.HUNGRY_1;
        Hungry1 hungry2 = Hungry1.HUNGRY_1;
        System.out.println(hungry1.equals(hungry2));
    }
}