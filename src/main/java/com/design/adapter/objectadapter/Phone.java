package com.design.adapter.objectadapter;

import org.junit.Test;

/**
 * @author zmj
 * @date 2020/6/28 17:03
 * @Description 手机,需要5v电压进行充电
 */
public class Phone {
    @Test
    public void test(){
        Phone mi6 = new Phone();
        mi6.charge(new Adapter());
    }
    /**
     * 充电,需要5v电压
     * @param adapter 充电器
     */
    public void charge(Adapter adapter) {
        int voltage = adapter.outPut5V();
        if (5 == voltage) {
            System.out.println("开始充电");
        }
    }
}
