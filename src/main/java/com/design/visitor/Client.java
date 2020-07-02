package com.design.visitor;

/**
 * @author zmj
 * @date 2020/7/1 11:04
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        BusinessReport businessReport = new BusinessReport();
        businessReport.addStaff(new Manager("经理一"));
        businessReport.addStaff(new Manager("经理二"));
        businessReport.addStaff(new Manager("经理三"));
        businessReport.addStaff(new Engineer("工程师一"));
        businessReport.addStaff(new Engineer("工程师二"));
        businessReport.addStaff(new Engineer("工程师三"));
        businessReport.addStaff(new Engineer("工程师四"));
        businessReport.addStaff(new Engineer("工程师五"));

        System.out.println("=========CEO查看员工报表========");
        businessReport.showBusinessReport(new CEO());
        System.out.println("=========CTO查看员工报表========");
        businessReport.showBusinessReport(new CTO());
    }

}
