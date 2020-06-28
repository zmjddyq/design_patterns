package com.design.singleton.hungry;

/**
 * @author zmj
 * @date 2020/6/27 20:54
 * @Description 单例模式饿汉式 静态代码块
 */
public class Hungry2 {
    private Hungry2() {
    }
    public static final  Hungry2 HUNGRY_2;
    static {
        HUNGRY_2 = new Hungry2();
    }
}
class Test2 {
    public static void main(String[] args) {
        Hungry2 hungry1 = Hungry2.HUNGRY_2;
        Hungry2 hungry2 = Hungry2.HUNGRY_2;
        System.out.println(hungry1.equals(hungry2));
    }
}