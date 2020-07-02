package com.design.template.templatepattern;

/**
 * @author zmj
 * @date 2020/6/30 16:31
 * @Description
 */
public class MakingPeanutSoy implements MakingSoy{
    @Override
    public String chooseIngredients() {
        System.out.println("选用上好的花生");
        return "花生";
    }
}
