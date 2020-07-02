package com.design.visitor;

/**
 * @author zmj
 * @date 2020/7/1 10:45
 * @Description
 */
public interface Visitor {

    void visit(Engineer engineer);

    void visit(Manager manager);
}
