package com.design.iterator;

/**
 * @author zmj
 * @date 2020/7/1 15:05
 * @Description
 */
public class Department {
    private String name;
    private String dec;

    public Department(String name, String dec) {
        this.name = name;
        this.dec = dec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", dec='" + dec + '\'';
    }
}
