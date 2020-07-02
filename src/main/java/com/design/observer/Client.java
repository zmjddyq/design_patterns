package com.design.observer;

import sun.awt.windows.WWindowPeer;

/**
 * @author zmj
 * @date 2020/7/1 16:25
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new Baidu());
        weatherData.registerObserver(new Sina());
        weatherData.update(15.1F,25.46F,15.4F);
        weatherData.update(17.8F,24.56F,10.3F);
    }
}
