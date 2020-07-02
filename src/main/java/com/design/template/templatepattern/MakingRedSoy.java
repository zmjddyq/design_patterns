package com.design.template.templatepattern;

/**
 * @author zmj
 * @date 2020/6/30 16:30
 * @Description
 */
public class MakingRedSoy implements MakingSoy{
    @Override
    public String chooseIngredients() {
        System.out.println("选用上好的红豆");
        return "红豆";
    }
}
