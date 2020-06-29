package com.design.combination;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zmj
 * @date 2020/6/29 11:23
 * @Description 组合模式:大学
 */
public class University extends OrgenizationComponents {
    private ArrayList<OrgenizationComponents> components;

    public University(String name, String des) {
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
