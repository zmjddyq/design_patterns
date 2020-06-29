package com.design.combination;

import java.util.ArrayList;

/**
 * @author zmj
 * @date 2020/6/29 11:29
 * @Description 组合模式：学院
 */
public class College extends OrgenizationComponents {
    private ArrayList<OrgenizationComponents> components;

    public College(String name, String des) {
        super(name, des);
        components = new ArrayList<>();
    }

    @Override
    public void add(OrgenizationComponents components) {
        this.components.add(components);
    }

    @Override
    public void remove(OrgenizationComponents components) {
        this.components.remove(components);
    }

    @Override
    public void print() {
        System.out.println("================" + super.getName() + "================");
        for (OrgenizationComponents component : components) {
            component.print();
        }
    }
}
