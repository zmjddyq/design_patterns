package com.design.visitor;

import java.util.ArrayList;

/**
 * @author zmj
 * @date 2020/7/1 10:55
 * @Description 员工业务报表
 */
public class BusinessReport {
    private ArrayList<Staff> staffs = new ArrayList<>();

    public void addStaff(Staff staff){
        staffs.add(staff);
    }

    /**
     * 显示员工报表
     */
    public void showBusinessReport(Visitor visitor) {
        for (Staff staff : staffs) {
            staff.accept(visitor);
        }
    }
}
