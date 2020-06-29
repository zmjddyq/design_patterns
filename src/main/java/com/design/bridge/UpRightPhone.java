package com.design.bridge;

/**
 * @author zmj
 * @date 2020/6/28 20:02
 * @Description
 */
public class UpRightPhone extends Phone{
    private Brand brand;

    public UpRightPhone(Brand brand) {
        this.brand = brand;
    }

    @Override
    protected void open() {
        String[] strings = brand.open().split(" ");
        System.out.println(strings[0] + "直立手机" + strings[1]);
    }

    @Override
    protected void call() {
        String[] strings = brand.call().split(" ");
        System.out.println(strings[0] + "直立手机" + strings[1]);
    }

    @Override
    protected void close() {
        String[] strings = brand.close().split(" ");
        System.out.println(strings[0] + "直立手机" + strings[1]);
    }
}
