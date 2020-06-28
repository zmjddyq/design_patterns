package com.design.factory.simple_factory;

/**
 * @author zmj
 * @date 2020/6/27 19:18
 * @Description 简单工厂模式
 */
public class SimpleFactoryPattern {
    public static void main(String[] args) {
        Phone miPhone = PhoneFactory.makePhone("MiPhone");
        Phone iPhone = PhoneFactory.makePhone("IPhone");
        miPhone.call();
        iPhone.call();
    }
}

/**
 * 创建简单工厂，创造手机
 */
class PhoneFactory {
    public static Phone makePhone(String PhoneType){
        switch (PhoneType) {
            case "MiPhone" :
                return new MiPhone();

            case "IPhone" :
                return new IPhone();

            default:
                return null;

        }
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
