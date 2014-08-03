package com.doit421.designpattern.factorymethod;

/**
 * Created by czb on 2014/8/3.
 * 纽约披萨商店，继承于披萨商店抽象类
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        if(type.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }
        return null;
    }
}
