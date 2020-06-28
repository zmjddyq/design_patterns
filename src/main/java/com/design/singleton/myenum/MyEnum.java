package com.design.singleton.myenum;

import com.design.singleton.lazy.Lazy2;

import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zmj
 * @date 2020/6/28 8:39
 * @Description 单例模式枚举实现
 */
enum MyEnum {
    MY_ENUM;
}
class Test {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 2L, TimeUnit.MINUTES, new LinkedBlockingDeque());
            Future<MyEnum> submit1 = threadPoolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                return MyEnum.MY_ENUM;
            });
            Future<MyEnum> submit2 = threadPoolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                return MyEnum.MY_ENUM;
            });
            Future<MyEnum> submit3 = threadPoolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                return MyEnum.MY_ENUM;
            });
            MyEnum myEnum1 = submit1.get();
            MyEnum myEnum2 = submit2.get();
            MyEnum myEnum3 = submit3.get();

            System.out.println(myEnum1.equals(myEnum2));
            System.out.println(myEnum2.equals(myEnum3));
            threadPoolExecutor.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
