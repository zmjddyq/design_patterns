package com.design.decorative;

import java.math.BigDecimal;

/**
 * @author zmj
 * @date 2020/6/29 10:14
 * @Description
 */
public class Latte extends Coffee{
    public Latte() {
        setDes("拿铁");
        setPrice(new BigDecimal(10));
    }
}
