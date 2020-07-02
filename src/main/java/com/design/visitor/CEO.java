package com.design.visitor;

/**
 * @author zmj
 * @date 2020/7/1 10:57
 * @Description 在CEO的访问者中，CEO关注工程师的 KPI，经理的 KPI 和新产品数量，
 * 通过两个 visitor 方法分别进行处理
 */
public class CEO implements Visitor {
    /**
     * CEO关注工程师的 KPI
     *
     * @param engineer
     */
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + ", kpi：" + engineer.kpi);
    }

    /**
     * 经理的 KPI 和新产品数量
     *
     * @param manager
     */
    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name + ", kpi：" + manager.kpi + ", 产品数量：" + manager.getProducts());
    }
}
