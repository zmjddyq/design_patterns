package com.design.visitor;

/**
 * @author zmj
 * @date 2020/7/1 11:01
 * @Description CTO关注工程师的代码量、经理的新产品数量
 */
public class CTO implements Visitor {
    /**
     * CTO关注工程师的代码量
     * @param engineer
     */
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + ", 代码量：" + engineer.getCodeLines());
    }

    /**
     * 经理的新产品数量
     * @param manager
     */
    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name + ", 产品数量：" + manager.getProducts());
    }
}
