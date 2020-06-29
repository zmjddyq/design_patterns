package com.design.adapter.objectadapter;

/**
 * @author zmj
 * @date 2020/6/28 17:01
 * @Description 对象适配器 (充电器)
 * 类适配器的重点在于类，是通过构造一个继承Adaptee类来实现适配器的功能；
 * 对象适配器的重点在于对象，是通过在直接包含Adaptee类来实现的，当需要调用特殊功能的时候直接使用Adapter中包含的那个Adaptee对象来调用特殊功能的方法即可。
 */
public class Adapter implements Voltage5V {
    private Voltage220V voltage220V;

    public Adapter() {
        voltage220V = new Voltage220V();
    }

    public Adapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    /**
     * 充电器进行降压
     * @return
     */
    @Override
    public int outPut5V() {
        int voltage = voltage220V.outPut220V();
        voltage = voltage / 44;
        System.out.println("充电器降压至5V");
        return voltage;
    }
}
