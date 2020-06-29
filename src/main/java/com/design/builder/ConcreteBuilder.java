package com.design.builder;

/**
 * @author zmj
 * @date 2020/6/28 15:35
 * @Description 具体建造者
 */
public class ConcreteBuilder extends Builder{
    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    public ConcreteBuilder(Product product) {
        this.product = product;
    }

    @Override
    void doBasic() {
        product.setBasic("10m地基");
    }

    @Override
    void doWall() {
        product.setWall("砖头墙");
    }

    @Override
    void doRoof() {
        product.setRoof("平顶");
    }

    @Override
    Product build() {
        return product;
    }
}
