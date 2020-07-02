package com.design.appearance;

/**
 * @author zmj
 * @date 2020/6/30 10:21
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=======开始观影======");
        HomeTheater.start();
        System.out.println("=======观影结束======");
        HomeTheater.end();
    }
}
