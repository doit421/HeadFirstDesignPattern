package com.doit421.designpattern.factorymethod;

/**
 * Created by czb on 2014/8/3.
 * 披萨商店抽象类
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //抽象方法，由子类来决定是什么类型的披萨
    protected abstract Pizza createPizza(String type);
}
