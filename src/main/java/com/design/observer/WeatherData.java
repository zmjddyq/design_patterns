package com.design.observer;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author zmj
 * @date 2020/7/1 16:10
 * @Description 气象站
 */
public class WeatherData implements Subject {
    /**
     * 存储观察者
     */
    private HashSet<Observer> observers;
    /**
     * 温度，气压，湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observers = new HashSet<>();
    }

    public void update(float temperature,float pressure,float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature,pressure,humidity);
        }
    }
}
