package com.design.decorative;

import java.math.BigDecimal;

/**
 * @author zmj
 * @date 2020/6/29 10:24
 * @Description 装饰品
 */
public class chocolate extends Decorator{
    public chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(new BigDecimal(2));
    }
}
