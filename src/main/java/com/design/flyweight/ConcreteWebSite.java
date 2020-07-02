package com.design.flyweight;

/**
 * @author zmj
 * @date 2020/6/30 10:59
 * @Description
 */
public class ConcreteWebSite implements WebSite {
    String website;

    public ConcreteWebSite(String website) {
        this.website = website;
    }

    @Override
    public void use() {
        System.out.println("使用" + website + "的网站形势进行发布");
    }

    @Override
    public void user(User user) {
        System.out.println("网站用户为: " + user.name);
    }
}
