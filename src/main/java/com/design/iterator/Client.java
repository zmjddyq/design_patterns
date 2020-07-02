package com.design.iterator;

import java.util.Iterator;

/**
 * @author zmj
 * @date 2020/7/1 15:32
 * @Description 迭代器模式
 */
public class Client {
    public static void main(String[] args) {
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        System.out.println(computerCollege.getName());
        Iterator iterator = computerCollege.creatIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(infoCollege.getName());
        Iterator iterator1 = infoCollege.creatIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
