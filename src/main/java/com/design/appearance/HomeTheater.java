package com.design.appearance;

/**
 * @author zmj
 * @date 2020/6/30 10:16
 * @Description 外观模式
 */
public class HomeTheater {
    private static Light light = Light.LIGHT;
    private static Projector projector = Projector.PROJECTOR;
    private static Screen screen = Screen.SCREEN;

    public static void start(){
        screen.down();
        projector.on();
        light.off();
        System.out.println("enjoy yourself!");
    }

    public static void end(){
        light.on();
        projector.off();
        screen.up();
    }
}
