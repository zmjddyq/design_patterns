package com.design.observer;

/**
 * @author zmj
 * @date 2020/7/1 16:24
 * @Description
 */
public class Sina implements Observer{
    /**
     * 温度，气压，湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("-----新浪收到通知，更新天气----- ");
        System.out.println("温度为：" + temperature + ";\n" +
                "气压为：" + pressure + ";\n" +
                "湿度为：" + humidity + ";");

    }
}
