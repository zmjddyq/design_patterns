package com.design.singleton.inner;

/**
 * @author zmj
 * @date 2020/6/28 8:44
 * @Description 单例静态内部类实现
 * 推荐:
 * 优点:懒加载,线程安全
 */
public class StaticInnerClass {
    private StaticInnerClass() {
    }
    private static class GetObject {
        private static final StaticInnerClass STATIC_INNER_CLASS = new StaticInnerClass();
    }
    public static StaticInnerClass getStaticInnerClass() {
        return GetObject.STATIC_INNER_CLASS;
    }
}
class Test {
    public static void main(String[] args) {
        StaticInnerClass staticInnerClass1 = StaticInnerClass.getStaticInnerClass();
        StaticInnerClass staticInnerClass2 = StaticInnerClass.getStaticInnerClass();
        System.out.println(staticInnerClass1.equals(staticInnerClass2));
    }
}
