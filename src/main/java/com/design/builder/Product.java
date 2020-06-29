package com.design.builder;

/**
 * @author zmj
 * @date 2020/6/28 15:29
 * @Description 建造者模式 产品
 */
public class Product {
    /**
     * 地基
     */
    private String basic;
    /**
     * 墙
     */
    private String wall;
    /**
     * 屋顶
     */
    private String roof;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public Product() {
    }

    public Product(String basic, String wall, String roof) {
        this.basic = basic;
        this.wall = wall;
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "Product{" +
                "basic='" + basic + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
