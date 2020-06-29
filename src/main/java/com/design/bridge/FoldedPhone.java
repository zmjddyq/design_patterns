package com.design.bridge;

import org.junit.Test;

/**
 * @author zmj
 * @date 2020/6/28 19:45
 * @Description
 */
public class FoldedPhone extends Phone{
    private Brand brand;

    public FoldedPhone(Brand brand) {
        this.brand = brand;
    }

    @Override
    protected void open() {
        String[] strings = brand.open().split(" ");
        System.out.println(strings[0] + "折叠手机" + strings[1]);
    }

    @Override
    protected void call() {
        String[] strings = brand.call().split(" ");
        System.out.println(strings[0] + "折叠手机" + strings[1]);
    }

    @Override
    protected void close() {
        String[] strings = brand.close().split(" ");
        System.out.println(strings[0] + "折叠手机" + strings[1]);
    }
}
