package com.design.visitor;

import java.util.Random;

/**
 * @author zmj
 * @date 2020/7/1 10:48
 * @Description 工程师
 */
public class Engineer extends Staff{

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // 工程师一年的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
