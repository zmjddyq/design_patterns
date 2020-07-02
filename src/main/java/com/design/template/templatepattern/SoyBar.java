package com.design.template.templatepattern;

/**
 * @author zmj
 * @date 2020/6/30 16:33
 * @Description 模板模式
 */
public class SoyBar {
    public static void main(String[] args) {
        System.out.println("======制作红豆浆=====");
        MakingSoy redSoy = new MakingRedSoy();
        redSoy.make();
        System.out.println("======制作花生豆浆=====");
        MakingSoy peanutSoy = new MakingPeanutSoy();
        peanutSoy.make();
        System.out.println("======制作原味豆浆=====");
        MakingSoy plainSoy = new MakingPlainSoy();
        plainSoy.make();

    }
}
