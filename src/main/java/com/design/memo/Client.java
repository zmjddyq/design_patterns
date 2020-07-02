package com.design.memo;

/**
 * @author zmj
 * @date 2020/7/2 9:37
 * @Description 备忘录模式,存档读档
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("初始状态: ");
        Originator originator = new Originator("状态一");
        System.out.println(originator.getStatus());

        System.out.println("保存初始状态，并更新状态: ");
        Caretaker caretaker = new Caretaker();
        caretaker.saveStatus(1,originator.saveStatus());
        originator.setStatus("状态二");
        System.out.println(originator.getStatus());

        System.out.println("读档: ");
        originator.recoverStatus(caretaker.getStatus(1));
        System.out.println(originator.getStatus());
    }
}
