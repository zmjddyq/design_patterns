package com.design.singleton.lazy;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author zmj
 * @date 2020/6/28 8:15
 * @Description 懒汉式线程安全
 */
public class Lazy2 {
    private Lazy2() {
    }

    private static volatile Lazy2 lazy2;

    /**
     * 方式一:同步方法
     * 效率较低
     */
    public synchronized static Lazy2 getLazy2_1() {
        if (lazy2 == null) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lazy2 = new Lazy2();
        }
        return lazy2;
    }

    /**
     * 方式二:同步代码块(双重判断)
     * 效率高 推荐
     */
    public static Lazy2 getLazy2_2() {
        if (lazy2 == null) {
            synchronized (Lazy2.class) {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (lazy2 == null) {
                    lazy2 = new Lazy2();
                }
            }
        }
        return lazy2;
    }

    /**
     * 错误方式:同步代码块(单次判断)
     * ？？？
     */
    public static Lazy2 getLazy2_3() {
            synchronized (Lazy2.class) {
                if (lazy2 == null) {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lazy2 = new Lazy2();
                }
            }
        return lazy2;
    }
}

class Test2 {
    public static void main(String[] args) {
        // 方式一测试
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 2L, TimeUnit.MINUTES, new LinkedBlockingDeque());
            Future<Lazy2> submit1 = threadPoolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                return Lazy2.getLazy2_3();
            });
            Future<Lazy2> submit2 = threadPoolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                return Lazy2.getLazy2_3();
            });
            Future<Lazy2> submit3 = threadPoolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                return Lazy2.getLazy2_3();
            });
            Lazy2 lazy1 = submit1.get();
            Lazy2 lazy2 = submit2.get();
            Lazy2 lazy3 = submit3.get();

            System.out.println(lazy1);
            System.out.println(lazy2);
            System.out.println(lazy3);
            threadPoolExecutor.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}