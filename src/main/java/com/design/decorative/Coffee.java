package com.design.decorative;

import java.math.BigDecimal;

/**
 * @author zmj
 * @date 2020/6/29 10:11
 * @Description
 */
public class Coffee extends Drink{
    @Override
    public BigDecimal cost() {
        return getPrice();
    }

    @Override
    public String getDes() {
        return super.getDes() + super.getPrice();
    }
}
