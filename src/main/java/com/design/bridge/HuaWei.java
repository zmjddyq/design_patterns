package com.design.bridge;

/**
 * @author zmj
 * @date 2020/6/28 20:03
 * @Description
 */
public class HuaWei implements Brand {
    @Override
    public String open() {
        return "华为 开机";
    }

    @Override
    public String call() {
        return "华为 打电话";
    }

    @Override
    public String close() {
        return "华为 关机";
    }
}
