package com.design.observer;

/**
 * @author zmj
 * @date 2020/7/1 16:06
 * @Description 观察者
 */
public interface Observer {
    void update(float temperature,float pressure,float humidity);

    void display();
}
