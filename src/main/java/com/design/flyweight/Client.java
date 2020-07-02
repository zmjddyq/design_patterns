package com.design.flyweight;

/**
 * @author zmj
 * @date 2020/6/30 11:12
 * @Description 享元模式
 * 小型的外包项目，给客户A做一个产品展示网站，客户A的朋友感觉效果不错，也希望做这样的产品展示网
 * 站，但是要求都有些不同:
 * 1) 有客户要求以新闻的形式发布
 * 2)有客户 人要求以博客的形式发布
 * 3)有客户希望以微信公众号的形式发布
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite web1 = webSiteFactory.get("新闻");
        web1.use();
        web1.user(new User("jim"));
        WebSite web2 = webSiteFactory.get("新闻");
        web2.use();
        web2.user(new User("tom"));
        WebSite web3 = webSiteFactory.get("微博");
        web3.use();
        web3.user(new User("jury"));
        webSiteFactory.showSize();
    }
}
