package com.design.template.templatepattern;

/**
 * @author zmj
 * @date 2020/6/30 16:19
 * @Description 模板
 */
public interface MakingSoy {
    default void make(){
        prepare();
        String ingredients = chooseIngredients();
        soak(ingredients);
        smash(ingredients);
    }

    default void prepare() {
        System.out.println("选用上号的黄豆");
    }

    default String chooseIngredients() {
        return null;
    }

    default void soak(String ingredients) {
        System.out.println("将黄豆" + (ingredients == null?"" : "和" + ingredients) + "浸泡3个小时");
    }
    default void smash(String ingredients) {
        System.out.println("将黄豆" + (ingredients == null?"" : "和" + ingredients) + "放入豆浆机做成豆浆");
    }
}
