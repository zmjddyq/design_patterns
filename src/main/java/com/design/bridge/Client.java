package com.design.bridge;

/**
 * @author zmj
 * @date 2020/6/28 19:54
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FoldedPhone(new Mi());
        phone1.open();
        Phone phone2 = new FoldedPhone(new HuaWei());
        phone2.call();
        Phone phone3 = new UpRightPhone(new HuaWei());
        phone3.close();
    }
}
