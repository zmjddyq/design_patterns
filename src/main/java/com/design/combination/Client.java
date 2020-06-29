package com.design.combination;

/**
 * @author zmj
 * @date 2020/6/29 11:31
 * @Description 组合模式
 */
public class Client {
    public static void main(String[] args) {
        OrgenizationComponents university = new University("集美大学","挺好");
        OrgenizationComponents college1 = new College("诚毅学院","还行");
        OrgenizationComponents college2 = new College("轮机学院","不错");
        college1.add(new Department("信息工程系","理发店"));
        college1.add(new Department("经济系","好"));
        college2.add(new Department("航海系","极好"));
        university.add(college1);
        university.add(college2);

        university.print();
    }
}
