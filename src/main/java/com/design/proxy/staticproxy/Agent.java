package com.design.proxy.staticproxy;

/**
 * @author zmj
 * @date 2020/6/30 15:20
 * @Description 代理模式 -- 经纪人(代理人)
 */
public class Agent implements Singer{
    private Singer singer;

    public Agent(Singer singer) {
        this.singer = singer;
    }

    /**
     * 代理人工作
     */
    @Override
    public void sing() {
        System.out.println("经纪人敲定业务");
        System.out.println("经纪人签合同");
        System.out.println("经纪人收定金");
        System.out.println("经纪人准备演唱会");
        singer.sing();
        System.out.println("经纪人演唱会收尾工作");
        System.out.println("经纪人收尾款");
    }
}
