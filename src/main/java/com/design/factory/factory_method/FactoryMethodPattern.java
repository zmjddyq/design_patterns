package com.design.factory.factory_method;


/**
 * @author zmj
 * @date 2020/6/27 19:35
 * @Description 工厂方法模式
 * 和简单工厂模式中工厂负责生产所有产品相比，工厂方法模式将生成具体产品的任务分发给具体的产品工厂，其UML类图如下：
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        new MiPhoneFactory().makePhone().call();
        new IPhoneFactory().makePhone().call();
    }
}

class IPhoneFactory extends PhoneFactory {

    @Override
    Phone makePhone() {
        return new IPhone();
    }
}

class MiPhoneFactory extends PhoneFactory {

    @Override
    Phone makePhone() {
        return new MiPhone();
    }
}

/**
 * 创建工厂规范，创造手机
 */
abstract class PhoneFactory {
    abstract Phone makePhone();
}

class IPhone implements Phone {
    @Override
    public void call() {
        System.out.println("用苹果手机打电话");
    }
}

class MiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("用小米手机打电话");
    }
}

interface Phone {
    void call();
}