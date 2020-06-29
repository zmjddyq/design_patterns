package com.design.builder;

/**
 * @author zmj
 * @date 2020/6/28 15:39
 * @Description 指挥者
 */
public class Director {

    public static Product build(ConcreteBuilder concreteBuilder){
        concreteBuilder.doBasic();
        concreteBuilder.doWall();
        concreteBuilder.doRoof();
        return concreteBuilder.build();
    }
}
