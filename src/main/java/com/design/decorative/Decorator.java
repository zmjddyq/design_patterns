package com.design.decorative;

import java.math.BigDecimal;

/**
 * @author zmj
 * @date 2020/6/29 10:17
 * @Description 装饰类
 */
public class Decorator extends Drink{
    private Drink coffee;

    public Decorator(Drink drink) {
        this.coffee = drink;
    }

    @Override
    public BigDecimal cost() {

        return coffee.cost().add(super.getPrice());
    }

    @Override
    public String getDes() {
        return super.getDes() + super.getPrice() + " && " + coffee.getDes() ;
    }
}
