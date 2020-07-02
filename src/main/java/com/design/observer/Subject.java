package com.design.observer;

/**
 * @author zmj
 * @date 2020/7/1 16:07
 * @Description 被观察者
 */
public interface Subject {
    /**
     * 注册一个观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除一个观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者修改数据
     */
    void notifyObserver();

}
