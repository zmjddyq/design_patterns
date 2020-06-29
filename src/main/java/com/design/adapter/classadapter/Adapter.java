package com.design.adapter.classadapter;

/**
 * @author zmj
 * @date 2020/6/28 17:01
 * @Description 类适配器 (充电器)
 */
public class Adapter extends Voltage220V implements Voltage5V{

    /**
     * 充电器进行降压
     * @return
     */
    @Override
    public int outPut5V() {
        int voltage = super.outPut220V();
        voltage = voltage / 44;
        System.out.println("充电器降压至5V");
        return voltage;
    }
}
