package com.design.iterator;

import java.util.Iterator;

/**
 * @author zmj
 * @date 2020/7/1 15:05
 * @Description
 */
public class ComputerCollege implements College{
    private String name;
    private Department[] departments;
    private int index = 0;

    public ComputerCollege(Department[] departments) {
        this.departments = departments;
    }

    public ComputerCollege() {
        name = "=====计算机学院=====";
        this.departments = new Department[4];
        addDepartment("计算机科学","计算机科学");
        addDepartment("软件工程","软件工程");
        addDepartment("自动化","自动化");
        addDepartment("数学系","数学系");
    }

    public String getName() {
        return name;
    }

    @Override
    public void addDepartment(String name,String dec) {
        Department department = new Department(name, dec);
        departments[index++] = department;
    }

    @Override
    public Iterator creatIterator() {
        return new ComputerCollegeIterator();
    }

    /**
     * 迭代器内部类
     */
    private class ComputerCollegeIterator implements Iterator<Department> {
        int temp = -1;
        @Override
        public boolean hasNext() {
            return ++temp < index;
        }

        @Override
        public Department next() {
            return departments[temp];
        }
    }


}
