package com.design.bridge;

/**
 * @author zmj
 * @date 2020/6/28 18:49
 * @Description 桥接模式
 * 品牌类型
 */
public interface Brand {
    /**
     * 开机
     */
    String open();

    /**
     * 打电话
     */
    String call();

    /**
     * 关机
     */
    String close();
}
