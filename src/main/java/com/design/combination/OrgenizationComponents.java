package com.design.combination;

import java.io.ObjectOutputStream;

/**
 * @author zmj
 * @date 2020/6/29 11:19
 * @Description 组合模式
 */
public abstract class OrgenizationComponents {
    private String name;
    private String des;

    /**
     * 添加子节点
     * @param components
     */
    public void add(OrgenizationComponents components) {
        throw new UnsupportedOperationException();
    }

    /**
     * 删除子节点
     * @param components
     */
    public void remove(OrgenizationComponents components) {
        throw new UnsupportedOperationException();
    }

    public abstract void print();

    public OrgenizationComponents(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
