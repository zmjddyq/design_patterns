package com.design.visitor;

import java.util.Random;

/**
 * @author zmj
 * @date 2020/7/1 10:53
 * @Description 经理
 */
public class Manager extends Staff{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // 一年做的产品数量
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
