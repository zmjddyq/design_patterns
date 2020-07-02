package com.design.visitor;

import java.util.Random;

/**
 * @author zmj
 * @date 2020/7/1 10:40
 * @Description
 */
public abstract class Staff {
    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);

}
