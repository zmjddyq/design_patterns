package com.design.singleton.lazy;

import java.util.concurrent.*;

/**
 * @author zmj
 * @date 2020/6/27 20:58
 * @Description 单例模式懒汉式 线程不安全
 */
public class Lazy1 {
    private Lazy1() {
    }
    private static Lazy1 lazy1;
    public static Lazy1 getLazy1() throws InterruptedException {
        if (lazy1 == null) {
            TimeUnit.SECONDS.sleep(1);
            lazy1 = new Lazy1();
        }
        return lazy1;
    }

}
class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
/*        Lazy1 lazy1 = Lazy1.getLazy1();
        Lazy1 lazy2 = Lazy1.getLazy1();
        System.out.println(lazy1.equals(lazy2));*/
        // 线程安全测试
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Lazy1> submit1 = executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            return Lazy1.getLazy1();
        });
        Future<Lazy1> submit2 = executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            return Lazy1.getLazy1();
        });
        // com.design.singleton.lazy.Lazy1@6d03e736
        Lazy1 lazy1 = submit1.get();
        // com.design.singleton.lazy.Lazy1@568db2f2
        Lazy1 lazy2 = submit2.get();

        System.out.println(lazy1);
        System.out.println(lazy2);

        executorService.shutdown();
    }
}
