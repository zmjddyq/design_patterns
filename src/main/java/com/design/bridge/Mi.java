package com.design.bridge;

/**
 * @author zmj
 * @date 2020/6/28 18:51
 * @Description
 */
public class Mi implements Brand{
    @Override
    public String open() {
        return "小米 开机";
    }

    @Override
    public String call() {
        return "小米 打电话";
    }

    @Override
    public String close() {
        return "小米 关机";
    }
}
