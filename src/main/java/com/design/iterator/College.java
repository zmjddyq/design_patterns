package com.design.iterator;

import java.util.Iterator;

/**
 * @author zmj
 * @date 2020/7/1 15:03
 * @Description
 */
public interface College {

    void addDepartment(String name,String dec);

    Iterator creatIterator();

}
