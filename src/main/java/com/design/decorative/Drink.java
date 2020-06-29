package com.design.decorative;

import java.math.BigDecimal;

/**
 * @author zmj
 * @date 2020/6/29 10:05
 * @Description 装载模式: 主体
 */
public abstract class Drink {
    /**
     * 详情
     */
    private String des;
    /**
     * 价格
     */
    private BigDecimal price;

    public void setDes(String des) {
        this.des = des;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 获取订单总额
     * @return
     */
    public abstract BigDecimal cost();
}
