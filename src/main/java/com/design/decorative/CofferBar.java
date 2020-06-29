package com.design.decorative;

/**
 * @author zmj
 * @date 2020/6/29 10:27
 * @Description 装饰者模式
 */
public class CofferBar {
    public static void main(String[] args) {
        Drink order = new Cappuccino();
        order = new Milk(order);
        order = new Milk(order);
        order = new chocolate(order);
        System.out.println("订单总额 ：" + order.cost() + "元");
        System.out.println("订单详情 ：" + order.getDes());
    }
}
