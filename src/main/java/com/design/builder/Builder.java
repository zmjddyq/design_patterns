package com.design.builder;

/**
 * @author zmj
 * @date 2020/6/28 15:32
 * @Description 生产者
 */
public abstract class Builder {

    /**
     * 打地基
     */
    abstract void doBasic();

    /**
     * 砌墙
     */
    abstract void doWall();

    /**
     * 封顶
     */
    abstract void doRoof();

    abstract Product build();
}
