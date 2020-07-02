package com.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zmj
 * @date 2020/7/1 15:15
 * @Description
 */
public class InfoCollege implements College {

    private String name;
    private ArrayList<Department> departments;

    public InfoCollege(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public InfoCollege() {
        name = "=====信息学院=====";
        departments = new ArrayList<>();
        addDepartment("通信工程", "通信工程");
        addDepartment("物联网", "物联网");
    }

    public String getName() {
        return name;
    }

    @Override
    public void addDepartment(String name, String dec) {
        Department department = new Department(name, dec);
        departments.add(department);
    }

    @Override
    public Iterator creatIterator() {
        return new InfoCollegeIterator();
    }

    private class InfoCollegeIterator implements Iterator<Department> {
        int temp = -1;

        @Override
        public boolean hasNext() {
            return ++temp < departments.size();
        }

        @Override
        public Department next() {
            return departments.get(temp);
        }
    }
}
