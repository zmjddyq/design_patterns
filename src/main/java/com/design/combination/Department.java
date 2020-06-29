package com.design.combination;

/**
 * @author zmj
 * @date 2020/6/29 11:30
 * @Description 组合模式:系
 */
public class Department extends OrgenizationComponents{
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println(super.getName());
    }
}
