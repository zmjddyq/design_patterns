package com.design.decorative;

import java.math.BigDecimal;

/**
 * @author zmj
 * @date 2020/6/29 10:16
 * @Description 装饰模式
 */
public class Cappuccino extends Coffee{

    public Cappuccino() {
        setDes("卡布奇诺");
        setPrice(new BigDecimal(15));
    }
}
