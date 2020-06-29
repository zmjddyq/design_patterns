package com.design.adapter.objectadapter;

/**
 * @author zmj
 * @date 2020/6/28 16:51
 * @Description 对象适配器模式(插座提供电压)
 * 被适配类
 */
public class Voltage220V {
    public int outPut220V(){
        int voltage = 220;
        System.out.println("输出" + voltage + "V的电压");
        return voltage;
    }
}
