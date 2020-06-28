package com.design.factory.abstract_factory;

/**
 * @author zmj
 * @date 2020/6/27 20:05
 * @Description 抽象工厂模式
 * 抽象工厂模式通过在AbstarctFactory中增加创建产品的接口，并在具体子工厂中实现新加产品的创建，当然前提是子工厂支持生产该产品。否则继承的这个接口可以什么也不干
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        new IPhoneFactory().makePC().writeCode();
        new MiPhoneFactory().makePC().writeCode();

    }
}

class IPhoneFactory extends PhoneFactory {

    @Override
    Phone makePhone() {
        return new IPhone();
    }

    @Override
    PC makePC() {
        return new MAC();
    }
}

class MiPhoneFactory extends PhoneFactory {

    @Override
    Phone makePhone() {
        return new MiPhone();
    }

    @Override
    PC makePC() {
        return new MiPC();
    }
}

/**
 * 创建工厂规范，创造手机
 */
abstract class PhoneFactory {
    /**
     * 制造手机
     * @return
     */
    abstract Phone makePhone();

    /**
     * 制造笔记本
     * @return
     */
    abstract PC makePC();
}

class MAC implements PC {

    @Override
    public void writeCode() {
        System.out.println("用MAC写代码");
    }
}

class MiPC implements PC {

    @Override
    public void writeCode() {
        System.out.println("用小米笔记本写代码");
    }
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
interface PC {
    void writeCode();
}