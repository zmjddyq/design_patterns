package com.design.decorative;

import java.math.BigDecimal;

/**
 * @author zmj
 * @date 2020/6/29 10:26
 * @Description 装饰品
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(new BigDecimal(5));
    }
}
